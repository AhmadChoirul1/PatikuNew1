package com.erjuwatra.jos.patikunew;


import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


public class Wisata extends Fragment {
//    ActionBar actionBar;

    private TextView tvSelanjutnya, tvSelajutnya1, tvSelajutnya2, tvSelajutnya3, tvSelajutnya4, tvSelajutnya5, tvSelajutnya6
            , tvSelanjutnya7, tvSelajutnya8, tvSelanjutnya9,  tvSelanjutnya10,  tvSelanjutnya11,  tvSelanjutnya12,  tvSelanjutnya13
            ,tvSelanjutnya14, tvSelanjutnya15, tvSelanjutnya16, tvSelanjutnya17, tvSelanjutnya18, tvSelanjutnya19, tvSelanjutnya20;

    public Wisata() {
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_wisata, container, false);
        ImageView img1 = v.findViewById(R.id.agro_jollong);
        ImageView img2 = v.findViewById(R.id.g_kemiri);
        ImageView img3 = v.findViewById(R.id.Taman_kalidoro);
        ImageView img4 = v.findViewById(R.id.Sendang_Sani);
        ImageView img5 = v.findViewById(R.id.Tpa);
        ImageView img6 = v.findViewById(R.id.Gerbang_majapahit);
        ImageView img7 = v.findViewById(R.id.waduk_gembong);
        ImageView img8 = v.findViewById(R.id.goa_pancur);
        ImageView img9 = v.findViewById(R.id.bukit_naga);
        ImageView img10 = v.findViewById(R.id.lorodan_semar);
        ImageView img11 = v.findViewById(R.id.terpus);
        ImageView img12 = v.findViewById(R.id.terjun_tedunan);
        ImageView img13 = v.findViewById(R.id.pantai_idola);
        ImageView img14 = v.findViewById(R.id.pantai_cinta);
        ImageView img15 = v.findViewById(R.id.rowo);
        ImageView img16 = v.findViewById(R.id.embung);
        ImageView img17 = v.findViewById(R.id.Grenjengan_sena);
        ImageView img18 = v.findViewById(R.id.Goa_wareh);
        ImageView img19 = v.findViewById(R.id.bukit);




        //inisialisasi

        tvSelanjutnya = v.findViewById(R.id.selanjutnya1);
        tvSelanjutnya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPancur = new Intent(getActivity(), Genuk.class);
                startActivity(intentPancur);
            }
        });
        tvSelajutnya1 = v.findViewById(R.id.selanjutnya);
        tvSelajutnya1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentgenuk = new Intent(getActivity(), Jollong.class);
                startActivity(intentgenuk);
            }
        });
        tvSelajutnya2 = v.findViewById(R.id.selanjutnya2);
        tvSelajutnya2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMajapahit = new Intent(getActivity(), TamanKalidoro.class);
                startActivity(intentMajapahit);
            }
        });
        tvSelajutnya3 = v.findViewById(R.id.selanjutnya3);
        tvSelajutnya3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTaman = new Intent(getActivity(), SendangSani.class);
                startActivity(intentTaman);
            }
        });
        tvSelajutnya4 = v.findViewById(R.id.selanjutnya4);
        tvSelajutnya4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTpa = new Intent(getActivity(), Tpa.class);
                startActivity(intentTpa);
            }
        });
        tvSelajutnya5 = v.findViewById(R.id.selanjutnya5);
        tvSelajutnya5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGerbang = new Intent(getActivity(), Majapahit.class);
                startActivity(intentGerbang);
            }
        });
        tvSelajutnya6 = v.findViewById(R.id.selanjutnya6);
        tvSelajutnya6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentgembong = new Intent(getActivity(), Gembong.class);
                startActivity(intentgembong);
            }
        });
        tvSelanjutnya7 = v.findViewById(R.id.selanjutnya7);
        tvSelanjutnya7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentbukit = new Intent(getActivity(), GoaPancur.class);
                startActivity(intentbukit);
            }
        });
        tvSelajutnya8 = v.findViewById(R.id.selanjutnya8);
        tvSelajutnya8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentbukitnaga = new Intent(getActivity(), BukitNaga.class);
                startActivity(intentbukitnaga);
            }
        });
        tvSelanjutnya9 = v.findViewById(R.id.selanjutnya9);
        tvSelanjutnya9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLorodansemar = new Intent(getActivity(), LorodanSemar.class);
                startActivity(intentLorodansemar);
            }
        });
        tvSelanjutnya10 = v.findViewById(R.id.selanjutnya10);
        tvSelanjutnya10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTerpus = new Intent(getActivity(), Terpus.class);
                startActivity(intentTerpus);
            }
        });
        tvSelanjutnya11 = v.findViewById(R.id.selanjutnya11);
        tvSelanjutnya11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTedunan = new Intent(getActivity(), Tedunan.class);
                startActivity(intentTedunan);
            }
        });
        tvSelanjutnya12 = v.findViewById(R.id.selanjutnya12);
        tvSelanjutnya12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentIdola = new Intent(getActivity(), PantaiIdola.class);
                startActivity(intentIdola);
            }
        });
        tvSelanjutnya13 = v.findViewById(R.id.selanjutnya13);
        tvSelanjutnya13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentCinta = new Intent(getActivity(), PantaiCinta.class);
                startActivity(intentCinta);
            }
        });
        tvSelanjutnya14 = v.findViewById(R.id.selanjutnya14);
        tvSelanjutnya14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRowo = new Intent(getActivity(), Rowo.class);
                startActivity(intentRowo);
            }
        });
        tvSelanjutnya15 = v.findViewById(R.id.selanjutnya15);
        tvSelanjutnya15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentEmung = new Intent(getActivity(), EmbungMini.class);
                startActivity(intentEmung);
            }
        });
        tvSelanjutnya16 = v.findViewById(R.id.selanjutnya16);
        tvSelanjutnya16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentSena = new Intent(getActivity(),GrenjenganSena.class);
                startActivity(intentSena);
            }
        });
        tvSelanjutnya17 = v.findViewById(R.id.selanjutnya17);
        tvSelanjutnya17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentWareh = new Intent(getActivity(), GoaWareh.class);
                startActivity(intentWareh);
            }
        });
        tvSelanjutnya18 = v.findViewById(R.id.selanjutnya18);
        tvSelanjutnya18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentPandang = new Intent(getActivity(), BukitPandang.class);
                startActivity(intentPandang);
            }
        });

        Glide.with(this).load("https://i.ibb.co/5Ftc84C/argo-njolong.jpg").into(img1);
        Glide.with(this).load("https://i.ibb.co/Kmrq7Vr/IMG20201007132336.jpg").into(img2);
        Glide.with(this).load("https://i.ibb.co/2vwQ1z6/IMG20201007131633.jpg").into(img3);
        Glide.with(this).load("https://i.ibb.co/NyY8zNC/IMG20201007141947.jpg").into(img4);
        Glide.with(this).load("https://i.ibb.co/F7yCxrr/IMG20201007125843.jpg").into(img5);
        Glide.with(this).load("https://i.ibb.co/v1Wf858/IMG20201007130717.jpg").into(img6);
        Glide.with(this).load("https://i.ibb.co/k2V50DT/IMG20201007122805.jpg").into(img7);
        Glide.with(this).load("https://i.ibb.co/BqRf4LX/IMG-20201012-105623.jpg").into(img8);
        Glide.with(this).load("https://i.ibb.co/584DQxk/IMG-20201007-123810-tigr.jpg").into(img9);
        Glide.with(this).load("https://i.ibb.co/8b08YJy/IMG-20201012-094737-tigr.jpg").into(img10);
        Glide.with(this).load("https://i.ibb.co/7XyT3LY/IMG20201012101905.jpg").into(img11);
        Glide.with(this).load("https://i.ibb.co/mXTtxMc/IMG-20201007-084304-tigr.jpg").into(img12);
        Glide.with(this).load("https://i.ibb.co/R7TYw6C/IMG-20201005-085217-tigr-Salin.jpg").into(img13);
        Glide.with(this).load("https://i.ibb.co/j59zPzb/IMG-20201005-092348-tigr-Salin.jpg").into(img14);
        Glide.with(this).load("https://i.ibb.co/rHd9mTM/IMG-20201007-093114-tigr.jpg").into(img15);
        Glide.with(this).load("https://i.ibb.co/VLmwbKz/Embung.png").into(img16);
        Glide.with(this).load("https://i.ibb.co/TWC01v0/IMG-20201005-145933-tigr.jpg").into(img17);
        Glide.with(this).load("https://i.ibb.co/BCTsLXH/IMG-20201012-113248-tigr.jpg").into(img18);
        Glide.with(this).load("https://i.ibb.co/jv2xQR6/IMG-20201012-092524-tigr.jpg").into(img19);



        return v;


    }
}