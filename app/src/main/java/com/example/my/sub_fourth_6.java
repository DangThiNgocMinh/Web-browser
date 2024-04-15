package com.example.my;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Switch;

public class sub_fourth_6 extends AppCompatActivity {
    private Switch mSwitch;
    private RadioButton mRadioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_fourth6);

        mSwitch = findViewById(R.id.switch5);
        mRadioButton = findViewById(R.id.radioButton10);

        mRadioButton.setChecked(true);
        mSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Nếu Switch được bật, kích hoạt RadioButton và cho phép tương tác với chúng
                    mRadioButton.setEnabled(true);
                    mRadioButton.setChecked(true); // Đặt mặc định RadioButton được chọn
                } else {
                    // Nếu Switch không được bật, vô hiệu hóa RadioButton và ngăn tương tác với chúng
                    mRadioButton.setEnabled(false);
                }
            }
        });

    }

    public void imageClick_sub_fourth_6(View view){
        int id = view.getId();
        if(id == R.id.web_back_12){
            Intent intent = new Intent(this, fourth.class);
            startActivity(intent);
        }
    }
}