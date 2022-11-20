///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           Config
// Course:          CS200 Fall 2020
//
// Author:          Lingyu Zhou
// Email:           your @wisc.edu email address
// Lecturer's Name: name of your lecturer
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// 
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

/**
 * This file contains constants for the text Adventure project. Also at the bottom of this file
 * are READ ME Notes for the Grader.
 *
 * @author Jim Williams
 * @author Lingyu Zhou aka. Ly
 */
public class Config {

    /**
     * Indexes into coordinate arrays specifying a location in the map.
     */
    public static final int ROW = 0;
    public static final int COLUMN = 1;

    /**
     * Indexes into the fields/attributes array for each map location (3rd dimension of
     * the map array)
     */
    public static final int NAME = 0;
    public static final int ENTER_TEXT = 1;
    public static final int ENTER_RESULT = 2;
    public static final int NEARBY_TEXT = 3;
    //add additional indexes here for additional field information added to each configuration
    //line.

    /**
     * Values within the location fields/attributes that are used for game logic other than
     * simply printing out.
     */
    //In name field, designates the starting location of the player
    public static final String NAME_START = "start";

    //The result of the player entering the field.
    public static final String RESULT_RANDOM_MOVE = "randomMove";
    public static final String RESULT_WIN = "win";
    public static final String RESULT_LOSE = "lose";
    //add additional game logic fields here (not text fields that are simply printed).

    /**
     * Values used by the player to navigate through the map.
     */
    public static final String MOVE_UP = "w";
    public static final String MOVE_DOWN = "s";
    public static final String MOVE_LEFT = "a";
    public static final String MOVE_RIGHT = "d";
    public static final String NEARBY = "n";
    public static final String QUIT = "q";
    //add additional game control characters here, throwing, shooting, etc.

}

/*
Your READ ME notes to the Grader
Describe your enhancements to the program, map, etc. here.  You may include a link to a
YouTube video of a maximum of 2 minutes demonstrating your program.

0) Overview of your changes or a YouTube video link (max 2 minutes)
My changes is mainly below.(I can't made a video)

1) Configuration Example: Contents of your own configuration (.advcfg) file
Coordinates/Name/Enter Text/Enter Result/Nearby Text/
8,6/size/This is the size of the map///
3,5/Diablo/Diablo tore you into pieces../lose/you hear a growl/
5,4/tornado/You are drawn into a tornado/lose/everything is twisting/
4,3/bog/You swamp in a bog and gradually sink into it/lose/your can hardly move/
3,2/maze/You enter a maze /randomMove/Something around you seems changed../
2,6/hostage/You've found the hostage safe and happy to see you!/win/you hear a dim shouting./
0,4/start/Welcome to the Eldorado Adventure! Find the hostage prisoned by the king, Diablo without a death. May you return safely!///
7,0/phalanx/You stepped in a strange phalanx, you are teleported/randomMove/Something is glaring in front of you/
4,1/portal/You walk through the portal/randomMove/You find a portal/
5,2/elves/A group of evil elves are chasing you, you run to some place../randomMove/you hear something chirping/
3,3/phalanx/You stepped in a strange phalanx, you are teleported/randomMove/Something is glaring in front of you/
2,7/tunnel/you squat down and enter it/randomMove/You found a secret tunnel that leads to some place../


2) Configuration Description: Describe unique elements in your configuration file
I add some creatures the player might meet while exploring the virtual world I designed. And also some events that might
lead to different results. I add some additional test cases, and I also add a sound named "randomSound" to render a
sense of mysterious while going to a random, scary place.
The sound file can be download at: https://pan.baidu.com/s/1QHwWVluM7pnc_-6J1Xa5HQ with a access code of "dyjj"
The YouTube version of the sound: https://youtu.be/zIrwV7R2VDg
The path of the file should be .\randomSound.mp3

3) writeMap Output: Example output of the writeMap method for your configuration file.
I use hollow square frame symbols to interpret the empty field, a dark solid square symbol to
interpret the position of the player. The beginning of the map is at the left up corner of the
display, which is (0,0)

4) Choose at least 1 of the following ways you extended the game and describe them:
  a) Tools: added your own tools/weapons and use of them in the game
  b) Audio: playing of audio files when sensing the neighbors, rather than simply text
  c) Test Cases: adding test cases to TestAdventure that thoroughly test the methods you wrote.
  d) Your Own: describe any other changes or additions we should consider for credit.

  I chose: b) & c)










 */
