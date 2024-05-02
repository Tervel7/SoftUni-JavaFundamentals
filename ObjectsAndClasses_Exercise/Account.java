package OOP;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    private Client client;

    private ArrayList<Transaction> transactions;
    private Date dateCreated;

    Account(int id, double balance, double annualInterestRate, Client client) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.client = client;
        this.transactions = new ArrayList<>();

        dateCreated = new Date();
    }

    public boolean withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            transactions.add(new Transaction('W',amount,balance,"Withdrawn" + amount));
            return true;
        } else
                return false;
    }

    public void deposit(double amount) {
        if (amount >0) {
            this.balance+= amount;
            transactions.add(new Transaction('D',amount,balance,"Deposited" + amount));
        }
    }

    public int countTransactions(char type) {
        int count = 0;
        for(Transaction transaction : transactions) {
            if(transaction.getType()==type)
                count++;
        }
        return count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
