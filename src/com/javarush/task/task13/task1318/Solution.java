package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//открыли поток чтения с клавы
        String filename = reader.readLine();//считали

        FileInputStream inputStream = new FileInputStream(filename);//открыли поток чтения содержимого файла

        while (inputStream.available()>0){
            int data = inputStream.read();//считали содержимое файла
            System.out.print((char)data);//все печатаем на 1 строке
        }
        System.out.println();//переносим курсор на новую строку

        inputStream.close();//закрыли поток чтения содержимого файла
        reader.close();//закрыли поток чтения с клавы

    }
}