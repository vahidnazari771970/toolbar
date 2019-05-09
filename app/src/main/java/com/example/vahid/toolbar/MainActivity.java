package com.example.vahid.toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    Toolbar tlb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tlb = findViewById(R.id.m_toolbar);
        setSupportActionBar(tlb);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_keyboard_arrow_left_black_24dp);
        tlb.setLogo(R.drawable.logo1);
        tlb.setTitle(R.string.title);
        tlb.setSubtitle(R.string.subtitle);




    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.toolbar_name,menu);
        return (true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem Item){

        int id = Item.getItemId();

        if (id == R.id.setting) {
            Toast.makeText(getApplicationContext(), "Settings Item Clicked", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.about) {
            Toast.makeText(getApplicationContext(), "About Item Clicked", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.profile) {
            Toast.makeText(getApplicationContext(), "profile Item Clicked", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.basket) {
            Toast.makeText(getApplicationContext(), "basket Item Clicked", Toast.LENGTH_SHORT).show();
        }
        else if (id==android.R.id.home){
            onBackPressed();
        }

        return super.onOptionsItemSelected(Item);
    }

}
