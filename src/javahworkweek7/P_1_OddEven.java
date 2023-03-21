package javahworkweek7;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class P_1_OddEven {
    static int a;

    public static void main(String[] args) {
        odd();
            }
            public static void odd(){
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter number to test : ");
                a = scan.nextInt();
                scan.close();
                String result = a % 2 ==0 ? "Even"  : "Odd";
                System.out.println(a + " is " + result);


            }


}



