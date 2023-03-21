package javahworkweek7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
public class P_8_CityName {
    public static void main(String[] args) {
        Alphabets();

    }
    public static void Alphabets() {
        char x;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A to F : ");
        x = scan.next().charAt(0);
        scan.close();

        if (x == 'A') {
            System.out.println("Amersham");
        }
        else if (x == 'B'){
            System.out.println("Barcelona");
        } else if (x == 'C'){
            System.out.println("Chesham");
        } else if (x == 'D'){
            System.out.println("Doncaster");
        } else if (x == 'E') {
            System.out.println("Enfield");
        } else  {
            System.out.println("Invalid Entry");

        }
    }
}
