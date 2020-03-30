package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    private static int listSize = 10;

    public static void main(String[] args) {
        //Среднеарефметическое 
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < listSize ; i++) {
            list.add(random.nextInt(100) - 1);
        }
        System.out.println(list);
        var average = list.stream().mapToInt((s) -> Integer.parseInt(String.valueOf(s))).average();
        System.out.println(average);


    }

}
