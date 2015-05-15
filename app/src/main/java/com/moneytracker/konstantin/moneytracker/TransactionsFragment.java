package com.moneytracker.konstantin.moneytracker;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by Konstantin on 04.05.2015.
 */
public class TransactionsFragment extends Fragment {

    private ListView listView;
    private TransactionsAdapter transactionsAdapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View inflate = inflater.inflate(R.layout.fragment_transactions, null);

        Transactions transactions = Transactions.getTestInstance();
        transactionsAdapter = new TransactionsAdapter(getActivity(), transactions);

        listView = (ListView) inflate.findViewById(R.id.list_transactions);
        listView.setAdapter(transactionsAdapter);
        return inflate;
    }

}
