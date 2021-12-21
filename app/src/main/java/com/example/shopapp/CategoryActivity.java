package com.example.shopapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {

    List<Item> items = new LinkedList<Item>();
    ListView goodsList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        setInitialData();

        goodsList =findViewById(R.id.goods_list);

        ItemAdapter adp = new ItemAdapter(this, R.layout.item_list, items);

        goodsList.setAdapter(adp);

        goodsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(CategoryActivity.this, GoodsActivity.class);
                Item selectedItem = items.get(position);

                intent.putExtra("name", selectedItem.getName());
                intent.putExtra("price", selectedItem.getPrice());
                intent.putExtra("img", selectedItem.getImg());

                startActivity(intent);
            }
        });


    }

    private void setInitialData() {
        items.add(new Item("Apples", 65, R.drawable.apples));
        items.add(new Item("Bananas", 55, R.drawable.bananas));

    }
}