package org.meicode.myappweather.Adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import org.meicode.myappweather.ItemClickListener;
import org.meicode.myappweather.Model.DayWeather;
import org.meicode.myappweather.R;

import java.util.List;

public class dayWeatherAdapter extends RecyclerView.Adapter<dayWeatherAdapter.ViewHolder> {
    List<DayWeather> list;
    ItemClickListener itemClickListener;

    public List<DayWeather> getList() {
        return list;
    }

    public void setList(List<DayWeather> list) {
        this.list = list;
    }

    public ItemClickListener getItemClickListener() {
        return itemClickListener;
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }

    public dayWeatherAdapter(List<DayWeather> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public dayWeatherAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.day_item , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull dayWeatherAdapter.ViewHolder holder, int position) {
        holder.txtDay.setText(list.get(position).getDay());
        holder.imageView.setImageResource(list.get(position).getTypeImage());
        holder.txt_dayTemp1.setText(list.get(position).getTemp1());
        holder.txt_dayTemp2.setText(list.get(position).getTemp2());
        holder.txtDay.setOnClickListener(new View.OnClickListener() {
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
        TextView txtDay;
        ImageView imageView;
        ImageView imageView2;
        TextView txt_dayTemp1;
        TextView txt_dayTemp2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtDay = itemView.findViewById(R.id.txt_day);
            imageView = itemView.findViewById(R.id.img_day);
            txt_dayTemp1 = itemView.findViewById(R.id.txt_dayTemp1);
            txt_dayTemp2 = itemView.findViewById(R.id.txt_dayTemp2);
            imageView2 = itemView.findViewById(R.id.img_title);

        }
    }
}
