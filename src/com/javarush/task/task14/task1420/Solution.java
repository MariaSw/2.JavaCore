package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1=Integer.parseInt(reader.readLine());
        int num2=Integer.parseInt(reader.readLine());

        findNOD(findDublicates(findDel(num1)),findDublicates(findDel(num2)));
    }
    public static ArrayList findDel(int num1) {
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 2; i <= num1; i++) {
            for (int j = i; ; ) {
                if (num1 % j == 0) {
                    list1.add(j);
                    num1 = num1 / j;
                } else break;
                if (num1 == i) list1.add(num1);
            }
        }
        return list1;
    }
        public static HashMap findDublicates(ArrayList<Integer> list1) {
        HashMap<Integer, Integer> dublicates = new HashMap<>();
        ArrayList<Integer> puthere = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            if (puthere.contains(list1.get(i))) {
                if (dublicates.containsKey(list1.get(i))) {
                    for (Map.Entry<Integer, Integer> pair : dublicates.entrySet()) {
                        if (pair.getKey() == list1.get(i)) pair.setValue(pair.getValue() + 1);
                    }
                } else {
                    dublicates.put(list1.get(i), 1);
                }
            } else puthere.add(list1.get(i));
        }
            return dublicates;
        }

        public static int findNOD(HashMap map1,HashMap map2) {
        int NOD = 1;

        
        return NOD;
        }

    }