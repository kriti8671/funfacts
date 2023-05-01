package com.project.funfacts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    FactBook factBook=new FactBook();
    Colors colors=new Colors();
  TextView textView;
  Button button;
  RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.funFactTextView);
        button=findViewById(R.id.showFunFactsButton);
        relativeLayout=findViewById(R.id.relativeLayout);
        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact=factBook.getFact();
                textView.setText(fact);
                int color=colors.getColors();
                relativeLayout.setBackgroundColor(color);
            }
        };
        button.setOnClickListener(listener);
    }
}