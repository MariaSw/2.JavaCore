package com.javarush.task.task12.task1229;

/* 
Родитель класса CTO
*/

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class CTO extends Miner implements Businessman {
//чтобы не реализовывать тут, создали доп. класс, в который добавили нужный метод
    }
    public static class Miner{
        public void workHard(){}
    }
}
