package com.example.test3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class cuahnag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuahnag);
        Button bt,bt1;
        bt = (Button) findViewById(R.id.dy);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(cuahnag.this, MapsActivity.class);
                startActivity(intent);
            }
        });
        bt1 = (Button) findViewById(R.id.tc);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new  Intent(cuahnag.this, dathang.class);
                startActivity(intent);
            }
        });
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.cuahang);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.dathang:
                        startActivity(new Intent(getApplicationContext(), dathang.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.tintuc:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.taikhoan:
                        startActivity(new Intent(getApplicationContext(), taikhoan.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.cuahang:
                        return true;
                }
                return false;
            }
        });
    }

}