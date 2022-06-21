package com.company;

import java.util.Scanner;

public class HackerRank1007 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        int a, b, n, sum;

        for (int i = 0; i < test; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();
            sum = a;

            for (int j = 0; j < n; j++) {
                sum += Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
