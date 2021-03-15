package com.example.activitylab;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView OnCreate,OnStart,OnResume,OnRestart;
    private Button btnStartActivity2;
    private int create=0,start=0,resume=0,restart=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        create++;
        OnCreate=findViewById(R.id.OnCreate);
        OnCreate.setText("onCreate() calls:"+create);
        Log.i("MainActivity","OnCreate is Called");
        btnStartActivity2=findViewById(R.id.btnStartActivity2);
        btnStartActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Activity2.class);
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
        Log.i("MainActivity","OnStart is Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        resume++;
        OnResume=findViewById(R.id.OnResume);
        OnResume.setText("onResume() calls:"+resume);
        Log.i("MainActivity","OnResume is Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        restart++;
        OnRestart=findViewById(R.id.OnRestart);
        OnRestart.setText("onRestart() calls:"+restart);
        Log.i("MainActivity","OnRestart is Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity","OnPause is Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity","OnStop is Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity","OnDestroy is Called");
    }
}

