package com.MHryhorovych.Chapter2;

/**
 * @autor Maksym Hryhorovych
 */

/*
 Найдите фрагмент кода с классом ATypeName и сделайте из него программу, пригодную для компиляции и запуска.
 */
public class Task3 {
    public static void main(String[] args) {

        ATypeName atn = new ATypeName();
        System.out.println(atn.typeName());

    }

    public static class ATypeName {
        String typeName() {
            String s = "String";
            return s;
        }
    }
}


