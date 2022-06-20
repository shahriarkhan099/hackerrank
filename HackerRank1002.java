package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class HackerRank1002 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> inputArray = new ArrayList<Integer>();
        takeInput(inputArray);
        inputArray.forEach(n-> System.out.println(n));
    }
    
    public static void takeInput(ArrayList<Integer> arr) {
       while(sc.hasNextInt()) {
           arr.add(sc.nextInt());
       }
    }
    
}
