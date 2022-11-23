package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.1 Вывести в консоль максимальное и минимальное значения типа int, используя класс Integer
        minMax();

        //1.2 В переменную записать 3х значное натуральное число, вывести в консоль сумму цифр числа
        sum();

        //1.3 В переменные x и y записать два натуральных числа, вывести в консоль остаток от деления x и y
        divider();

        //1.4 Напишите метод, который будет вычислять площадь прямоугольника и выводить результат в консоль, вызовите этот из main
        square();
    }

    private static void square() {
        System.out.println("\nВычеслить площадь прямоугольника, введите Ширину и Длину:");

        Scanner scan = new Scanner(System.in);
        System.out.println("Ширина:");
        int a = scan.nextInt();

        System.out.println("Длина:");
        int b = scan.nextInt();

        System.out.println("Площадь прямоугольника: " + a * b);
    }

    private static void divider() {
        System.out.println("\nВ переменные x и y записать два натуральных числа, вывести в консоль остаток от деления x и y:");

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число x:");
        int a = scan.nextInt();

        System.out.println("Введите число y:");
        int b = scan.nextInt();

        System.out.println(a % b);
    }

    private static void sum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nВведите 3х значное число, в ответе получите сумму цифр этого числа: ");
        int value = scan.nextInt();
        char[] chars = ("" + value).toCharArray();
        System.out.println("Сумма цифр: " +  (chars[0] - '0' + chars[1] - '0' + chars[2] - '0'));
    }

    private static void minMax() {
        System.out.println("Integer max value is: " + Integer.MAX_VALUE);
        System.out.println("Integer min value is: " + Integer.MIN_VALUE);
    }
}





