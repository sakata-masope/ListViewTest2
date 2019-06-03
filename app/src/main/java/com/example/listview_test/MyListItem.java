package com.example.listview_test;

import android.graphics.Bitmap;

public class MyListItem {
    private Bitmap mThubnail=null;
    private String mTitle = null;
    private String mText=null;

    public MyListItem(){};

    public MyListItem(Bitmap thumbnail, String title,String text)
    {
        mThubnail=thumbnail;
        mTitle=title;
        mText=text;
    }

    public void setmThubnail(Bitmap thumbnail)
    {
        mThubnail=thumbnail;
    }

    public void setmTitle(String title)
    {
        mTitle=title;
    }

    public void setmText(String text)
    {
        mText=text;
    }

    public Bitmap getmThubnail()
    {
        return mThubnail;
    }

    public String getmTitle()
    {
        return mTitle;
    }

    public String getmText()
    {
        return mText;
    }
}
