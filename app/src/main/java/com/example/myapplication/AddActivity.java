package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AddActivity extends AppCompatActivity {

    private static final String TAG = "AddActivity";
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        Intent intent = getIntent();
        String stamp = intent.getStringExtra("stamp");
        String afterStamp = intent.getStringExtra("afterStamp");
        String afterCoupon = intent.getStringExtra("afterCoupon");


        tv1 = findViewById(R.id.stampQty);
        tv1.setText(stamp);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                    Intent intent = new Intent(AddActivity.this, SearchActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("afterStamp",afterStamp);
                    intent.putExtra("afterCoupon",afterCoupon);
                    startActivity(intent);
                    AddActivity.this.finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}