package homework;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 */
public class Multiplication10 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number");
        int t=  scanner.nextInt();
        System.out.println(t);

        for (int i=1; i<=10; i++){
            System.out.println(t + " x " + i + " = " + (t*i));
        }

    }
}
