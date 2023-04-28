package org.example.Seminar3.Students.data;

import java.time.LocalDate;

public class PreStudent extends Student implements Comparable<Student>{
    private String nameOfSchool;

    public PreStudent(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, String nameOfSchool) {
        super(firstName, secondName, patronymic, dateOfBirth);
        this.nameOfSchool = nameOfSchool;
    }

    public PreStudent(String firstName, String secondName, String patronymic, LocalDate dateOfBirth, Long studentId, String nameOfSchool) {
        super(firstName, secondName, patronymic, dateOfBirth, studentId);
        this.nameOfSchool = nameOfSchool;
    }

    public Long getPreStudentId() {
        return getStudentId();
    }

    public void setPreStudentId(Long studentId) {
        setStudentId(studentId);
    }

    @Override
    public String toString() {
        return "PreStudent{" +
                "studentId='" + super.getStudentId() +'\'' +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", patronymic='" + super.getPatronymic() + '\'' +
                ", dateOfBirth=" + super.getDateOfBirth() + '\'' +
                ", nameOfSchool=" + this.nameOfSchool +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getStudentId().compareTo(o.getStudentId());
    }
}
