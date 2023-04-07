package org.example.Seminar3.Students;

import org.example.Seminar3.Students.data.Student;
import org.example.Seminar3.Students.data.Teacher;
import org.example.Seminar3.Students.data.User;
import org.example.Seminar3.Students.data.UserComparator;
import org.example.Seminar3.Students.view.StudentView;
import org.example.Seminar3.Students.view.TeacherView;

import java.time.LocalDate;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("teacherFN_1", "teacherSN_3", "teacherP_1",
                LocalDate.of(1990, 10, 21));
        Teacher teacher2 = new Teacher("teacherFN_1", "teacherSN_2", "teacherP_1",
                LocalDate.of(1990, 10, 21));

        UserComparator<User> comp = new UserComparator<>();
        System.out.println(comp.compare(teacher1, teacher2));

        StudentView stView1 = new StudentView();
        stView1.sendOnConsole(List.of(new Student("stdFN_1", "stdSN_1", "stdP_1",
                        LocalDate.of(1990, 10, 21)),
                new Student("stdFN_2", "stdSN_2", "stdP_2",
                        LocalDate.of(1990, 10, 21))));

        TeacherView teacherView = new TeacherView();
        teacherView.sendOnConsole(List.of(teacher1, teacher2));
    }
}
