package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();//считали имя файла

        writeNumFile(file);

    }
    public static void writeNumFile(String file) throws IOException{
        ArrayList<Integer> list = new ArrayList<>();
        InputStream inputStream = new FileInputStream(file);//открыли поток чтения с файла
        Scanner scanner = new Scanner(inputStream);


        while(scanner.hasNextInt()) {//считали
            list.add(scanner.nextInt());
        }

        Collections.sort(list);
        for (int s:list) {
            if(s%2==0) System.out.println(s);
        }
        inputStream.close();
    }
}
