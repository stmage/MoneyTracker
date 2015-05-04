package com.moneytracker.konstantin.moneytracker;

import java.util.ArrayList;

/**
 * Created by Konstantin on 25.04.2015.
 */
public class Transactions {

    private ArrayList<Transaction> transactions;

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    Transactions() {
       transactions = new ArrayList<Transaction>();
    }

    public void add(String title, String date, String sum) {
        Transaction el = new Transaction();
        el.setTitle(title);
        el.setCategory("");
        el.setStringDate(date);
        el.setStringSum(sum);
        transactions.add(el);
    }

    public void add(String title, String category, String date, String sum) {
        Transaction el = new Transaction();
        el.setTitle(title);
        el.setCategory(category);
        el.setStringDate(date);
        el.setStringSum(sum);
        transactions.add(el);
    }

    public Transaction getTransaction(int position) {
        return transactions.get(position);
    }
}
