package com.example.myapplication;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ProgressDialog customProgressDialog;
    private static final String TAG = "MainActivity";
    private retrofitURL retrofitURL;
    private Api api = retrofitURL.retrofit.create(Api.class);

    private int cnt = 1;

    private LinearLayout btn_search;
    private TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8;
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btn_back, btn_delete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //로딩창 객체 생성
        customProgressDialog = new ProgressDialog(this);
        ProgressDialog customProgressDIalog = new ProgressDialog(this);
        //로딩창을 투명하게
        customProgressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        customProgressDialog.setCancelable(false); // 로딩시 백그라운드 터치 막기

        init();
        onClick();
    }

    @Override
    public void onBackPressed() {
 //       super.onBackPressed();
    }

    public void init() {
        tv1 = findViewById(R.id.textView1);
        tv2 = findViewById(R.id.textView2);
        tv3 = findViewById(R.id.textView3);
        tv4 = findViewById(R.id.textView4);
        tv5 = findViewById(R.id.textView5);
        tv6 = findViewById(R.id.textView6);
        tv7 = findViewById(R.id.textView7);
        tv8 = findViewById(R.id.textView8);

        btn0 = findViewById(R.id.button0);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);

        btn_search = findViewById(R.id.btn_search);
        btn_back = findViewById(R.id.btn_back);
        btn_delete = findViewById(R.id.btn_delete);


    }

    public void onClick() {

        btn_search.setOnClickListener(v -> {

            if (cnt == 9) {
                String phoneNumber = "010" + tv1.getText() + tv2.getText() + tv3.getText() + tv4.getText() + tv5.getText() + tv6.getText() + tv7.getText() + tv8.getText();
                Log.d(TAG, "onClick phoneNumber: " + phoneNumber);
                // 로딩창 보여주기
                customProgressDialog.show();
                Call<CMRespDto<RespDto>> call = api.search(phoneNumber);
                call.enqueue(new Callback<CMRespDto<RespDto>>() {
                    @Override
                    public void onResponse(Call<CMRespDto<RespDto>> call, Response<CMRespDto<RespDto>> response) {
                        Log.d(TAG, "onResponse:  성공");
                        customProgressDialog.hide();
                        CMRespDto<RespDto> cmRespDto = response.body();

                        if (cmRespDto.getCode() == 1) {
                            Intent intent = new Intent(MainActivity.this, AddActivity.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            intent.putExtra("stamp", cmRespDto.getData().getStamp() + "");
                            intent.putExtra("afterStamp", cmRespDto.getData().getAfterStamp() + "");
                            intent.putExtra("afterCoupon", cmRespDto.getData().getAfterCoupon() + "");
                            startActivity(intent);
                            MainActivity.this.finish();
                        } else {
                            customProgressDialog.hide();
                        }

                    }

                    @Override
                    public void onFailure(Call<CMRespDto<RespDto>> call, Throwable t) {
                        Log.d(TAG, "onFailure: 실패" + call + t);
                        customProgressDialog.hide();
                    }
                });
            } else {
                Toast.makeText(getApplicationContext(), "휴대폰 번호를 전부 입력해주세요.", Toast.LENGTH_SHORT).show();
            }
        });


        btn_delete.setOnClickListener(v -> {
            cnt = 1;
            tv1.setText("");
            tv2.setText("");
            tv3.setText("");
            tv4.setText("");
            tv5.setText("");
            tv6.setText("");
            tv7.setText("");
            tv8.setText("");
        });


        btn_back.setOnClickListener(v -> {
            if (cnt > 1 && cnt < 10) {
                cnt--;
            }
            switch (cnt) {
                case 1:
                    tv1.setText("");
                    break;
                case 2:
                    tv2.setText("");
                    break;
                case 3:
                    tv3.setText("");
                    break;
                case 4:
                    tv4.setText("");
                    break;
                case 5:
                    tv5.setText("");
                    break;
                case 6:
                    tv6.setText("");
                    break;
                case 7:
                    tv7.setText("");
                    break;
                case 8:
                    tv8.setText("");
                    break;
            }
        });

        btn0.setOnClickListener(v -> {
            switch (cnt) {
                case 1:
                    tv1.setText(btn0.getText());
                    cnt++;
                    break;
                case 2:
                    tv2.setText(btn0.getText());
                    cnt++;
                    break;
                case 3:
                    tv3.setText(btn0.getText());
                    cnt++;
                    break;
                case 4:
                    tv4.setText(btn0.getText());
                    cnt++;
                    break;
                case 5:
                    tv5.setText(btn0.getText());
                    cnt++;
                    break;
                case 6:
                    tv6.setText(btn0.getText());
                    cnt++;
                    break;
                case 7:
                    tv7.setText(btn0.getText());
                    cnt++;
                    break;
                case 8:
                    tv8.setText(btn0.getText());
                    cnt++;
                    break;
            }
        });

        btn1.setOnClickListener(v -> {
            switch (cnt) {
                case 1:
                    tv1.setText(btn1.getText());
                    cnt++;
                    break;
                case 2:
                    tv2.setText(btn1.getText());
                    cnt++;
                    break;
                case 3:
                    tv3.setText(btn1.getText());
                    cnt++;
                    break;
                case 4:
                    tv4.setText(btn1.getText());
                    cnt++;
                    break;
                case 5:
                    tv5.setText(btn1.getText());
                    cnt++;
                    break;
                case 6:
                    tv6.setText(btn1.getText());
                    cnt++;
                    break;
                case 7:
                    tv7.setText(btn1.getText());
                    cnt++;
                    break;
                case 8:
                    tv8.setText(btn1.getText());
                    cnt++;
                    break;
            }
        });

        btn2.setOnClickListener(v -> {
            switch (cnt) {
                case 1:
                    tv1.setText(btn2.getText());
                    cnt++;
                    break;
                case 2:
                    tv2.setText(btn2.getText());
                    cnt++;
                    break;
                case 3:
                    tv3.setText(btn2.getText());
                    cnt++;
                    break;
                case 4:
                    tv4.setText(btn2.getText());
                    cnt++;
                    break;
                case 5:
                    tv5.setText(btn2.getText());
                    cnt++;
                    break;
                case 6:
                    tv6.setText(btn2.getText());
                    cnt++;
                    break;
                case 7:
                    tv7.setText(btn2.getText());
                    cnt++;
                    break;
                case 8:
                    tv8.setText(btn2.getText());
                    cnt++;
                    break;
            }
        });

        btn3.setOnClickListener(v -> {
            switch (cnt) {
                case 1:
                    tv1.setText(btn3.getText());
                    cnt++;
                    break;
                case 2:
                    tv2.setText(btn3.getText());
                    cnt++;
                    break;
                case 3:
                    tv3.setText(btn3.getText());
                    cnt++;
                    break;
                case 4:
                    tv4.setText(btn3.getText());
                    cnt++;
                    break;
                case 5:
                    tv5.setText(btn3.getText());
                    cnt++;
                    break;
                case 6:
                    tv6.setText(btn3.getText());
                    cnt++;
                    break;
                case 7:
                    tv7.setText(btn3.getText());
                    cnt++;
                    break;
                case 8:
                    tv8.setText(btn3.getText());
                    cnt++;
                    break;
            }
        });

        btn4.setOnClickListener(v -> {
            switch (cnt) {
                case 1:
                    tv1.setText(btn4.getText());
                    cnt++;
                    break;
                case 2:
                    tv2.setText(btn4.getText());
                    cnt++;
                    break;
                case 3:
                    tv3.setText(btn4.getText());
                    cnt++;
                    break;
                case 4:
                    tv4.setText(btn4.getText());
                    cnt++;
                    break;
                case 5:
                    tv5.setText(btn4.getText());
                    cnt++;
                    break;
                case 6:
                    tv6.setText(btn4.getText());
                    cnt++;
                    break;
                case 7:
                    tv7.setText(btn4.getText());
                    cnt++;
                    break;
                case 8:
                    tv8.setText(btn4.getText());
                    cnt++;
                    break;
            }
        });

        btn5.setOnClickListener(v -> {
            switch (cnt) {
                case 1:
                    tv1.setText(btn5.getText());
                    cnt++;
                    break;
                case 2:
                    tv2.setText(btn5.getText());
                    cnt++;
                    break;
                case 3:
                    tv3.setText(btn5.getText());
                    cnt++;
                    break;
                case 4:
                    tv4.setText(btn5.getText());
                    cnt++;
                    break;
                case 5:
                    tv5.setText(btn5.getText());
                    cnt++;
                    break;
                case 6:
                    tv6.setText(btn5.getText());
                    cnt++;
                    break;
                case 7:
                    tv7.setText(btn5.getText());
                    cnt++;
                    break;
                case 8:
                    tv8.setText(btn5.getText());
                    cnt++;
                    break;
            }
        });

        btn6.setOnClickListener(v -> {
            switch (cnt) {
                case 1:
                    tv1.setText(btn6.getText());
                    cnt++;
                    break;
                case 2:
                    tv2.setText(btn6.getText());
                    cnt++;
                    break;
                case 3:
                    tv3.setText(btn6.getText());
                    cnt++;
                    break;
                case 4:
                    tv4.setText(btn6.getText());
                    cnt++;
                    break;
                case 5:
                    tv5.setText(btn6.getText());
                    cnt++;
                    break;
                case 6:
                    tv6.setText(btn6.getText());
                    cnt++;
                    break;
                case 7:
                    tv7.setText(btn6.getText());
                    cnt++;
                    break;
                case 8:
                    tv8.setText(btn6.getText());
                    cnt++;
                    break;
            }
        });


        btn7.setOnClickListener(v -> {
            switch (cnt) {
                case 1:
                    tv1.setText(btn7.getText());
                    cnt++;
                    break;
                case 2:
                    tv2.setText(btn7.getText());
                    cnt++;
                    break;
                case 3:
                    tv3.setText(btn7.getText());
                    cnt++;
                    break;
                case 4:
                    tv4.setText(btn7.getText());
                    cnt++;
                    break;
                case 5:
                    tv5.setText(btn7.getText());
                    cnt++;
                    break;
                case 6:
                    tv6.setText(btn7.getText());
                    cnt++;
                    break;
                case 7:
                    tv7.setText(btn7.getText());
                    cnt++;
                    break;
                case 8:
                    tv8.setText(btn7.getText());
                    cnt++;
                    break;
            }
        });

        btn8.setOnClickListener(v -> {
            switch (cnt) {
                case 1:
                    tv1.setText(btn8.getText());
                    cnt++;
                    break;
                case 2:
                    tv2.setText(btn8.getText());
                    cnt++;
                    break;
                case 3:
                    tv3.setText(btn8.getText());
                    cnt++;
                    break;
                case 4:
                    tv4.setText(btn8.getText());
                    cnt++;
                    break;
                case 5:
                    tv5.setText(btn8.getText());
                    cnt++;
                    break;
                case 6:
                    tv6.setText(btn8.getText());
                    cnt++;
                    break;
                case 7:
                    tv7.setText(btn8.getText());
                    cnt++;
                    break;
                case 8:
                    tv8.setText(btn8.getText());
                    cnt++;
                    break;
            }
        });

        btn9.setOnClickListener(v -> {
            switch (cnt) {
                case 1:
                    tv1.setText(btn9.getText());
                    cnt++;
                    break;
                case 2:
                    tv2.setText(btn9.getText());
                    cnt++;
                    break;
                case 3:
                    tv3.setText(btn9.getText());
                    cnt++;
                    break;
                case 4:
                    tv4.setText(btn9.getText());
                    cnt++;
                    break;
                case 5:
                    tv5.setText(btn9.getText());
                    cnt++;
                    break;
                case 6:
                    tv6.setText(btn9.getText());
                    cnt++;
                    break;
                case 7:
                    tv7.setText(btn9.getText());
                    cnt++;
                    break;
                case 8:
                    tv8.setText(btn9.getText());
                    cnt++;
                    break;
            }
        });
    }
}