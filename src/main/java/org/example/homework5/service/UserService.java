package org.example.homework5.service;

import org.example.homework5.controller.Infrastructure;
import org.example.homework5.model.User;

import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.Scanner;

public class UserService {
    Scanner scanner = new Scanner(System.in);

    /**
     * Метод создания нового экземпляра класса User
     *
     * @return - новый экземпляр класса User
     */
    public User createNewUser() {
        User user = new User();

        System.out.print("Введите фамилию пользователя: ");
        String inputValue = scanner.nextLine().toUpperCase();
        user.setSurname(nameFieldValidation(inputValue));

        System.out.print("Введите имя пользователя: ");
        inputValue = scanner.nextLine().toUpperCase();
        user.setName(nameFieldValidation(inputValue));

        System.out.print("Введите отчество пользователя (или НЕТ, если отчество отсутствует): ");
        inputValue = scanner.nextLine().toUpperCase();
        user.setPatronymic(nameFieldValidation(inputValue));

        System.out.print("Введите дату рождения пользователя (гггг-мм-дд): ");
        inputValue = scanner.nextLine();
        user.setDateOfBirth(dateFieldValidation(inputValue));

        System.out.print("Введите серию и номер паспорта пользователя (сссс-нннннн): ");
        inputValue = scanner.nextLine();
        user.setPassport(passportFieldValidation(inputValue));

        System.out.println("Создан новый пользователь: " + user.getFullInfo());
        Infrastructure.printDivider();

        return user;
    }


    /**
     * Метод валидации номера лицевого счета
     *
     * @param text - введенные пользователем данные
     * @return - проверенное и согласованное значение
     */
    private Long personalAccountNumFieldValidation(String text) {
        while (text.length() != 20 && !Infrastructure.isNum(text)) {
            System.out.print("Введите корректные данные (20 цифр): ");
            text = scanner.nextLine();
        }
        return Long.parseLong(text);
    }

    /**
     * Метод валидации поля Паспорт
     *
     * @param text - значение поля для проверки
     * @return - проверенное и согласованное значение
     */
    private String passportFieldValidation(String text) {
        while (!isPassportType(text)) {
            System.out.print("Введите корректные данные (сссс-нннннн): ");
            text = scanner.nextLine();
        }
        return text;
    }

    /**
     * Метод проверки соответствия указанного паспорта формату (сссс-нннннн)
     *
     * @param text - введенная пользователем информация
     * @return - результат проверки на соответствие
     */
    private boolean isPassportType(String text) {
        if (text.length() != 11) return false;
        String[] parts = text.split("-");
        if (parts.length != 2) return false;
        if (parts[0].length() != 4 || !Infrastructure.isNum(parts[0])) return false;
        return parts[1].length() == 6 && Infrastructure.isNum(parts[1]);
    }

    /**
     * Метод валидации полей ФИО пользователя
     *
     * @param text - значение поля для проверки
     * @return - проверенное и согласованное значение
     */
    private String nameFieldValidation(String text) {
        while (!(text != null && text.chars().allMatch(Character::isLetter))) {
            System.out.print("Введите корректные данные: ");
            text = scanner.nextLine().toUpperCase();
        }
        return text;
    }

    /**
     * Метод валидации полей дат
     *
     * @param text - значение поля для проверки
     * @return - проверенное и согласованное значение
     */
    private LocalDate dateFieldValidation(String text) {
        while (!isDateType(text)) {
            System.out.print("Введите корректные данные (гггг-мм-дд): ");
            text = scanner.nextLine();
        }
        return LocalDate.parse(text);
    }

    /**
     * Метод проверки соответствия введенной даты формату (гггг-мм-дд)
     *
     * @param text - введенная пользователем информация
     * @return - результат проверки на соответствие
     */
    private boolean isDateType(String text) {
        if (text.length() != 10) return false;
        String[] parts = text.split("-");
        if (parts.length != 3) return false;
        if (parts[0].length() != 4 && !Infrastructure.isNum(parts[0])) return false;
        for (int i = 1; i < parts.length; i++) {
            if (parts[i].length() != 2 && !Infrastructure.isNum(parts[i])) return false;
        }
        int month = Integer.parseInt(parts[1]);
        if (month < 1 || month > 12) return false;
        return isValidDayInMonth(Integer.parseInt(parts[0]), month, Integer.parseInt(parts[2]));
    }

    /**
     * Метод проверяющий наличие дня в месяце
     *
     * @param year  - год (для проверки на високосность)
     * @param month - месяц
     * @param day   - день
     * @return - результат проверки
     */
    private boolean isValidDayInMonth(int year, int month, int day) {
        int maxDay = 31;
        switch (month) {
            case 2:
                if (IsoChronology.INSTANCE.isLeapYear(year)) {
                    maxDay = 29;
                } else {
                    maxDay = 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = 30;
        }
        return day >= 1 && day <= maxDay;
    }

}
