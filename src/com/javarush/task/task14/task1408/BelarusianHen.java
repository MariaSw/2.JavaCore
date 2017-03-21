package com.javarush.task.task14.task1408;

/**
 * Created by Cookie on 21.03.2017.
 */
public class BelarusianHen extends Hen implements Country{
    public int getCountOfEggsPerMonth(){
        return 15;
    }
    String getDescription(){
        return String.format("%s Моя страна - %s. Я несу %s яиц в месяц.",
                super.getDescription(), BELARUS, getCountOfEggsPerMonth());
    }
    //<getDescription() родительского класса> + <» Моя страна — Sssss. Я несу N яиц в месяц.»>
    //где Sssss — название страны
    //где N — количество яиц в месяц
}
