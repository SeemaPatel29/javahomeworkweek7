package javahworkweek7;

import java.util.Arrays;

/**
 * 17. Write a java program to sort a number array and a string array.
 */
public class P_17_NumArray {
    public static void main(String[] args) {
        numeric();
    }
    public static void numeric(){
        int [] array1 = {
                203,57,2,105,10,99,15,239 };
        String [] array2 = {
                "Z","E","M","U","H","C","W"};
        System.out.println("Original numeric array :" + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted numeric array :"+ Arrays.toString(array1));
        System.out.println("Original numeric array :" + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted string array : " + Arrays.toString(array2));


        }
    }




