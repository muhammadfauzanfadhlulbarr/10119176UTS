package com.example.a10119176uts;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


//Muhammad Fauzan Fadhlulbarr | IF10K | 10119176 | 23 Mei 2022
public class GalleryFragment extends Fragment {

    GalleryFragment(){

    }

    public static GalleryFragment newInstance() {
        GalleryFragment fragment = new GalleryFragment();
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    RecyclerView recyclerViewGallery;
    ArrayList<GalleryModel> galleryModel;
    private StaggeredGridLayoutManager manager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        recyclerViewGallery = root.findViewById(R.id.view_gallery);
        manager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerViewGallery.setLayoutManager(manager);

        galleryModel = new ArrayList<>();

        GalleryModel gallery1 = new GalleryModel(R.drawable.ozan);
        galleryModel.add(gallery1);
        GalleryModel gallery2 = new GalleryModel(R.drawable.ozan1);
        galleryModel.add(gallery2);
        GalleryModel gallery3 = new GalleryModel(R.drawable.ozan2);
        galleryModel.add(gallery3);
        GalleryModel gallery4 = new GalleryModel(R.drawable.ozan3);
        galleryModel.add(gallery4);
        GalleryModel gallery5 = new GalleryModel(R.drawable.ozan4);
        galleryModel.add(gallery5);
        GalleryModel gallery6 = new GalleryModel(R.drawable.ozan5);
        galleryModel.add(gallery6);
        GalleryModel gallery7 = new GalleryModel(R.drawable.ozan6);
        galleryModel.add(gallery7);
        GalleryModel gallery8 = new GalleryModel(R.drawable.ozan7);
        galleryModel.add(gallery8);

        recyclerViewGallery.setAdapter(new GalleryAdapter(galleryModel));



        return root;
    }


}