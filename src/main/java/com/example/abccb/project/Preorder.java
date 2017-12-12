package com.example.abccb.project;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


/**
 * Created by abccb on 2017/11/30.
 */



public class Preorder extends AppCompatActivity {

    CheckBox A1,A2,A3,A4,B1,B2,B3,B4,C1,C2,C3,C4,D1,D2,D3,D4;
    TextView seat;
    Button ok,cancle;

    Dialog dialog;
    int temp;
    int id;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.preorder,container,false);
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preorder);

        temp=0;
        A1 = (CheckBox) findViewById(R.id.A1);
        A2 = (CheckBox) findViewById(R.id.A2);
        A3 = (CheckBox) findViewById(R.id.A3);
        A4 = (CheckBox) findViewById(R.id.A4);
        B1 = (CheckBox) findViewById(R.id.B1);
        B2 = (CheckBox) findViewById(R.id.B2);
        B3 = (CheckBox) findViewById(R.id.B3);
        B4 = (CheckBox) findViewById(R.id.B4);
        C1 = (CheckBox) findViewById(R.id.C1);
        C2 = (CheckBox) findViewById(R.id.C2);
        C3 = (CheckBox) findViewById(R.id.C3);
        C4 = (CheckBox) findViewById(R.id.C4);
        D1 = (CheckBox) findViewById(R.id.D1);
        D2 = (CheckBox) findViewById(R.id.D2);
        D3 = (CheckBox) findViewById(R.id.D3);
        D4 = (CheckBox) findViewById(R.id.D4);
        seat = (TextView) findViewById(R.id.seat);
        ok = (Button) findViewById(R.id.ok);
        cancle = (Button) findViewById(R.id.cancle);

        CheckBox.OnCheckedChangeListener checkboxListener = new CheckBox.OnCheckedChangeListener() {


            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if (temp >= 1) {
                        dialog = new AlertDialog.Builder(Preorder.this)

                                .setTitle("不太好吧")

                                .setMessage("一人一座，共享良好学习环境\n请先取消选中的座位")

                                .setPositiveButton("确定", null)

                                .show();
                        buttonView.setChecked(false);
                        id=buttonView.getId();

                    }else
                        temp++;
                } else {
                    temp--;

                }
            }
        };
        A1.setOnCheckedChangeListener(checkboxListener);
        A2.setOnCheckedChangeListener(checkboxListener);
        A3.setOnCheckedChangeListener(checkboxListener);
        A4.setOnCheckedChangeListener(checkboxListener);
        B1.setOnCheckedChangeListener(checkboxListener);
        B2.setOnCheckedChangeListener(checkboxListener);
        B3.setOnCheckedChangeListener(checkboxListener);
        B4.setOnCheckedChangeListener(checkboxListener);
        C1.setOnCheckedChangeListener(checkboxListener);
        C2.setOnCheckedChangeListener(checkboxListener);
        C3.setOnCheckedChangeListener(checkboxListener);
        C4.setOnCheckedChangeListener(checkboxListener);
        D1.setOnCheckedChangeListener(checkboxListener);
        D2.setOnCheckedChangeListener(checkboxListener);
        D3.setOnCheckedChangeListener(checkboxListener);
        D4.setOnCheckedChangeListener(checkboxListener);


        class listen implements View.OnClickListener {

            @Override
            public void onClick(View v) {
                if (id>0) {
                    //发送给服务器端
                    //判断后接收反馈
                }
                ;

            }
        }
        class listenCancle implements View.OnClickListener {

            @Override
            public void onClick(View v) {
                if (id>0) {
                    //发送给服务器端
                    //判断后接收反馈
                }
                ;

            }
        }
        ok.setOnClickListener(new listen());
        cancle.setOnClickListener(new listenCancle());
    }}