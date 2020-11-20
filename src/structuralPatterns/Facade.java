package structuralPatterns;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Hashtable;

public class Facade {
    public static void main(String[] args) {
        BankService bankService = new BankService();

        int mySaving = bankService.createNewAccount("saving", new BigDecimal(500.00));
        int myInvestment = bankService.createNewAccount("investment", new BigDecimal(1000.00));

        bankService.transferMoney(mySaving, myInvestment, new BigDecimal(300.00));

    }
}

interface IAccount {
    public void deposit(BigDecimal amount);
    public void withdraw(BigDecimal amount);
    public void transfer(int accountNo, BigDecimal amount);
    public int getAccountNumber();
}

class Chequing implements IAccount {
    private BigDecimal initialAmount;

    public Chequing(BigDecimal initialAmount) {
        this.initialAmount = initialAmount;
    }

    @Override
    public void deposit(BigDecimal amount) {

    }

    @Override
    public void withdraw(BigDecimal amount) {

    }

    @Override
    public void transfer(int accountNo, BigDecimal amount) {

    }

    @Override
    public int getAccountNumber() {
        return 0;
    }
}

class Saving implements  IAccount {
    private BigDecimal initialAmount;

    public Saving(BigDecimal initialAmount) {
        this.initialAmount = initialAmount;
    }

    @Override
    public void deposit(BigDecimal amount) {

    }

    @Override
    public void withdraw(BigDecimal amount) {

    }

    @Override
    public void transfer(int accountNo, BigDecimal amount) {

    }

    @Override
    public int getAccountNumber() {
        return 0;
    }
}

class Investment implements IAccount {
    private BigDecimal initialAmount;

    public Investment(BigDecimal initialAmount) {
        this.initialAmount = initialAmount;
    }

    @Override
    public void deposit(BigDecimal amount) {

    }

    @Override
    public void withdraw(BigDecimal amount) {

    }

    @Override
    public void transfer(int accountNo, BigDecimal amount) {

    }

    @Override
    public int getAccountNumber() {
        return 0;
    }
}

class BankService {
    private Hashtable<Integer, IAccount> bankAccounts;

    public BankService() {
        this.bankAccounts = new Hashtable<Integer, IAccount>();
    }

    public int createNewAccount(String type, BigDecimal initAmount) {
        IAccount newAccount = null;
        switch (type) {
            case "chequing":
                newAccount = new Chequing(initAmount);
                break;
            case "saving":
                newAccount = new Saving(initAmount);
            case "investment":
                newAccount = new Investment(initAmount);
            default:
                System.out.println("Invalid account type");
                break;
        }
        if (newAccount != null) {
            this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }
        return -1;
    }

    public void transferMoney(int to, int from, BigDecimal amount) {
        IAccount toAccount = this.bankAccounts.get(to);
        IAccount fromAccount = this.bankAccounts.get(from);
        fromAccount.transfer(toAccount.getAccountNumber(), amount);
    }

}