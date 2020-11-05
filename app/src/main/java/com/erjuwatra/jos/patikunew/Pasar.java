package com.erjuwatra.jos.patikunew;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Pasar extends AppCompatActivity {
    TextView tvPuri, tvTrangkil, tvWedarijaksa, tvPragolo, tvNgablak;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasar);
        ImageView img1 = findViewById(R.id.puri);
        ImageView img2 = findViewById(R.id.trangkil);
        ImageView img3 = findViewById(R.id.wedarijaksa);
        ImageView img4 = findViewById(R.id.pragolo);
        ImageView img5 = findViewById(R.id.ngablak);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("PASAR");

        tvPuri=(TextView)findViewById(R.id.puri_selanjutnya);

        tvPuri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentpuri = new Intent(getApplicationContext(), Puri.class);
                startActivity(intentpuri);
            }
        });
        tvTrangkil = (TextView)findViewById(R.id.trangkil_selanjutnya);
        tvTrangkil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTrangkil = new Intent(getApplicationContext(), Trangkil.class);
                startActivity(intentTrangkil);
            }
        });
        tvWedarijaksa=(TextView)findViewById(R.id.wedari_selanjutnya);
        tvWedarijaksa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWedari = new Intent(getApplicationContext(), Wedarijaksa.class);
                startActivity(intentWedari);
            }
        });
        tvPragolo = (TextView)findViewById(R.id.pragolo_selanjutnya);
        tvPragolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPragolo = new Intent(getApplicationContext(),Pragolo.class);
                startActivity(intentPragolo);
            }
        });
        tvNgablak = (TextView)findViewById(R.id.ngablak_selanjutnya);
        tvNgablak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentngablak = new Intent(getApplicationContext(), Ngablak.class);
                startActivity(intentngablak);
            }
        });
        Glide.with(this).load("https://i.ibb.co/yf3BCr5/Puri2.jpg").into(img1);
        Glide.with(this).load("https://i.ibb.co/3fXxZKM/Whats-App-Image-2020-10-30-at-15-49-14.jpg").into(img2);
        Glide.with(this).load("https://i.ibb.co/8bdB7GB/pasar.jpg").into(img3);
        Glide.with(this).load("https://i.ibb.co/7tcYcG8/p-pragolo.jpg").into(img4);
        Glide.with(this).load("https://i.ibb.co/C7GxX1M/ngablak.jpg").into(img5);
        Glide.with(this).load("https://i.ibb.co/C7GxX1M/ngablak.jpg").into(img5);



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