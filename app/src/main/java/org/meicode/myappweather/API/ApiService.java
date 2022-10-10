package org.meicode.myappweather.API;

import org.meicode.myappweather.Model.City;
import org.meicode.myappweather.Model.CityList;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {

    @GET("weather?&appid=8466f9d8b1235ae1de0d895b739c6772")
    Call<WeatherInfoResponse> getWeatherInfo(@Query("lat") String lat , @Query("lon") String lon );



}
