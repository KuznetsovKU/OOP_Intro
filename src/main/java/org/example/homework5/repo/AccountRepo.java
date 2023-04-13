package org.example.homework5.repo;

import org.example.homework5.model.Account;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AccountRepo implements Iterable<Account> {
    protected List<Account> accountList = new ArrayList<>();

    public AccountRepo() {
    }

    public void addAccountToRepo(Account account) {
        accountList.add(account);
    }

    public Account getAccountFromRepo(String accountNumber) {
        for (Account account : accountList) {
            if (account.getAccountNumber().equals(accountNumber)) return account;
        }
        return null;
    }

    public void deleteAccountFromRepo(String accountNumber) {
        for (Account account : accountList) {
            if (account.getAccountNumber().equals(accountNumber)) {
                accountList.remove(account);
            }
        }
    }

    @Override
    public Iterator<Account> iterator() {
        return new AccountIterator(accountList);
    }

    public void showAccountRepo() {
        for (Account account : accountList) {
            System.out.println(account);
        }
    }

    public void extractAccountRepo() throws IOException {
        FileWriter fileWriter = new FileWriter("AccountRepo.txt", false);
        for (Account account : accountList) {
            fileWriter.write(account.toString() + "\n");
        }
        fileWriter.close();
    }
}
