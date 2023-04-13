package org.example.homework5.controller;

import java.util.Scanner;

public class Infrastructure {
    public static void printDivider() {
        System.out.println("---------------");
    }


    /**
     * Метод проверяющий, является ли введенная в строке информация числом
     *
     * @param value - передаваемая на проверку строка
     * @return - результат проверки
     */
    public static boolean isNum(String value) {
        for (char c : value.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }

    public static String getCorrectIntValue() {
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        while (!isNum(inputValue)) {
            System.out.println("Введите корректные данные: ");
            inputValue = scanner.nextLine();
        }
        return inputValue;
    }

    public static int parseUserID() {
        return Integer.parseInt(getCorrectIntValue());
    }

    public static int getCorrectMenuAnswer(int maxValue) {
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();
        int answerNumber = -1;
        while (answerNumber == -1) {
            if (isNum(inputValue) && Integer.parseInt(inputValue) >= 0 && Integer.parseInt(inputValue) <= maxValue) {
                answerNumber = Integer.parseInt(inputValue);
            } else {
                System.out.print("Введите корректные данные: ");
                inputValue = scanner.nextLine();
            }
        }
        return answerNumber;
    }

}
