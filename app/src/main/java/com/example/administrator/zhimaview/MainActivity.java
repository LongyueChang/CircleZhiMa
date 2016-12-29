package com.example.administrator.zhimaview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText mEditText;
    private RoundIndicatorView mMyView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mEditText= (EditText) findViewById(R.id.edit_show);
        mMyView= (RoundIndicatorView) findViewById(R.id.myView);
    }

    public void edShow(View view) {
        int trim = Integer.valueOf(mEditText.getText().toString().trim());

        mMyView.setCurrentNumAnim(trim);
    }
}
