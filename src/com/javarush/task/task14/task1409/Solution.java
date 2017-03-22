package com.javarush.task.task14.task1409;

/* 
Мосты
*/

public class Solution {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    public static void println(Bridge bridge){//сужение
        System.out.println(bridge.getCarsCount());//программа сама знает какой метод вызвать,
        // в зависимости от объекта на который ссылается переменная, несмотря на одинак. название
    }
}

