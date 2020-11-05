package com.erjuwatra.jos.patikunew;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Soto extends AppCompatActivity {
    ActionBar actionBar;
    private ArrayList<Item> items= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soto);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(" WARUNG SOTO");


        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new Adapter(items, this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        items.add(new Item("https://i.ibb.co/WKSHzbt/sototarsan.png", getString(R.string.soto1), getString(R.string.desSoto1), "-6.696275,111.075165","https://www.google.co.id/maps/place/Soto+Ayam+Kemiri+Lasdi+Tarsan/@-6.7455031,111.043414,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d25550deaa69:0x67e70f9e981cf9e6!8m2!3d-6.7455084!4d111.0456027"));
        items.add(new Item("https://i.ibb.co/Qr8PGV3/sotocecep.png", getString(R.string.soto2), getString(R.string.desSoto2), "-6.696275,111.075165","https://www.google.co.id/maps/place/Soto+Kemiri+Pati+Pak+Cecep+(Kuliner+Pati)/@-6.7505439,111.0538157,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d2572a2abf17:0xf86877819ad8488d!8m2!3d-6.7505492!4d111.0560044"));
        items.add(new Item("https://i.ibb.co/PY9P4SZ/sotokribo.png", getString(R.string.soto3), getString(R.string.desSoto3), "-6.696275,111.075165","https://www.google.com/maps/place/Soto+Kemiri+Pak+Kribo/@-6.7490584,111.0356999,17z/data=!3m1!4b1!4m5!3m4!1s0x2e70d253c7a7c68b:0xbd98219794d07a76!8m2!3d-6.7490637!4d111.0378886"));
        items.add(new Item("https://i.ibb.co/Ytt5wLt/sotopakwo.png", getString(R.string.soto4), getString(R.string.desSoto4), "-6.696275,111.075165","https://www.google.com/maps/place/Soto+Ayam+Kemiri+Pak+Wo/@-6.7531537,111.0418511,17z/data=!3m1!4b1!4m5!3m4!1s0x2e70d257b0ec94cf:0xe5a26e4b8bb543d4!8m2!3d-6.753159!4d111.0440398"));
        items.add(new Item("https://i.ibb.co/740rPzH/soto45.png", getString(R.string.soto5), getString(R.string.desSoto5), "-6.696275,111.075165","https://www.google.com/maps/place/Soto+Kemiri+Gedung+Joeang45'/@-6.7507618,111.0287051,17z/data=!3m1!4b1!4m5!3m4!1s0x2e70d24e8185e231:0x3637c22146417914!8m2!3d-6.7507671!4d111.0308938"));

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
