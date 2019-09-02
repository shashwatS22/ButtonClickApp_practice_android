package com.example.buttonclickapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText userInput;
    private TextView textView;
    private int numTimesClicked=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput=(EditText) findViewById(R.id.editText2);
        button=(Button) findViewById(R.id.button);
        textView=(TextView) findViewById(R.id.textView2);
        textView.setText("");
        textView.setMovementMethod(new ScrollingMovementMethod());
        View.OnClickListener myOnclicklistner= new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numTimesClicked++;
                String result="\nThe button was tapped "+numTimesClicked+" times.";

                textView.append(result);
            }
        };
        button.setOnClickListener(myOnclicklistner);
    }
}
