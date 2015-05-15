package com.moneytracker.konstantin.moneytracker;

import java.util.ArrayList;

/**
 * Created by Konstantin on 11.05.2015.
 */
public class Categories {
    private ArrayList<Category> categories;

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }

    Categories() {
        categories = new ArrayList<Category>();
        Category category = new Category(1, "���");
        categories.add(category);
        category = new Category(2, "�����");
        categories.add(category);
        category = new Category(3, "������");
        categories.add(category);
        category = new Category(4, "�������");
        categories.add(category);
        category = new Category(5, "������");
        categories.add(category);
    }

    public Category getCategory(int position) {
        return categories.get(position);
    }

}
