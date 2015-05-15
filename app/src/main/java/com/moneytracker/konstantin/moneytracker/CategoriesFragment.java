package com.moneytracker.konstantin.moneytracker;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by Konstantin on 15.05.2015.
 */
public class CategoriesFragment extends Fragment {
    private ListView listView;
    private TransactionsAdapter transactionsAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View inflate = inflater.inflate(R.layout.fragment_categories, null);

        Categories categories = new Categories();
        CategoriesAdapter categoriesAdapter = new CategoriesAdapter(getActivity(), categories);

        listView = (ListView) inflate.findViewById(R.id.list_categories);
        listView.setAdapter(categoriesAdapter);
        return inflate;
    }
}