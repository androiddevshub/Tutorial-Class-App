package com.example.tutorialclassapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {


    Intent intent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.messageText);

        intent = getIntent();
        String message = intent.getStringExtra("msg");

        textView.setText(message);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "http://karma69.com";
                intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });





    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("activity second","onStart Method Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("activity second","onResume Method Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("activity second","onPause Method Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("activity second","onStop Method Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("activity second","onDestroy Method Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("activity second","onRestart Method Called");
    }
}
