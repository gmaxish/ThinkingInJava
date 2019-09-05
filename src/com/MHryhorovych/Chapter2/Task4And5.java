package com.MHryhorovych.Chapter2;

/**
 * @autor Maksym Hryhorovych
 */

/*
 4. Сделайте то же для для кода с использованием DataOnly.
 5. Измените упражнение 4 так, чтоб даннм класса DataOnly присваивались значения, а затем распечатайте их в методе main().
 */
public class Task4And5 {
    public static void main(String[] args) {
        DataOnly dao = new DataOnly();
        dao.i = 47;
        dao.d = 46.77;
        dao.b = false;
        System.out.println(DataOnly.i);
        System.out.println(DataOnly.d);
        System.out.println(DataOnly.b);
    }

    static class DataOnly {
        static int i;
        static double d;
        static boolean b;
    }
}
