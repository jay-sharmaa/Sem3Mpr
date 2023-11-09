package com.example.shoppinapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuItemCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class Searchintent extends Menuforallactivity {
    private Toolbar toolbar;
    public ListView listView;
    String [] name = {"Realme","Ballz","Reebok","Jack n Jones","Asus","Kakabura","Slim Wear","Ben Martin","Campus","Omsan","Indoprimo",
            "XENON NS","Style Lure","SMT","DesignKeeda","Canva","JPG","Woodland","RR Tshirts","Sparx","Asian","BlueStar","RG"};
    int pos_list,j = 0,count = -1;
    String lis_search = "";
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchintent);
        toolbar = findViewById(R.id.appbar);
        setSupportActionBar(toolbar);

        listView = findViewById(R.id.listview);

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name);
        listView.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_home_menu,menu);

        MenuItem menuItem = menu.findItem(R.id.searchhomemenu);
        SearchView searchView = (SearchView) menuItem.getActionView();

        searchView.setQueryHint("Type here ");

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                lis_search = query;
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                lis_search = newText;
                return false;
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(Searchintent.this, "Item Clicked -> " + position, Toast.LENGTH_SHORT).show();

                if(lis_search.isEmpty()){
                    Intent intent = new Intent(getApplicationContext(),All_Item_Activity.class);
                    intent.putExtra("Key",position);
                    startActivity(intent);
//                    Toast.makeText(Searchintent.this, ""+position, Toast.LENGTH_SHORT).show();
                }

                else{
                    j = lis_search.length();
                    for(int i = 0;i<name.length;i++){
                        if(name[i].startsWith(lis_search)){
                            if(position == 0){
                                Intent intent = new Intent(getApplicationContext(),All_Item_Activity.class);
                                intent.putExtra("Key",i);
                                startActivity(intent);
                                break;
                            }
                            position--;
                        }
                    }
                }
//                else {
//                    for (int k = 0; k < name.length; k++) {
//                        if (lis_search.equals(name[k].substring(0, lis_search.length()))) {
//                            Intent intent = new Intent(getApplicationContext(), All_Item_Activity.class);
//                            intent.putExtra("menukey", k);
//                            startActivity(intent);
//                        }
//                    }
//                }
            }
        });

        //Applications of Integral Transforms in Mathematical Statistics
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}