package com.example.a10119176uts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

//Muhammad Fauzan Fadhlulbarr | IF10K | 10119176 | 23 Mei 2022
public class Walktrought1 extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public Walktrought1(Context context){
        this.context = context;
    }

    //Array
    public int[] slide_images = {
            R.drawable.daily_activity,
            R.drawable.gallery,
            R.drawable.music_video
    };

    public String[] heading = {
            "Daily Activity",
            "Gallery",
            "Music Favorite & Video"
    };

    public String[] heading_desc = {
            "These activities include eating, dressing, \ngetting into or out of a bed or chair, \ntaking a bath or shower, and using \nthe toilet.",
            "These gallery include all my activity \ninto photo and my self picture stored.",
            "These Music and video include all genre \nwhere i listening a lot, especially \nK-Pop and Western Music"
    };


    @Override
    public int getCount() {
        return slide_images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (RelativeLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.activity_walktrought1, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_images);
        TextView slideHeading = (TextView) view.findViewById(R.id.heading);
        TextView slideDescription = (TextView) view.findViewById(R.id.heading_desc);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(heading[position]);
        slideDescription.setText(heading_desc[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}


