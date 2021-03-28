package com.example.tutorialclassapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    ArrayList<User> arrayList;

    LayoutInflater layoutInflater;
    Context context;


    public CustomAdapter(ArrayList<User> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
        layoutInflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

       View view =  layoutInflater.inflate(R.layout.list_item, null);

        TextView textView1 = view.findViewById(R.id.listTextView1);
        TextView textView2 = view.findViewById(R.id.listTextView2);
        textView1.setText(""+arrayList.get(position).getId());
        textView2.setText(arrayList.get(position).getName());
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context.getApplicationContext(), ThirdActivity.class);
                intent.putExtra("data",arrayList.get(position).getName());
                context.startActivity(intent);
            }
        });
        return view;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

}
