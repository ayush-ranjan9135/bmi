package com.example.bmi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText txtname ,weigth ,hightinft ,hightinin ;
        Button btncal;
        TextView result;
        LinearLayout llmain;

        txtname=findViewById(R.id.txtname);
        weigth=findViewById(R.id.weigth);
        hightinft=findViewById(R.id.hightinft);
        hightinin=findViewById(R.id.hightinin);
        btncal=findViewById(R.id.btncal);
        result=findViewById(R.id.result);
        llmain=findViewById(R.id.llmain);

        btncal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtname.getText().toString();
                int wt=Integer.parseInt(weigth.getText().toString());
                int ft=Integer.parseInt(hightinft.getText().toString());
                int in=Integer.parseInt(hightinin.getText().toString());

                int totalin=ft*12+in;
                double totalcm=totalin*2.53;
                double totalm=totalcm/100;
                double bmi=wt/(totalm*totalm);

                if(bmi>25){
                    result.setText("U r overweight!");
                    llmain.setBackgroundResource(R.drawable.motu);
                }
                else if(bmi<18){
                    result.setText("u r underweight");
                    llmain.setBackgroundResource(R.drawable.skiney);
                }
                else {
                    result.setText("u r healdhy");
                    llmain.setBackgroundResource(R.drawable.heldhy);
                }

            }
        });



        }
    }
