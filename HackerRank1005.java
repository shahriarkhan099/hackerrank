package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class HackerRank1005 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> stringArray = new ArrayList<String>();
        ArrayList<Integer> intArray = new ArrayList<Integer>();

        takeInput(stringArray, intArray);
        printInput(stringArray, intArray);
    }

    static void takeInput(ArrayList<String> stringArray, ArrayList<Integer> intArray) {

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String lineArray[] = line.split(" ");
            stringArray.add(lineArray[0]);
            intArray.add(Integer.valueOf(lineArray[1]));
        }
    }

    static void printInput(ArrayList<String> stringArray, ArrayList<Integer> intArray){
        System.out.println("================================");
        for(int i=0; i<stringArray.size(); i++){
            System.out.print(stringArray.get(i));
            for(int j=stringArray.get(i).length(); j<15; j++){
                System.out.print(" ");
            }
            for(int j=String.valueOf(intArray.get(i)).length(); j<3; j++){
                System.out.print("0");
            }
            System.out.println(intArray.get(i));
        }
        System.out.println("================================");
    }

}
