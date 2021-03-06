package com.acme.banking.dbo.domain;

public class SavingAccount implements Account {
    private int id;
    private Client client;
    private double amount;

    public SavingAccount(int id, Client client, double amount) {
        if (id <= 0) throw new IllegalArgumentException("id");
        if (client == null) throw new IllegalArgumentException("client");
        if (amount < 0) throw new IllegalArgumentException("amount");

        this.id = id;
        this.client = client;
        this.amount = amount;
    }

    public Client getClient() {
        return client;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Integer getClientId() {
        return client.getId();
    }

    @Override
    public void withdraw(double amount) {
        //TODO
    }

    @Override
    public void deposit(double amount) {
        //TODO
    }
}
