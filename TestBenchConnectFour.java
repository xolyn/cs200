public class TestBenchConnectFour {

    public static void main(String[] args) {
        testIsWinningCord();
    }

    // Add at least 4 more clearly distinct test vectors to help debug the bugs in isWinningCoord
    public static void testIsWinningCord() {
        {//Vertical
            int[][] board = {
                {0,-1,-1,-1,-1,-1,-1},
                {0,-1,-1,-1,-1,-1,-1},
                {0,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1}
            };
            System.out.println("Vertical winning move test (Row: 3, Col: 0): " +
                               ConnectFour.isWinningCoord(3, 0, board, 0));
            ConnectFour.printGameBoard(board);
        }

        {//Horizontal
            int[][] board = {
                    {-1, 0, 0, 0,-1,-1,-1},
                    {-1,-1,-1,-1,-1,-1,-1},
                    {-1,-1,-1,-1,-1,-1,-1},
                    {-1,-1,-1,-1,-1,-1,-1},
                    {-1,-1,-1,-1,-1,-1,-1},
                    {-1,-1,-1,-1,-1,-1,-1}
            };
            System.out.println("Horizontal winning move test (Row: 0, Col: 4): " +
                    ConnectFour.isWinningCoord(0, 4, board, 0));
            ConnectFour.printGameBoard(board);
        }

        {//Diagonal Positive 1
            int[][] board = {
                    { 0, 1, 1, 1, 0, 0,-1},
                    {-1, 0, 1, 1,-1,-1,-1},
                    {-1,-1, 0, 1,-1,-1,-1},
                    {-1,-1,-1,-1,-1,-1,-1},
                    {-1,-1,-1,-1,-1,-1,-1},
                    {-1,-1,-1,-1,-1,-1,-1}
            };
            System.out.println("Diagonal (pos#1) winning move test (Row: 3, Col: 3): " +
                    ConnectFour.isWinningCoord(3, 3, board, 0));

            ConnectFour.printGameBoard(board);
        }

        {//Diagonal Positive 2
            int[][] board = {
                    {-1,-1, 0, 1, 1, 1,-1},
                    {-1,-1,-1, 0, 1, 1,-1},
                    {-1,-1,-1,-1, 0, 1,-1},
                    {-1,-1,-1,-1,-1,-1,-1},
                    {-1,-1,-1,-1,-1,-1,-1},
                    {-1,-1,-1,-1,-1,-1,-1}
            };
            System.out.println("Diagonal (pos#2) winning move test (Row: 3, Col: 5): " +
                    ConnectFour.isWinningCoord(3, 5, board, 0));

            ConnectFour.printGameBoard(board);
        }

        {//Diagonal Negative 1
            int[][] board = {
                { 1, 1, 1, 0,-1,-1,-1},
                { 1, 1, 0,-1,-1,-1,-1},
                { 1, 0,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1},
                {-1,-1,-1,-1,-1,-1,-1}
            };
            System.out.println("Diagonal (neg#1) winning move test (Row: 3, Col: 0): " +
                               ConnectFour.isWinningCoord(3, 0, board, 0));
            ConnectFour.printGameBoard(board);
        }

        {//Diagonal Negative 2
            int[][] board = {
                    {-1,-1,-1, 1, 1, 1, 0},
                    {-1,-1,-1, 1, 1, 0,-1},
                    {-1,-1,-1, 1, 0,-1,-1},
                    {-1,-1,-1,-1,-1,-1,-1},
                    {-1,-1,-1,-1,-1,-1,-1},
                    {-1,-1,-1,-1,-1,-1,-1}
            };
            System.out.println("Diagonal (neg#2) winning move test (Row: 3, Col: 3): " +
                    ConnectFour.isWinningCoord(3, 3, board, 0));
            ConnectFour.printGameBoard(board);
        }
    }
    
}

