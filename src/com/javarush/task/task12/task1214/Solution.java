package com.javarush.task.task12.task1214;

/* 
Класс Cow от Animal
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();//абстрактный метод
    }

    public static class Cow extends Animal {
        public String getName(){
            return "Корова";// переписанный метод
        }
    }

}
