package com.example.my;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class sub_fourth extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_fourth);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        // Lắng nghe sự kiện khi RadioButton được chọn
        RadioGroup radioGroup = findViewById(R.id.idgroup);
        radioGroup.setOnCheckedChangeListener((group, checkedId) -> {
            RadioButton radioButton = findViewById(checkedId);
            Toast.makeText(sub_fourth.this, "Selected option: " + radioButton.getText(), Toast.LENGTH_SHORT).show();
        });
    }
    public void imageOnclick_sub_fourth(View view){
        int id = view.getId();
        if(id == R.id.web_back_4){
            Intent intent = new Intent(this, fourth.class);
            startActivity(intent);
        }
    }
}