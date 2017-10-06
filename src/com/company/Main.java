package com.company;

import java.util.Scanner;

public class Main {
    // Горячие клавиши
    // sout - быстрая генерация метода System.out.println
    // Ctrl + D - копирование текущей строки и вставка этой строки
    // Ctrl + Alt + L - форматирование выделенного блока кода

    // С этого метода начинается выполнение программы
    public static void main(String[] args) {
        // write your code here
        // Текст в двойных кавычках - это строка String

        // Выводит текст на экран
        // И делает перенос строки
        System.out.println("Hello world");
        System.out.println("Hello students");

        // Выводит текст на экран
        // Не делает перенос строки
        System.out.print("Android ");
        System.out.print("Best");

        // Просто перенос строки
        System.out.println();

        // Конкатенация строк
        System.out.println("10 + 20 = " + (10 + 20));

        // Объект для ввода с клавиатуры
        Scanner scanner = new Scanner(System.in); // Скопировать

        // Ввод с клавиатуры
        // c = a + b
        int a = 0;
        int b = 0;
        int c = 0;

        System.out.print("Введите a : ");
        // Считывает данные с консоли
        // Если значение корректное то присваивывает их переменной a,
        // Иначе, выдает ошибку
        a = scanner.nextInt();

        System.out.print("Введите b : ");
        b = scanner.nextInt();

        c = a + b;

        System.out.println(a + " + " + b + " = " + c);

        String name;
        System.out.print("Введите своё имя : ");
        name = scanner.next();
        System.out.println("Имя пользователя - " + name);

        // Теорема Пифагора
        // c^2 = a^2 + b^2
        // c = корень(a^2 + b^2)

        double a1 = 0;
        double b1 = 0;
        double c1 = 0;
        System.out.println("c^2 = a^2 + b^2");

        System.out.print("Введите a : ");
        a1 = scanner.nextDouble();

        System.out.print("Введите b : ");
        b1 = scanner.nextDouble();

        // Math - в этом классе описаны все базовые математические функции
        // Math.pow(value1, value2) - возведение в степеннь
        //          value1 - основание
        //          value2 - степень
        // Math.sqrt - квадратный корень
        // Math.abs - возвращает модуль числа
        // Math.rand - случайная дробная часть [0,..., 1)

        c1 = Math.sqrt((a1 * a1) + Math.pow(b1, 2));
        System.out.println("При a = " + a1 + ", b = " + b1 + ", c = " + c1);

        // Преобразование типов
        // Безопасное (неявное)
        int integerValue = 30;
        double doubleValue = integerValue;  // 30.0

        // 8 bits
        byte byteValue = 100;
        // 16 bits
        short shortValue = byteValue; // 100

        // Опасное (явное)
        double doubleValue1 = 30.3;
        // Происходит потеря вещественной части
        int integerValue1 = (int) doubleValue1; // 30

        // 16 bits
        short shortValue1 = 1000; // 0000 0011 1110 1000 = 1000
        // 8 bits
        byte byteValue1 = (byte) shortValue1;  // 0110 1000 = 2^3 + 2^5 + 2^6 = 8 + 32 + 64 + 104

        // Пример, когда можно использовать явное приведение типов

        int element = (int) Math.pow(10, 2);  // 100.0 = 100

        /*System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    */


    }
}
