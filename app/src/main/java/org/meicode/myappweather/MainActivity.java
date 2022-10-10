package org.meicode.myappweather;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.RecoverySystem;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import org.meicode.myappweather.Fragment.CityFragment;
import org.meicode.myappweather.Fragment.FavouriteFragment;
import org.meicode.myappweather.Fragment.HomeFragment;
import org.meicode.myappweather.Fragment.SettingFragment;
import org.meicode.myappweather.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {


    BottomNavigationView bottomNavigationView;
    Fragment homeFragment= new HomeFragment();





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        //replaceFragment(new HomeFragment());

        bottomNavigationView = findViewById(R.id.bottomNavigation);



        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, homeFragment).commit();
        //bottomNavigationView.setSelectedItemId(R.id.city);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        homeFragment = new HomeFragment();
                        break;
                    case R.id.favourite:
                        homeFragment = new FavouriteFragment();
                        break;
                    case R.id.city:
                        homeFragment = new CityFragment();
                        break;
                        case R.id.setting:
                        homeFragment = new SettingFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout , homeFragment).commit();
                return true;
            }
        });
    }



}