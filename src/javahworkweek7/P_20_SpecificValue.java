package javahworkweek7;
/**
 * 20. Write a java program to test if an array contains a specific value.
 */

import java.util.Scanner;

public class P_20_SpecificValue {
    public static void main(String[] args) {
        value();
        // used array and also scanner with for loop to find specific number
    }
    public static void value(){
        int x;
        Scanner scan =new Scanner(System.in);
        System.out.println("Please Enter the specific value :");
        x = scan.nextInt();
        scan.close();
        int[] num = {10, 30, 50,60,70,80};
        int toFind = x;
        boolean found = false;
        for (int n : num){
            if (n == toFind){
              found = true;
              break;
            }
        }
        if (found)
            System.out.println(toFind + " is found.");
        else {
            System.out.println(toFind + " is not found.");
        }

    }

}
