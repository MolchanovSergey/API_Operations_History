package ru.netology.molchanov;

import java.time.LocalDate;

public class Operation {
    private int id;// номер транзакции
    private double amount;// сумма транзакции
   private LocalDate date;// дата транзакции
   private int customer;// уникальный номер клиента

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getCustomer() {
        return customer;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }

    public Operation(int id, double amount, LocalDate date, int customer){
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.customer = customer;
    }
    public Operation(){

    }

    @Override
    public String toString() {
        return "Транзакция №" + id + '\'' +
                "Сумма" + amount + '\'' +
                "Дата:" + date + '\'' +
                "Номер клиента" + customer + '\'';
    }
}
