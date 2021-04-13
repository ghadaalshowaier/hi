package com.example.chapter14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MyAndroid", "onCreate");

        Toasty.info(getBaseContext(), "This is an info toast.", Toast.LENGTH_SHORT, true).show();
        Toasty.error(getBaseContext(), "This is an error toast.", Toast.LENGTH_SHORT, true).show();
        Toasty.success(getBaseContext(), "Success.", Toast.LENGTH_SHORT, true).show();
        Toasty.normal(getBaseContext(), "Normal toast").show();

        Log.d("Ghada", "before activity 2");
        startActivity(new Intent(MainActivity.this, MainActivity2.class));
        Log.d("Ghada", "after activity 2");


    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("MyAndroid", "onStart");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d("MyAndroid","onResume");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d("MyAndroid","onPause");
    }
    public void onStop() { super.onStop();
        Log.d("MyAndroid","onStop");
    }
    public void onDestroy() { super.onDestroy(); Log.d("MyAndroid","onDestroy");
    }
}