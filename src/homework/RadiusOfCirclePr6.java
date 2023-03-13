package homework;

import sun.util.resources.ms.CalendarData_ms_MY;

import java.util.Scanner;

/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */
public class RadiusOfCirclePr6 {
    static double radius ,area;
    static double PI  =  3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of circle = ");
        radius = scanner.nextDouble();
        // Area =PI*radius*radius)
        MyMethod();
        scanner.close();
    }

    public static void MyMethod(){
        area =PI*radius*radius;
        System.out.println("Area of the circle is:" + area);

    }

}
