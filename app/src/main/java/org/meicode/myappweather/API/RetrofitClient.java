package org.meicode.myappweather.API;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static ApiService apiService;
    private static Retrofit retrofit = null;
    public RetrofitClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);


        OkHttpClient client = new OkHttpClient.Builder().
                addInterceptor(interceptor).
                connectTimeout(60, TimeUnit.SECONDS).
                readTimeout(60 , TimeUnit.SECONDS).
                writeTimeout(60,TimeUnit.SECONDS)
                .build();



        retrofit = new Retrofit.Builder().baseUrl("https://api.openweathermap.org/data/3.0/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
    }
    public ApiService getApiService(){
        if(apiService == null){
            apiService = retrofit.create(ApiService.class);
            return apiService;
        }
        return apiService;
    }
}
