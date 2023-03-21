package javahworkweek7;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
public class P_2_LeapYear {
    public static void main(String[] args) {
        P_2_LeapYear obj = new P_2_LeapYear();
        obj.leapyear();

    }
    public void leapyear(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year number  :");
        int number = scan.nextInt();
        scan.close();
        if (number % 4 ==0) {
            System.out.println("This is a leap year");
        }else {
            System.out.println("This is not a leap year");

        }

    }
}
