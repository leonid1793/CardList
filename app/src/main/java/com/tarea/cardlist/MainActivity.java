package com.tarea.cardlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window w= getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<item> itemList = new ArrayList<>();
        itemList.add(new item(R.drawable.img1,"Cities",R.drawable.img5,2500));
        itemList.add(new item(R.drawable.img2,"Patio",R.drawable.img6,3100));
        itemList.add(new item(R.drawable.img3,"Juegos",R.drawable.img7,8000));
        itemList.add(new item(R.drawable.img4,"Citas",R.drawable.img8,2500));
        Adapter adapter = new Adapter( this,itemList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
