package com.MHryhorovych.Chapter2;

/**
 * @autor Maksym Hryhorovych
 */

/*
 * Напишите программу, включающую метод storage(), приведенный ранее в этой главе.
 */
public class Task6 {
    public static void main(String[] args) {
    int x = 5;
    int y = 10;
        System.out.println(storage(x,y));
    }

    static int storage(int x, int y){
        int sum = x + y;
        return sum;
    }
}
