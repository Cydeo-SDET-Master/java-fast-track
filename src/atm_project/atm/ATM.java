package atm_project.atm;

import java.util.Scanner;

public abstract class ATM implements Machine, MoneyFunctions{

    private final double withdrawLimit;
    private boolean poweredOn;

    public ATM(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public abstract void interfaceMenu(Scanner input);
    public abstract void login(String username, int pin);
    public abstract void logout();

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public boolean isPoweredOn() {
        return poweredOn;
    }

    public void setPoweredOn(boolean poweredOn) {
        this.poweredOn = poweredOn;
    }
}
