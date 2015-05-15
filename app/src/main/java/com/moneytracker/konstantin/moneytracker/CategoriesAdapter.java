package com.moneytracker.konstantin.moneytracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Konstantin on 15.05.2015.
 */
public class CategoriesAdapter extends ArrayAdapter<Category> {

    private Categories categories;

    public CategoriesAdapter(Context context, Categories categories) {
        super(context, 0, categories.getCategories());
        this.categories = categories;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Category category = categories.getCategory(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_category, parent, false);
        }

        TextView category_number = (TextView) convertView.findViewById(R.id.item_category_number);
        TextView category_text = (TextView) convertView.findViewById(R.id.item_category_text);

        // Отображаем элементы
        category_number.setText(category.getStringNumber());
        category_text.setText(category.getCategory());

        return convertView;
    }

}
