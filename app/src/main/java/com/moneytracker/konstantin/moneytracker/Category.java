package com.moneytracker.konstantin.moneytracker;

/**
 * Created by Konstantin on 25.04.2015.
 */
public class Category {
    
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    private int number;

    public int getNumber() {
        return number;
    }

    public String getStringNumber() {
        return String.valueOf(number);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Category(int number, String category) {
        this.category = category;
        this.number = number;
    }

    public Category() {
    }

    public String getDefaultCategory() {
        return  "Прочее";
    }


}
