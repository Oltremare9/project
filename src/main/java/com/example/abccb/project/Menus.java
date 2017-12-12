package com.example.abccb.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static com.example.abccb.project.R.id.imageView;
import static com.example.abccb.project.R.id.imageView2;

/**
 * Created by abccb on 2017/11/9.
 */

public class Menus extends AppCompatActivity {

    Button button5;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        List<View> views = new ArrayList<View>();
        LayoutInflater inflater = LayoutInflater.from(getApplicationContext());
        View view1 = inflater.inflate(R.layout.pic1, null);
        View view2 = inflater.inflate(R.layout.pic2, null);

        views.add(view1);
        views.add(view2);


       viewPager.setAdapter(new HomePagerAdapter(views));

        Button button = (Button) findViewById(R.id.button5);
        Button button1= (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Menus.this,Search.class);
                startActivity(intent);
            }
        });
        button1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Menus.this,Preorder.class);
                startActivity(intent);
            }
        });


    }

    public class HomePagerAdapter extends PagerAdapter {
        List<View> views;
        public HomePagerAdapter(List<View> views){
            this.views=views;
        }
        @Override
        public int getCount() {
            return views.size();
        }
        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view==object;
        }


        public void destroyItem(ViewGroup container, int position , Object object){
            ((ViewPager)container).removeView(views.get(position));
        }

        public Object instantiateItem(ViewGroup container,int position){
            ((ViewPager)container).addView(views.get(position));
            return views.get(position);
        }


    }
}
