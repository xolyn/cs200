///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           PigLatinator
// Course:          COMP SCI 200
//
// Author:          Ly
// Email:           lzhou256@wisc.edu
// Lecturer's Name: Jim Williams
//
///////////////////////////////// CITATIONS ////////////////////////////////////
//
// Source or Recipient; Description
// Examples:
// Jane Doe; helped me with for loop in reverse method
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html;
//         counting for loop
// John Doe; I helped with switch statement in main method.
//
/////////////////////////////// 80 COLUMNS WIDE ////////////////////////////////

public class PigLatinator
{

    /**
     * Takes a character array and arranges the characters into it's pig-latin form
     *
     * If a word starts with a consonant, use the startsConsonant method.
     * If a word starts with a vowel, use the startsVowel method.
     * If a word contains no vowels, use the startsConsonant method.
     * Hint: Use your isVowel method to cut down on repetitive code
     *
     * Example: char[] input = {'h', 'e', 'l', 'l', 'o'} gives
     *          char[] output = {'e', 'l', 'l', 'o', '-', 'h', 'a', 'y'}
     *          char[] input = {'f', 'l', 'a', 'r', 'e'} gives
     *          char[] output = {'a', 'r', 'e', '-', 'f', 'l', 'a', 'y'}
     *          char[] input = {'i', 't'} gives
     *          char[] output = {'i', 't', '-', 'y', 'a', 'y'}
     *          char[] input = {'s', 'h', 'h'} gives
     *          char[] output = {'s', 'h', 'h', '-', 'a', 'y'}
     *          
     *
     * @param input The char array to rearrange to pig-latin.
     * @return A new char array containing the pig-latin of input. If input is null, return null.
     */
    public static char[] pigLatin(char[] input)
    {
        if (input==null){return null;}
        else if (isVowel(input[0])==true){return startsVowel(input);}
        else /*(isVowel(input[0])==false)*/{return startsConsonant(input);}



    }

    /**
     * This method is to transform words that begin with a consonant into pig-latin.
     * If a word starts with a consonant, search through the word beginning at index 0 for the first 
     * instance of a vowel. Split the array at this vowel, moving the consonants to the back of the array, 
     * following a '-'. The  add 'ay' at the end of the word.
     * If a word contains no vowels, just add "ay" at the end of the word following a '-'.
     * NOTE: Do not use string methods to rearrange your arrays; you should use the indexes
     * 
     * @param input - The char array to rearrange to pig-latin.
     * @return A new char array containing the pig-latin of input.
     */
    public static char[] startsConsonant(char[] input) {
        /*
        int[] test=new int[input.length];
        for(int i=0;i< input.length;i++){
            test[i]=input[i];
        }
        */
        int index=-1;
        for1:for(int i=0;i< input.length;i++){
            if(isVowel(input[i])==true)
            {
                index=i;
                break for1;
            }
        }
        //System.out.println(index);//元音位数

        char[] tst=new char[input.length+3];

        if(index==-1)//没有元音
            {
            for(int i=0;i<input.length;i++){tst[i]=input[i];}
            tst[input.length]='-';
            tst[input.length+1]='a';
            tst[input.length+2]='y';
            }
        else //有元音
            {
                for (int j = index; j < input.length; j++)
                {
                    tst[j - index] = input[j];
                }
                tst[input.length - index] = '-';
                for (int k = 0; k < index; k++)
                {
                    tst[input.length - index + 1 + k] = input[k];
                }
                tst[tst.length - 2] = 'a';
                tst[tst.length - 1] = 'y';
            }
        //System.out.print(tst);
        return tst;
    }

    /**
     * This method is to transform words that begin with a vowel into pig-latin.
     * If a word starts with a vowel add the word "yay" at the end of the word following a '-'.
     * NOTE: Do not use string methods to rearrange your arrays; you should use the indexes
     * 
     * @param input, the letter being checked if it is a vowel
     * @return A new char array containing the pig-latin of input.
     */

    public static char[] startsVowel(char[] input) {
        char tst[]=new char[input.length+4];
        for(int i=0;i<input.length;i++){tst[i]=input[i];}
        tst[input.length]='-';
        tst[input.length+1]='y';
        tst[input.length+2]='a';
        tst[input.length+3]='y';

        return tst;
    }
    /**
     * Takes a letter, and checks if it is a vowel, then returns true is yes, false if no.
     * 
     * Vowels are: a, e, i, o, u 
     * (Note: We are not considering y for this program.)
     * 
     * @param letter, the letter being checked if it is a vowel
     * @return A boolean, true if letter is vowel, otherwise false
     */
    public static boolean isVowel(char letter)
    {
        boolean a=false;
        if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){a=true;}
        else{}
        return a;
    }

    /**
     * This is test method for the pigLatin() method
     * 
     * This method already contains 3 tests, but you should consider adding more to 
     * test different input.
     * 
     */
    public static void testPigLatin()
    {
        char arr[] = {'f', 'l', 'a', 'r', 'e'};
        char arr2[] = {'b', 'o', 'o', 'k'};
        char arr3[] = {'i', 't'};



        System.out.print("Expected: are-flay\nActual: ");
        System.out.println(pigLatin(arr));
        System.out.print("Expected: ook-bay\nActual: ");
        System.out.println(pigLatin(arr2));
        System.out.print("Expected: it-yay\nActual: ");
        System.out.println(pigLatin(arr3));


    }

    /**
     * This is the main method of your program. This is where we will call our test method.
     * 
     * @param args
     */

    public static void main(String[] args)
    {
        //char[] tst={'i','i','o','o','r'};
        //startsConsonant(tst);
        //System.out.println("\n"+isVowel('a'));
        //System.out.print(startsVowel(tst));
        //
        testPigLatin();
        System.out.println((char)111);
    }
}
