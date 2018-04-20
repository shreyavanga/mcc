package com.example.hp.expt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button addbtn,subbtn,mulbtn,divbtn;
    EditText n1,n2;
    EditText result;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText)findViewById(R.id.n1) ;
        n2 = (EditText)findViewById(R.id.n2) ;
        result = (EditText)findViewById(R.id.result);


         addbtn = (Button)findViewById(R.id.btn1);
        subbtn = (Button)findViewById(R.id.btn2);
        mulbtn = (Button)findViewById(R.id.btn3);
        divbtn = (Button)findViewById(R.id.btn4);

        result=(EditText)findViewById(R.id.result);

        addbtn.setOnClickListener(
               new Button.OnClickListener(){
                   @Override
                   public void onClick(View view) {
                       String num1 = n1.getText().toString();
                       String num2 = n2.getText().toString();
                       int value = Integer.parseInt(num1) + Integer.parseInt(num2);
                       String val = Integer.toString(value);
                       result.setText(val);
                   }
               }
        );

        subbtn.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        String num1 = n1.getText().toString();
                        String num2 = n2.getText().toString();
                        int value = Integer.parseInt(num1) - Integer.parseInt(num2);
                       // int value = num1 - num2;
                        System.out.print(value);

                        String val = Integer.toString(value);
                        result.setText(val);
                    }
                }
        );
        mulbtn.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        String num1 = n1.getText().toString();
                        String num2 = n2.getText().toString();
                        int value = Integer.parseInt(num1) * Integer.parseInt(num2);

                        //int value = num1 * num2;
                        String val = Integer.toString(value);
                        result.setText(val);
                    }
                }
        );

        divbtn.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View view) {
                        String num1 = n1.getText().toString();
                        String num2 = n2.getText().toString();
                        int value = Integer.parseInt(num1) / Integer.parseInt(num2);

                       // int value = num1 / num2;
                        String val = Integer.toString(value);
                        result.setText(val);
                    }
                }
        );


    }

}
