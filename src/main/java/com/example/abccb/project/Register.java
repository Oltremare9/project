package com.example.abccb.project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.register);


        Button button=(Button)findViewById(R.id.button2);
        button.setOnClickListener(new ClickListener());




    }
    private class ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Intent intent =new Intent(Register.this,Menus.class);
            startActivity(intent);
        }
    }
}
