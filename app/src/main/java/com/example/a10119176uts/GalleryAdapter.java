package com.example.a10119176uts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


//Muhammad Fauzan Fadhlulbarr | IF10K | 10119176 | 23 Mei 2022
public class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.myviewholder> {

    ArrayList<GalleryModel> galleryModel;

    public GalleryAdapter(ArrayList<GalleryModel> galleryModel) {
        this.galleryModel = galleryModel;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gallery, parent, false);
        return new GalleryAdapter.myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.logoGallery.setImageResource(galleryModel.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return galleryModel.size();
    }

    class myviewholder extends RecyclerView.ViewHolder {
        ImageView logoGallery;

        public myviewholder(@NonNull View itemView) {
            super(itemView);
            logoGallery = itemView.findViewById(R.id.logo_gallery);
        }
    }
}
