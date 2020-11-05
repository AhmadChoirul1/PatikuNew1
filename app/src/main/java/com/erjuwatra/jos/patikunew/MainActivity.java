package com.erjuwatra.jos.patikunew;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    BottomNavigationView bottomNavigationView;

    Dashboard fraghome;
    News fragnews;
//    Search fragsearch;
    Kuliner fragkuliner;
    Wisata fragwisata;

    MenuItem menuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.pager);
        setupViewPager(viewPager);

        bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.dashboard:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.news:
                        viewPager.setCurrentItem(1);
                        break;
//                    case R.id.search:
//                        viewPager.setCurrentItem(2);
//                        break;
                    case R.id.kuliner:
                        viewPager.setCurrentItem(2);
                        break;
                    case R.id.traveling:
                        viewPager.setCurrentItem(3);
                        break;
                }
                return false;
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                bottomNavigationView.getMenu().getItem(position).setChecked(true);
                menuItem = bottomNavigationView.getMenu().getItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });


    }

    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        fraghome = new Dashboard();
        fragnews = new News();
//        fragsearch = new Search();
        fragkuliner = new Kuliner();
        fragwisata = new Wisata();


        adapter.addFragment(fraghome);
        adapter.addFragment(fragnews);
//        adapter.addFragment(fragsearch);
        adapter.addFragment(fragkuliner);
        adapter.addFragment(fragwisata);
viewPager.setAdapter(adapter);



    }
}