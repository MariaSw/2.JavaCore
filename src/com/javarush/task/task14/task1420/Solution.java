package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1=Integer.parseInt(reader.readLine());
        int num2=Integer.parseInt(reader.readLine());

        System.out.println(NOD(num1,num2));
    }
    public static int NOD(int num1, int num2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 2; i <= num1; i++) {
            for (int j = 2; j <= i; j++) {
                if (num1 % j == 0) list1.add(j);
                num1 = num1 / j;
            }
        }
        for (int i = 2; i <= num2; i++) {
            for (int j = 2; j <= i; j++) {
                if (num1 % j == 0) list2.add(j);
                num2 = num2 / j;
            }
        }
        int del;
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                //if (list1.get(i)==)
            }
        }
        return 0;

    }}