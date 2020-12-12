package com.example.test3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;

import GridItem.ProductAdapter;
import GridItem.ProductModel;


public class FoodFragment extends Fragment {
    GridView gridView1;
    Context context;
    RelativeLayout gridviewdata;
    ArrayList<ProductModel> arr_bean;
    ProductAdapter adapter;
    ProductModel productModel;
    View v;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_food, container, false);
        gridView1 = v.findViewById(R.id.gridview1);
        arr_bean = new ArrayList<>();

        drinkData();
        context = this.getActivity();
        adapter = new ProductAdapter(context, arr_bean);
        gridView1.setAdapter(adapter);

        gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(context,arr_bean.get(position).getNamedh(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context.getApplicationContext(),GridItemActivity.class);
                intent.putExtra("name",arr_bean.get(position).getNamedh());
                intent.putExtra("image",arr_bean.get(position).getImages());
                intent.putExtra("gia",arr_bean.get(position).getGiadh());
                startActivity(intent);
            }
        });

        return v;

    }

    private void drinkData() {
        productModel = new ProductModel();
        productModel.setId(1);
        productModel.setNamedh("Macca phủ socola");
        productModel.setImages(R.drawable.h32);
        productModel.setGiadh("25.000 VND");
        arr_bean.add(productModel);

        productModel = new ProductModel();
        productModel.setId(2);
        productModel.setNamedh("Mít xấy");
        productModel.setImages(R.drawable.h33);
        productModel.setGiadh("25.000 VND");
        arr_bean.add(productModel);

        productModel = new ProductModel();
        productModel.setId(3);
        productModel.setNamedh("Cơm cháy chà bông");
        productModel.setImages(R.drawable.h34);
        productModel.setGiadh("25.000 VND");
        arr_bean.add(productModel);


    }

}