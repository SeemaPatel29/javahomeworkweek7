package javahworkweek7;

import java.util.Scanner;

/**
 * 16. write the java program to check if enter number is "POSITIVE", "NEGATIVE" or
 * "ZERO".
 */
public class P_16_PositiveNOrZero {
    public static void main(String[] args) {
         zero();

    }
    private static void zero(){
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");
        num = scan.nextInt();
        scan.close();
        //check the number is greater than 0 or not used if syntax
        if (num > 0){
            System.out.println("The number is Positive.");
            //check the number is less than 0 or not
        } else if (num < 0) {
            System.out.println("The number is Negative.");
          //executes when the above two conditions return false
        }else {
            System.out.println("The number is Zero.");
        }



    }


}
