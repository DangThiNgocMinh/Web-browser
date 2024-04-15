package com.example.my;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class sub_fourth_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_fourth2);
    }
    public void imageClick_sub_fourth_2(View view){
        int id = view.getId();
        if(id == R.id.web_back_6){
            Intent intent = new Intent(this, fourth.class);
            startActivity(intent);
        }
    }
}