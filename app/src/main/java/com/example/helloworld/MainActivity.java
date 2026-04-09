package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends Activity {
    private TextView textView;
    private int clickCount = 0;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        textView = new TextView(this);
        textView.setText("Hello World!");
        textView.setTextSize(24);
        textView.setPadding(50, 50, 50, 20);
        
        Button button = new Button(this);
        button.setText("点击我");
        button.setTextSize(18);
        button.setPadding(50, 20, 50, 50);
        
        // 设置按钮点击事件
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount++;
                if (clickCount == 1) {
                    textView.setText("你点击了 1 次！");
                } else {
                    textView.setText("你点击了 " + clickCount + " 次！");
                }
            }
        });
        
        // 用垂直布局把它们放在一起
        android.widget.LinearLayout layout = new android.widget.LinearLayout(this);
        layout.setOrientation(android.widget.LinearLayout.VERTICAL);
        layout.setPadding(50, 100, 50, 50);
        layout.addView(textView);
        layout.addView(button);
        
        setContentView(layout);
    }
}
