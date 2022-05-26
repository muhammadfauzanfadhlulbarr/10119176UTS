package com.example.a10119176uts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

//Muhammad Fauzan Fadhlulbarr | IF10K | 10119176 | 23 Mei 2022
public class BottomNavigation extends AppCompatActivity {

    private BottomNavigationView nMainNav;
    private FrameLayout nMainFrame;

    private HomeFragment homeFragment;
    private GalleryFragment galleryFragment;
    private DailyFragment dailyFragment;
    private MusicFragment musicFragment;
    private ProfileFragment profileFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        getSupportActionBar().hide();

        nMainFrame = (FrameLayout) findViewById(R.id.main_frame);
        nMainNav = (BottomNavigationView) findViewById(R.id.main_nav);

        homeFragment = new HomeFragment();
        galleryFragment = new GalleryFragment();
        dailyFragment = new DailyFragment();
        musicFragment = new MusicFragment();
        profileFragment = new ProfileFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.main_frame, homeFragment).commit();

        nMainNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_home :
                        setFragment(homeFragment);
                        return true;
                    case R.id.nav_gallery :
                        setFragment(galleryFragment);
                        return true;
                    case R.id.nav_daily :
                        setFragment(dailyFragment);
                        return true;
                    case R.id.nav_music :
                        setFragment(musicFragment);
                        return true;
                    case R.id.nav_profile :
                        setFragment(profileFragment);
                        return true;
                    default:
                        return false;
                }


            }

            private void setFragment(Fragment fragment) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

                fragmentTransaction.replace(R.id.main_frame, fragment);
                fragmentTransaction.commit();
            }
        });


    }
}