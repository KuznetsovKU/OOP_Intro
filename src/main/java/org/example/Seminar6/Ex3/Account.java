package org.example.Seminar6.Ex3;

import java.math.BigDecimal;

public abstract class Account {
    protected float balance;
    protected abstract void deposit(float amount);
    protected abstract void withdraw(float amount);

}
