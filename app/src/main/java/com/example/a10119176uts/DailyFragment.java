package com.example.a10119176uts;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


//Muhammad Fauzan Fadhlulbarr | IF10K | 10119176 | 23 Mei 2022
public class DailyFragment extends Fragment {

    DailyFragment(){

    }

    public static DailyFragment newInstance() {
        DailyFragment fragment = new DailyFragment();
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    RecyclerView recyclerViewDaily;
    ArrayList<DailyModel> dailyModel;
    RecyclerView recyclerViewFriendlist;
    ArrayList<FriendlistModel> friendlistModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_daily, container, false);

        recyclerViewDaily = root.findViewById(R.id.view_daily);
        recyclerViewDaily.setLayoutManager(new LinearLayoutManager(getContext()));

        dailyModel = new ArrayList<>();

        DailyModel daily1 = new DailyModel(R.drawable.daily_sleep, "Wake up", "04.00 a.m");
        dailyModel.add(daily1);
        DailyModel daily2 = new DailyModel(R.drawable.daily_sport, "Sport", "06.00 a.m - 07.00 p.m");
        dailyModel.add(daily2);
        DailyModel daily3 = new DailyModel(R.drawable.daily_kerja, "Work", "08.00 p.m - 16.00 p.m ");
        dailyModel.add(daily3);
        DailyModel daily4 = new DailyModel(R.drawable.daily_bersih, "Clean Room", "16.00 p.m - 16.30 p.m");
        dailyModel.add(daily4);
        DailyModel daily5 = new DailyModel(R.drawable.daily_game, "Playing Game", "16.30 p.m - 18.00 p.m");
        dailyModel.add(daily5);
        DailyModel daily6 = new DailyModel(R.drawable.daily_kuliah, "College", "18.00 pm / 22.50 p.m");
        dailyModel.add(daily6);

        recyclerViewDaily.setAdapter(new DailyAdapter(dailyModel));

        recyclerViewFriendlist = root.findViewById(R.id.view_friendlist);
        recyclerViewFriendlist.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        friendlistModel = new ArrayList<>();

        FriendlistModel friendlist1 = new FriendlistModel(R.drawable.friend_karina, "Karina");
        friendlistModel.add(friendlist1);
        FriendlistModel friendlist2 = new FriendlistModel(R.drawable.friend_haechan, "Haechan");
        friendlistModel.add(friendlist2);
        FriendlistModel friendlist3 = new FriendlistModel(R.drawable.friend_mark, "Mark");
        friendlistModel.add(friendlist3);
        FriendlistModel friendlist4 = new FriendlistModel(R.drawable.friend_renjun, "Renjun");
        friendlistModel.add(friendlist4);
        FriendlistModel friendlist5 = new FriendlistModel(R.drawable.friend_sehun, "Sehun");
        friendlistModel.add(friendlist5);
        FriendlistModel friendlist6 = new FriendlistModel(R.drawable.friend_yoona, "Yoona");
        friendlistModel.add(friendlist6);
        FriendlistModel friendlist7 = new FriendlistModel(R.drawable.friend_arfin, "Arfin");
        friendlistModel.add(friendlist7);
        FriendlistModel friendlist8 = new FriendlistModel(R.drawable.friend_taeyeon, "Taeyeon");
        friendlistModel.add(friendlist8);
        FriendlistModel friendlist9 = new FriendlistModel(R.drawable.friend_winter, "Winter");
        friendlistModel.add(friendlist9);

        recyclerViewFriendlist.setAdapter(new FriendlistAdapter(friendlistModel));

        return root;
    }


}