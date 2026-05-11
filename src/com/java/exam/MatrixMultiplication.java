package com.java.exam;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] A = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int n2 = sc.nextInt();
        int p = sc.nextInt();

        int[][] B = new int[n2][p];

        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < p; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        if (n != n2) {
            System.out.println("Matrix multiplication not possible");
            return;
        }

        int[][] C = new int[m][p];

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < p; j++) {

                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Result Matrix:");

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < p; j++) {
                System.out.print(C[i][j] + " ");
            }

            System.out.println();
        }
    }
}
