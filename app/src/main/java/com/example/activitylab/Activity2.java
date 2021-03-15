package com.example.activitylab;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {private TextView OnCreate,OnStart,OnResume,OnRestart;
    private Button btnStartActivity1;
    private int create=0,start=0,resume=0,restart=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        create++;
        OnCreate=findViewById(R.id.OnCreate);
        OnCreate.setText("onCreate() calls:"+create);
        Log.i("Activity 2","OnCreate is Called");

        btnStartActivity1=findViewById(R.id.btnStartActivity1);
        btnStartActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity2.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        start++;
        OnStart=findViewById(R.id.OnStart);
        OnStart.setText("onStart() calls:"+start);
        Log.i("Activity 2","OnStart is Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        resume++;
        OnResume=findViewById(R.id.OnResume);
        OnResume.setText("onResume() calls:"+resume);
        Log.i("Activity 2","OnResume is Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        restart++;
        OnRestart=findViewById(R.id.OnRestart);
        OnRestart.setText("onRestart() calls:"+restart);
        Log.i("Activity 2","OnRestart is Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Activity 2","OnPause is Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Activity 2","OnStop is Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity 2","OnDestroy is Called");
    }
}