package com.example.admin.listviewadaptercustom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //danh sach chua mang du lieu
    ArrayList<TraiCay> traiCayArrayList;
    ListView lvTraiCay;

    //khai bao adapter
    TraiCayAdapter adapter ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();


        adapter = new TraiCayAdapter(this,R.layout.dongtraicay,traiCayArrayList);

        lvTraiCay.setAdapter(adapter);

    }

    public void AnhXa(){

        lvTraiCay = (ListView) findViewById(R.id.lv);
        //khoi tao arraylist
        traiCayArrayList = new ArrayList<>();

        //them doi tuong vao mang
        // moi 1 dong chua 1 doi tuong

        traiCayArrayList.add(new TraiCay("dau tay", "dat lat" , R.drawable.hinh1));
        traiCayArrayList.add(new TraiCay("tam", " dac lac", R.drawable.hinh2));
        traiCayArrayList.add(new TraiCay("ten tuoi", "hong", R.drawable.hinh3));

    }
}
