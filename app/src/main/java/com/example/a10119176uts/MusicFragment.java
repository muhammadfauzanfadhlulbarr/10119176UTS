package com.example.a10119176uts;

import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import java.util.ArrayList;

//Muhammad Fauzan Fadhlulbarr | IF10K | 10119176 | 23 Mei 2022
public class MusicFragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<MusicModel> musicModels;

    public MusicFragment() {
        // Required empty public constructor
    }



    public static MusicFragment newInstance() {
        MusicFragment fragment = new MusicFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_music, container, false);

        // music
        recyclerView = root.findViewById(R.id.recview_music);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        musicModels = new ArrayList<>();


        MusicModel music1 = new MusicModel(R.drawable.aespa_black_mamba, "Black Mamba", "Aespa");
        musicModels.add(music1);
        MusicModel music2 = new MusicModel(R.drawable.aespa_dream_come_true, "Dreams Come True", "Aespa");
        musicModels.add(music2);
        MusicModel music3 = new MusicModel(R.drawable.aespa_next_level, "Next Level", "Aespa");
        musicModels.add(music3);
        MusicModel music4 = new MusicModel(R.drawable.aespa_savage, "Savage", "Aespa");
        musicModels.add(music4);
        MusicModel music5 = new MusicModel(R.drawable.aespa_savage, "Aenergy", "Aespa");
        musicModels.add(music5);
        MusicModel music6 = new MusicModel(R.drawable.aespa_forever, "Forever", "Aespa");
        musicModels.add(music6);


        MusicAdapter musicAdapter = new MusicAdapter(musicModels, getContext());
        recyclerView.setAdapter(musicAdapter);

        VideoView vvVideo = root.findViewById(R.id.vv_video);
        String videoPath = "android.resource://" + getContext().getPackageName() + "/" + R.raw.black_mamba;
        Uri uri = Uri.parse(videoPath);
        vvVideo.setVideoURI(uri);


        MediaController mediaController = new MediaController(getContext());
        vvVideo.setMediaController(mediaController);
        mediaController.setAnchorView(vvVideo);


        return root;
    }
}