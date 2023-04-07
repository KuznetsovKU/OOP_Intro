package org.example.Seminar3.Students.view;

import org.example.Seminar3.Students.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
