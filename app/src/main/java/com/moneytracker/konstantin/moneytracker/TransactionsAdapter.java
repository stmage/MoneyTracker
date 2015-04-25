package com.moneytracker.konstantin.moneytracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by Konstantin on 25.04.2015.
 */
public class TransactionsAdapter extends ArrayAdapter<Transaction> {
    public TransactionsAdapter(Context context, Transactions transactions) {
        super(context, 0, transactions.getTransactions());
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Transaction transaction = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent);
        }

        TextView title = (TextView) convertView.findViewById(R.id.item_title);
        TextView category = (TextView) convertView.findViewById(R.id.item_category);
        TextView date = (TextView) convertView.findViewById(R.id.item_date);
        TextView sum = (TextView) convertView.findViewById(R.id.item_sum);

        title.setText(transaction.getTitle());
        category.setText(transaction.getCategory());
        date.setText(transaction.getStringDate());
        sum.setText(transaction.getStringSum());

        return convertView;
    }
}
