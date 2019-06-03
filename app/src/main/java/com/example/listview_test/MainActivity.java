package com.example.listview_test;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.my_listview);

        ArrayList<MyListItem> listItems = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Bitmap bmp = BitmapFactory.decodeResource(getResources(), R.drawable.pistol_pose_man);
            MyListItem item = new MyListItem(bmp, "Sample Text No." + String.valueOf(i),"Hello");
            listItems.add(item);
        }
        MyListAdapter adapter = new MyListAdapter(this, R.layout.list_item, listItems);
        listView.setAdapter(adapter);
    }
}
