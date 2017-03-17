package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//открыли поток для чтения с консоли
        String filename = reader.readLine();//считали "имя файла.расширение" с консоли

        FileWriter filewriter = new FileWriter(filename);//создали объект для записи файлов,указали путь к файлу
        BufferedWriter bufferedwriter = new BufferedWriter(filewriter);//открыли поток записи

        while (true) {
            String s = reader.readLine();
            bufferedwriter.write(s+"\n");//записали в файл строку,перенесли курсор
            if (s.equals("exit")) break;
        }
        reader.close();
        bufferedwriter.close();
    }
}
