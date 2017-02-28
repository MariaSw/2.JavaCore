package com.javarush.task.task12.task1201;

/* 
Я не корова, Я - кит
*/

public class Solution {
    public static void main(String[] args) {
        Cow cow = new Whale();
        Cow trueCow= new Cow();
        Whale trueWhale = new Whale();
        //Whale whale = (Whale)new Cow();//ошибка - рыба - не всегда селедка

        System.out.println(cow.getName());//так как объект, на который ссылается переменная это whale, метод вызовется из класса whale
        System.out.println(trueCow.getName());
        System.out.println(trueWhale.getName());
        System.out.println(trueWhale.getPhrase());//вызовется метод родительского класса
    }

    public static class Cow {
        public String getName() {
            return "Я - корова";
        }
        public String getPhrase(){return "Mooo";}
    }

    public static class Whale extends Cow {
        public String getName(){return  "Я не корова, Я - кит.";}
        public String getPhrase() {
            return super.getPhrase();
        }
    }
}
