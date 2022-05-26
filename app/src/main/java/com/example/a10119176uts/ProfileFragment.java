package com.example.a10119176uts;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


//Muhammad Fauzan Fadhlulbarr | IF10K | 10119176 | 23 Mei 2022
public class ProfileFragment extends Fragment {


    ProfileFragment(){

    }

    public static ProfileFragment newInstance() {
        ProfileFragment fragment = new ProfileFragment();
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    ImageView Instagram, Whatsapp, Telegram, Gmail, Github, Youtube, Maps;
    TextView Abouts;

    @SuppressLint("ResourceType")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_profile, container, false);



        Instagram = (ImageView) root.findViewById(R.id.instagram);
        Whatsapp = (ImageView) root.findViewById(R.id.whatsapp);
        Telegram = (ImageView) root.findViewById(R.id.telegram);
        Gmail = (ImageView) root.findViewById(R.id.gmail);
        Github = (ImageView) root.findViewById(R.id.github);
        Youtube = (ImageView) root.findViewById(R.id.youtube);
        Maps = (ImageView) root.findViewById(R.id.maps);
        Abouts = (TextView) root.findViewById(R.id.about);


        Instagram.setOnClickListener(v -> {
            Intent insta = new Intent();
            insta.setAction(Intent.ACTION_VIEW);
            insta.addCategory(Intent.CATEGORY_BROWSABLE);
            insta.setData(Uri.parse("https://www.instagram.com/fauzanfadhlulbarr/"));
            startActivity(insta);
        });

        Whatsapp.setOnClickListener(view -> {
            Intent whatsapp = new Intent();
            whatsapp.setAction(Intent.ACTION_VIEW);
            whatsapp.addCategory(Intent.CATEGORY_BROWSABLE);
            whatsapp.setData(Uri.parse("https://wa.me/6285155420345"));
            startActivity(whatsapp);
        });

        Telegram.setOnClickListener(view -> {
            Intent telegram = new Intent();
            telegram.setAction(Intent.ACTION_VIEW);
            telegram.addCategory(Intent.CATEGORY_BROWSABLE);
            telegram.setData(Uri.parse("https://t.me/fauzanfadhlulbarr"));
            startActivity(telegram);
        });

        Gmail.setOnClickListener(view -> {
            Intent gmail = new Intent();
            gmail.setAction(Intent.ACTION_VIEW);
            gmail.addCategory(Intent.CATEGORY_BROWSABLE);
            gmail.setData(Uri.parse("mailto:muhammadfauzanfadhlulbarr@gmail.com"));
            startActivity(gmail);

        });


        Github.setOnClickListener(view -> {
            Intent github = new Intent();
            github.setAction(Intent.ACTION_VIEW);
            github.addCategory(Intent.CATEGORY_BROWSABLE);
            github.setData(Uri.parse("https://github.com/muhammadfauzanfadhlulbarr"));
            startActivity(github);
        });

        Youtube.setOnClickListener(view -> {
            Intent youtube = new Intent();
            youtube.setAction(Intent.ACTION_VIEW);
            youtube.addCategory(Intent.CATEGORY_BROWSABLE);
            youtube.setData(Uri.parse("https://www.youtube.com/channel/UCSKeOZNAuUyV_OvafEPRMgQ"));
            startActivity(youtube);
        });

        Maps.setOnClickListener(view -> {
            Intent map = new Intent();
            map.setAction(Intent.ACTION_VIEW);
            map.addCategory(Intent.CATEGORY_BROWSABLE);
            map.setData(Uri.parse("https://goo.gl/maps/bqmevWxfvtBvC2gd8"));
            startActivity(map);
        });

        Abouts.setOnClickListener(view -> {
            AboutDialog Aboutdialog = new AboutDialog();
            Aboutdialog.show(getFragmentManager(),"AboutDialog Apps");
        });

        return root;
    }

}