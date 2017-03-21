package com.javarush.task.task14.task1405;

/* 
Food
*/

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();//от Selectable(мало методов) к Food(много методов) - расширение
        Food newFood = (Food) selectable;//не каждый selectable 100% Food, поэтому используем оператор привидения

        foodMethods(food);
        selectableMethods(selectable);
    }

    public static void foodMethods(Food food) {
        food.eat();
        food.onSelect();// у food есть метод интерфейса который он выполняет
    }

    public static void selectableMethods(Selectable selectable) {
        selectable.onSelect();// у переменной интерфейса есть только метод интерфейса
    }

    interface Selectable {
        void onSelect();
    }

    static class Food implements Selectable{
        public void eat() {
            System.out.println("food was eaten");
        }
        public void onSelect(){System.out.println("food was selected");}
    }
}
