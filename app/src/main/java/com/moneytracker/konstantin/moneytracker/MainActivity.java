package com.moneytracker.konstantin.moneytracker;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {

    private ListView listView;
    private Transactions transactions;
    private TransactionsAdapter transactionsAdapter;

    private void initTransaction() {
        transactions = new Transactions();
        transactions.add("Шины", "Машина", "12-04-2015", "20000");
        transactions.add("Интернет", "11-04-2015", "2000");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTransaction();
        transactionsAdapter = new TransactionsAdapter(this, transactions);
        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(transactionsAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
