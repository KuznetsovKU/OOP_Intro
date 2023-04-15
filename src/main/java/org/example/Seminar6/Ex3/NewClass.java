package org.example.Seminar6.Ex3;

import java.math.BigDecimal;

public class NewClass extends Account{
    @Override
    protected void deposit(float amount) {
        this.balance += amount;
    }

    @Override
    protected void withdraw(float amount) {
        this.balance -= amount;
    }
}
