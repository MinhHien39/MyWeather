package org.meicode.myappweather.API;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeatherInfoResponse {
    @SerializedName("main")
    public ModelMain main;


    public class ModelMain{
        @SerializedName("temp")
        public double temp;
    }
}
