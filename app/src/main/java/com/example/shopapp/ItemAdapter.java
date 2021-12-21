package com.example.shopapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ItemAdapter extends ArrayAdapter<Item> {
    private LayoutInflater inflater;
    private int layout;
    private List<Item> items;

    public ItemAdapter(Context context, int resource, List<Item> items){
        super(context, resource, items);
        this.items = items;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }
    public View getView(int position, View convView, ViewGroup parent){
        View view = inflater.inflate(this.layout, parent, false);

        ImageView imgView = view.findViewById(R.id.img);
        TextView nameView = view.findViewById(R.id.name);
        TextView priceView = view.findViewById(R.id.price);

        Item item = items.get(position);

        imgView.setImageResource(item.getImg());
        nameView.setText(item.getName());
        priceView.setText(String.valueOf(item.getPrice() + "Руб."));

        return view;
    }
}
