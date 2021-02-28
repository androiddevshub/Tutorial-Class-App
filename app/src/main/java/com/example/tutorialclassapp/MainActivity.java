package com.example.tutorialclassapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {







    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.inputEditText);

        findViewById(R.id.btnSendMsg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = editText.getText().toString();

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("msg", message);

                startActivity(intent);

            }
        });


        Log.e("activity main","onCreate Method Called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("activity main","onStart Method Called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("activity main","onResume Method Called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("activity main","onPause Method Called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("activity main","onStop Method Called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("activity main","onDestroy Method Called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("activity main","onRestart Method Called");
    }
}

