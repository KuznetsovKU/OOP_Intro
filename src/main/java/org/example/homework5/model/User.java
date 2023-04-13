package org.example.homework5.model;

import java.time.LocalDate;

public class User {
    private static Integer idCounter;

    static {
        User.idCounter = 1;
    }

    protected Integer userID;
    protected String surname;
    protected String name;
    protected String patronymic;
    protected LocalDate dateOfBirth;
    protected String passport;
    protected String personalAccountNum;
    protected double balance;


    public User() {
        this.userID = idCounter++;
        this.balance = 0.0;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getPersonalAccountNum() {
        return personalAccountNum;
    }

    public void setPersonalAccountNum(String personalAccount) {
        this.personalAccountNum = personalAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Integer getUserID() {
        return userID;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", ФИО='" + surname + '.' + name.substring(0, 1) + '.' + patronymic.substring(0, 1) + '\'' +
                ", лицевой счет='" + personalAccountNum + '\'' +
                '}';
    }

    public String getFullInfo() {
        return "User{" +
                "userID=" + userID +
                ", фамилия='" + surname + '\'' +
                ", имя='" + name + '\'' +
                ", отчество='" + patronymic + '\'' +
                ", дата рождения=" + dateOfBirth +
                ", паспорт='" + passport + '\'' +
                ", лицевой счет='" + personalAccountNum + '\'' +
                ", баланс=" + balance +
                '}';
    }

    public String getBalanceInfo() {
        return "User{" +
                "userID=" + userID +
                ", фамилия='" + surname + '\'' +
                ", имя='" + name.substring(0, 1) + '\'' +
                ", отчество='" + patronymic.substring(0, 1) + '\'' +
                ", баланс=" + balance +
                '}';
    }

    public String getFullName() {
        return surname + ' ' + name + ' ' + patronymic;
    }
}
