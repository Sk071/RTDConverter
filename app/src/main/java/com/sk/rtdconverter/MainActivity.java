package com.sk.rtdconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText e = (EditText) findViewById(R.id.txtValue);
        Button b = (Button) findViewById(R.id.btn) ;
        TextView t = (TextView)findViewById(R.id.txtResult);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float d =  Float.parseFloat(e.getText().toString());
                float rs = d*77.54f;
                t.setText(+d+"$ is equals to "+rs+"rs");
                Toast.makeText(getApplicationContext(),"rs:"+rs,Toast.LENGTH_LONG).show();


            }
        });

    }
}