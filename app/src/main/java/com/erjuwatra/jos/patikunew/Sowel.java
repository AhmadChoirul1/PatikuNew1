package com.erjuwatra.jos.patikunew;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import java.util.ArrayList;

public class Sowel extends AppCompatActivity {
        ActionBar actionBar;
        private ArrayList<Item> items= new ArrayList<>();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_sowel);

            actionBar = getSupportActionBar();
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle(" WARUNG SEGO TEWEL");


            RecyclerView recyclerView = findViewById(R.id.recyclerview);
            recyclerView.setHasFixedSize(true);
            recyclerView.setAdapter(new Adapter(items, this));
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

            items.add(new Item("https://i.ibb.co/sjrp7hQ/sulasih.png", getString(R.string.sowel1), getString(R.string.desSowel1), "-6.6669969,111.0408714","https://www.google.co.id/maps/place/Warung+Sego+Tewel+(Mak+Sulasih)/@-6.6669969,111.0408714,824m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d454fffffffd:0xcfa33fb5a50e4a13!8m2!3d-6.6669969!4d111.0430601"));
            items.add(new Item("https://i.ibb.co/MD2Bgk1/sowel-ndari.jpg", getString(R.string.sowel2), getString(R.string.desPetis2), "-6.6870009,111.0682193","https://www.google.co.id/maps/place/Warung+Makan+Sego+Tewel+Ndari/@-6.6870009,111.0682193,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d4be189e9c87:0xe4bf98d4b815fbd8!8m2!3d-6.6870009!4d111.070408"));
            items.add(new Item("https://i.ibb.co/bXZY1Mb/godong-jati.png", getString(R.string.sowel3), getString(R.string.desSowel3), "-6.7584015,111.0371184","https://www.google.co.id/maps/place/Warung+Sego+Tewel+Godong+Jati+Mantul/@-6.7583962,111.0371184,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d398931597b5:0xd42dde1d991eb6c4!8m2!3d-6.7584015!4d111.0393071"));
            items.add(new Item("https://i.ibb.co/Xs3TZ8V/dipenogoro.png", getString(R.string.sowel4), getString(R.string.desSowel4), "-6.7490843,111.042044","https://www.google.co.id/maps/place/Warung+Diponegoro+Sego+Tewel+-+Alas+Godong+Jati/@-6.7490843,111.042044,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d255c1747857:0x487b2ff0cbcb9f62!8m2!3d-6.7490843!4d111.0442327"));
            items.add(new Item("https://i.ibb.co/vmKR2tt/mbak-yun.png", getString(R.string.sowel5), getString(R.string.desSowel5), "-6.8794508,111.0424246","https://www.google.co.id/maps/place/Warung+Sego+Tewel+Mbak+Yun/@-6.8794508,111.0424246,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70cb9de973ad3d:0x1f023adc1979f36!8m2!3d-6.8794508!4d111.0446133"));
            items.add(new Item("https://i.ibb.co/DgncXFB/SoWel.png", getString(R.string.sowel6), getString(R.string.desSowel6), "-6.6585074,111.0465558","https://www.google.co.id/maps/place/SO-WEL+sego+tewel/@-6.6585074,111.0465558,824m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d507263df1c1:0x97f1d962c9728d2c!8m2!3d-6.6585074!4d111.0487445"));
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