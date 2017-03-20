package com.javarush.task.task13.task1317;

/* 
Погода
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FROZEN));//в параметр кладется строка из интерфейса из другого файла
    }

    static class Today implements Weather {
        private String type;

        Today(String type) {
            this.type = type;
        }//конструктор собирает объект today и кладет в него type который является строкой

        @Override
        public String toString() {
            return String.format("%s for today", this.getWeatherType());
        }//при переводе объекта в строку берется положенный в него тип через метод getWeatherType

        public String getWeatherType() {
            return type;
        }
    }

}
