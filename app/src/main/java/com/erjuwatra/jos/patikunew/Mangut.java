package com.erjuwatra.jos.patikunew;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Mangut extends AppCompatActivity {
    ActionBar actionBar;
    private ArrayList<Item> items= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mangut);

        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(" WARUNG MAKAN MANGUT");


        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new Adapter(items, this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        items.add(new Item("https://i.ibb.co/v1Wf858/IMG20201007130717.jpg", getString(R.string.mangut1), getString(R.string.desmangut1),"-6.696275,111.075165","https://www.google.co.id/maps/place/Warung+Makan+Bu+Sarah/@-6.7506233,111.024204,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d24bdf367f09:0x7aef700a59e9a401!8m2!3d-6.7506286!4d111.0263927"));
        items.add(new Item("https://i.ibb.co/v1Wf858/IMG20201007130717.jpg", getString(R.string.mangut2), getString(R.string.desmangut2), "-6.696275,111.075165","https://www.google.co.id/maps/place/Warung+ndas+manyung/@-6.7493052,111.0438526,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70d3bb9d7f0b93:0x532bb49c2e108213!8m2!3d-6.7493105!4d111.0460413"));
        items.add(new Item("https://i.ibb.co/v1Wf858/IMG20201007130717.jpg", getString(R.string.mangut3), getString(R.string.desmangut3), "-6.696275,111.075165","https://www.google.co.id/maps/place/Warung+Ndas+Manyung%2Bes+Gempol/@-6.7892132,111.0521137,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e70cd2b7d85105f:0xfcde71c11d1fdd30!8m2!3d-6.7892185!4d111.0543024"));
        items.add(new Item("https://i.ibb.co/v1Wf858/IMG20201007130717.jpg", getString(R.string.mangut4), getString(R.string.desmangut4), "-6.696275,111.075165","https://www.google.co.id/maps/place/Warung+Makan+Sederhana+(+Kepala+manyung+)/@-6.7185417,111.1455513,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e772c672e20ba6f:0x3eefecea949718ff!8m2!3d-6.718547!4d111.14774"));
        items.add(new Item("https://i.ibb.co/v1Wf858/IMG20201007130717.jpg", getString(R.string.mangut5), getString(R.string.desmangut5), "-6.696275,111.075165","https://www.google.co.id/maps/place/Warung+Tower+Special+Kepala+Manyung+Pedas/@-6.7114256,111.1821341,823m/data=!3m2!1e3!4b1!4m5!3m4!1s0x2e772c1c66bd5c2d:0xdfb9157c878e1357!8m2!3d-6.7114309!4d111.1843228"));

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
