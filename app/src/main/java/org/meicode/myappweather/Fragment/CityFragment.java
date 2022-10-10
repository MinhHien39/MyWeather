package org.meicode.myappweather.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import org.meicode.myappweather.API.ApiService;
import org.meicode.myappweather.API.WeatherInfoResponse;
import org.meicode.myappweather.API.RetrofitClient;
import org.meicode.myappweather.CityActivityAdapter;
import org.meicode.myappweather.Model.City;
import org.meicode.myappweather.R;

import java.util.ArrayList;
import java.util.List;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class CityFragment extends Fragment {
    RecyclerView recyclerView;
    List<City> list;
    CityActivityAdapter adapter;

    //TextView txt_name123;
    //TextView txt_temperature;


    TextView txt_country;
    TextView txt_temp;
    TextView txt_city;
    ImageView imageView;

    RelativeLayout relativeLayout;

    ApiService apiService;
    RetrofitClient retrofitClient;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_city, container, false);

        recyclerView = root.findViewById(R.id.recyclerView3);

        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));

        txt_city = root.findViewById(R.id.txt_nameCity);
        txt_temp = root.findViewById(R.id.txt_tempCity);
        txt_country = root.findViewById(R.id.txt_nameCountry);
        //txt_temperature = root.findViewById(R.id.txt_temperature);
        imageView = root.findViewById(R.id.img_city);


        list = new ArrayList<>();

        getListCity();

        return  root;


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerView3);

        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        //txt_temperature = view.findViewById(R.id.txt_temperature);
        imageView = view.findViewById(R.id.img_city);




//        list = new ArrayList<>();
//
//        list.add(new City("22", "Austin", "USA", "17%", "7km/h", 1));
//        list.add(new City("-5", "New York", "USA", "17%", "7km/h", 2));
//        list.add(new City("20", "Jakarta", "INA", "27%", "20km/h", 2));
//        list.add(new City("22", "Bangkok", "THAI", "17%", "7km/h", 1));
//        list.add(new City("21", "Da Nang", "VIE", "17%", "7km/h", 1));
//
//        adapter = new CityActivityAdapter(list);
//        adapter.setItemClickListener(new ItemClickListener<City>() {
//            @Override
//            public void onClick(View view, int position, City data) {
//                //Intent intent = new Intent(getContext() , MainActivity.class);
//                String name = data.getCity().toString();
//
//                Bundle bundle = new Bundle();
//                bundle.putString("nameCity", data.getCity());
//                bundle.putString("temperatureCity",data.getTemperature());
//                bundle.putString("humidityCity",data.getHumidity());
//                bundle.putString("windCity",data.getWind());
//                bundle.putInt("imageCity",data.getTypeImage());
//
//                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
//                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//                HomeFragment homeFragment = new HomeFragment();
//                homeFragment.setArguments(bundle);
//
//
//                fragmentTransaction.replace(R.id.frameLayout , homeFragment );
//                fragmentTransaction.commit();
//
//                //startActivity(intent);
//
//            }
//        });
//
//        recyclerView.setAdapter(adapter);
    }
    public void getListCity(){
        Log.d("AAAA","Access");
        RetrofitClient retrofitClient = new RetrofitClient();
        retrofitClient.getApiService().getWeatherInfo("16.100601" , "108.2501946").enqueue(new Callback<WeatherInfoResponse>() {
            @Override
            public void onResponse(Call<WeatherInfoResponse> call, Response<WeatherInfoResponse> response) {
                Log.d("Check Data",response.message());
                WeatherInfoResponse data = response.body();

            }

            @Override
            public void onFailure(Call<WeatherInfoResponse> call, Throwable t) {
                Log.d("Check Data",t.getMessage());

            }
        });



    }


}
