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


public class DrinksFragment extends Fragment {
    GridView gridView;
    Context context;
    RelativeLayout gridviewdata;
    ArrayList<ProductModel> arr_bean;
    ProductAdapter adapter;
    ProductModel productModel;
    View v;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_drinks, container, false);
        gridView = v.findViewById(R.id.gridview);
        arr_bean = new ArrayList<>();

        drinkData();
        context = this.getActivity();
        adapter = new ProductAdapter(context, arr_bean);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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
        productModel.setNamedh("Cafe latte");
        productModel.setImages(R.drawable.h30);
        productModel.setGiadh("25.000 VND");
        arr_bean.add(productModel);

        productModel = new ProductModel();
        productModel.setId(2);
        productModel.setNamedh("Cafe sữa đá");
        productModel.setImages(R.drawable.h35);
        productModel.setGiadh("27.000 VND");
        arr_bean.add(productModel);

        productModel = new ProductModel();
        productModel.setId(3);
        productModel.setNamedh("Cafe sài gòn");
        productModel.setImages(R.drawable.h36);
        productModel.setGiadh("23.000 VND");
        arr_bean.add(productModel);

        productModel = new ProductModel();
        productModel.setId(4);
        productModel.setNamedh("Cafe latte");
        productModel.setImages(R.drawable.h37);
        productModel.setGiadh("24.000 VND");
        arr_bean.add(productModel);

        productModel = new ProductModel();
        productModel.setId(5);
        productModel.setNamedh("Cafe latte");
        productModel.setImages(R.drawable.h37);
        productModel.setGiadh("40.000 VND");
        arr_bean.add(productModel);

        productModel = new ProductModel();
        productModel.setId(6);
        productModel.setNamedh("Capuchino");
        productModel.setImages(R.drawable.h38);
        productModel.setGiadh("45.000 VND");
        arr_bean.add(productModel);

        productModel = new ProductModel();
        productModel.setId(7);
        productModel.setNamedh("Cafe ssữa đá");
        productModel.setImages(R.drawable.h39);
        productModel.setGiadh("25.000 VND");
        arr_bean.add(productModel);

        productModel = new ProductModel();
        productModel.setId(8);
        productModel.setNamedh("Cacao nóng");
        productModel.setImages(R.drawable.h40);
        productModel.setGiadh("20.000 VND");
        arr_bean.add(productModel);

        productModel = new ProductModel();
        productModel.setId(9);
        productModel.setNamedh("Cafe latte");
        productModel.setImages(R.drawable.h41);
        productModel.setGiadh("21.000 VND");
        arr_bean.add(productModel);

        productModel = new ProductModel();
        productModel.setId(10);
        productModel.setNamedh("Cafe latte");
        productModel.setImages(R.drawable.h42);
        productModel.setGiadh("25.000 VND");
        arr_bean.add(productModel);

        productModel = new ProductModel();
        productModel.setId(11);
        productModel.setNamedh("Cafe latte");
        productModel.setImages(R.drawable.h40);
        productModel.setGiadh("25.000 VND");
        arr_bean.add(productModel);

        productModel = new ProductModel();
        productModel.setId(12);
        productModel.setNamedh("Cafe latte");
        productModel.setImages(R.drawable.h41);
        productModel.setGiadh("25.000 VND");
        arr_bean.add(productModel);

        productModel = new ProductModel();
        productModel.setId(13);
        productModel.setNamedh("Cafe latte");
        productModel.setImages(R.drawable.h42);
        productModel.setGiadh("25.000 VND");
        arr_bean.add(productModel);
    }
}