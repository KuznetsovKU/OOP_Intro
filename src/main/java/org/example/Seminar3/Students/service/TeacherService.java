package org.example.Seminar3.Students.service;

import org.example.Seminar3.Students.data.Student;
import org.example.Seminar3.Students.data.Teacher;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class TeacherService implements UserService<Teacher>{
    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (Teacher student: teachers){
            if (student.getTeacherId() > countMaxId){
                countMaxId = student.getTeacherId();
            }
        }
        countMaxId++;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        teachers.add(teacher);
    }
}
