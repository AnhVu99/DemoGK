package com.example.th4_14_10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ListView lv;
    ArrayList<item1> arr1;
    ArrayList<itemSach> arr2;

    Adapter1 Adap1;
    Adapter2 adapter2;
    GridView gv;
    RecyclerView rec;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        gv = (GridView) findViewById(R.id.gv);
        initSach();
        gv.setNumColumns((arr2.size()+1)/2);
        rec = (RecyclerView) findViewById(R.id.recyclerView);
        Adap1 = new Adapter1(arr1);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        rec.setLayoutManager(mLayoutManager);
        rec.setItemAnimator(new DefaultItemAnimator());

        prepareMovieData();
        Adap1 = new Adapter1(this,R.layout.item_grid1,arr1);
        //lv = (ListView) findViewById(R.id.lv1);
        rec.setAdapter(Adap1);

        //lv.setAdapter(Adap1)
        adapter2 = new Adapter2(this,arr2,R.layout.item2);
        gv.setAdapter(adapter2);
        gv.setColumnWidth(160);
        //gv.wid


    }
    private void prepareMovieData() {
        arr1 = new ArrayList<item1>();
        arr1.add(new item1("Cáp chuyển từ Cổng \n" +
                "USB sang PS2...",(float)69900,R.drawable.dauchuyendoi));
        arr1.add(new item1("Cáp chuyển từ Cổng \n" +
                "USB sang PS2...",(float)69900,R.drawable.dauchuyendoi));
        arr1.add(new item1("Cáp chuyển từ Cổng \n" +
                "USB sang PS2...",(float)69900,R.drawable.daucam));
        arr1.add(new item1("Cáp chuyển từ Cổng \n" +
                "USB sang PS2...",(float)69900,R.drawable.dauchuyendoipsps2));
        arr1.add(new item1("Cáp chuyển từ Cổng \n" +
                "USB sang PS2...",(float)69900,R.drawable.daynguon));
        arr1.add(new item1("Cáp chuyển từ Cổng \n" +
                "USB sang PS2...",(float)69900,R.drawable.giacchuyen));
        Adap1.notifyDataSetChanged();
    }
    void initSach(){
        arr2 = new ArrayList<itemSach>();
        arr2.add(new itemSach("sách 1",R.drawable.main1));
        arr2.add(new itemSach("sách 2",R.drawable.main2));
        arr2.add(new itemSach("sách 3",R.drawable.main3));
        arr2.add(new itemSach("sách 4",R.drawable.main6));
        arr2.add(new itemSach("sách 5",R.drawable.laptop));
        arr2.add(new itemSach("sách 6",R.drawable.laptop2));
        arr2.add(new itemSach("sách 7",R.drawable.laptop4));
        arr2.add(new itemSach("sách 8",R.drawable.laptop5));
        arr2.add(new itemSach("sách 9",R.drawable.manhinh));
        arr2.add(new itemSach("sách 10",R.drawable.manhinh2));
    }

}