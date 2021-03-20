package com.example.tutorialclassapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    CustomAdapter customAdapter;

    ArrayList<String> stringArrayList = new ArrayList<>();

    ListView listView;





    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stringArrayList.add("Shubham");
        stringArrayList.add("Shubhashish");
        stringArrayList.add("Ashish");
        stringArrayList.add("Jack");
        stringArrayList.add("Spiderman");
        listView = findViewById(R.id.customListView);


//        ["shubham", "shubhashish", "ashish", "jack", "spiderman"]

        customAdapter = new CustomAdapter(stringArrayList,MainActivity.this);


        listView.setAdapter(customAdapter);


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

