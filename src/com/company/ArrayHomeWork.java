package com.company;

import java.util.*;


public class ArrayHomeWork {
    public static void main(String[] args) {
        ArrayHomeWork arrayHomeWork = new ArrayHomeWork();
        arrayHomeWork.exercise1();
        arrayHomeWork.exercise2();
        arrayHomeWork.exercise3();
    }

    private void exercise3() {
        //1.3
        //Создать массив, в котором содержатся строки с временами года.
        // При помощи конструкции switch-case сделать вывод в консоль месяцев, соответствующих времени года.
        // Выбор времени года реализовать через псевдорандом Math.
        System.out.println("\nЗадание №3");
        List<String> seasons = List.of("Зима", "Весна", "Лето", "Осень");
        int seasonNumber = new Random().nextInt(seasons.size());
        switch (seasonNumber) {
            case 0:
                System.out.println("Декабрь, Январь, Февраль");
                break;
            case 1:
                System.out.println("Март, Апрель, Май");
                break;
            case 2:
                System.out.println("Июнь, Июль, Август");
                break;
            case 3:
                System.out.println("Сентябрь, Октябрь, Ноябрь");
                break;
        }
    }

    private void exercise2() {
        //1.2
        //Создать список ArrayList(динамический массив), заполнить строками, вводимыми пользователем через консоль (до 10 штук).
        // Вывести в консоль строку, содержащую заглавную букву
        //Найти наименьшую и наибольшую по длине строку в списке
        //Удалить из списка наименьшую и наибольшую строки
        //Вывести содержимое списка в консоль

        ArrayList<String> array = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nЗадание №2");
        System.out.println("Введите слова с заглавными буквами и без них");
        for (int i = 0; i < 3; i++) {
            String line = scanner.nextLine();
            array.add(line);
        }
        for (int i = 0; i < array.size(); i++) {
            String line = array.get(i);
            String lowerCaseLine = line.toLowerCase();
            if (!lowerCaseLine.equals(line)) {
                System.out.println("\"" + array.get(i) + "\" содержит заглавную букву");
            }
        }
        String shortString = array.get(0);
        String longString = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).length() < shortString.length()) {
                shortString = array.get(i);
            }
            if (array.get(i).length() > longString.length()) {
                longString = array.get(i);
            }
        }
        System.out.println("Наименьшая по длине строка в списке: " + shortString);
        System.out.println("Наибольшая по длине строка в списке: " + longString);

        array.remove(shortString);
        array.remove(longString);
        System.out.println("Cодержимое списка: " + array);
    }


    private void exercise1() {
        //1.1
        //Создать массив Array из 10 элементов, заполнить массив случайными числами используя псевдорандом из Math.
        //Найти наименьшее и наибольшее число в массиве
        //Найти суммы чисел массива
        //Выбрать только четные числа и записать их в новый массив
        //Вывести содержимое массива с четными числами в консоль
        System.out.println("\nЗадание №1");
        int[] array = new int[10];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        ArrayList<Number> evenNumber = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int number = ((int) (Math.random() * 10));
            array[i] = number;
            sum += number;
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
            if (number % 2 == 0) {
                evenNumber.add(number);
            }
            System.out.println(array[i]);
        }
        System.out.println("Наименьшее: " + min);
        System.out.println("Наибольшее: " + max);
        System.out.println("Сумма: " + sum);
        System.out.println("Только чётные числа: " + evenNumber);
    }
}


