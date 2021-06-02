package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World!");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first integer");
        int first = scan.nextInt();
        System.out.println("You entered " + first);

        System.out.println("Enter the second integer");
        int second = scan.nextInt();
        System.out.println("You entered " + second);

        if (first==second){
            System.out.println("First Number is equal to second number.");
        }

        if (first!=second){
            System.out.println("First number is not equal to second number.");
        }

        if (first>second){
            System.out.println("First number is greater than second number.");
        }

        if (first<second){
            System.out.println("First number is less than second number.");
        }


    }
}
