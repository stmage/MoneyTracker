package com.moneytracker.konstantin.moneytracker;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {

    private Transactions transactions;
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private ListView leftDrawer;
    private ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        leftDrawer = (ListView) findViewById(R.id.left_drawer);

        String[] navigationData = new String[]{getString(R.string.transactions), getString(R.string.categories), getString(R.string.statistic)};
        ArrayAdapter<String> navigationDrawerAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, navigationData);
        leftDrawer.setAdapter(navigationDrawerAdapter);
        leftDrawer.setOnItemClickListener(new DrawerItemClickListener());


        if (toolbar != null) {
            setSupportActionBar(toolbar);
        }

        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        drawerLayout.setDrawerListener(drawerToggle);

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

    @Override
    public void setTitle(CharSequence title) {
        super.setTitle(title);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerToggle.syncState();
    }

    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            if (position == 0) {
                leftDrawer.setItemChecked(position, true);
                drawerLayout.closeDrawer(leftDrawer);
                setTitle(getString(R.string.transactions));
                getFragmentManager().beginTransaction().replace(R.id.content_frame, new TransactionsFragment()).commit();
            }
            if (position == 1) {
                leftDrawer.setItemChecked(position, true);
                drawerLayout.closeDrawer(leftDrawer);
                setTitle(getString(R.string.categories));
                getFragmentManager().beginTransaction().replace(R.id.content_frame, new CategoriesFragment()).commit();
            }
            if (position == 2) {
                leftDrawer.setItemChecked(position, true);
                drawerLayout.closeDrawer(leftDrawer);
                setTitle(getString(R.string.categories));
                getFragmentManager().beginTransaction().replace(R.id.content_frame, new StatisticFragment()).commit();
            }
        }
    }
}
