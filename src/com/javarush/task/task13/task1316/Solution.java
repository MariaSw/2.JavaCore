package com.javarush.task.task13.task1316;

/* 
Некорректные строки
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";

        void onPress();
    }

    interface Button extends SimpleObject {

        final String NAME = "Submit";

        //void onPress();- совпадает, нужно менять
        //public void onPress();-итак паблик, в остальном совпадает, нужно что то менять

        //protected void onPress();- только паблик



        //private void onPress();-только паблик

        //protected String onPress(Object o); - только паблик

        String onPress(Object o); /**можно создать метод с тем же именем, но другими параметрами - параметрический полиморфизм или перегрузка методов. Одинаковые методы нельзя*/

        //private String onPress(Object o);- только паблик

    }
}