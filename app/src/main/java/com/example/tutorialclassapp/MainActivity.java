package com.example.tutorialclassapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
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

    ListView listView;

    ArrayList<User> userArrayList = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user1 = new User();
        user1.setId(11);
        user1.setName("Shubham Jain");

        User user2 = new User();
        user2.setId(12);
        user2.setName("Shubhashish");


        User user3 = new User();
        user3.setId(13);
        user3.setName("Ashish");


        User user4 = new User();
        user4.setId(14);
        user4.setName("Spiderman");

        User user5 = new User();
        user5.setId(0);
        user5.setName("");

//        How to send object through intent from one activity to another activity
//        Intent intent = new Intent(this, SecondActivity.class);
//        intent.putExtra("user", (Parcelable) user1);




        userArrayList.add(user1);
        userArrayList.add(user2);
        userArrayList.add(user3);
        userArrayList.add(user4);
        userArrayList.add(user5);

        listView = findViewById(R.id.customListView);


//        ["shubham", "shubhashish", "ashish", "jack", "spiderman"]

        customAdapter = new CustomAdapter(userArrayList,MainActivity.this);


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

