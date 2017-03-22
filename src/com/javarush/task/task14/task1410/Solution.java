package com.javarush.task.task14.task1410;

/* 
Дегустация вин
*/

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink() {
        return new BubblyWine();//нельзя создать объект абстрактного класса, но
        //любой объект наследник хранит методы базового абстрактного класса
    }

    public static Wine getWine() {
        return new Wine();
    }

    public static Wine getBubblyWine() {
        return new BubblyWine();//объект наследник можно сохранить в переменную базового класса
    }
}
