package com.tarikul.myapplication4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PhotoActivity extends AppCompatActivity {
   Button btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
        btn1 = (Button)findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent tp = new Intent(PhotoActivity.this, SmashActivity.class);
                startActivity(tp);
            }
        });
        btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent tp = new Intent(PhotoActivity.this, C2Activity.class);
                startActivity(tp);
            }
        });
        btn3 = (Button)findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent tp = new Intent(PhotoActivity.this, UtreeActivity.class);
                startActivity(tp);
            }
        });
        btn4 = (Button)findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent tp = new Intent(PhotoActivity.this, C4Activity.class);
                startActivity(tp);
            }
        });

    }
}
