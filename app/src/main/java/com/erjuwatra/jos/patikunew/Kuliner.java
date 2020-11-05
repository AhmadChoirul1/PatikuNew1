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

public class Kuliner extends Fragment {
    //untuk intent
    private CardView cvSowel, cvBandeng, cvGandul, cvPetis, cvTempe,cvSoto,cvMangut;
    private ImageView imPasar, imSnack, imAngkringan;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return di ganti dengan View
        View v = inflater.inflate(R.layout.fragment_kuliner, container, false);
        //gambar
//        ImageView img1 = v.findViewById(R.id.k_sowel);
//        ImageView img2 = v.findViewById(R.id.k_bandeng);
//        ImageView img3 = v.findViewById(R.id.k_gandul);
//        ImageView img4 = v.findViewById(R.id.k_petis);
//        ImageView img5 = v.findViewById(R.id.k_nasipedes);
//        ImageView img6 = v.findViewById(R.id.k_soto);
//        ImageView img7 = v.findViewById(R.id.k_mangut);

        //didapat dari private di atas
        cvSowel=v.findViewById(R.id.sowel_kuliner);
        cvGandul= v.findViewById(R.id.gandul_kuliner);
        cvPetis= v.findViewById(R.id.petis_kuliner);
        cvTempe= v.findViewById(R.id.Tempe_kuliner);
        cvSoto= v.findViewById(R.id.soto_kuliner);
        cvMangut= v.findViewById(R.id.mangut_kuliner);
        cvBandeng= v.findViewById(R.id.bandeng_kuliner);
        imPasar = v.findViewById(R.id.pasar);
        imSnack = v.findViewById(R.id.snack);
        imAngkringan = v.findViewById(R.id.angkringan);

        //Intent card view
        cvSowel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentsowel = new Intent(getActivity(), Sowel.class);
                startActivity(intentsowel);
            }
        });
        cvBandeng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentbandeng = new Intent(getActivity(), Bandeng.class);
                startActivity(intentbandeng);
            }
        });
        cvGandul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentgandul = new Intent(getActivity(), Gandul.class);
                startActivity(intentgandul);
            }
        });
        cvPetis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentpetis = new Intent(getActivity(), Petis.class);
                startActivity(intentpetis);
            }
        });
        cvTempe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenttempe = new Intent(getActivity(), Tempe.class);
                startActivity(intenttempe);
            }
        });
        cvSoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentsoto = new Intent(getActivity(), Soto.class);
                startActivity(intentsoto);
            }
        });
        cvMangut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentmangut = new Intent(getActivity(), Mangut.class);
                startActivity(intentmangut);
            }
        });
        //Intent Image View
        imPasar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPasar = new Intent(getActivity(), Pasar.class);
                startActivity(intentPasar);
            }
        });
        imSnack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSnack = new Intent(getActivity(), Snack.class);
                startActivity(intentSnack);
            }
        });
        imAngkringan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentAngkringan = new Intent(getActivity(), Angkringan.class);
                startActivity(intentAngkringan);
            }
        });

//        Glide.with(this).load("https://i.ibb.co/px0Qkqs/sowel.jpg").into(img1);
//        Glide.with(this).load("https://i.ibb.co/HgHg8p5/bandeng.jpg").into(img2);
//        Glide.with(this).load("https://i.ibb.co/kX08fWh/gandul.jpg").into(img3);
//        Glide.with(this).load("https://i.ibb.co/m4YyPnc/petisrunting.jpg").into(img4);
//        Glide.with(this).load("https://i.ibb.co/6Zpt8s0/nasipedes.jpg").into(img5);
//        Glide.with(this).load("https://i.ibb.co/GcjqC2B/sotokemiri.jpg").into(img6);
//        Glide.with(this).load("https://i.ibb.co/hy0RvMH/mangut.jpg").into(img7);

return v;
    }

}