package javahworkweek7;

/**
 * 19. Write a java program to calculate the average value of array elements.
 */

public class P_19_AvgArray {
    public static void main(String[] args) {
        value();

    }
    public static void value(){
        double[]numArray = {10.6, -10.0, 12.4, 15.0};
        double sum = 0.0;
        for (double num : numArray){
            sum +=num;
        }
        double average = sum / numArray.length;
        System.out.println("The average is :" + average);

    }

}
