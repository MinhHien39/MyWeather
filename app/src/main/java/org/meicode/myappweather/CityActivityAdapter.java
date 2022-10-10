package org.meicode.myappweather;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import androidx.recyclerview.widget.RecyclerView;

import org.meicode.myappweather.Model.City;

import java.util.List;

public class CityActivityAdapter extends RecyclerView.Adapter<CityActivityAdapter.ViewHolder> {

    List<City> list;





    public CityActivityAdapter(List<City> list) {
        this.list = list;
    }

    ItemClickListener itemClickListener;

    public ItemClickListener getItemClickListener() {
        return itemClickListener;
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }



    @NonNull
    @Override
    public CityActivityAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.city_item , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull CityActivityAdapter.ViewHolder holder, int position) {
        holder.txt_tempCity.setText(list.get(position).getTemperature());
        holder.txt_nameCity.setText(list.get(position).getCity());
        holder.txt_nameCountry.setText(list.get(position).getCountry());
        holder.txt_waterCity.setText(list.get(position).getHumidity());
        holder.txt_windCity.setText(list.get(position).getWind());
        holder.img_city.setImageResource(list.get(position).getTypeImage());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = holder.getAdapterPosition();
                itemClickListener.onClick(holder.txt_tempCity , position , list.get(position));
            }
        });
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt_tempCity;
        TextView txt_nameCity;
        TextView txt_nameCountry;
        TextView txt_waterCity;
        TextView txt_windCity;
        ImageView img_city;
        RelativeLayout layout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_tempCity = itemView.findViewById(R.id.txt_tempCity);
            txt_nameCity = itemView.findViewById(R.id.txt_nameCity);
            txt_nameCountry= itemView.findViewById(R.id.txt_nameCountry);
            txt_waterCity = itemView.findViewById(R.id.txt_humidityCity);
            txt_windCity = itemView.findViewById(R.id.txt_windCity);
            img_city = itemView.findViewById(R.id.img_city);
            layout = itemView.findViewById(R.id.parent);

        }
    }
}
