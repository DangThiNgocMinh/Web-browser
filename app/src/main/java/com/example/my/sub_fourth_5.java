package com.example.my;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;


public class sub_fourth_5 extends AppCompatActivity {

    private Switch mSwitch;
    private RadioButton mRadioButton;
    private RadioButton mRadioButton2;
    private EditText mEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_fourth5);

        mSwitch = findViewById(R.id.switch4);
        mRadioButton = findViewById(R.id.radioButton9);
        mRadioButton2 = findViewById(R.id.radioButton);
        mRadioButton.setChecked(true);

        // Xử lý sự kiện khi thay đổi trạng thái của Switch
        mSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // Nếu Switch được bật, kích hoạt RadioButton và cho phép tương tác với chúng
                    mRadioButton.setEnabled(true);
                    mRadioButton2.setEnabled(true);
                } else {
                    // Nếu Switch không được bật, vô hiệu hóa RadioButton và ngăn tương tác với chúng
                    mRadioButton.setEnabled(false);
                    mRadioButton2.setEnabled(false);
                }
            }
        });
        mRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    mRadioButton2.setChecked(false);
                }
            }
        });
        mRadioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    mRadioButton.setChecked(false);
                }
            }
        });
    }

    public void imageClick_sub_fourth_5(View view){
        int id = view.getId();
        if(id == R.id.web_back_11){
            Intent intent = new Intent(this, fourth.class);
            startActivity(intent);
        }
    }
}