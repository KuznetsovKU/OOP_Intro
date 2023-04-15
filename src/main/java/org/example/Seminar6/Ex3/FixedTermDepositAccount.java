package org.example.Seminar6.Ex3;

import java.math.BigDecimal;

public class FixedTermDepositAccount extends Account{
    @Override
    protected void deposit(float amount) {
// Deposit into this account
    }

    @Override
    protected void withdraw(float amount) {
        throw new UnsupportedOperationException();
    }
}
