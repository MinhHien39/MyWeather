package org.meicode.myappweather.Adapter;

import android.content.ClipData;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.meicode.myappweather.ItemClickListener;
import org.meicode.myappweather.Model.hourWeather;
import org.meicode.myappweather.R;

import java.util.List;

public class hourWeatherAdapter extends RecyclerView.Adapter<hourWeatherAdapter.ViewHolder> {
    List<hourWeather> list;
    ItemClickListener itemClickListener;

    public ItemClickListener getItemClickListener() {
        return itemClickListener;
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public hourWeatherAdapter(List<hourWeather> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public hourWeatherAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.hour_day_item , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull hourWeatherAdapter.ViewHolder holder, int position) {
        holder.txt_hour.setText(list.get(position).getHour());
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.txt_temp.setText(list.get(position).getTemperature());
        holder.txt_hour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = holder.getAdapterPosition();

                itemClickListener.onClick(holder.imageView , position , list.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txt_hour;
        ImageView imageView;
        TextView txt_temp;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_hour = itemView.findViewById(R.id.txt_hour);
            imageView = itemView.findViewById(R.id.img_temp);
            txt_temp = itemView.findViewById(R.id.txt_temp);
        }
    }
}
