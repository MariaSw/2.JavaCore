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
            String numS2 = reader.readLine();

            if(isValid(numS1)&&isValid(numS2))
            System.out.println(findNOD(findDublicates(findDel(Integer.parseInt(numS1))),findDublicates(findDel(Integer.parseInt(numS2)))));

    }
    public static boolean isValid (String num){
        if (!num.matches("\\d+")||num.charAt(0)=='0')
            throw new NumberFormatException("Введите два целых положительных числа.");
        else return true;
    }
    public static ArrayList findDel(int num1) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 2; i <= num1; i++) {
            while (true) {/**цикл внутри цикла неободим для мнократного использования одного и то же числа*/
                if (num1 % i == 0) {/**если исходное число делится на предложенное число без остатка, */
                    list.add(i);/**добавляем его в список*/
                    num1 = num1 / i;/**делим на предложенное число, переопределяем исходное число для поиска последующих делителей*/
                    }else break;/**в случае, если исходное число не делится без остатка, выходим из цикла, пробуем делить на след. число*/
            }
        }
        return list;
    }
        public static HashMap findDublicates(ArrayList<Integer> list) {

        HashMap<Integer, Integer> puthere = new HashMap<>();/**карта для перекладывания чисел с целью нахождения каоличества повторов каждого числа*/

            for (int i = 0; i < list.size(); i++){
                if (puthere.containsKey(list.get(i))){/**2. Если уже содержит*/
                    for (Map.Entry<Integer,Integer> pair:puthere.entrySet()){
                      if (list.get(i)==pair.getKey())/**ищем такое число в карте*/
                          pair.setValue(pair.getValue()+1);/**меняем увеличиваем счетчик на 1*/
                    }
                }else{
                    puthere.put(list.get(i), 1);/**1. Если карта не содержит такое число, кладем, ставим счетчик - 1*/
                }
            }
        return puthere;
        }

        public static int findNOD(HashMap<Integer,Integer> map1,HashMap<Integer, Integer> map2) {
        int NOD = 1;/**ставим дефолтом 1, если ни один делитель не совпадает*/

            for (Map.Entry<Integer, Integer> pair1:map1.entrySet()){
                for (Map.Entry<Integer, Integer> pair2:map2.entrySet()){
                    if(pair1.getKey()==pair2.getKey()){/**сравниваем делители двух карт(чисел), на наличие одинаковых*/
                        if (pair1.getValue()>=pair2.getValue()) {/**далее берем наименьший показатель счетчика повторов из двух карт */
                            NOD = NOD * (int) Math.pow(pair2.getKey(), pair2.getValue());/**и возводим в такую степень*/
                        }

                        else
                            NOD = NOD*(int)Math.pow(pair2.getKey(),pair1.getValue());
                    }
                }
            }

            return NOD;
        }

    }