package org.example.homework5.repo;

import org.example.homework5.model.Account;

import java.util.Iterator;
import java.util.List;

public class AccountIterator implements Iterator<Account> {
    private int counter;
    private List<Account> accountList;

    public AccountIterator(List<Account> accountList) {
        this.counter = 0;
        this.accountList = accountList;
    }

    @Override
    public boolean hasNext() {
        return counter < accountList.size();
    }

    @Override
    public Account next() {
        if (!hasNext()) return null;
        return accountList.get(counter++);
    }
}
