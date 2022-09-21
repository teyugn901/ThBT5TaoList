package com.example.listviewnc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvCay;
    ArrayList<Cay> arrayCay;
    CayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        //khởi tạo adapter
        adapter = new CayAdapter(this, R.layout.dong_cay,arrayCay);
        lvCay.setAdapter(adapter);
    }

    private void AnhXa() {
        lvCay = (ListView) findViewById(R.id.listviewCay);
        arrayCay = new ArrayList<>();

        arrayCay.add(new Cay("Cây Kim Liên"," Cây Kim Liên Đà Lạt",R.drawable.img));
        arrayCay.add(new Cay("Cây Phát Tài"," Cây Phát Tài Phong Thủy",R.drawable.img_1));
        arrayCay.add(new Cay("Cây Lá"," Cây Lá Tài Lộc",R.drawable.img_2));
        arrayCay.add(new Cay("Cây Dừa Cạn"," Dừa cạn phong thủy",R.drawable.img_3));
        arrayCay.add(new Cay("Cây Trường Thọ"," Trường thọ tài lộc",R.drawable.img_4));

    }
}