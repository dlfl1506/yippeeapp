package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {

    private static final String TAG = "SearchActivity";
    private ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10;
    private TextView couponQty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        Intent intent = getIntent();
        String afterStamp = intent.getStringExtra("afterStamp");
        String afterCoupon = intent.getStringExtra("afterCoupon");
        init();
        Log.d(TAG, "onCreate: " + afterStamp);
        Log.d(TAG, "onCreate: " + afterCoupon);
        couponQty.setText(afterCoupon);
        switch (afterStamp) {
            case "0":
                img1.setBackgroundResource(R.drawable.logo3);
                img2.setBackgroundResource(R.drawable.logo3);
                img3.setBackgroundResource(R.drawable.logo3);
                img4.setBackgroundResource(R.drawable.logo3);
                img5.setBackgroundResource(R.drawable.logo3);
                img6.setBackgroundResource(R.drawable.logo3);
                img7.setBackgroundResource(R.drawable.logo3);
                img8.setBackgroundResource(R.drawable.logo3);
                img9.setBackgroundResource(R.drawable.logo3);
                img10.setBackgroundResource(R.drawable.logo3);
                break;
            case "1":
                img1.setBackgroundResource(R.drawable.logo2);
                img2.setBackgroundResource(R.drawable.logo3);
                img3.setBackgroundResource(R.drawable.logo3);
                img4.setBackgroundResource(R.drawable.logo3);
                img5.setBackgroundResource(R.drawable.logo3);
                img6.setBackgroundResource(R.drawable.logo3);
                img7.setBackgroundResource(R.drawable.logo3);
                img8.setBackgroundResource(R.drawable.logo3);
                img9.setBackgroundResource(R.drawable.logo3);
                img10.setBackgroundResource(R.drawable.logo3);
                break;
            case "2":
                img1.setBackgroundResource(R.drawable.logo2);
                img2.setBackgroundResource(R.drawable.logo2);
                img3.setBackgroundResource(R.drawable.logo3);
                img4.setBackgroundResource(R.drawable.logo3);
                img5.setBackgroundResource(R.drawable.logo3);
                img6.setBackgroundResource(R.drawable.logo3);
                img7.setBackgroundResource(R.drawable.logo3);
                img8.setBackgroundResource(R.drawable.logo3);
                img9.setBackgroundResource(R.drawable.logo3);
                img10.setBackgroundResource(R.drawable.logo3);
                break;
            case "3":
                img1.setBackgroundResource(R.drawable.logo2);
                img2.setBackgroundResource(R.drawable.logo2);
                img3.setBackgroundResource(R.drawable.logo2);
                img4.setBackgroundResource(R.drawable.logo3);
                img5.setBackgroundResource(R.drawable.logo3);
                img6.setBackgroundResource(R.drawable.logo3);
                img7.setBackgroundResource(R.drawable.logo3);
                img8.setBackgroundResource(R.drawable.logo3);
                img9.setBackgroundResource(R.drawable.logo3);
                img10.setBackgroundResource(R.drawable.logo3);
                break;
            case "4":
                img1.setBackgroundResource(R.drawable.logo2);
                img2.setBackgroundResource(R.drawable.logo2);
                img3.setBackgroundResource(R.drawable.logo2);
                img4.setBackgroundResource(R.drawable.logo2);
                img5.setBackgroundResource(R.drawable.logo3);
                img6.setBackgroundResource(R.drawable.logo3);
                img7.setBackgroundResource(R.drawable.logo3);
                img8.setBackgroundResource(R.drawable.logo3);
                img9.setBackgroundResource(R.drawable.logo3);
                img10.setBackgroundResource(R.drawable.logo3);
                break;
            case "5":
                img1.setBackgroundResource(R.drawable.logo2);
                img2.setBackgroundResource(R.drawable.logo2);
                img3.setBackgroundResource(R.drawable.logo2);
                img4.setBackgroundResource(R.drawable.logo2);
                img5.setBackgroundResource(R.drawable.logo2);
                img6.setBackgroundResource(R.drawable.logo3);
                img7.setBackgroundResource(R.drawable.logo3);
                img8.setBackgroundResource(R.drawable.logo3);
                img9.setBackgroundResource(R.drawable.logo3);
                img10.setBackgroundResource(R.drawable.logo3);
                break;
            case "6":
                img1.setBackgroundResource(R.drawable.logo2);
                img2.setBackgroundResource(R.drawable.logo2);
                img3.setBackgroundResource(R.drawable.logo2);
                img4.setBackgroundResource(R.drawable.logo2);
                img5.setBackgroundResource(R.drawable.logo2);
                img6.setBackgroundResource(R.drawable.logo2);
                img7.setBackgroundResource(R.drawable.logo3);
                img8.setBackgroundResource(R.drawable.logo3);
                img9.setBackgroundResource(R.drawable.logo3);
                img10.setBackgroundResource(R.drawable.logo3);
                break;
            case "7":
                img1.setBackgroundResource(R.drawable.logo2);
                img2.setBackgroundResource(R.drawable.logo2);
                img3.setBackgroundResource(R.drawable.logo2);
                img4.setBackgroundResource(R.drawable.logo2);
                img5.setBackgroundResource(R.drawable.logo2);
                img6.setBackgroundResource(R.drawable.logo2);
                img7.setBackgroundResource(R.drawable.logo2);
                img8.setBackgroundResource(R.drawable.logo3);
                img9.setBackgroundResource(R.drawable.logo3);
                img10.setBackgroundResource(R.drawable.logo3);
                break;
            case "8":
                img1.setBackgroundResource(R.drawable.logo2);
                img2.setBackgroundResource(R.drawable.logo2);
                img3.setBackgroundResource(R.drawable.logo2);
                img4.setBackgroundResource(R.drawable.logo2);
                img5.setBackgroundResource(R.drawable.logo2);
                img6.setBackgroundResource(R.drawable.logo2);
                img7.setBackgroundResource(R.drawable.logo2);
                img8.setBackgroundResource(R.drawable.logo2);
                img9.setBackgroundResource(R.drawable.logo3);
                img10.setBackgroundResource(R.drawable.logo3);
                break;
            case "9":
                img1.setBackgroundResource(R.drawable.logo2);
                img2.setBackgroundResource(R.drawable.logo2);
                img3.setBackgroundResource(R.drawable.logo2);
                img4.setBackgroundResource(R.drawable.logo2);
                img5.setBackgroundResource(R.drawable.logo2);
                img6.setBackgroundResource(R.drawable.logo2);
                img7.setBackgroundResource(R.drawable.logo2);
                img8.setBackgroundResource(R.drawable.logo2);
                img9.setBackgroundResource(R.drawable.logo2);
                img10.setBackgroundResource(R.drawable.logo3);
                break;

        }


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10000);
                    Intent intent = new Intent(SearchActivity.this, MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                    SearchActivity.this.finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }


    public void init() {
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img7 = findViewById(R.id.img7);
        img8 = findViewById(R.id.img8);
        img9 = findViewById(R.id.img9);
        img10 = findViewById(R.id.img10);

        couponQty = findViewById(R.id.couponQty);

    }
}