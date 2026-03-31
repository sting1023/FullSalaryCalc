package com.salarycalc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> records = new ArrayList<>();
    private TextView resultTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(48, 48, 48, 48);

        TextView title = new TextView(this);
        title.setText("工资计算器");
        title.setTextSize(24);
        layout.addView(title);

        final EditText nameInput = new EditText(this);
        nameInput.setHint("姓名");
        layout.addView(nameInput);

        final EditText baseInput = new EditText(this);
        baseInput.setHint("基本工资");
        baseInput.setInputType(8192);
        layout.addView(baseInput);

        final EditText bonusInput = new EditText(this);
        bonusInput.setHint("奖金");
        bonusInput.setInputType(8192);
        layout.addView(bonusInput);

        Button addBtn = new Button(this);
        addBtn.setText("添加");
        addBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String name = nameInput.getText().toString();
                records.add(name);
                nameInput.setText("");
                baseInput.setText("");
                bonusInput.setText("");
            }
        });
        layout.addView(addBtn);

        Button calcBtn = new Button(this);
        calcBtn.setText("计算");
        calcBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                resultTv.setText("共" + records.size() + "条记录");
            }
        });
        layout.addView(calcBtn);

        resultTv = new TextView(this);
        resultTv.setTextSize(16);
        layout.addView(resultTv);

        setContentView(layout);
    }
}
