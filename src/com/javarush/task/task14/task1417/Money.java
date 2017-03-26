package com.javarush.task.task14.task1417;

public abstract class Money {

    private double amount;//поле

    public double getAmount(){//геттер
        return amount;
    }

    public Money(double amount) {//конструктор
        this.amount=amount;
    }

    //public abstract double getAmount();

    public abstract String getCurrencyName();//метод геттер
}

