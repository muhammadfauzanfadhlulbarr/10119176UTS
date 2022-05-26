package com.example.a10119176uts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


//Muhammad Fauzan Fadhlulbarr | IF10K | 10119176 | 23 Mei 2022
public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.myviewholder> {

    ArrayList<MusicModel> musicModel;
    Context context;




    public MusicAdapter(ArrayList<MusicModel> musicModel, Context context) {
        this.musicModel = musicModel;
        this.context = context;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_music, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.logoMusic.setImageResource(musicModel.get(position).getImage());
        holder.titleFavorite.setText(musicModel.get(position).getTitle());
        holder.singerFavorite.setText(musicModel.get(position).getPenyanyi());
    }

    @Override
    public int getItemCount() {
        return musicModel.size();
    }


    class myviewholder extends RecyclerView.ViewHolder {
        ImageView logoMusic;
        TextView titleFavorite, singerFavorite;

        @SuppressLint("SetJavaScriptEnabled")
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            logoMusic = itemView.findViewById(R.id.logo_music);
            titleFavorite = itemView.findViewById(R.id.title_favorite);
            singerFavorite = itemView.findViewById(R.id.singer_favorite);

        }
    }
}
