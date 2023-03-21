package javahworkweek7;

import java.util.Scanner;

/**
 * Same as above program-8 using switch statement.
 */
public class P_9_CityNameWithSwitch {
    public static void main(String[] args) {
        cityname();
    }
    public static void cityname() {
        String grade;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A to F");
        grade = scan.next();
        scan.close();

        switch (grade) {
            case "A":
                System.out.println("Amersham");
                break;
            case "B":
                System.out.println("Barcelona");
                break;
            case "C":
                System.out.println("Chesham");
                break;
            case "D":
                System.out.println("Doncaster");
                break;
            case "E":
                System.out.println("Enfield");
                break;
            case "F":
                System.out.println("Felthan");
                break;
            default:
                System.out.println("Invalid output");

        }

    }

}
