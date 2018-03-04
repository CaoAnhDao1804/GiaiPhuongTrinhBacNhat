package com.example.administrator.giaiphuongtrinhbacnhat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnKetQua;
    EditText txta,txtb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txta = (EditText)findViewById(R.id.editSoA);
        txtb = (EditText)findViewById(R.id.editSoB);

        btnKetQua = (Button) findViewById(R.id.btnKetQua);

        btnKetQua.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent myIntent = new Intent(MainActivity.this, ResultActivity.class);
                int a = Integer.parseInt(txta.getText().toString());
                int b = Integer.parseInt(txta.getText().toString());

                Bundle bundle =  new Bundle();
                bundle.putInt("soA",a);
                bundle.putInt("soB",b);

                myIntent.putExtra("MyPackage", bundle);

                startActivity(myIntent);

            }

        });



    }
}

