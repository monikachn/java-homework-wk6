package homework;

import java.util.Scanner;

/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
public class AveOfThreeNo13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program calculates Avergae. provide three numbers. e.g. 4 18 12 ");
        int num1 = scanner.nextInt();
        System.out.println(num1);

      int num2 = scanner.nextInt();
        System.out.println(num2);
        int num3 = scanner.nextInt();
        System.out.println(num3);
        scanner.close();

        average(num1, num2, num3);
    }
    public static void average(int num1, int num2, int num3){
        System.out.println( "Average is: " + (num1 + num2 + num3)/3);
    }

}






