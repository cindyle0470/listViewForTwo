package com.cindyle.twogrouplistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvItems = findViewById(R.id.lvItems);

        List<ItemData> dataList = new ArrayList<>();
        dataList.add(new ItemHeader("Group1"));
        dataList.add(new ItemData("title1", "group1"));
        dataList.add(new ItemData("title2", "group1"));
        dataList.add(new ItemData("title3", "group1"));
        dataList.add(new ItemData("title4", "group1"));
        dataList.add(new ItemData("title5", "group1"));
        dataList.add(new ItemData("title6", "group1"));

        dataList.add(new ItemHeader("Group2"));
        dataList.add(new ItemData("title7", "group2"));
        dataList.add(new ItemData("title8", "group2"));
        dataList.add(new ItemData("title9", "group2"));
        dataList.add(new ItemData("title10", "group2"));
        dataList.add(new ItemData("title11", "group2"));
        dataList.add(new ItemData("title12", "group2"));
        dataList.add(new ItemData("title13", "group2"));
        dataList.add(new ItemData("title14", "group2"));
        dataList.add(new ItemData("title15", "group2"));

        ItemAdapter adapter = new ItemAdapter(this, dataList);
        lvItems.setNestedScrollingEnabled(true);
        lvItems.setAdapter(adapter);
        lvItems.setOnItemClickListener((parent, view, position, id) -> {
            ItemData data = dataList.get(position);
            if (!(data instanceof ItemHeader)) {
                Toast.makeText(MainActivity.this, "data: " + data.title, Toast.LENGTH_SHORT).show();
            }
        });
    }
}