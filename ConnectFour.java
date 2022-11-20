///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           FileHandler
// Course:          COMP SCI 200
//
// Author:          Ly
// Email:           lzhou256@wisc.edu
// Lecturer's Name: Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// Derived from Laura "Hobbes" Legault, CS 301 Sp 16
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class ConnectFour {

    final static int BOARD_WIDTH = 7;
    final static int BOARD_HEIGHT = 6;
    final static int CONNECT_WIN = 4;
    final static int COMPUTER_PLAYER = 0;
    final static int HUMAN_PLAYER = 1;

    public enum argState {NONE, PLAYERS, TEST}



    /**
     * The main body of the game, including the welcome, instructions of dropping tokens,
     * asks for re-enter for invalid indices, printing instructions for ending, including
     * victories and draws and a farewell. In this method, user also allow user to choose
     * modes they want, including test ,pvp and adding computers.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numPlayers = 2;
        boolean testMode = false;
        boolean seedInput = false;
        long seed = 0;

        argState cmdFlag = argState.NONE;
        for (String arg : args) {
            switch (arg) {
                case "-t":
                    cmdFlag = argState.TEST;
                    break;
                case "-p":
                    cmdFlag = argState.PLAYERS;
                    break;
                default:
                    if (cmdFlag == argState.TEST) {
                        seed = Long.parseLong(arg);
                        seedInput = true;
                    } else if (cmdFlag == argState.PLAYERS) {
                        numPlayers = Integer.parseInt(arg);
                    }
                    cmdFlag = argState.NONE;
                    break;
            }
        }
        Random rand;
        if (seedInput) {
            rand = new Random(seed);
        } else {
            rand = new Random();
        }
        int[] players = new int[]{COMPUTER_PLAYER, COMPUTER_PLAYER};
        for (int i = 0; i < numPlayers && i < players.length; i++) {
            players[i] = HUMAN_PLAYER;
        }
        boolean gameOn = true;
        System.out.println("Welcome to Connect Token Game. \n" +
                "On your turn, please select a column from 1 to " +
                BOARD_WIDTH + " to drop your token.");
        int[][] board = new int[BOARD_HEIGHT][BOARD_WIDTH];
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], -1);
        }
        int player = 0;
        printGameBoard(board);
        while (gameOn) {
            System.out.println("Player " + (player + 1) + " your move:");
            if (players[player] == HUMAN_PLAYER) {
                while (!input.hasNextInt()) {
                    input.next();
                }
                int move = input.nextInt();
                if (move < 1 || move > BOARD_WIDTH || board[BOARD_HEIGHT - 1][move - 1] != -1) {
                    System.out.println("Invalid column: " + move +
                            ". Please select a (non-full) column from 1 to " +
                            BOARD_WIDTH + ".");
                    continue;
                }
                gameOn = !isWinningCol(move - 1, board, player);
                dropToken(move - 1, board, player);
            } else {
                gameOn = !computerProcess(board, player, rand);
            }
            printGameBoard(board);
            if (!gameOn) {
                System.out.println("Player " + (player + 1) + " won!");
            }
            player = (player + 1) % 2;
            if (gameOn && checkFullBoard(board)) {
                System.out.println("Game over. We have a draw!");
                gameOn = false;
            }
        }
        System.out.println("Thank you for playing!");
    }

    /**
     * Checks if the game board is full, i.e., if no more tokens can be added.
     * <p>
     * A game board is not full if any of the top most cells contain the value -1.
     *
     * @param board The game board to verify. It must be of size BOARD_WIDTH * BOARD_HEIGHT.
     * @return true if the game board is not full, false otherwise.
     */
    public static boolean checkFullBoard(int[][] board) {
        for (int i = 0; i < BOARD_WIDTH; i++) {
            if (board[BOARD_HEIGHT - 1][i] == -1)
                return false;
        }
        return true;
    }

    /**
     * Maps the player index to a character.
     *
     * @param player The integer index to map to a character.
     * @return Returns the mapped character:
     * - 0 is mapped to 'X'
     * - 1 is mapped to 'O'
     * - Every other index is mapped to ' '
     */
    public static char getToken(int player) {

        return (player == 0 ? 'X' : (player == 1 ? 'O' : ' '));

    }

    /**
     * Drops a token into the game board at a specified column, col. The token is place at the
     * lowest unfilled cell (value -1) of column col. Specifically, the lowest unfilled cell
     * is set to the player index.
     *
     * @param col    The column where the token is dropped.
     * @param board  The game board into which the token is dropped. It must be of size
     *               BOARD_WIDTH * BOARD_HEIGHT.@param player The player index.
     * @return Returns false if the column if full, i.e., the maximum index is not -1.
     *         Otherwise returns true.
     */
    public static boolean dropToken(int col, int[][] board, int player) {
        if (board[BOARD_HEIGHT - 1][col] != -1) {
            return false;
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == -1) {
                board[i][col] = player;
                break;
            }
        }
        return true;
    }

    /**
     * Checks each column to see if dropping a token at that column would result in a win for
     * the specified player index.
     *
     * @param board  The game board into which the token is dropped. It must be of size
     *               BOARD_WIDTH * BOARD_HEIGHT.
     * @param player The player index.
     * @returns The lowest column index for which the specified player would win by
     * dropping a token. If there is no such column, -1 is returned.
     */
    public static int findWinningMove(int[][] board, int player) {
        for (int col = 0; col < BOARD_WIDTH; col++) {
            if (isWinningCol(col, board, player)) {
                return col;
            }
        }
        return -1;
    }

    /**
     * Checks if dropping a token at the specified column for the specified player would result in
     * a win.
     *
     * @param col    The column where the token is dropped.
     * @param board  The game board into which the token is dropped. It must be of size
     *               BOARD_WIDTH * BOARD_HEIGHT.
     * @param player The player index.
     * @return true if col is a winning column for player. Otherwise, returns false.
     */
    public static boolean isWinningCol(int col, int[][] board, int player) {
        for (int i = BOARD_HEIGHT - 1; i >= 0; i--) {
            if (isWinningCoord(i, col, board, player)) {
                return true;
            }
        }
        return false;
    }


    /**
     * Check if the current situation is a victory for certain player after putting
     * a token at given rowNum and colNum by checking the given game situation
     * that is simplified by a 2D array.
     *
     * @param colNum:The column that the token will be at (start from 0)
     * @param rowNum:The row that the token will be at (start from 0)
     * @param currSituation: The situation of the game board, displayed as a 2D array
     * @param playerToken:The kind of the token, 0 stands for X, 1 stands for O
     * @return :whether given player wins the game after dropping his/her token,
     *          return true for yes.
     */
    public static boolean isWinningCoord(int rowNum, int colNum,
                                         int[][] currSituation, int playerToken) {
        if (rowNum >= BOARD_HEIGHT
                ||
                rowNum < 0
                ||
                colNum >= BOARD_WIDTH
                ||
                colNum < 0
                ||
                currSituation[rowNum][colNum] != -1
                ||
                (rowNum < BOARD_HEIGHT - 1 && currSituation[rowNum + 1][colNum] != -1)
                ||
                (rowNum > 0 && currSituation[rowNum - 1][colNum] == -1)) {
            return false;
        }
        { // Vertical
            int count = 0;
            for (int i = rowNum - 1; i >= 0; i--) {
                if (currSituation[i][colNum] != playerToken) {
                    break;
                } else {
                    count++;
                }
            }
            if (count >= CONNECT_WIN - 1) {
                return true;
            }
        }
        { // Horizontal
            int count = 0;
            for (int i = colNum - 1; i >= 0; i--) {
                if (currSituation[rowNum][i] != playerToken) {
                    break;
                } else {
                    count++;
                }
            }
            for (int i = colNum + 1; i < BOARD_WIDTH; i++) {
                if (currSituation[rowNum][i] != playerToken) {
                    break;
                } else {
                    count++;
                }
            }
            if (count >= CONNECT_WIN - 1) {
                return true;
            }
        }
        { // Diagonals
            int countNegSlope = 0;
            for (int i = rowNum - 1; i >=0; i--) {
                for (int j = colNum + 1; j <BOARD_WIDTH; j++) {

                    if (currSituation[i][j] != playerToken) {
                        if(colNum<=BOARD_WIDTH){colNum++;}//
                        break;

                    } else {
                        countNegSlope++;
                    }
                }
            }
            for (int i = rowNum + 1; i < BOARD_HEIGHT; i++) {
                for (int j = colNum - 1; j >=0; j--) {

                    if (currSituation[i][j] != playerToken) {
                        break;
                    } else {
                        countNegSlope++;
                    }
                }
            }
            if (countNegSlope >= CONNECT_WIN - 1) {
                return true;






            }
            int countPosSlope = 0;
            for (int i = rowNum + 1; i < BOARD_HEIGHT; i++) {
                for (int j = colNum + 1; j < BOARD_WIDTH; j++) {
                    if (currSituation[i][j] != playerToken) {
                        break;
                    } else {
                        countPosSlope++;
                    }
                }
            }
            for (int i = rowNum - 1; i >= 0; i--) {
                for (int j = colNum - 1; j >= 0; j--) {
                    if (currSituation[i][j] != playerToken) {


                    } else {

                        countPosSlope++;

                    }

                }
            }
            if (countPosSlope >= CONNECT_WIN - 1) {
                return true;
            }

        }
        return false;
    }

    /**
     * The process of dropping token by computer that is against to the another player by
     * dropping a token at the position of potential four consecutive tokens. If there is no
     * such a position, the computer drop at a random position.
     *
     * @param gameBoard: The current game board stored in 2D array.
     * @param userToken: The kind of token dropped, 0 for X and 1 for o
     * @param rand: The random variable
     * @return :The status of whether to continue or not, true for yes.
     */
    public static boolean computerProcess(int[][] gameBoard, int userToken, Random rand) {
        int x = findWinningMove(gameBoard, userToken);
        if (x != -1) {
            dropToken(x, gameBoard, userToken);
            return true;
        }
        x = findWinningMove(gameBoard, (userToken + 1) % 2);
        if (x != -1) {
            dropToken(x, gameBoard, userToken);
            return false;
        }
        do {
            x = rand.nextInt(BOARD_WIDTH);
        } while (gameBoard[BOARD_HEIGHT - 1][x] != -1);
        dropToken(x, gameBoard, userToken);
        return false;
    }

    /**
     * Print the game board at given situation, with lines constituted of "-"
     * at the top and buttom and use "|" to depict the grid, use " " to depict
     * the seats for users' tokens.
     *
     * @param currSituation: the simplified situation version of a 2D array
     */
    public static void printGameBoard(int[][] currSituation) {
        for (int i = 0; i < BOARD_WIDTH; i++) {
            System.out.print("--");
        }
        System.out.println("-");
        for (int i = currSituation.length - 1; i >= 0; i--) {
            System.out.print("|");
            for (int j = 0; j < BOARD_WIDTH; j++) {
                System.out.print(getToken(currSituation[i][j]) + "|");
            }
            System.out.println();
        }
        for (int i = 0; i < BOARD_WIDTH; i++) {
            System.out.print("--");
        }
        System.out.println("-");
        System.out.print(" ");
        for (int i = 0; i < BOARD_WIDTH; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();
    }

}
