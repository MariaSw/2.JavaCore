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


            String numS1 = reader.readLine();
        if (!numS1.matches("\\d+"))
            throw new NumberFormatException();

            String numS2 = reader.readLine();
        if (!numS2.matches("\\d+"))
            throw new NumberFormatException();

            int num1 = Integer.parseInt(numS1);
            int num2 = Integer.parseInt(numS2);

            System.out.println(findNOD(findDublicates(findDel(num1)),findDublicates(findDel(num2))));

    }
    public static ArrayList findDel(int num1) {
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 2; i <= num1; i++) {
            while (true) {
                if (num1 % i == 0) {
                    list1.add(i);
                    num1 = num1 / i;
                    }else break;
            }
            if (num1 == i) list1.add(num1);
        }
        return list1;
    }
        public static HashMap findDublicates(ArrayList<Integer> list1) {

        HashMap<Integer, Integer> puth = new HashMap<>();

            for (int i = 0; i < list1.size(); i++){
                if (puth.containsKey(list1.get(i))){
                    for (Map.Entry<Integer,Integer> pair:puth.entrySet()){
                      if (list1.get(i)==pair.getKey())
                          pair.setValue(pair.getValue()+1);
                    }
                }else{
                    puth.put(list1.get(i), 1);
                }
            }
        return puth;
        }

        public static int findNOD(HashMap<Integer,Integer> map1,HashMap<Integer, Integer> map2) {
        int NOD = 1;

            for (Map.Entry<Integer, Integer> pair1:map1.entrySet()){
                for (Map.Entry<Integer, Integer> pair2:map2.entrySet()){
                    if(pair1.getKey()==pair2.getKey()){
                        if (pair1.getValue()>=pair2.getValue()) {
                            NOD = NOD * (int) Math.pow(pair1.getKey(), pair2.getValue());
                        }

                        else
                            NOD = NOD*(int)Math.pow(pair1.getKey(),pair1.getValue());
                    }
                }
            }

            return NOD;
        }

    }