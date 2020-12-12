package com.example.test3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import Listview.ListViewBaseAdapter;
import Listview.ListViewBean;

public class taikhoan extends AppCompatActivity {

    ListView lv;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taikhoan);



        //Listview
        lv = (ListView) findViewById(R.id.list);
        arr_bean=new ArrayList<ListViewBean>();
        arr_bean.add(new ListViewBean(R.drawable.star, "The Coffee House Rewards"));
        arr_bean.add(new ListViewBean(R.drawable.account, "Thông tin tài khoản"));
        arr_bean.add(new ListViewBean(R.drawable.music,"Nhạc đang phát"));
        arr_bean.add(new ListViewBean(R.drawable.history, "Lịch sử"));
        arr_bean.add(new ListViewBean(R.drawable.help, "Giúp đỡ"));
        arr_bean.add(new ListViewBean(R.drawable.setting, "Cài đặt"));
        adapter=new ListViewBaseAdapter(arr_bean,this);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){
                    Intent intent = new Intent(taikhoan.this,layout_1.class);
                    startActivity(intent);
                }
                if(position == 1){
                    Intent intent = new Intent(taikhoan.this,layout_2.class);
                    startActivity(intent);
                }
                if(position == 2){
                    Intent intent = new Intent(taikhoan.this,layout_3.class);
                    startActivity(intent);
                }
                if(position == 3){
                    Intent intent = new Intent(taikhoan.this,layout_4.class);
                    startActivity(intent);
                }
                if(position == 4){
                    Intent intent = new Intent(taikhoan.this,layout_5.class);
                    startActivity(intent);
                }
                if(position == 5){
                    Intent intent = new Intent(taikhoan.this,layout_6.class);
                    startActivity(intent);
                }



            }
        });



        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.taikhoan);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.dathang:
                        startActivity(new Intent(getApplicationContext(), dathang.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.cuahang:
                        startActivity(new Intent(getApplicationContext(), cuahnag.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.tintuc:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.taikhoan:
                        return true;
                }
                return false;
            }
        });
    }
}