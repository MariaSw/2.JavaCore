package com.javarush.task.task14.task1419;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions()  {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            InputStream inputStream = new FileInputStream("I_don't_exist.txt");

        } catch (FileNotFoundException e){// 2
            exceptions.add(e);
        }
        try {
            int[] array = new int[3];
            int f = array[5];
        }catch (ArrayIndexOutOfBoundsException e){// 3
            exceptions.add(e);
        }
        try{
            Object x = new Integer(0);
            System.out.println((String)x);

        }catch (ClassCastException e){//4
            exceptions.add(e);
        }
        try {
            Integer number = new Integer("45ewrwer");

        }catch (NumberFormatException e) {//5
            exceptions.add(e);
        }
        try {
            List<Integer> list = new ArrayList<Integer>();
            list.get(6);
        }
        catch (IndexOutOfBoundsException e){//6
            exceptions.add(e);
        }
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }catch (NullPointerException e){//7
            exceptions.add(e);
        }
        try{
            int[] array = new int[-10];
        }catch (NegativeArraySizeException e){//8
            exceptions.add(e);
        }
        try{
            Time.valueOf("ffhfhf");
        }catch (IllegalArgumentException e){//9
            exceptions.add(e);
        }
        try{
            Solution.class.getField("dfsd");//10
        }catch (NoSuchFieldException e){//10
            exceptions.add(e);
        }
    }
}
