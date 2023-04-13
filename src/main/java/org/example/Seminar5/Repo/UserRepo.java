package org.example.Seminar5.Repo;

import org.example.Seminar5.Model.User;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserRepo {

    private List<User> db = new ArrayList<>();

    public UserRepo(List<User> db) {
        this.db = new ArrayList<>();
    }

    public UserRepo() {
    }

    public void addUserToRepo(User user) {
        db.add(user);
    }

    public void deleteFromRepo(User user) {
        db.remove(user);
    }

    public User getUserFromRepo(User user) {
        for (User el : db){
            if (el.getUserID().equals(user.getUserID())){
                return el;
            }
        }
        return null;
    }

    public void saveUser(User user){
        try(FileWriter fileWriter = new FileWriter("text.txt", true)){
            fileWriter.write(user.toString());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
