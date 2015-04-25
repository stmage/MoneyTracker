package com.moneytracker.konstantin.moneytracker;

import com.moneytracker.konstantin.moneytracker.Category;

import java.sql.Date;

/**
 * Created by Konstantin on 25.04.2015.
 */
public class Transaction {

    private String title;
    private int sum;
    private String category;
    private Category categoryClass = new Category();
    private Date date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSum() {
        return sum;
    }

    public String getStringSum() {
        return String.valueOf(sum);
    }

    public void setStringSum(String sum) {
        this.sum = Integer.parseInt(sum);
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (category.equals(""))
            this.category = categoryClass.getDefaultCategory();
        else
            this.category = category;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStringDate() {
        return String.valueOf(date);
    }

    public void setStringDate(String date) {
        this.date = Date.valueOf(date);
    }

}
