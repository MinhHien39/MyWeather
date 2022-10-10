package org.meicode.myappweather.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.meicode.myappweather.Model.DayWeather;
import org.meicode.myappweather.Model.hourWeather;
import org.meicode.myappweather.ItemClickListener;
import org.meicode.myappweather.Model.hourWeather;
import org.meicode.myappweather.R;
import org.meicode.myappweather.Adapter.dayWeatherAdapter;

import org.meicode.myappweather.Adapter.hourWeatherAdapter;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    List<hourWeather> list;
    hourWeatherAdapter adapter;

    RecyclerView recyclerView2;
    List<DayWeather> list2;
    dayWeatherAdapter adapter2;


    ImageView imageView;
    TextView txt_temperature;

    TextView txt_name;
    TextView txt_humidity;
    TextView txt_wind;
    ConstraintLayout constraintLayout;





    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_home, container, false);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerView1);
        imageView = view.findViewById(R.id.img_title);
        txt_name = view.findViewById(R.id.txt_name123);
        txt_temperature = view.findViewById(R.id.txt_temperature);
        txt_humidity = view.findViewById(R.id.txt_humidity);
        txt_wind = view.findViewById(R.id.txt_wind);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext() , RecyclerView.HORIZONTAL , false));
        recyclerView.setHasFixedSize(true);
        list = new ArrayList<>();
        list.add(new hourWeather("01 AM" , 1, "19"));
        list.add(new hourWeather("02 AM" , 2, "20"));
        list.add(new hourWeather("03 AM ", 2, "21"));
        list.add(new hourWeather("04 PM" , 1, "18"));
        list.add(new hourWeather("05 AM" , 1, "19"));
        list.add(new hourWeather("06 AM" , 2, "20"));
        list.add(new hourWeather("07 AM" , 2, "21"));
        list.add(new hourWeather("08 AM" , 1, "18"));
        list.add(new hourWeather("09 AM" , 1, "19"));
        list.add(new hourWeather("10 AM" , 2, "20"));
        list.add(new hourWeather("11 AM" , 2, "21"));
        list.add(new hourWeather("12 AM" , 1, "18"));
        list.add(new hourWeather("01 PM" , 1, "19"));
        list.add(new hourWeather("02 PM" , 2, "20"));
        list.add(new hourWeather("03 PM" , 2, "21"));
        list.add(new hourWeather("04 PM" , 1, "18"));
        list.add(new hourWeather("05 PM" , 1, "19"));
        list.add(new hourWeather("06 PM" , 2, "20"));
        list.add(new hourWeather("07 PM" , 2, "21"));
        list.add(new hourWeather("08 PM" , 1, "18"));
        list.add(new hourWeather("09 PM" , 1, "19"));
        list.add(new hourWeather("10 PM" , 2, "20"));
        list.add(new hourWeather("11 PM" , 2, "21"));
        list.add(new hourWeather("12 PM" , 1, "18"));

        adapter = new hourWeatherAdapter(list);

        adapter.setItemClickListener(new ItemClickListener<hourWeather>() {
            @Override
            public void onClick(View view, int position, hourWeather data) {
                imageView.setImageResource(data.getImage());
                txt_temperature.setText(data.getTemperature());
            }
        });

        recyclerView.setAdapter(adapter);

        recyclerView2 = view.findViewById(R.id.recyclerView2);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView2.setLayoutManager(new GridLayoutManager(getContext() , 1));
        list2 = new ArrayList<>();
        list2.add(new DayWeather("Monday" , 1 , "19"  , "19" ));
        list2.add(new DayWeather("Tuesday" , 2 , "18"  , "19" ));
        list2.add(new DayWeather("Wednesday" , 1 , "20" , "19" ));
        list2.add(new DayWeather("Thursday" , 2 , "15" , "19" ));
        list2.add(new DayWeather("Friday" , 1 , "17" , "19" ));
        list2.add(new DayWeather("Saturday" , 2 , "23"  , "19" ));
        list2.add(new DayWeather("Sunday" , 1 , "24"  , "19" ));
        adapter2 = new dayWeatherAdapter(list2);
        adapter2.setItemClickListener(new ItemClickListener<DayWeather>() {
            @Override
            public void onClick(View view, int position, DayWeather data) {
                imageView.setImageResource(data.getTypeImage());
                txt_temperature.setText(data.getTemp1());
            }
        });
        recyclerView2.setAdapter(adapter2);

        Bundle bundle = getArguments();
        //String name = bundle.getString("nameCity");

        if (bundle != null){
            txt_name.setText(bundle.getString("nameCity"));
            txt_temperature.setText(bundle.getString("temperatureCity"));
            txt_humidity.setText(bundle.getString("humidityCity"));
            txt_wind.setText(bundle.getString("windCity"));
            imageView.setImageResource(bundle.getInt("imageCity"));
        }


    }

}