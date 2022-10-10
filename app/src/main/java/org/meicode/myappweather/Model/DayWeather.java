package org.meicode.myappweather.Model;

import org.meicode.myappweather.R;

public class DayWeather {
    String day;
    int image;
    String temp1;
    String temp2;

    public DayWeather(String day, int image, String temp1, String temp2) {
        this.day = day;
        this.image = image;
        this.temp1 = temp1;
        this.temp2 = temp2;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getImage() {
        return image;
    }
    public int getTypeImage(){
        if (image == 1){
            return R.drawable.sun;
        }
        return R.drawable.moon;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTemp1() {
        return temp1;
    }

    public void setTemp1(String temp1) {
        this.temp1 = temp1;
    }

    public String getTemp2() {
        return temp2;
    }

    public void setTemp2(String temp2) {
        this.temp2 = temp2;
    }
}
