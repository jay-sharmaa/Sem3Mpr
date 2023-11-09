package com.example.shoppinapp;

import static com.example.shoppinapp.All_Item_Activity.num;

import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Dialog;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.sax.RootElement;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends Menuforallactivity{
    BottomNavigationView bottomNavigationView;
    private Toolbar toolbar;
    int main_id;
    boolean bool = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        loadfragment(new HomeFragment(),true);
        toolbar = findViewById(R.id.appbar);
        setSupportActionBar(toolbar);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                main_id = id;
                if(id == R.id.nav_home){
                    loadfragment(new HomeFragment(),false);
                }
                else if(id == R.id.nav_profile){
                    loadfragment(new ProfileFragment(),false);
                }
                else if(id == R.id.nav_cart){
                    loadfragment(new CartFragment(),false);
                }
                else if(id == R.id.nav_category){
                    loadfragment(new CategoryFragment(),false);
                }
                else{
                    loadfragment(new SearchFragment(),false);
                }
                return true;
            }
        });
      /*  Intent i = getIntent();
        int d = i.getIntExtra("dialogkey",-1);
        if(d == 1){
            Dialog dialog = new Dialog(MainActivity.this);
            dialog.setContentView(R.layout.);
        */
    }

    public void loadfragment(Fragment fragment, boolean flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if(flag){
            ft.add(R.id.container,fragment);
        }
        else{
            ft.replace(R.id.container,fragment);
        }
        ft.commit();
    }



    boolean doublebacktoexit = false;
    @Override
    public void onBackPressed() {
        BadgeDrawable badgeDrawable = bottomNavigationView.getOrCreateBadge(R.id.nav_cart);
        badgeDrawable.setVisible(true);
        if (main_id != R.id.nav_home && !doublebacktoexit) {
            loadfragment(new HomeFragment(), false);
            main_id = R.id.nav_home;
        }
        else if(doublebacktoexit){
            super.onBackPressed();
        }
        this.doublebacktoexit = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                doublebacktoexit = false;
            }
        }, 2000);
        if(num != 0) {
            badgeDrawable.setNumber(num);
        }
        else{
            badgeDrawable.setNumber(num);
        }
    }
}