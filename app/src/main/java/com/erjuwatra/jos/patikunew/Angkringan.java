package com.erjuwatra.jos.patikunew;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Angkringan extends AppCompatActivity {
    ActionBar actionBar;
    private ArrayList<Item> items= new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angkringan);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(" ANGKRINGAN");


        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new Adapter(items, this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        items.add(new Item("https://i.ibb.co/rcgFYbG/hellokiti.png", getString(R.string.angkringan1), getString(R.string.desAng1), "-6.7274919,111.0495911","https://www.google.com/maps/place/Angkringan+Hello+Kitty+%26+Dawet+Hitam+(JemBut)+Kak+Ary/@-6.7274919,111.0495911,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d3d374a2a359:0xa0bd7d57f0e3c6de!8m2!3d-6.7274972!4d111.0517798"));
        items.add(new Item("https://i.ibb.co/kMdYXS7/kali.png", getString(R.string.angkringan2), getString(R.string.desAng2), "-6.7351961,111.0428132","https://www.google.com/maps/place/Angkringan+Kali/@-6.7351961,111.0428132,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d3ce0b89b157:0x9339cca8bbf4f3f!8m2!3d-6.7352014!4d111.0450019"));
        items.add(new Item("https://i.ibb.co/C6YkNrj/berkah.png", getString(R.string.angkringan3), getString(R.string.desAng3), "-6.7380905,111.0378625","https://www.google.com/maps/place/Angkringan+Berkah/@-6.7380905,111.0378625,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d3aed331970b:0x400a5d6a0876436!8m2!3d-6.7380958!4d111.0400512"));
        items.add(new Item("https://i.ibb.co/pPtmVT8/pakhehari.png", getString(R.string.angkringan4), getString(R.string.desAng4), "-6.7420787,111.0397893","https://www.google.com/maps/place/Angkringan+Pakdhe+Hari/@-6.7420787,111.0397893,823m/data=!3m1!1e3!4m12!1m6!3m5!1s0x2e70d3aba499aa53:0x6e8b6b47b28c4a3c!2sAngkringan+Pakdhe+Hari!8m2!3d-6.742084!4d111.041978!3m4!1s0x2e70d3aba499aa53:0x6e8b6b47b28c4a3c!8m2!3d-6.742084!4d111.041978"));
        items.add(new Item("https://i.ibb.co/3Nq0Hr6/gambur.png",getString(R.string.angkringan5), getString(R.string.desAng5), "-6.7431166,111.0388096","https://www.google.com/maps/place/Angkringan+Gembur/@-6.7431166,111.0388096,823m/data=!3m1!1e3!4m12!1m6!3m5!1s0x2e70d3b08795024d:0x2badae96357cedfb!2sAngkringan+Gembur!8m2!3d-6.7431165!4d111.0388096!3m4!1s0x2e70d3b08795024d:0x2badae96357cedfb!8m2!3d-6.7431165!4d111.0388096"));
        items.add(new Item("https://i.ibb.co/nQL7rr3/agung-ce.png",getString(R.string.angkringan6), getString(R.string.desAng6), "--6.7438417,111.0396294","https://www.google.com/maps/place/Angkringan+Agung+Ces/@-6.7438417,111.0396294,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d3553779acad:0x7f8abb3317d5de3c!8m2!3d-6.743847!4d111.0418181"));
        items.add(new Item("https://i.ibb.co/5TC2mFR/D.png",getString(R.string.angkringan7), getString(R.string.desAng7), "-6.7442617,111.0394483","https://www.google.com/maps/place/D'+Angkringan/@-6.7442617,111.0394483,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d3ab3f26ec27:0x3eb299de620e3e56!8m2!3d-6.744267!4d111.041637"));
        items.add(new Item("https://i.ibb.co/TPMhdKd/pakdhe.png",getString(R.string.angkringan8), getString(R.string.desAng8), "-6.7429707,111.0354689","https://www.google.com/maps/place/Angkringan+Pak+Dhe/@-6.7429707,111.0354689,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d3acf8fffff1:0x2184a7f9f0f98f65!8m2!3d-6.742976!4d111.0376576"));


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
