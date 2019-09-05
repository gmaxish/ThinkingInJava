package com.MHryhorovych.Chapter2;

/**
 * @autor Maksym Hryhorovych
 */

/*
 * Напишите программу, демонстрирующую автоматическую упаковку примитивных типов данных
 */
public class Task9 {
    public static void main(String[] args) {
        int i = 5;
        double d = 6.00;
        long l = 8000000L;

        Integer integer = new Integer(i);
        Double doubble = new Double(d);
        Long loong = new Long(l);

        System.out.println(integer);
        System.out.println(doubble);
        System.out.println(loong);
    }
}
