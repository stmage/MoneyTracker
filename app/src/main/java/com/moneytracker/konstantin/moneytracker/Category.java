package com.moneytracker.konstantin.moneytracker;

import java.util.ArrayList;

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
    
    public ArrayList getAllCategories() {
        ArrayList res = new ArrayList();
        res.add("Еда");
        res.add("Жилье");
        res.add("Машина");
        res.add("Девчонки");
        res.add("Прочее");
        return res;
    }
    public String getDefaultCategory() {
        return  "Прочее";
    }
}
