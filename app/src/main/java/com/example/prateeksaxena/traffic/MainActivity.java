package com.example.prateeksaxena.traffic;

import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button br,by,bg;
TextView tv;
int k;
CountDownTimer ct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        br=findViewById(R.id.br);
        by=findViewById(R.id.by);
        bg=findViewById(R.id.bg);
        tv=findViewById(R.id.tv);

         ct=new CountDownTimer(60000,1000) {
            @Override
            public void onTick(long l) {
                k++;
                tv.setText(""+k);
                if(k<=20)
                {   by.setBackgroundColor(Color.WHITE);
                    br.setBackgroundColor(Color.RED);
                    bg.setBackgroundColor(Color.WHITE);
                }
                else if(k<=40 && k>20)
                {bg.setBackgroundColor(Color.WHITE);
                    by.setBackgroundColor(Color.YELLOW);
                    br.setBackgroundColor(Color.WHITE);
                }
                else if(k>40 && k<60)
                {
                    bg.setBackgroundColor(Color.GREEN);
                    br.setBackgroundColor(Color.WHITE);
                    by.setBackgroundColor(Color.WHITE);
                }

            }

            @Override
            public void onFinish() {
                k=0;
                ct.start();
            }

        }.start();
    }
}
