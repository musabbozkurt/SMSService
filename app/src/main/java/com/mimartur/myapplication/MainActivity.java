package com.mimartur.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView inside;
    String message = "No SMS Now";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inside = (TextView) findViewById(R.id.textView);

        if (getIntent().getExtras() !=null){
            message = getIntent().getExtras().getString("message");

            if (message == null){

                message = "No New SMS";
            }
        }

        inside.setText("Bildirim: "+message);


    }
}
