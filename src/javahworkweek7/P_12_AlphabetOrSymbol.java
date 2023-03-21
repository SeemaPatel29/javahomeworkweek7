package javahworkweek7;
/**
 * 12. Write a program to print the numbers between 1 to 100 which can be
 * divided by 3 and 5 separately.
 */

import java.util.Scanner;

public class P_12_AlphabetOrSymbol {

    public static void main(String[] args) {
        identifyInput();

    }
    public static void identifyInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = scan.next().charAt(0);
        scan.close();
        if ((ch >= 'a' && ch <= 'z' ) || (ch >= 'A' && ch<= 'Z')){
            System.out.println("Showing A ALPHABET.");

        }else if (ch >= '0' && ch <= '9'){
            System.out.println("Showing A DIGIT.");
        }else {
            System.out.println("Showing A SPECIAL CHARACTER.");
        }

    }
}
