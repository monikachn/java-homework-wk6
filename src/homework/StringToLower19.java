package homework;
/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.the
 * Output: the quick brown fox jumps over the lazy dog.
 */

import java.util.Scanner;

public class StringToLower19 {
    public static void main(String[] args){
        String line = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        line = line.toLowerCase();
        System.out.println(line);
    }
}
