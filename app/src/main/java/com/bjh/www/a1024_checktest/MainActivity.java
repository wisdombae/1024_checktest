package com.bjh.www.a1024_checktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        textView.setVisibility(View.GONE);      // textView 초기 상태: GONE
    }

    public void onClickWidget(View view) {

        int id = view.getId();
        String text_checkbox = ((CheckBox)view).getText().toString();

        switch(id) {
            case R.id.checkBox1:
                checkBoxStatePrint(view, text_checkbox);
                break;
            case R.id.checkBox2:
                checkBoxStatePrint(view, text_checkbox);
                break;
            case R.id.checkBox3:
                checkBoxStatePrint(view, text_checkbox);
                break;
            default:
        }
    }

    public void checkBoxStatePrint(View view, String str) {
        if (((CheckBox) view).isChecked()) {
            textView.setVisibility(View.VISIBLE);
            textView.setText(str);
            str = str + " - " + ((CheckBox) view).isChecked();
        }
        else {
            textView.setVisibility(View.GONE);
        }
    }
}