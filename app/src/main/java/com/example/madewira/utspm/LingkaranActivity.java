package com.example.madewira.utspm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LingkaranActivity extends AppCompatActivity {
    Button button1,button2;
    TextView textView2;
    EditText editText1,editText2;
    int ds=22/7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        textView2=(TextView)findViewById(R.id.textView6);
        button1=(Button)findViewById(R.id.button3);
        button2=(Button)findViewById(R.id.button4);
        editText1=(EditText)findViewById(R.id.editText3);
        editText2=(EditText)findViewById(R.id.editText4);

        Button Luas= (Button) findViewById(R.id.button3);
        Luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view) {
                editText1=(EditText)findViewById(R.id.editText3);
                editText2=(EditText)findViewById(R.id.editText4);

                int num1 = Integer.parseInt(editText1.getText().toString());
                int num2 = Integer.parseInt(editText2.getText().toString());
                int result =22/7*num1*num2;
                textView2.setText(result + "");
            }
        });

        Button keliling = (Button) findViewById(R.id.button4);
        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view) {
                editText1=(EditText)findViewById(R.id.editText3);
                editText2=(EditText)findViewById(R.id.editText4);

                int num1 = Integer.parseInt(editText1.getText().toString());
                int num2 = Integer.parseInt(editText2.getText().toString());
                int result = 2*22/7*num1;
                textView2.setText(result + "");
            }
        });
    }
}
