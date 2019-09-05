package com.MHryhorovych.Chapter2;

/**
 * @autor Maksym Hryhorovych
 */

/*
 * Напишите программу, которая демонстрирует, что независимо от количества созданных объектов, класс содержит
 * только один экземпляр поля static.
 */
public class Task8 {
    static double d = 50.9;

    public static void main(String[] args) {
        StaticClass sc = new StaticClass();
        System.out.println(d);
        System.out.println(Task8.d);
        System.out.println(sc.task8.d);
        System.out.println(sc.task_8.d);

    }
}
class StaticClass{
    Task8 task8 = new Task8();
    Task8 task_8 = new Task8();
}
