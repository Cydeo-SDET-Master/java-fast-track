package atm_project.main;

public class Account {

    private String username;
    private long accountNumber;
    private double balance;
    private int pin;

    public Account(String username, long accountNumber, double balance, int pin) {
        this.username = username;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public void updateBalance(double money){
        balance += money;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return accountNumber + " | " + username + " | $" + balance;
    }

    @Override
    public boolean equals(Object obj){
        return this.username.equals( ((Account)obj).username );
    }

}
