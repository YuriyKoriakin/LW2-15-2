package com.brainacad.oop.testcollection21;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by Yuriy on 16.03.2016.
 * Ctrl + миша і показує реалізацію методів
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();//declare Collection with realization LinkedList
        for (int i = 0; i <= 10; i++) {//loop
            Random random = new Random();
            int position = random.nextInt(list.size()+1);  //повертає випадкове число від 0 до зазначеного
            list.add(position,"number: " + i);//fill collection
        }
        for (String str : list) {
            System.out.println(str);
        }
    }
}