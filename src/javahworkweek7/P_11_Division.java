package javahworkweek7;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */
public class P_11_Division {
    public static void main(String[] args) {
        numbers();
    }
    public static void numbers(){
        System.out.println("\nDivision by 3:");
        for (int i= 1; i < 100; i++){
            if (i % 3 == 0);
            System.out.println(i + ",");
        }
        System.out.println("\n\nDivision by 5");
        for (int x = 1; x < 100; x++){
            if (x %5==0 ) ;
            System.out.println(x + ",");
        }


    }
}
