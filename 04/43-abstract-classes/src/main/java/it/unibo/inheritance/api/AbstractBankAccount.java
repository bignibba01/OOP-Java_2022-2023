package it.unibo.inheritance.api;

public abstract class AbstractBankAccount implements BankAccount{
    public static final double ATM_TRANSACTION_FEE = 1;
    public static final double MANAGEMENT_FEE = 5;

    private AccountHolder holder;
    private double balance;
    private int transactions;

    protected abstract boolean isWithdrawAllowed(double amount);

    protected abstract double computeFee();

    public AbstractBankAccount(final AccountHolder accountHolder, final double balance) {
        this.holder = accountHolder;
        this.balance = balance;
        this.transactions = 0;
    }

    public void chargeManagementFees(int id) {
        if (checkUser(id)) {
            this.balance -= MANAGEMENT_FEE;
            resetTransactions();
        }
    }

    public void deposit(int id, double amount) {
        this.transactionOp(id, amount);
    }

    public void depositFromATM(int id, double amount) {
        this.deposit(id, amount - ATM_TRANSACTION_FEE);
    }

    public void withdraw(int id, double amount) {
        if (this.isWithdrawAllowed(amount)) {
            this.transactionOp(id, -amount);
        }
    }

    public void withdrawFromATM(int id, double amount) {
        this.withdraw(id, amount + ATM_TRANSACTION_FEE);
    }

    protected boolean checkUser(final int id) {
        return this.getAccountHolder().getUserID() == id;
    }

    protected void incrementTransactions() {
        this.transactions++;
    }

    protected void resetTransactions() {
        this.transactions = 0;
    }

    private void transactionOp(final int id, final double amount) {
        if (checkUser(id)) {
            this.balance += amount;
            this.incrementTransactions();
        }
    }

    public AccountHolder getAccountHolder() {
        return this.holder;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getTransactionsCount() {
        return this.transactions;
    }

}
