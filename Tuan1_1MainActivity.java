package com.example.tuan1application.tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.tuan1application.R;

public class Tuan1_1MainActivity extends AppCompatActivity {

    EditText txt1,txt2;
    Button btn1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan11_main);
        txt1=findViewById(R.id.demo11txt1);
        txt2=findViewById(R.id.demo11txt2);
        btn1=findViewById(R.id.demo11btn1);
        tv1=findViewById(R.id.demo11tv1);

        btn1.setOnClickListener(v->{
            tinhTong();
        });
    }

    private void tinhTong() {
        String str1=txt1.getText().toString();
        float so1=Float.parseFloat(str1);

        String str2=txt2.getText().toString();
        float so2=Float.parseFloat(str2);

        float tong=so1+so2;

        tv1.setText(String.valueOf(tong));
    }
}
