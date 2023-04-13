package org.example.homework5.repo;

import org.example.homework5.model.User;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserRepo implements Iterable<User> {
    protected List<User> userList = new ArrayList<>();

    public UserRepo() {
    }

    public void addUserToRepo(User user) {
        userList.add(user);
    }

    public User getUserFromRepo(int userID) {
        for (User user : userList) {
            if (user.getUserID().equals(userID)) return user;
        }
        return null;
    }

    public void deleteUserFromRepo(int userID) {
        for (User user : userList) {
            if (user.getUserID().equals(userID)) {
                userList.remove(user);
            }
        }
    }

    @Override
    public Iterator<User> iterator() {
        return new UserIterator(userList);
    }

    public void showUserRepo() {
        for (User user : userList) {
            System.out.println(user);
        }
    }

    public void showFullInfoInUserRepo() {
        for (User user : userList) {
            System.out.println(user.getFullInfo());
        }
    }

    public void extractUserRepo() throws IOException {
        FileWriter fileWriter = new FileWriter("UserRepo.txt", false);
        for (User user : userList) {
            fileWriter.write(user.getFullInfo() + "\n");
        }
        fileWriter.close();
    }
}
