package org.example.homework5.repo;

import org.example.homework5.model.User;

import java.util.Iterator;
import java.util.List;

public class UserIterator implements Iterator<User> {
    private int counter;
    private List<User> userList;

    public UserIterator(List<User> userList) {
        this.counter = 0;
        this.userList = userList;
    }

    @Override
    public boolean hasNext() {
        return counter < userList.size();
    }

    @Override
    public User next() {
        if (!hasNext()) return null;
        return userList.get(counter++);
    }
}
