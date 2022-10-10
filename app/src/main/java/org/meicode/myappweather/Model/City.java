package org.meicode.myappweather.Model;

import com.google.gson.annotations.SerializedName;

import org.meicode.myappweather.R;

public class City {
    String lat;
    String lon;

    String temperature;

    String city;

    String country;
    String humidity;
    String wind;
    int image;

    public City(String temperature, String city, String country, String humidity, String wind, int image) {
        this.temperature = temperature;
        this.city = city;
        this.country = country;
        this.humidity = humidity;
        this.wind = wind;
        this.image = image;
    }


    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getImage() {
        return image;
    }
    public int getTypeImage(){
        if(image == 1 ){
            return R.drawable.moon;
        }
        return R.drawable.sun;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }
}
