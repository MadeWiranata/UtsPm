package com.example.madewira.utspm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SegiTigaActivity extends AppCompatActivity {
    Button button1,button2;
    TextView textView2;
    EditText editText1,editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segi_tiga);

        textView2=(TextView)findViewById(R.id.textView3);
        button1=(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2);
        editText1=(EditText)findViewById(R.id.editText);
        editText2=(EditText)findViewById(R.id.editText2);

        Button addBtn= (Button) findViewById(R.id.button);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view) {
                editText1=(EditText)findViewById(R.id.editText);
                editText2=(EditText)findViewById(R.id.editText2);

                int num1 = Integer.parseInt(editText1.getText().toString());
                int num2 = Integer.parseInt(editText2.getText().toString());
                int result = 1/2*num1*num2;
                textView2.setText(result + "");
            }
        });

        Button keliling = (Button) findViewById(R.id.button2);
        keliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View view) {
                editText1=(EditText)findViewById(R.id.editText);
                editText2=(EditText)findViewById(R.id.editText2);

                int num1 = Integer.parseInt(editText1.getText().toString());
                int num2 = Integer.parseInt(editText2.getText().toString());
                int result = num1+num2+num1;
                textView2.setText(result + "");
            }
        });
    }
}

