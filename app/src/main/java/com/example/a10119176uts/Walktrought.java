package com.example.a10119176uts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

//Muhammad Fauzan Fadhlulbarr | IF10K | 10119176 | 23 Mei 2022
public class Walktrought extends AppCompatActivity {

    private ViewPager nWalktrought1;
    private LinearLayout nDotLayout;

    private TextView[] nDots;

    private Walktrought1 walktrought1;

    private Button nNextbtn;
    private Button nBackbtn;

    private int nCurrentPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walktrought);

        nWalktrought1 = (ViewPager) findViewById(R.id.slideViewPager);
        nDotLayout = (LinearLayout) findViewById(R.id.dotsLayout);

        nNextbtn = (Button) findViewById(R.id.Nextbtn);
        nBackbtn = (Button) findViewById(R.id.Backbtn);

        walktrought1 = new Walktrought1(this);

        nWalktrought1.setAdapter(walktrought1);
        addDotsIndicator(0);

        nWalktrought1.addOnPageChangeListener(viewListener);

        nNextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nWalktrought1.setCurrentItem(nCurrentPage + 1);
            }
        });

        nBackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nWalktrought1.setCurrentItem(nCurrentPage - 1);
            }
        });

        getSupportActionBar().hide();
    }

    public void addDotsIndicator(int position){
        nDots = new TextView[3];
        nDotLayout.removeAllViews();

        for(int i = 0; i < nDots.length; i++){
            nDots[i] = new TextView(this);
            nDots[i].setText(Html.fromHtml("&#8226;"));
            nDots[i].setTextSize(35);
            nDots[i].setTextColor(getResources().getColor(R.color.Primary));

            nDotLayout.addView(nDots[i]);
        }

        if(nDots.length > 0) {
            nDots[position].setTextColor(getResources().getColor(R.color.Secondary));
        }
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            addDotsIndicator(position);

            nCurrentPage = position;

            if(position == 0){
                nNextbtn.setEnabled(true);
                nBackbtn.setEnabled(false);
                nBackbtn.setVisibility(View.INVISIBLE);

                nNextbtn.setText("Next");
                nBackbtn.setText("");
            } else if(position == nDots.length - 1){
                nNextbtn.setEnabled(true);
                nBackbtn.setEnabled(true);
                nBackbtn.setVisibility(View.VISIBLE);
                nNextbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        launchHomeScreen();
                    }
                });

                nNextbtn.setText("Finish");
                nBackbtn.setText("Back");
            } else {
                nNextbtn.setEnabled(true);
                nBackbtn.setEnabled(true);
                nBackbtn.setVisibility(View.VISIBLE);

                nNextbtn.setText("Next");
                nBackbtn.setText("Back");
            }


        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    private void launchHomeScreen() {
        startActivity(new Intent(this, BottomNavigation.class));
        finish();
    }
}














