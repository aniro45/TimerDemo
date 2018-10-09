package com.example.admin.timerdemo;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CountDownTimer start = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.i("Its Start", "Its Counting sec.");
                Toast.makeText(MainActivity.this, "Running per sec.", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFinish() {


                Toast.makeText(MainActivity.this, "Its Finished", Toast.LENGTH_SHORT).show();
                Log.i("Done", "fiished");
            }
        }.start();

      /*  final Handler handler = new Handler();                              // Timer With Continous time changing by lpase of 1 sec.
        Runnable runnable = new Runnable() {
            @Override
            public void run() {

                Log.i("counting things" ,"Give me a 5...!!!");
                Toast.makeText(MainActivity.this, "give me a 5...!!!", Toast.LENGTH_SHORT).show();

                handler.postDelayed(this,1000);
            }


       handler.post(runnable);

     */

    }
}
