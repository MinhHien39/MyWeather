package org.meicode.myappweather.Model;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class CityList {
    @SerializedName("temp")
    public String temp;
    @SerializedName("city")
    public String city;
    @SerializedName("country")
    public String country;
    @SerializedName("humidity")
    public String humidity;
    @SerializedName("windspeed")
    public String speed;
    @SerializedName("weather")
    public List<Datum> datumList = new ArrayList<>();

    public class Datum{
        @SerializedName("icon")
        public Integer icon;
    }
}

