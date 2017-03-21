package com.javarush.task.task14.task1408;

/**
 * Created by Cookie on 21.03.2017.
 */
public class RussianHen extends Hen implements Country{
    public int getCountOfEggsPerMonth(){
        return 30;
    }
    String getDescription(){return String.format("%s Моя страна - %s. Я несу %s яиц в месяц.",
            super.getDescription(), RUSSIA, getCountOfEggsPerMonth());}
}
