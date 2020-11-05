package com.erjuwatra.jos.patikunew;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Gandul extends AppCompatActivity {
    ActionBar actionBar;
    private ArrayList<Item> items= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gandul);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(" WARUNG GANDUL");


        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new Adapter(items, this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        items.add(new Item("https://i.ibb.co/grxntDh/sahabat.png", getString(R.string.gandul1), getString(R.string.desGan1), "-6.7040937,111.0595488","https://www.google.co.id/maps/place/Warung+Makan+Gandul+Sahabat+Romantis/@-6.7040937,111.0595488,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d345fc3f314f:0x3ca3165ea0305bab!8m2!3d-6.704099!4d111.0617375"));
        items.add(new Item("https://i.ibb.co/MZLv61R/warung-kakamarsono.jpg", getString(R.string.gandul2), getString(R.string.desGan2), "-6.7243983,111.050266","https://www.google.co.id/maps/place/Warung+Nasi+Gandul+Kak+Marsono/@-6.7243983,111.050266,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d373536c67e7:0xba16eb7d895c9c87!8m2!3d-6.7244036!4d111.0524547"));
        items.add(new Item("https://i.ibb.co/sHf4hWT/maktun.png", getString(R.string.gandul3), getString(R.string.desGan3), "-6.7099409,111.0549984","https://www.google.com/maps/place/Nasi+Gandul+Mak+Tum/@-6.7099409,111.0549984,17z/data=!3m1!4b1!4m5!3m4!1s0x2e70d3ca1a6392bd:0x422409a209a21c19!8m2!3d-6.7099462!4d111.0571871"));
        items.add(new Item("https://i.ibb.co/3N5rDkG/romantis.png", getString(R.string.gandul4), getString(R.string.desGan4), "-6.696275,111.075165","https://www.google.com/maps/place/Nasi+Gandul+Mak+Tum/@-6.7099409,111.0549984,17z/data=!3m1!4b1!4m5!3m4!1s0x2e70d3ca1a6392bd:0x422409a209a21c19!8m2!3d-6.7099462!4d111.0571871"));
        items.add(new Item("https://i.ibb.co/w0Dgg75/pakharjo.png", getString(R.string.gandul5), getString(R.string.desGan5), "-6.7481707,111.0272143","https://www.google.com/maps/place/Warung+Nasi+Gandul+Pak+Harjo/@-6.7481707,111.0272143,17z/data=!3m1!4b1!4m5!3m4!1s0x2e70d24c8a1a8ad5:0x42ad4edd3f235762!8m2!3d-6.748176!4d111.029403"));
        items.add(new Item("https://i.ibb.co/31p9kV5/pakmeled.png", getString(R.string.gandul6), getString(R.string.desGan6), "-6.7582951,111.0431515","https://www.google.com/maps/place/Nasi+Gandul+Pak+Meled/@-6.7582951,111.0431515,17z/data=!3m1!4b1!4m5!3m4!1s0x2e70d2589a93f5b1:0x12006a6876ce116a!8m2!3d-6.7583004!4d111.0453402"));
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