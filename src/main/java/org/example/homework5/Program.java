package org.example.homework5;

import org.example.homework5.controller.Infrastructure;
import org.example.homework5.controller.MainController;

import java.io.IOException;

public class Program {
    MainController mainController = new MainController();

    public void startProgram() throws IOException {
        System.out.println("Добро пожаловать в модуль управления Пользователями и их лицевыми счетами!");
        int command = -1;
        while (command != 0) {
            switch (showMainMenu()) {
                case 1:
                    int userMenuCommand = -1;
                    while (userMenuCommand != 0) {
                        switch (showUserMenu()) {
                            case 1:
                                mainController.createNewUser();
                                continue;
                            case 2:
                                System.out.println(mainController.getUserFromRepo());
                                Infrastructure.printDivider();
                                continue;
                            case 3:
                                mainController.deleteUser();
                                Infrastructure.printDivider();
                                continue;
                            case 4:
                                System.out.println(mainController.getUsersAccountFromRepo());
                                Infrastructure.printDivider();
                                continue;
                            case 5:
                                System.out.println(mainController.getUserBalance());
                                Infrastructure.printDivider();
                                continue;
                            case 6:
                                mainController.deleteUsersAccount();
                                Infrastructure.printDivider();
                                continue;
                            case 0:
                                userMenuCommand = 0;
                                Infrastructure.printDivider();
                                System.out.println("Возврат в главное меню");
                                break;
                        }
                    }
                    continue;
                case 2:
                    int accountMenuCommand = -1;
                    while (accountMenuCommand != 0) {
                        switch (showAccountMenu()) {
                            case 1:
                                mainController.createNewAccount();
                                continue;
                            case 2:
                                System.out.println(mainController.getAccountFromRepo());
                                Infrastructure.printDivider();
                                continue;
                            case 3:
                                mainController.deleteAccountFromRepo();
                                Infrastructure.printDivider();
                                continue;
                            case 0:
                                accountMenuCommand = 0;
                                System.out.println("Возврат в главное меню");
                                break;
                        }
                    }
                    continue;
                case 3:
                    int financialOperationsMenuCommand = -1;
                    while (financialOperationsMenuCommand != 0) {
                        switch (showFinancialOperationsMenu()) {
                            case 1:
                                mainController.getMoney();
                                Infrastructure.printDivider();
                                continue;
                            case 2:
                                mainController.spendMoney();
                                Infrastructure.printDivider();
                                continue;
                            case 3:
                                mainController.transferMoney();
                                Infrastructure.printDivider();
                                continue;
                            case 0:
                                financialOperationsMenuCommand = 0;
                                System.out.println("Возврат в главное меню");
                                break;
                        }
                    }
                    continue;
                case 4:
                    int repoMenuCommand = -1;
                    while (repoMenuCommand != 0) {
                        switch (showRepoMenu()) {
                            case 1:
                                mainController.showUserRepo();
                                Infrastructure.printDivider();
                                continue;
                            case 2:
                                mainController.showFullInfoInUserRepo();
                                Infrastructure.printDivider();
                                continue;
                            case 3:
                                mainController.showAccountRepo();
                                Infrastructure.printDivider();
                                continue;
                            case 4:
                                mainController.extractUserRepo();
                                Infrastructure.printDivider();
                                continue;
                            case 5:
                                mainController.extractAccountRepo();
                                Infrastructure.printDivider();
                                continue;
                            case 0:
                                repoMenuCommand = 0;
                                System.out.println("Возврат в главное меню");
                                break;
                        }
                    }
                    continue;
                case 0:
                    command = 0;
                    System.out.println("Работа завершена.");
                    break;

            }

        }

    }

    private int showMainMenu() {
        System.out.println("Выбери блок: ");
        System.out.println("1 - Операции с Пользователями, 2 - Операции с Лицевыми счетами, 3 - Операции зачисления, " +
                "списания денежных средств, 4 - Операции с БД, 0 - Выйти из программы");
        return Infrastructure.getCorrectMenuAnswer(4);
    }

    private int showUserMenu() {
        System.out.println("Выбери необходимую операцию: ");
        System.out.println("1 - Создать нового Пользователя, 2 - Найти Пользователя в БД, 3 - Удалить Пользователя " +
                "из БД, 4 - Найти лицевой счет пользователя, 5 - Показать информацию о суммарном балансе Пользователя," +
                " 6 - Удалить лицевой счет пользователя, 0 - Перейти на уровень выше");
        return Infrastructure.getCorrectMenuAnswer(6);
    }

    private int showAccountMenu() {
        System.out.println("Выбери необходимую операцию: ");
        System.out.println("1 - Создать новый лицевой счет, 2 - Найти лицевой счет в БД, 3 - Удалить лицевой счет из БД," +
                " 0 - Перейти на уровень выше");
        return Infrastructure.getCorrectMenuAnswer(3);
    }

    private int showFinancialOperationsMenu() {
        System.out.println("Выбери необходимую операцию: ");
        System.out.println("1 - Зачисление денежных средств, 2 - Списание денежных средств, 3 - Перевод денежных средств," +
                " 0 - Перейти на уровень выше");
        return Infrastructure.getCorrectMenuAnswer(3);
    }

    private int showRepoMenu() {
        System.out.println("Выбери необходимую операцию: ");
        System.out.println("1 - Показать сокращенную БД Пользователей, 2 - Показать полную БД Пользователей, " +
                "3 - Показать БД Лицевых счетов, 4 - Выгрузить БД Пользователей, 5 - Выгрузить БД Лицевых счетов, " +
                "0 - Перейти на уровень выше");
        return Infrastructure.getCorrectMenuAnswer(5);
    }
}
