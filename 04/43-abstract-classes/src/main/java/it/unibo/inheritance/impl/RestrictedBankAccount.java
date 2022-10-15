package it.unibo.inheritance.impl;

import it.unibo.inheritance.api.*;

public class RestrictedBankAccount extends AbstractBankAccount{
    public RestrictedBankAccount(AccountHolder accountHolder, double balance) {
        super(accountHolder, balance);
    }

    private static final double TRANSACTION_FEE = 0.1;

    protected boolean isWithdrawAllowed(double amount) {
        return this.getBalance() > amount;
    }

    protected double computeFee() {
        return MANAGEMENT_FEE + getTransactionsCount() * TRANSACTION_FEE;
    }

    public void chargeManagementFees(final int usrID) {
        final double feeAmount = MANAGEMENT_FEE + getTransactionsCount() * TRANSACTION_FEE;
        if (checkUser(usrID) && isWithdrawAllowed(feeAmount)) {
            super.deposit(super.getAccountHolder().getUserID(), -feeAmount);
            resetTransactions();
        }
    }
    
}
