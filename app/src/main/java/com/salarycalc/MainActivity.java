package com.salarycalc;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "SalaryCalc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "MainActivity onCreate");
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Log.d(TAG, "Layout set OK");
            TextView tv = findViewById(R.id.tv_result);
            tv.setText("工资计算器已启动！");
        } catch (Exception e) {
            Log.e(TAG, "Crash!", e);
        }
    }
}
