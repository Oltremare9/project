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


}

