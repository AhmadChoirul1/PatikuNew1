package com.erjuwatra.jos.patikunew;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import ru.embersoft.expandabletextview.ExpandableTextView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<Item> items;
    private Context context;

    public Adapter(ArrayList<Item> items, Context context) {
        this.items = items;
        this.context = context;

    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,
                parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final Adapter.ViewHolder holder, final int position) {

        final Item item = items.get(position);
        Glide.with(context).load(item.getImageResources()).into(holder.imageView);
        holder.titleTextView.setText(item.getTitle());
        holder.descTextView.setText(item.getDesc());
        holder.descTextView.setOnStateChangeListener(new ExpandableTextView.OnStateChangeListener() {
            @Override
            public void onStateChange(boolean isShrink) {
                Item contentItem = items.get(position);
                contentItem.setShrink(isShrink);
                items.set(position, contentItem);
            }
        });
        holder.descTextView.setText(item.getDesc());
        holder.descTextView.resetState(item.isShrink());
        holder.btnshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareintent = new Intent(Intent.ACTION_SEND);
                shareintent.setType("text/plain");
                shareintent.putExtra(Intent.EXTRA_SUBJECT, "Insert Subject here");

                String app_url = item.getSharebutton();
                shareintent.putExtra(android.content.Intent.EXTRA_TEXT, app_url);
                context.startActivity(Intent.createChooser(shareintent, "Share via"));
            }
        });
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String googleMap = "com.google.android.apps.maps";
                Uri gmmIntentUri = Uri.parse("google.navigation:q=" + item.getKoordinat());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage(googleMap);
                if (mapIntent.resolveActivity(context.getPackageManager()) !=null){
                    context.startActivity(mapIntent);
                }else {

                    Toast.makeText(context, "Google Maps Belum di Install, Mohon Install Dahulu" + item.getTitle(), Toast.LENGTH_SHORT).show();
                }

                }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        ExpandableTextView descTextView;
        TextView titleTextView;
        Button btn, btnshare;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            descTextView = itemView.findViewById(R.id.descTextview);
            titleTextView = itemView.findViewById(R.id.titletextiew);
            imageView = itemView.findViewById(R.id.imageview1);
            btn = itemView.findViewById(R.id.lokasi);
            btnshare = itemView.findViewById(R.id.btnshare);

        }
    }
}
