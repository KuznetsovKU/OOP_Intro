package org.example.homework5.model;

public class Account {
    private static int accountCounter;

    static {
        Account.accountCounter = 1;
    }

    protected String accountNumber;
    protected int userID;
    protected double balance;

    public Account() {
        this.accountNumber = createAccountNumber();
        this.balance = 0;
    }

    @Override
    public String toString() {
        return "Account{" +
                "лицевой счет='" + accountNumber + '\'' +
                ", userID=" + userID +
                ", баланс=" + balance +
                '}';
    }

    /**
     * Метод автоматической генерации номера лицевого счета
     *
     * @return - сгенерированный номер лицевого счета
     */
    private String createAccountNumber() {
        int accountCounterGrade = Integer.toString(accountCounter).length();
        String baseAccountNumber = "40817810012340000000";
        String currentAccountNumber = baseAccountNumber.substring(0, baseAccountNumber.length() - accountCounterGrade) +
                Integer.toString(accountCounter);
        accountCounter++;
        return currentAccountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
