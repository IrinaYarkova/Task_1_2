package com.company;

import java.util.Scanner;

/**
 * Задание 1, 2
 * Программа включает в себя простейший калькулятор и поиск самого длинного слова в массиве
 * @author Yarkova I. A.
 */
public class Main {
    //Метод для вычисления сложения, умножения, вычисления и деления двух дробных чисел
    public static void Calculator() {
        Scanner in = new Scanner(System.in);

        //Ввод входных данных
        System.out.print("Введите первое число: ");
        float number1 = in.nextFloat();
        System.out.print("Введите второе число: ");
        float number2 = in.nextFloat();
        System.out.print("Введите операцию: \n '+' сложение \n '-' вычитание \n '*' умножение \n '/' деление\n");
        String operator = in.next();

        char op = operator.charAt(0);
        float result = 0;

        //Вычисление результата в зависимости от операции
        switch (op) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                op = '0';
                break;
        }

        //Вывод результата в кансоль
        if (op != '0') {
            System.out.printf("Результат ычисления: \n %f %s %f = %.4f", number1, operator, number2, result);
        } else
            System.out.print("Неизвестный оператор!");

        in.close();
    }

    //Метод для поиска самого длинного слова в массиве
    public static void MaxElement() {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите колличество слов для сравнения:");
        int size = in.nextInt();

        String array[] = new String[size];
        //Заполнение массива словами
        for (int i = 0; i < size; i++) {
            System.out.println("Введите " + (i+1) + " слово:");
            array[i] = in.next();
        }

        //Поиск самого длинного слова
        int max = array[0].length();
        String result = array[0];
        for (int j = 1; j < size; j++)
            if (max < array[j].length()){
                max = array[j].length();
                result = array[j];
            }
        //Вывод результата
        System.out.println("Самое длинное слово: " + result);

        in.close();
    }

    //Метод предназначен для выбора программы
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите номер программы: (1 - калькулятор, 2 - максимальный элемент)");
        int task = in.nextInt();

        if (task == 1) {
            Calculator();
        } else if (task == 2) {
            MaxElement();
        } else System.out.println("Такой программы не существует!");
        in.close();
    }

}