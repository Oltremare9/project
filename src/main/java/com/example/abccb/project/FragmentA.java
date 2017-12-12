package com.example.abccb.project;

/**
 * Created by abccb on 2017/12/12.
 */

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Carson_Ho on 16/7/22.
 */
public class FragmentA extends Fragment {

    @Nullable

    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmenta, container, false);
    }
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        this.getActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        Spinner spinner1=(Spinner)getActivity().findViewById(R.id.spinner1);
        List<String> list=new ArrayList<String>();
        list.add("浦一");
        list.add("浦二");
        list.add("浦三");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);

        Spinner spinner2=(Spinner)getActivity().findViewById(R.id.spinner2);
        List<String>list2=new ArrayList<String>();
        list2.add("一");
        list2.add("二");
        list2.add("三");
        list2.add("四");
        list2.add("五");
        ArrayAdapter<String>adapter2=new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item,list2);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);


        Spinner spinner3=(Spinner)getActivity().findViewById(R.id.spinner3);
        List<String>list3=new ArrayList<String>();
        list3.add("8-10点");
        list3.add("10-12点");
        list3.add("14-16点");
        list3.add("16-18点");
        list3.add("晚自习");
        ArrayAdapter<String>adapter3=new ArrayAdapter<String>(this.getActivity(),android.R.layout.simple_spinner_item,list3);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(adapter3);
    }


}

