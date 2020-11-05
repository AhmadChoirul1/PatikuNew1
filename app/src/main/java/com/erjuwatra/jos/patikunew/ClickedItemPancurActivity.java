package com.erjuwatra.jos.patikunew;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ClickedItemPancurActivity extends AppCompatActivity {

    ImageView imageView;
//    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clicked_item_pancur);

        imageView = findViewById(R.id.imageView);
//        textView = findViewById(R.id.tvName);

        Intent intent =  getIntent();

        if (intent.getExtras() != null){
//            String selectedName = intent.getStringExtra("name");
            String selectedImage = intent.getStringExtra("image");

//            textView.setText(selectedName);
            Glide.with(this).load(selectedImage).into(imageView);
        }

    }
}