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

        System.out.println(findNOD(findDublicates(findDel(num1)),findDublicates(findDel(num2))));
    }
    public static ArrayList findDel(int num1) {
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 2; i <= num1; i++) {
            for (int j = i; ; ) {
                if (num1 % j == 0) {
                    list1.add(j);
                    num1 = num1 / j;
                    }else break;
            }
            if (num1 == i) list1.add(num1);
        }
        for (int s:list1) {
            System.out.println(s);
        }
        return list1;
    }
        public static HashMap findDublicates(ArrayList<Integer> list1) {
        HashMap<Integer, Integer> dublicates = new HashMap<>();
        ArrayList<Integer> puthere = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            if (puthere.contains(list1.get(i))) {
                System.out.println("ololo");
                if (dublicates.containsKey(list1.get(i))) {/** 3) если дупликат повторяется еще раз*/
                    System.out.println("lala");
                    for (Map.Entry<Integer, Integer> pair : dublicates.entrySet()) {/** 4) ищем в мар*/
                        if (list1.get(i)==pair.getKey()) /** 5) повторяющийся дупликат, который совпадает с <какое число>*/
                            pair.setValue(pair.getValue() + 1);/** 6) увеличиваем количество повторов на 1*/
                        System.out.println("lalal");
                    }
                } else {
                    dublicates.put(list1.get(i), 2);/**2)если несвежее, кладем дубликат в мар, ставим количество повторов 2*/
                }
            } else puthere.add(list1.get(i));/** 1)перекладываем в пустой контейнер, если свежее*/
        }

           /***/ for (Map.Entry<Integer, Integer> pair : dublicates.entrySet()){
                System.out.println(pair.getKey()+" "+pair.getValue());
            }

        return dublicates;
        }

        public static int findNOD(HashMap<Integer,Integer> map1,HashMap<Integer, Integer> map2) {
        int NOD = 1;

            for (Map.Entry<Integer, Integer> pair1:map1.entrySet()){
                for (Map.Entry<Integer, Integer> pair2:map2.entrySet()){
                    if(pair1.getKey()==pair2.getKey()){
                        if (pair1.getValue()>=pair2.getValue())
                            NOD = pair1.getKey()*pair2.getValue();
                        else
                            NOD = pair1.getKey()*pair1.getValue();
                    }
                    else return NOD;
                }
            }
        return NOD;
        }

    }