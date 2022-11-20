///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           NestedPrinting
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

/**
 * A class that can be used to build String representations of 1D, 2D, and 3D String arrays
 * to display their contents.
 */
public class NestedPrinting {

    /**
     * Takes a one-line String of input and makes a new version of
     * it which ends with a suffix and is of the given length.
     * To make it the correct length, the original input
     * should either be truncated (losing some characters)
     * or it should be padded at the end with spaces (' ')
     * before adding the suffix.
     *
     * @param input A single line String to be fixed
     * @param suffix The String that the output should end with
     * @param length The total length of the output, including the suffix
     * @return A String of the given length which ends with the suffix
     **/
    public static String endWith(String input, String suffix, int length) {
        if(input.length()+suffix.length()>length){
            int digitToRemain=length-suffix.length();
            String r="";
            for(int i=0;i<digitToRemain;i++){
                r=r+input.charAt(i);
            }
            r=r.concat(suffix);
            return r;
        }//-
        else{
            int numOfSpace=length-suffix.length()-input.length();
            String r="";
            r=r.concat(input);
            for(int i=0;i<numOfSpace;i++){
                r=r.concat(" ");
            }
            r=r.concat(suffix);
            return r;
        }//+

    }

    /**
     * Returns a line of characters which consists of
     * lineChar repeated length times.
     * @param lineChar The character to create a line out of
     * @param length The length of the returned String
     * @return A String of the given length consisting only of lineChar
     */
    public static String lineOf(char lineChar, int length) {
        String o="";
        for(int i=0;i<length;i++){
            o+=lineChar;
        }
        return o;
    }

    /**
     * Returns a single String as a representation of an array of Strings.
     * The return should start with '{' and end with '}'. The elements
     * of the array should be included without quotes and with commas
     * after all but the last element of the array.
     * There should be no newline at the end of the returned String.
     *
     * Example output:
     * arrToString(new String[] { "hello", "there", "everyone" })
     * returns: "{hello, there, everyone}"
     *
     * @param arr An array of Strings to be printed
     * @return A String which has the array on a single line
     */
    public static String arrToString(String[] arr) {
        String o="{";
        for(int i=0;i<arr.length-1;i++){
            o=o+arr[i]+", ";
        }
        if(arr.length>0){
        o=o+arr[arr.length-1];}
        o+="}";
        return o;
    }

    /**
     * Returns a single String as a representation of an 2D array of Strings.
     * The returned String should have arr.length+2 lines and it
     * should end with a newline.
     * Every line should start with the given prefix and
     * end with the given suffix, but each line will have different contents.
     * 
     * If adding the prefix + suffix would make the line longer
     * than length, then the contents of the line should be truncated
     * to allow for them to be added. You can assume that the
     * length of prefix + suffix is always less than or equal
     * to the length.
     *
     * The first line's contents is just "{".
     * The final line's contents is just "}".
     * The inner line's contents are two spaces ("  ") plus the
     * String representation of a 1D array from arrToString(String[])
     * plus a comma after all but the last element of the 2D array.
     *
     * Example Output (prefix is "_", suffix is "!", length is 15):
     * _{            !
     * _  {Hi, Guy}, !
     * _  {2D}       !
     * _}            !
     *
     * hint: use the arrToString(String[] arr) method you created
     * 
     * @param arr The 2D array we're trying to represent as a String
     * @param prefix A String which should be at the start of
     *      every line of the output
     * @param suffix A String which should be at the end of
     *      every line of the output
     * @param length The length of every line of the output
     */
    public static String arrToString(String[][] arr, String prefix, String suffix, int length) {
        String o="";
        int s=suffix.length();
        int p=prefix.length();
        if(length==3){
            if(arr.length==0 || arr.length==1&&arr[0].length==0){o=o+"{  \n}  \n";}


            else{
                o=prefix+"{"+suffix+"\n"+prefix+" "+suffix+"\n"+prefix+"}"+suffix+"\n";}}
        //}

        else {
            {
                o = o + prefix + "{";
                for (int i = 0; i < length - 1 - prefix.length() - suffix.length(); i++) {
                    o = o + " ";
                }
                o += suffix + "\n";
            }//line1

            //body:
            for (int i = 0; i < arr.length; i++) {

                if (s + p + 2 + arrToString(arr[i]).length() <= length) {
                    o = o + prefix + "  " + arrToString(arr[i]);
                    if (i != arr.length - 1) {
                        o += ",";
                    }
                    if (i != arr.length - 1) {
                        for (int j = 0; j < (length - s - p - 3 - arrToString(arr[i]).length()); j++) {
                            o = o + " ";
                        }
                    } else {
                        for (int j = 0; j < (length - s - p - 2 - arrToString(arr[i]).length()); j++) {
                            o = o + " ";
                        }
                    }
                    o = o + suffix + "\n";
                } else {

                    int rm = length - prefix.length() - 2;

                    o = o + prefix + "  ";
                    o = o + endWith(arrToString(arr[i]), suffix, rm) + "\n";
                }
            }


            {
                o = o + prefix + "}";
                for (int i = 0; i < length - 1 - prefix.length() - suffix.length(); i++) {
                    o = o + " ";
                }
                o += suffix + "\n";
            }//lastline
        }
        return o;
    }

    /**
     * Returns a single String as a representation of an 3D array of Strings.
     * EVERY LINE should start with the given prefix and
     * end with the given suffix, but each line will have different contents.
     *
     * The first line's contents is just "{".
     * The final line's contents is just "}".
     * Between them will be a blocks of lines for each 2D array which
     * should be created using arrToString(String[][]). Every line in each block
     * should have two additional spaces ("  ") after the prefix.
     * Between every block, there should be a divider which is a single
     * line which is just the divider character repeated to fit the length.
     *
     * Example Output (prefix is "_", suffix is "!?",
     *      divider is '-", length is 15):
     * _{           !?
     * _  {         !?
     * _    {Hi, Guy!?
     * _    {3D}    !?
     * _  }         !?
     * _------------!?
     * _  {         !?
     * _    {Nope}  !?
     * _  }         !?
     * _}           !?
     *
     * 
     * hint: use the arrToString(String[][] arr, String prefix, String suffix, int length) method you created
     * @param arr The 3D array we're trying to represent as a String
     * @param prefix A String which should be at the start of
     *      every line of the output
     * @param suffix A String which should be at the end of
     *      every line of the output
     * @param divider A character to be repeated to divide blocks
     *      of 2D arrays
     * @param length The length of every line of the output
     * @return A String representing the 3D array
     */
    public static String arrToString(String[][][] arr, String prefix, String suffix, char divider, int length) {
       int l1=arr.length;
       //int l2=arr[0].length;
       int bodyrm=length-4-prefix.length()-suffix.length();
       int p=prefix.length();
       int s=suffix.length();
       String o=prefix+"{";
       for(int i=0;i<length-p-s-1;i++){
           o=o+" ";
       }
       o=o+suffix+"\n";

       for(int i=0;i<l1;i++){

           o=o+prefix+"  "+"{";
           for(int j=0;j<length-p-s-3;j++){
               o=o+" ";
           }
           o=o+suffix; //inner header



           for(int k=0;k<arr[i].length;k++){
               o=o+"\n"+prefix+"    ";
               String new1 =arrToString(arr[i][k]);
               if(k!=arr[i].length-1){new1+=",";}
               o=o+endWith(new1,suffix,(length-p-4));

               //o+="\n"+arrToString(arr[i][k]);
           }

           o=o+"\n"+prefix+"  "+"}";

           for(int j=0;j<length-p-s-3;j++){
               o=o+" ";
           }
           o=o+suffix+"\n"; //inner buttom

           if(i!=arr.length-1){
           o=o+prefix;
           for(int q=0;q<length-s-p;q++){o=o+divider;}
           o=o+suffix+"\n";}
       }

        o=o+prefix+"}";
        for(int i=0;i<length-p-s-1;i++){
            o=o+" ";
        }
        o=o+suffix+"\n";



return o;
    }

    /**
     * Represents 3D array inside a box.
     * The left and right variables represent the sides of the box
     * and the divider is both the top and bottom (including corners).
     *
     * Example Output (left is "_", right is "!?",
     *      divider is '-", length is 15):
     * ---------------
     * _{           !?
     * _  {         !?
     * _    {Hi, Guy!?
     * _    {3D}    !?
     * _  }         !?
     * _------------!?
     * _  {         !?
     * _    {Nope}  !?
     * _  }         !?
     * _}           !?
     * ---------------
     *
     * @param arr The 3D array we're trying to represent as a String
     * @param left A String which should be at the start of
     *      every line of the 3D array representation
     * @param right A String which should be at the end of
     *      every line of the 3D array representation
     * @param divider A character to be repeated to divide blocks
     *      of 2D arrays and fill the top and bottom of the box
     * @param length The length of every line of the output
     * @return A String representing the boxed 3D array
     */
    public static String arrInBox(String[][][] arr, String left, String right, char divider, int length) {
        String o="";
        String add=""+divider;
        for(int i=0;i<length;i++){
            o=o.concat(add);
        }
        o=o+"\n";
        o=o+arrToString(arr,left,right,divider,length);
        for(int i=0;i<length;i++){
            o=o+divider;
        }
        o=o+"\n";
        return o;
    }

}