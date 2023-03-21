package javahworkweek7;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */
public class P_5_Salary {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter Employee ID :");
        String empid= scan.nextLine();
        System.out.println("Enter Employee Name :");
        String name = scan.nextLine();
        System.out.println("Enter Basic salary :");
        double salary = scan.nextDouble();
        scan.close();

        System.out.println("|--------------------------------------------|");
        System.out.println("|             Salary Slip                    |");
        System.out.println("|                                            |");
        System.out.println("|--------------------------------------------|");
        System.out.println("| Employed ID  :   " + empid + "                         |" );
        System.out.println("| Employee Name :  "  + name  + "                         |");
        System.out.println("|                                            |");
        System.out.println("|--------------------------------------------|");
        System.out.println("| Basic Salary         : "  +  salary +  "              |");
        double HRA = (salary * 10) /100;
        System.out.println("| HRA                  : "   + HRA  +  "               |");
        double DA = (salary * 8) / 100;
        System.out.println("| DA                   : "   +   DA   + "              |");
        double TA = (salary * 9)/ 100;
        System.out.println("|  TA                  : "   + TA    +  "               |");
        double PF = (salary * 20)/ 100;
        System.out.println("|  PF                  : "   +   PF    +    "               |");
        System.out.println("|--------------------------------------------|");
        double Grosssalary = salary +HRA + DA + TA -PF;
        System.out.println("| Gross Salary    :"  +  Grosssalary  +   "                |");
        System.out.println("|============================================|");

    }
}
