package com.erjuwatra.jos.patikunew;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Petis extends AppCompatActivity {

    ActionBar actionBar;
    private ArrayList<Item> items= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petis);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(" WARUNG PETIS");


        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new Adapter(items, this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        items.add(new Item("https://i.ibb.co/TYgGKj9/petisbusriwati.png", getString(R.string.petis1), getString(R.string.desPetis1), "-6.722688,111.0505183","https://www.google.co.id/maps/place/Warung+Petis+Runting+Bu+Sriwati/@-6.722688,111.0505183,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d373656183d1:0x5a27a87e300ad116!8m2!3d-6.7226933!4d111.052707"));
        items.add(new Item("https://i.ibb.co/Bj7YPst/petispojok.png", getString(R.string.petis2), getString(R.string.desPetis2), "-6.7219789,111.0587445","https://www.google.co.id/maps/place/Warung+Petis+Pojok/@-6.7219789,111.0587445,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d36d02099cc1:0xdbc8f1a9e0e9f3d8!8m2!3d-6.7219842!4d111.0609332"));
        items.add(new Item("https://i.ibb.co/yhXmJzr/petismbahmur.png", getString(R.string.petis3), getString(R.string.desPetis3), "-6.7196332,111.0450552","https://www.google.com/maps/place/Warung+petis+jelak+mbah+mur/@-6.7197367,111.0472379,17z/data=!4m12!1m6!3m5!1s0x2e70d3760a0a193d:0x3ea066b727086ef!2sWarung+petis+jelak+mbah+mur!8m2!3d-6.7196385!4d111.0472439!3m4!1s0x2e70d3760a0a193d:0x3ea066b727086ef!8m2!3d-6.7196385!4d111.0472439"));
        items.add(new Item("https://i.ibb.co/fGBgjjm/petishenirozaq.png", getString(R.string.petis4), getString(R.string.desPetis4), "-6.655846,111.081388","https://www.google.com/maps/place/Warung+petis+Heni+Rozaq/@-6.655846,111.081388,17z/data=!3m1!4b1!4m5!3m4!1s0x2e70d52f12409b87:0xa18c3c6cef82d5c7!8m2!3d-6.6558513!4d111.0835767"));
        items.add(new Item("https://i.ibb.co/6tGqcQs/petisberingin.png", getString(R.string.petis5), getString(R.string.desPetis5), "-6.7445755,111.1529444","https://www.google.com/maps/place/Warung+Petis+Jetak+Bringin/@-6.7445755,111.1529444,17z/data=!3m1!4b1!4m5!3m4!1s0x2e772d4de1bd2c6d:0x38c7d50b5018c091!8m2!3d-6.7445808!4d111.1551331"));

    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
