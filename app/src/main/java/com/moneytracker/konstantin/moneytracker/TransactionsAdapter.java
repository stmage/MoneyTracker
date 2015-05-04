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

    private Transactions transactions;

    public TransactionsAdapter(Context context, Transactions transactions) {
        super(context, 0, transactions.getTransactions());
        this.transactions = transactions;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Transaction transaction = transactions.getTransaction(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_linear, parent, false);
        }

        TextView title = (TextView) convertView.findViewById(R.id.item_linear_title);
        TextView category = (TextView) convertView.findViewById(R.id.item_linear_category);
        TextView date = (TextView) convertView.findViewById(R.id.item_linear_date);
        TextView sum = (TextView) convertView.findViewById(R.id.item_linear_sum);

        // Отображаем элементы
        title.setText(transaction.getTitle());
        category.setText(transaction.getCategory());
        date.setText(transaction.getStringDate());
        sum.setText(transaction.getStringSum());

        return convertView;
    }
}
