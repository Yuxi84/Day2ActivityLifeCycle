package com.example.yzhan14.day2activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.hello_view);

        //Anonymous inner class
        tv.setOnClickListener(new View.OnClickListener(){

                                  @Override
                                  public void onClick(View view) {
                                      Toast.makeText(MainActivity.this,"Burnt",Toast.LENGTH_SHORT).show();
                                  }
                              }
        );
    }
}
