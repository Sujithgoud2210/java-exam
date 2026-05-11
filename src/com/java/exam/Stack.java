package com.java.exam;

import java.util.Scanner;

class Stack {
    public class FactorialRecursion {

        static long factorial(int n) {
            if (n == 0 || n == 1)
                return 1;

            return n * factorial(n - 1);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            if (n < 0) {
                System.out.println("Invalid number");
            } else {
                System.out.println("Factorial = " + factorial(n));
            }
        }
    }
}
