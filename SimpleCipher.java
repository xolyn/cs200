///////////////////////// TOP OF FILE COMMENT BLOCK ////////////////////////////
//
// Title:           SimpleCipher
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
import java.util.Arrays;

public class SimpleCipher 
{

    /**
     * Encrypts an array based on the given key.
     *
     * The encryption will be a simple XOR cipher. Each element in the toEnc 
     * array is XOR'd (^) with the corresponding element in the key array. If the
     * key is shorter than toEnc, then repeatedly traverse the key as needed 
     * in order to encode each element of toEnd.
     * Hint: This is best accomplished by using the mod (%) operator.
     *
     * Example: int[] toEnc = {'H', 'e', 'l', 'l', 'o'} and
     *          int[] key = {'f', 'o', 'o'} gives
     *          [46, 10, 3, 10, 0] as
     *          'H' ^ 'f' = 46
     *          'e' ^ 'o' = 10
     *          'l' ^ 'o' = 3
     *          'l' ^ 'f' = 10
     *          'o' ^ 'o' = 0
     *
     * @param toEnc The integer array to encrypt.
     * @param key The key used by the cipher for encryption the array.
     * @return A new int array containing the encryption of toEnc with key.
     */
    public static int[] encrypt(int[] toEnc, int[] key) {
        int textl=toEnc.length;
        int keyl= key.length;
        /*
        int r=textl%keyl;
        int [] neout=new int [textl];
        for(int i=0;i<keyl;i++){
            neout[i]=toEnc[i]^key[i];
        }
        for(int j=0;j<r;j++){
            neout[keyl+j]=toEnc[keyl+j]^key[j];
        }
        */
        int [] res=new int[toEnc.length];
        int [] anew=new int[test(toEnc,key).length];
        for(int i=0;i<test(toEnc,key).length;i++){
            anew[i]=test(toEnc,key)[i];}
        for(int j=0;j<textl;j++){
            anew[j]=toEnc[j]^anew[j];
        }

        return anew;

    }

    /**
     * Decrypts an array based on a given key.
     *
     * The simple cipher described in the encrypt method uses XOR for the 
     * encryption. In this method, we want to decrypt the array. That means we
     * need to do the inverse operation from the encryption. Interestingly, the
     * inverse operation of XOR is XOR. That is, 7^4 = 3 and 3^4 = 7. Hence, we 
     * can use the encrypt method to decrypt.
     *
     * Call the encrypt method with the appropriate parameters... 
     * DON'T DUPLICATE CODE! 
     *
     * @param toDec The integer array to decrypt.
     * @param key The key used by the cipher for encryption the array.
     * @return A new int array containing the decryption of toDec with key.
     */
    public static int[] decrypt(int[] toDec, int[] key) {
        /*int textl=toDec.length;
        int keyl= key.length;
        int t1=textl/keyl;
        int r=textl%keyl;
        int [] neout=new int [textl];
        int [] key1=new int[textl];
        for(int i=0;i<textl;i+=keyl){
            for(int j=0;j<keyl;j++){
                key1[j+i]=key[j];
            }
            System.out.println(key1);
        }
        return neout;
        */
        /*
        int textl=toDec.length;

        int keyl= key.length;
        int r=textl%keyl;
        int [] neout=new int [textl];
        for(int i=0;i<keyl;i++){
            neout[i]=toDec[i]^key[i];
        }
        for(int j=0;j<r;j++){
            neout[keyl+j]=toDec[keyl+j]^key[j];
        }
        */
        int textl=toDec.length;
        int keyl= key.length;
        int [] res=new int[toDec.length];
        int [] anew=new int[test(toDec,key).length];
        for(int i=0;i<test(toDec,key).length;i++){
        anew[i]=test(toDec,key)[i];}
        for(int j=0;j<textl;j++){
            anew[j]=toDec[j]^anew[j];
        }

        return anew;


    }

    /** 
     * A utility method to convert (with possible loss of precision) from an int
     * array to a char array.
     *
     * This method create a new char array of the same length as intArr. Then, element i of 
     * intArr should be stored as a char in the new array at index i for all i of intArr.
     * That is, each element in the returned array should correspond with the same index on 
     * the original array.
     *
     * @param intArr The int array to convert.
     * @return A new char array with the converted values. If intArr is null, 
     *         this method should return null.
     */
    public static char[] toCharArr(int[] intArr) {
        if(intArr==null){return null;}

        else{
        int l= intArr.length;
        char[] charArr=new char[l];
        for(int i=0;i<l;i++){
            charArr[i]=(char)intArr[i];
        }

        return charArr;}
    }

    /** 
     * A utility method to convert from a char array to an int array.
     *
     * This method create a new int array of the same length as charArr. Then, element i of 
     * charArr should be stored as an int in the new array at index i for all i of charArr.
     * That is, each element in the returned array should correspond with the same index on 
     * the original array.
     *
     * @param charArr The char array to convert.
     * @return A new int array with the converted values. If charArr is null, 
     *         this method should return null.
     */    
    public static int[] toIntArr(char[] charArr) {
        if(charArr==null){return null;}

        else {
            int l = charArr.length;
            int[] intArr = new int[l];
            for (int i = 0; i < l; i++) {
                intArr[i] = (int) (charArr[i]);
            }

            //if(charArr==null){return null;}
            //else{return intArr;}
            return intArr;
        }
    }

    /**
     * This zyBooks only does unit tests of your methods. So, use the main method 
     * to test your methods.
     */
    public static void main(String[] args) {
        // The toIntArr and the toCharArr may be useful in testing your encrypt/decrypt methods
        int arr[] = {'H', 'e', 'l', 'l', 'o'};
        int key[] = {'f', 'o', 'o'};
        int d[]={0,1,2,3,4,5,6,7,8};
        int k[]={1};
        //decrypt(d,k);
        System.out.println(Arrays.toString(encrypt(arr, key))); // Should be [46, 10, 3, 10, 0]
        System.out.println(toCharArr(encrypt(encrypt(arr, key), key))); // Should be Hello
        System.out.println(toCharArr(decrypt(encrypt(arr, key), key))); // Should be Hello
        //test(d,k);
        //System.out.println(decrypt(d,k));
        //
    }





    public static int[] test(int[]a,int[]b) {
        int al = a.length;
        int bl = b.length;
        int outime = al / bl;
        int rmnt = al % bl;
        int ka = al - rmnt;
        int[] l1 = new int[al];
        for (int i = 0; i < ka; i += bl) {
            for (int j = 0; j < bl; j++) {
                l1[i + j] = b[j];
            }
        }
        for (int q = 0; q < rmnt; q++) {
            l1[q + ka] = b[q];
        }
        for (int k = 0; k < l1.length; k++) {
            //System.out.println(l1[k]);

        }
        return l1;
    }
}




















