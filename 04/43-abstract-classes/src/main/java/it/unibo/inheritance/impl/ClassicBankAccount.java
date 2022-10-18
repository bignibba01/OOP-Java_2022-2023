package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.*;

public class ClassicBankAccount extends AbstractBankAccount{

    public ClassicBankAccount(AccountHolder accountHolder, double balance) {
        super(accountHolder, balance);
    }

    protected boolean isWithdrawAllowed(double amount) {
        return true;
    }

    protected double computeFee() {
        return MANAGEMENT_FEE;
    }
    
}
