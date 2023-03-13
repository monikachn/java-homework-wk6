package homework;

/**
 *Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */
public class BinaryNo16 {

    public static void main(String[] args) {



        int n = Integer.valueOf("10",  2);
        int n1 = Integer.valueOf("11",  2);

        System.out.println(Integer.toBinaryString( n+n1));
    }
}
