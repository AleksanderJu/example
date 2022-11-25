package com.company;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        String question1 = "В каком году человек первый раз полетел в космос?:1981, 1961, 1991.";
        System.out.println(question1);
        Scanner in1 = new Scanner(System.in);
        String number = in1.nextLine();
        int intNumber = Integer.parseInt(number);
        if (intNumber == 1961) {
            System.out.println("Правильно!");
        } else {
            System.out.println("Неправильно!");
        }
        String question2 = "Какая страна производит больше всего кофе в мире?: Колумбия, Индонезия, Бразилия";
        System.out.println(question2);
        Scanner in2 = new Scanner(System.in);
        boolean isExpectedString = in2.nextLine().equals("Бразилия");
        if (isExpectedString) {
            System.out.println("Правильно!");
        } else {
            System.out.println("Неправильно!");
        }

// Написал 2 примера, по такой же аналогии можно продолжать составлять викторину дальше.
    }

}
