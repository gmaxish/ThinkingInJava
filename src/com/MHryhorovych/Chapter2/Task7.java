package com.MHryhorovych.Chapter2;


/**
 * @autor Maksym Hryhorovych
 */

/*
 * Превраите фрагменты кода с классом Incremetnable в работающую программу.
 */
public class Task7 {
    static int i = 5;

    public static void main(String[] args) {
        Incremetnable.increment();
        System.out.println(i);
    }

    public static class Incremetnable {
        static void increment() {
            Task7.i++;
        }
    }
}
