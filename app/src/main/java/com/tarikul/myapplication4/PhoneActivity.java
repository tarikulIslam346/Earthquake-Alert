package com.tarikul.myapplication4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class PhoneActivity extends AppCompatActivity {
     ImageButton btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone);
        btn6 = (ImageButton) findViewById(R.id.button);
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent phoneIntent = new Intent(Intent.ACTION_CALL);
                phoneIntent.setData(Uri.parse("tel:01774909858"));
                //Intent tp = new Intent(MainActivity.this,PhoneActivity.class);
                //startActivity(phoneIntent);
                try{
                    startActivity(phoneIntent);
                }

                catch (android.content.ActivityNotFoundException ex){
                    Toast.makeText(getApplicationContext(),"yourActivity is not founded",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
