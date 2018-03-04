package com.example.administrator.giaiphuongtrinhbacnhat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView txtKetQua;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        txtKetQua = (TextView) findViewById(R.id.txtKetQua);
        btnBack = (Button) findViewById(R.id.btnBack);

        Intent callerIntent =  getIntent();

        Bundle bundle = callerIntent.getBundleExtra("MyPackage");

        int a = bundle.getInt("soA");
        int b = bundle.getInt("soB");

        giaiPTBN(a,b);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    public void giaiPTBN(int a, int b) {
        if(a==0){
            if (b==0){
                txtKetQua.setText("Phương trình vô số nghiệm");
                return;
            }
            else {
                txtKetQua.setText("Phương trình vô nghiệm");
            }

        } else txtKetQua.setText(String.valueOf((float)-b/a));
    }
}