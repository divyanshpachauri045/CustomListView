package com.example.divyansh.day1;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class CustomAdapter extends ArrayAdapter {

    ArrayList<MyPojo> arrayList;
    int resource;
    Context context;

    public CustomAdapter(@NonNull Context context, int resource, ArrayList<MyPojo> arrayList) {
        super(context, resource, arrayList);
        this.context = context;
        this.arrayList = arrayList;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(resource, null, false);

        TextView textName = (TextView) view.findViewById(R.id.textName);
        TextView textNumber = (TextView) view.findViewById(R.id.textNumber);
        TextView i = (TextView) view.findViewById(R.id.insideText);


        MyPojo myPojo = arrayList.get(position);
        textName.setText(myPojo.getName());
        textNumber.setText(myPojo.getNumber());

        String s = myPojo.getName();
        char c = (char)s.charAt(0);
        i.setText(c+"");

        ImageView img = (ImageView)view.findViewById(R.id.image);

        Random r = new Random();

        int color = Color.argb(255,r.nextInt(255),r.nextInt(255),r.nextInt(255));
        img.setColorFilter(color);

        if(position%2 == 0){
            view.setBackgroundColor(Color.LTGRAY);
        }
        else{
            view.setBackgroundColor(Color.WHITE);
        }


        return view;
    }
}
