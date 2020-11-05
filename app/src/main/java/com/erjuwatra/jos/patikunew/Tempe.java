package com.erjuwatra.jos.patikunew;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Tempe extends AppCompatActivity {
    ActionBar actionBar;
    private ArrayList<Item> items= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tempe);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(" WARUNG MAKAN TEMPE");


        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new Adapter(items, this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        items.add(new Item("https://i.ibb.co/v1Wf858/IMG20201007130717.jpg", getString(R.string.tempe1), getString(R.string.destempe1), "-6.7025807,111.0606473","https://www.google.co.id/maps/place/Sego+Tempe+Pedes/@-6.7025807,111.0606473,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d49dc21b0d57:0x6d3fee0a5723e90e!8m2!3d-6.702586!4d111.062836"));
        items.add(new Item("https://i.ibb.co/v1Wf858/IMG20201007130717.jpg", getString(R.string.tempe2), getString(R.string.destempe2), "-6.7002316,111.0623082","https://www.google.co.id/maps/place/Sego+tempe+pedes+warung+ijo/@-6.7002316,111.0623082,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d5e2033531f7:0xa069d813ce042c4a!8m2!3d-6.7002369!4d111.0644969"));
        items.add(new Item("https://i.ibb.co/v1Wf858/IMG20201007130717.jpg", getString(R.string.tempe3), getString(R.string.destempe3), "-6.728853,111.051026","https://www.google.co.id/maps/place/sego+tempe+pedes+ngarep+Fastabiq/@-6.7288218,111.0487931,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d341ac56ac7b:0x2e74a7543cc07437!8m2!3d-6.7288271!4d111.0509818"));
        items.add(new Item("https://i.ibb.co/v1Wf858/IMG20201007130717.jpg", getString(R.string.tempe4), getString(R.string.destempe4), "-6.6256185,111.0515327","https://www.google.co.id/maps/place/Sego+Tempe+Pedes+Pak+Sarbi/@-6.6256185,111.0515327,824m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d5795d26aa71:0x55f70bc5c15e3e92!8m2!3d-6.6256238!4d111.0537214"));
        items.add(new Item("https://i.ibb.co/v1Wf858/IMG20201007130717.jpg", getString(R.string.tempe5), getString(R.string.destempe5), "-6.6924791,111.0685382","https://www.google.co.id/maps/place/Nasi+Pedes+Tempe+Semangit/@-6.6924791,111.0685382,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d4bd43adfc19:0xb8e5e6032e709982!8m2!3d-6.6924844!4d111.0707269"));
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
