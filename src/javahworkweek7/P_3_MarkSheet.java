package javahworkweek7;
/**
 * 3. Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 *
 */

import java.util.Scanner;

public class P_3_MarkSheet {

    String name;
    int roll, Maths, Science, English;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter  Student Name");
        String name = scan.nextLine();
        System.out.println("Enter roll number");
        int num = scan.nextInt();
        System.out.println("Enter marks in Maths:");
        int m = scan.nextInt();
        System.out.println("Enter marks in Science:");
        int m1 = scan.nextInt();
        System.out.println("Enter marks in English:");
        int m2 = scan.nextInt();
        scan.close();
        int total = m + m1 + m2;
        double percentage = total / 300.0 * 100.0;
        String result = "Fail";
        if (percentage >=35){
            result="Pass";
        }
        if (percentage >= 80) {
            result = "A+";
        } else if (percentage >= 60) {
            result = "A";
        } else if (percentage >= 50) {
            result = "B";
        } else if (percentage >= 35) {
            result = "C";
        } else if (percentage > 35) {
            System.out.println("Pass");
        } else if (percentage < 35) {
            System.out.println("Fail");
        }

        System.out.println("_______________________________________ ");
        System.out.println("|                                       |");
        System.out.println("|          Mark Sheet                   |");
        System.out.println("| Name               :  " + name +  "               |");
        System.out.println("| Roll No.:          : " + num +    "                |");
        System.out.println("| Subjacts           : Marks               |");
        System.out.println("| Maths              :" + m + "              |");
        System.out.println("| Science            :" + m1 + "              | ");
        System.out.println("| English            :" + m2 + "               |");
        System.out.println("| Total              :     " + total + "|");
        System.out.println("| Percentage         :" + percentage + "|");
        System.out.println("| Result             :                   |");
        System.out.println("| Grade              :  " + result + "                 | ");
        System.out.println("|                                        |");
        System.out.println("__________________________________________");
    }
}
