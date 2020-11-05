package com.erjuwatra.jos.patikunew;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Bandeng extends AppCompatActivity {
    ActionBar actionBar;
    private ArrayList<Item> items= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bandeng);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(" WARUNG BANDENG");


        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new Adapter(items, this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        items.add(new Item("https://i.ibb.co/M8CCThy/rm-pondok.png", getString(R.string.bandeng1), getString(R.string.desBan1), "-6.696275,111.075165", "https://www.google.co.id/maps/place/Rm+Pondok+Bandeng+No+57/@-6.7398941,111.0250164,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d3b6ba2c3e49:0xe42e408e75389608!8m2!3d-6.7398994!4d111.0272051"));
        items.add(new Item("https://i.ibb.co/7WQfjNQ/rindang-84.png", getString(R.string.banddeng2), getString(R.string.desBan2), "-6.691474,111.070829", "https://www.google.co.id/maps/place/Rindang+84/@-6.7282401,111.0570563,13175m/data=!3m1!1e3!4m8!1m2!2m1!1srindang+84!3m4!1s0x2e70d3b6b16f64cb:0x9494d74a7794e925!8m2!3d-6.73993!4d111.0288218"));
        items.add(new Item("https://i.ibb.co/6DfN59s/pondok-babe.jpg", getString(R.string.bandeng3), getString(R.string.desBan3), "-6.695664,111.067489", "https://www.google.co.id/maps/place/Pondok+Bandeng+BaBe/@-6.7414508,111.036762,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d3ac14a7ca8d:0x2ffc933a797c5859!8m2!3d-6.7414561!4d111.0389507"));
        items.add(new Item("https://i.ibb.co/Km2mrdR/tanpa-duri.png", getString(R.string.bandeng4), getString(R.string.desBandeng4), "-6.669230,111.072915", "https://www.google.co.id/maps/place/Bandeng+Tanpa+Duri/@-6.7109996,111.1307807,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e772c8f7db4db7f:0x36f909f879ec97ad!8m2!3d-6.7110049!4d111.1329694"));
        items.add(new Item("https://i.ibb.co/XscKvQz/presto-samaria.jpg", getString(R.string.bandeng5), getString(R.string.desbandeng5), "-6.676703,111.072959","https://www.google.co.id/maps/place/Bandeng+Presto+Samaria+Juwana/@-6.7197923,111.1452471,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e772c6753260c89:0xbf4444d543d08858!8m2!3d-6.7197976!4d111.1474358"));
        items.add(new Item("https://i.ibb.co/8D0rcG9/rm.png", getString(R.string.bandeng6), getString(R.string.desbandeng5),"-6.681949,111.071652","https://www.google.co.id/maps/place/RM+Pawon+Solo+Cabang+Pati/@-6.7500972,111.0258031,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d24e7403c58b:0xdacdf63333ab1ac!8m2!3d-6.7501025!4d111.0279918"));
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
