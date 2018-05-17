package com.example.divyansh.day1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.*;
import android.view.LayoutInflater;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView l;
    private CustomAdapter  adapter;
    private ArrayList<MyPojo> arrayList = new ArrayList<>();
    private String[] s ={"Abhay","Jaggu","Bhu","Hitesh","Aman","Raj","Raj","Devendra","Naman","Aashu"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyPojo myPojo = new MyPojo();
        myPojo.setName("Divyansh");
        myPojo.setNumber("12345");
        arrayList.add(myPojo);

        for(int i=1;i<11;i++){
            MyPojo myPojo1 = new MyPojo();
            myPojo1.setName(s[i-1]);
            myPojo1.setNumber("1234567");
            arrayList.add(myPojo1);
        }

        l = (ListView)findViewById(R.id.listview);
        adapter = new CustomAdapter(MainActivity.this,R.layout.list_item,arrayList);
        l.setAdapter(adapter)   ;

    }
}
