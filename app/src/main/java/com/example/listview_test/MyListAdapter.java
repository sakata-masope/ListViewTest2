package com.example.listview_test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyListAdapter extends ArrayAdapter<MyListItem> {

    private int mResource;
    private List<MyListItem> mItems;
    private LayoutInflater mInflater;

    public MyListAdapter(Context context,int resource,List<MyListItem> items)
    {
        super(context, resource,items);

        mResource=resource;
        mItems=items;
        mInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup group)
    {
        View view;
        if(convertView!=null)
        {
            view=convertView;
        }
        else
        {
            view = mInflater.inflate(mResource,null);
        }

        MyListItem item = mItems.get(position);

        ImageView thumbnail =(ImageView)view.findViewById(R.id.thumbnail);
        thumbnail.setImageBitmap(item.getmThubnail());

        TextView title =(TextView)view.findViewById(R.id.title);
        title.setText(item.getmTitle());

        TextView text=(TextView)view.findViewById(R.id.mainText);
        text.setText(item.getmText());

        return view;

    }
}
