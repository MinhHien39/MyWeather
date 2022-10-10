package org.meicode.myappweather.Model;

import org.meicode.myappweather.R;

public class hourWeather {
    String hour;
    int typeImage;
    String temperature;

    public hourWeather(String hour, int typeImage, String temperature) {
        this.hour = hour;
        this.typeImage = typeImage;
        this.temperature = temperature;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public int getTypeImage() {
        return typeImage;
    }
    public int getImage(){
        if(typeImage == 1){
            return R.drawable.sun;
        }
        return R.drawable.moon;
    }

    public void setTypeImage(int typeImage) {
        this.typeImage = typeImage;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
}
