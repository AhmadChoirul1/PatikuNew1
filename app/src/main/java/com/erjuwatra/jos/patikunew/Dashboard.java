package com.erjuwatra.jos.patikunew;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;


public class Dashboard extends Fragment {
    private CardView cvWisata, cvPasar, cvAngkringan, cvKuliner, cvSowel, cvTpa, cvPragolo, cvPantai;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_dashboard, container, false);
        //
        cvWisata= v.findViewById(R.id.w_jollong);
        cvAngkringan = v.findViewById(R.id.Angringan);
        cvPasar =  v.findViewById(R.id.P_pasar);
        cvKuliner = v.findViewById(R.id.Kuliner);
        cvSowel = v.findViewById(R.id.cvSowel);
        cvTpa = v.findViewById(R.id.cvTpa);
        cvPragolo = v.findViewById(R.id.cvPragolo);
        cvPantai = v.findViewById(R.id.cvPantai);


        //gambar
        ImageView img1 = v.findViewById(R.id.Jollong);
        ImageView img2 = v.findViewById(R.id.p_pasar);
        ImageView img3 = v.findViewById(R.id.soWel);
        ImageView img4 = v.findViewById(R.id.Angkringan);
        ImageView img5 = v.findViewById(R.id.Sowel);
        ImageView img6 = v.findViewById(R.id.tpa);
        ImageView img7 = v.findViewById(R.id.pragolo_pasar);
        ImageView img8 = v.findViewById(R.id.pantaiIdola);


        ImageSlider imageSlider = v.findViewById(R.id.slider);
        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://i.ibb.co/v4CVmdW/IMG20201007122805.jpg"));
        slideModels.add(new SlideModel("https://i.ibb.co/c2WNVhR/IMG20201007112033.jpg"));
        slideModels.add(new SlideModel("https://i.ibb.co/m4YyPnc/petisrunting.jpg"));
        slideModels.add(new SlideModel("https://i.ibb.co/WKSHzbt/sototarsan.png"));
        slideModels.add(new SlideModel("https://i.ibb.co/GcjqC2B/sotokemiri.jpg"));
        slideModels.add(new SlideModel("https://picsum.photos/id/891/300/200"));
        imageSlider.setImageList(slideModels, true);

        //Intent
        cvWisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentwisata = new Intent(getActivity(), Jollong.class);
                startActivity(intentwisata);
            }
        });

        cvPasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPasar = new Intent(getActivity(), Pasar.class);
                startActivity(intentPasar);
            }
        });
        cvKuliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentKuliner = new Intent(getActivity(), Gandul.class);
                startActivity(intentKuliner);
            }
        });
        cvAngkringan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAngkringan = new Intent(getActivity(), Angkringan.class);
                startActivity(intentAngkringan);
            }
        });
        cvSowel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSowel = new Intent(getActivity(), Sowel.class);
                startActivity(intentSowel);
            }
        });
        cvTpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTpa = new Intent(getActivity(), Tpa.class);
                startActivity(intentTpa);
            }
        });
        cvPragolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPragolo = new Intent(getActivity(), Pragolo.class);
                startActivity(intentPragolo);
            }
        });
        cvPantai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPasar = new Intent(getActivity(), PantaiIdola.class);
                startActivity(intentPasar);
            }
        });

        Glide.with(this).load("https://i.ibb.co/yQcN8Fp/IMG20201007112308-2.jpg").into(img1);
        Glide.with(this).load("https://i.ibb.co/7410LZG/pasar.jpg").into(img2);
        Glide.with(this).load("https://i.ibb.co/8KFssb1/pakharjo.png").into(img3);
        Glide.with(this).load("https://i.ibb.co/NyY8zNC/IMG20201007141947.jpg").into(img4);
        Glide.with(this).load("https://i.ibb.co/sjrp7hQ/sulasih.png").into(img5);
        Glide.with(this).load("https://i.ibb.co/F7yCxrr/IMG20201007125843.jpg").into(img6);
        Glide.with(this).load("https://i.ibb.co/7tcYcG8/p-pragolo.jpg").into(img7);
        Glide.with(this).load("https://i.ibb.co/R7TYw6C/IMG-20201005-085217-tigr-Salin.jpg").into(img8);
        return v;
    }
}