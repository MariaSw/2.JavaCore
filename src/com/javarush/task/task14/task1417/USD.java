package com.javarush.task.task14.task1417;

/**
 * Created by Cookie on 26.03.2017.
 */
public class USD extends Money {
    public USD(double amount) {//конструктор
        super(amount);
    }
    public String getCurrencyName() {
        return "USD";
    }
}
