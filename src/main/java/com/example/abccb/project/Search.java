package com.example.abccb.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by abccb on 2017/11/23.
 */

public class Search extends AppCompatActivity {


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.search,container,false);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.search);

        Spinner spinner1=(Spinner)findViewById(R.id.spinner1);
        List<String>list=new ArrayList<String>();
        list.add("浦一");
        list.add("浦二");
        list.add("浦三");
        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);

        Spinner spinner2=(Spinner)findViewById(R.id.spinner2);
        List<String>list2=new ArrayList<String>();
        list2.add("一");
        list2.add("二");
        list2.add("三");
        list2.add("四");
        list2.add("五");
        ArrayAdapter<String>adapter2=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);


        Spinner spinner3=(Spinner)findViewById(R.id.spinner3);
        List<String>list3=new ArrayList<String>();
        list3.add("8-10点");
        list3.add("10-12点");
        list3.add("14-16点");
        list3.add("16-18点");
        list3.add("晚自习");
        ArrayAdapter<String>adapter3=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list3);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
    }
}
