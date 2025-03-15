package atm_project.atm;

public interface MoneyFunctions {
    double withdraw(double amount);
    double checkBalance();
    double deposit(double amount);
    boolean transfer(long accountNumber, double amount);
}


