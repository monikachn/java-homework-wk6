package homework;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class TemToCelsius7 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter a temperature");
        float fahr= scanner.nextFloat();
        float cel = (fahr - 32) * 5/9;
        System.out.println("celcius + = " +cel );
    }
}
