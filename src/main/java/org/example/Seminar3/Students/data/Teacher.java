package org.example.Seminar3.Students.data;

import java.time.LocalDate;
import java.util.Comparator;

public class Teacher extends User implements Comparable<Teacher>{

    private Long teacherId;

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        super(firstName, secondName, patronymic, dateOfBirth);
    }

    public Teacher(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long studentId) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.teacherId = studentId;
    }
    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public static class TeacherComparator implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return 0;
        }
    }
    @Override
    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(o.teacherId);
    }
}
