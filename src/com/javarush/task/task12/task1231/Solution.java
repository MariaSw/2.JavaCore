package com.javarush.task.task12.task1231;

/* 
Нужно исправить программу, чтобы компилировалась и работала
*/

public class Solution {

    public static void main(String[] args) {
        Horse horse = new Pegas();
        horse.run();
    }

    public static interface Fly {
        public void fly();//delete
    }

    public static class Horse {//delete
        public void run() {

        }
    }

    public static class Pegas extends Horse implements Fly {
        public void fly() {//delete

        }
    }

    public static abstract class SwimPegas extends Pegas {//add
        public abstract void swim();//add
    }

}
