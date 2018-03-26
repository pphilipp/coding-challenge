package com.badi.presentation.search;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.badi.R;
import com.badi.data.entity.SimpleCity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CityHomeAdapter extends RecyclerView.Adapter<CityHomeAdapter.CityViewHolder>{
    public static final int TYPE_ITEM_SMALL = 0;
    public static final int TYPE_ITEM_LARGE = 1;

    private List<SimpleCity> cities;
    private int currentItemType;
    private OnCityClickListener listener;

    public CityHomeAdapter(int itemType) {
        this.cities = new ArrayList<>();
        this.currentItemType = itemType;
    }

    public void setOnEventClickListener(CityHomeAdapter.OnCityClickListener listener) {
        this.listener = listener;
    }

    @Override
    public CityViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;

        switch (currentItemType) {
            default:
            case TYPE_ITEM_SMALL:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_city, parent, false);
                break;
            case TYPE_ITEM_LARGE:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_city_large, parent, false);
        }

        return new CityViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CityViewHolder holder, int position) {
        SimpleCity city = cities.get(position);
        CityViewHolder viewHolder = holder;
        viewHolder.city = city;

        holder.show(position);
    }

    @Override
    public int getItemCount() {
        return cities.size();
    }

    public void setAmenities(List<SimpleCity> cities) {
        this.cities = cities;
    }

    public class CityViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        View root;
        SimpleCity city;

        @BindView(R.id.image_city) ImageView cityImage;
        @BindView(R.id.text_city_name) TextView cityNameText;

        CityViewHolder(View root) {
            super(root);
            ButterKnife.bind(this, root);

            this.root = root;
            this.root.setOnClickListener(this);
        }

        public void show(int position) {
            cityImage.setImageDrawable(cities.get(position).getImageSmall());
            cityNameText.setText(cities.get(position).getAddress());
        }

        @Override
        public void onClick(View v) {
            if (listener != null)
                listener.onCityClick(city);
        }
    }

    interface OnCityClickListener{
        void onCityClick(SimpleCity city);
    }
}
