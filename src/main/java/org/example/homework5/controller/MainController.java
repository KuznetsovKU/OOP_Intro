package org.example.homework5.controller;

import org.example.homework5.model.Account;
import org.example.homework5.model.User;

import java.io.IOException;
import java.util.Scanner;

public class MainController {
    Scanner scanner = new Scanner(System.in);
    UserController userController = new UserController();
    AccountController accountController = new AccountController();

    /**
     * Метод создания нового пользователя с присвоением ему номера лицевого счета
     */
    public void createNewUser() {
        User user = userController.createNewUser();
        Account account = accountController.createNewAccount(user);
        matchAccountWithUser(account);
        updateUserBalance(user);
    }

    /**
     * Метод связывающий лицевой счет с конкретным пользователем
     *
     * @param account - номер лицевого счета
     */
    private void matchAccountWithUser(Account account) {
        int userID = account.getUserID();
        userController.getUserFromRepo(userID).setPersonalAccountNum(account.getAccountNumber());
    }

    /**
     * Метод получения конкретного пользователя из БД по запросу клиента
     *
     * @return - конкретный экземпляр класса User
     */
    public User getUserFromRepo() {
        System.out.print("Укажите UserID пользователя, которого необходимо найти в базе данных: ");
        return getUserFromRepoByUserID(Infrastructure.parseUserID());
    }

    /**
     * Метод получения конкретного пользователя из БД по userID
     *
     * @param userID - идентификационный номер (ID) пользователя в БД
     * @return - конкретный экземпляр класса User
     */
    private User getUserFromRepoByUserID(int userID) {
        return userController.getUserFromRepo(userID);
    }

    /**
     * Метод удаления отдельного пользователя из БД по запросу клиента
     */
    public void deleteUser() {
        System.out.print("Укажите UserID пользователя, которого необходимо удалить из базы данных: ");
        int userID = Integer.parseInt(Infrastructure.getCorrectIntValue());
        accountController.deleteAccountFromRepo(userController.getUserFromRepo(userID).getPersonalAccountNum());
        userController.deleteUserFromRepo(userID);
    }

    /**
     * Метод создания лицевого счета для конкретного пользователя
     */
    public void createNewAccount() {
        System.out.print("Укажите UserID пользователя, для которого нужно создать лицевой счет: ");
        accountController.createNewAccount(getUserFromRepoByUserID(Infrastructure.parseUserID()));
    }

    /**
     * Метод получения конкретного лицевого счета из БД по запросу клиента
     *
     * @return - конкретный экземпляр класса Account
     */
    public Account getAccountFromRepo() {
        System.out.print("Укажите номер лицевого счета, который необходимо найти в базе данных (20 цифр): ");
        String inputValue = scanner.nextLine();
        return accountController.getAccountFromRepo(inputValue);
    }

    /**
     * Метод удаления конкретного лицевого счета из БД
     */
    public void deleteAccountFromRepo() {
        System.out.print("Укажите номер лицевого счета, который необходимо удалить (20 цифр): ");
        String inputValue = scanner.nextLine();
        accountController.deleteAccountFromRepo(inputValue);
    }

    /**
     * Метод получения лицевого счета конкретного пользователя из БД
     *
     * @return - конкретный экземпляр класса Account
     */
    public Account getUsersAccountFromRepo() {
        System.out.print("Укажите UserID пользователя, чей лицевой счет нужно найти: ");
        return accountController.getAccountFromRepo(getUserFromRepoByUserID(Infrastructure.parseUserID()).
                getPersonalAccountNum());
    }

    /**
     * Метод удаления лицевого счета конкретного пользователя из БД
     */
    public void deleteUsersAccount() {
        System.out.print("Укажите UserID пользователя, чей лицевой счет необходимо удалить: ");
        accountController.deleteAccountFromRepo(getUserFromRepoByUserID(Infrastructure.parseUserID()).
                getPersonalAccountNum());
    }

    /**
     * Метод получения информации о балансе лицевого счета конкретного пользователя
     *
     * @return - сумма находящаяся на лицевом счету конкретного пользователя
     */
    public String getUserBalance() {
        System.out.print("Укажите UserID пользователя, чей баланс необходимо отобразить: ");
        return userController.getUserBalance(getUserFromRepoByUserID(Infrastructure.parseUserID()));
    }

    /**
     * Метод обновления информации о балансе лицевого счета конкретного пользователя
     *
     * @param user - экземпляр класса User, которому нужно обновить информацию о балансе лицевого счета
     */
    private void updateUserBalance(User user) {
        double accountBalance = 0.0;
        accountBalance += accountController.getAccountFromRepo(user.getPersonalAccountNum()).getBalance();
        userController.getUserFromRepo(user.getUserID()).setBalance(accountBalance);
    }

    /**
     * Метод зачисления денежных средств на лицевой счет конкретного пользователя
     */
    public void getMoney() {
        System.out.print("Укажите UserID пользователя, которому зачисляются денежные средства: ");
        User user = getUserFromRepoByUserID(Infrastructure.parseUserID());
        System.out.print("Укажите сумму к зачислению: ");
        int sum = Integer.parseInt(Infrastructure.getCorrectIntValue());
        changeBalance(user, sum);
    }

    /**
     * Метод списания денежных средств с лицевого счета конкретного пользователя
     */
    public void spendMoney() {
        System.out.print("Укажите UserID пользователя, у которого списываются денежные средства: ");
        User user = getUserFromRepoByUserID(Infrastructure.parseUserID());
        System.out.print("Укажите сумму к списанию: ");
        int sum = Integer.parseInt(Infrastructure.getCorrectIntValue());
        changeBalance(user, -sum);
    }

    /**
     * Метод перевода денежных средств между двумя пользователями
     */
    public void transferMoney() {
        System.out.print("Укажите UserID пользователя, от которого переводятся денежные средства: ");
        User user1 = getUserFromRepoByUserID(Infrastructure.parseUserID());
        System.out.print("Укажите UserID пользователя, которому переводятся денежные средства: ");
        User user2 = getUserFromRepoByUserID(Infrastructure.parseUserID());
        System.out.print("Укажите сумму перевода: ");
        int sum = Integer.parseInt(Infrastructure.getCorrectIntValue());
        changeBalance(user1, -sum);
        changeBalance(user2, sum);
    }

    /**
     * Метод изменения баланса лицевого счета конкретного пользователя с передачей итогового значения
     * в соответствующее поле конкретного экземпляра класса User
     *
     * @param user - конкретный пользователь, баланс лицевого счета которого подлежит изменению
     * @param sum  - сумма, на которую должен измениться баланс лицевого счета
     */
    private void changeBalance(User user, double sum) {
        double currentBalance = accountController.getAccountFromRepo(user.getPersonalAccountNum()).getBalance();
        accountController.getAccountFromRepo(user.getPersonalAccountNum()).setBalance(currentBalance + sum);
        updateUserBalance(user);
    }

    /**
     * Метод вывода в консоль списка Пользователей (сокращенная информация)
     */
    public void showUserRepo() {
        userController.showUserRepo();
    }

    /**
     * Метод вывода в консоль списка Пользователей (полная информация)
     */
    public void showFullInfoInUserRepo() {
        userController.showFullInfoInUserRepo();
    }

    /**
     * Метод вывода в консоль списка лицевых счетов
     */
    public void showAccountRepo() {
        accountController.showAccountRepo();
    }

    /**
     * Метод выгрузки списка Пользователей в отдельный файл
     *
     * @throws IOException
     */
    public void extractUserRepo() throws IOException {
        userController.extractUserRepo();
    }

    /**
     * Метод выгрузки списка Лицевых счетов в отдельный файл
     *
     * @throws IOException
     */
    public void extractAccountRepo() throws IOException {
        accountController.extractAccountRepo();
    }

}
