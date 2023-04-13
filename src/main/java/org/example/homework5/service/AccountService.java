package org.example.homework5.service;

import org.example.homework5.controller.Infrastructure;
import org.example.homework5.model.Account;
import org.example.homework5.model.User;

public class AccountService {
    public Account createNewAccount(User user) {
        Account account = new Account();
        account.setUserID(user.getUserID());
        System.out.println("Для пользователя " + user.getFullName() + " создан лицевой счет: " + account.toString());
        Infrastructure.printDivider();
        return account;
    }

    public double getAccountBalance(Account account) {
        return account.getBalance();
    }

    public void setAccountBalance(Account account, double sum) {
        account.setBalance(account.getBalance() + sum);
    }

    public String getAccountNumber(Account account) {
        return account.getAccountNumber();
    }

    public int getAccountUserID(Account account) {
        return account.getUserID();
    }
}
