package com.example.abccb.project;

/**
 * Created by abccb on 2017/12/12.
 */

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

/**
 * Created by Carson_Ho on 16/7/22.
 */
public class FragmentB extends Fragment {

    CheckBox A1,A2,A3,A4,B1,B2,B3,B4,C1,C2,C3,C4,D1,D2,D3,D4;
    TextView seat;
    Button ok,cancle;

    Dialog dialog;
    int temp;
    int id;
    @Nullable

    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        View view=inflater.inflate(R.layout.fragmentb, container, false);
        return view;
    }
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        temp=0;
        A1 = (CheckBox) getActivity().findViewById(R.id.A1);
        A2 = (CheckBox) getActivity().findViewById(R.id.A2);
        A3 = (CheckBox) getActivity().findViewById(R.id.A3);
        A4 = (CheckBox) getActivity().findViewById(R.id.A4);
        B1 = (CheckBox) getActivity().findViewById(R.id.B1);
        B2 = (CheckBox) getActivity().findViewById(R.id.B2);
        B3 = (CheckBox) getActivity().findViewById(R.id.B3);
        B4 = (CheckBox) getActivity().findViewById(R.id.B4);
        C1 = (CheckBox) getActivity().findViewById(R.id.C1);
        C2 = (CheckBox) getActivity().findViewById(R.id.C2);
        C3 = (CheckBox) getActivity().findViewById(R.id.C3);
        C4 = (CheckBox) getActivity().findViewById(R.id.C4);
        D1 = (CheckBox) getActivity().findViewById(R.id.D1);
        D2 = (CheckBox) getActivity().findViewById(R.id.D2);
        D3 = (CheckBox) getActivity().findViewById(R.id.D3);
        D4 = (CheckBox) getActivity().findViewById(R.id.D4);
        seat = (TextView) getActivity().findViewById(R.id.seat);
        ok = (Button) getActivity().findViewById(R.id.ok);
        cancle = (Button) getActivity().findViewById(R.id.cancle);

        CheckBox.OnCheckedChangeListener checkboxListener = new CheckBox.OnCheckedChangeListener() {


            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    if (temp >= 1) {
                        dialog = new AlertDialog.Builder(getActivity())

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
                };
            }
        }
        ok.setOnClickListener(new listen());
        cancle.setOnClickListener(new listenCancle());


    }



}

