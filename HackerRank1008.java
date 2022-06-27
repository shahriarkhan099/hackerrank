package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class HackerRank1008 {
    static String str;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for (int i = 0; i < test; i++) {
            ArrayList<String> dataTypes = new ArrayList<String>();
            try {
                byte n = sc.nextByte();
                addPrint(String.valueOf(n), 4, dataTypes);
            } catch (Exception e) {
                try {
                    short n = sc.nextShort();
                    addPrint(String.valueOf(n), 3, dataTypes);
                } catch (Exception er) {
                    try {
                        int n = sc.nextInt();
                        addPrint(String.valueOf(n), 2, dataTypes);
                    } catch (Exception err) {
                        try {
                            str = sc.next();
                            long n = Long.valueOf(str);
                            addPrint(String.valueOf(n), 1, dataTypes);
                        } catch (Exception error) {
                            System.out.println(str + " can't be fitted anywhere.");
                        }
                    }
                }
            }
        }
    }

    public static void addPrint(String n, int dataNum, ArrayList<String> dataTypes) {
        String strArray[] = {"byte", "short", "int", "long"};
        for (int i = 4 - dataNum; i < strArray.length; i++) {
            dataTypes.add(strArray[i]);
        }
        System.out.println(n + " can be fitted in:");
        dataTypes.forEach(n1 -> System.out.println("* " + n1));
    }
}
