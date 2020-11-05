package com.erjuwatra.jos.patikunew;

import android.app.ActionBar;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class News extends Fragment {
    //untuk web view
WebView mv;
String URL;
ActionBar actionBar;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_news, container, false);

        //ini untuk webviewnya
        URL = "https://mitrapost.com/";
        mv = v.findViewById(R.id.web);
        mv.getSettings().setJavaScriptEnabled(true);
        mv.loadUrl(URL);
        mv.setWebViewClient(new WebViewClient());
     return v;
    }
}