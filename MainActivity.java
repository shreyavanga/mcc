package com.example.hp.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.btn1);
        b2 = (Button)findViewById(R.id.btn2);
        edit = (EditText)findViewById(R.id.edit);


        b2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        edit.setText("");
                    }
                }
        );


    }

    public void onClick(View v){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

}
