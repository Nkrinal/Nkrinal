package com.example.sendwich;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox ch1,ch2,ch3;
    Button btn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ch1 = findViewById(R.id.ch1);
        ch2 = findViewById(R.id.ch2);
        ch3 = findViewById(R.id.ch3);

        btn = findViewById(R.id.btn);

        txt = findViewById(R.id.txt);

        ch1.setChecked(true);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Chkb1 = ch1.getText().toString();
                String Chkb2 = ch2.getText().toString();
                String Chkb3 = ch3.getText().toString();

                if(ch1.isChecked() && ch2.isChecked() && ch3.isChecked())
                {
                    txt.setText("your sendwich fillings include :"+Chkb1+" "+Chkb2+" "+Chkb3);
                }
                else if(ch1.isChecked() && ch2.isChecked())
                {
                    txt.setText("your sendwich feelings include :" +Chkb1+" "+Chkb2);
                }
                else if(ch2.isChecked() && ch3.isChecked())
                {
                    txt.setText("your sendwich feelings include :" +Chkb2+" "+Chkb3);
                }
                else if(ch3.isChecked() && ch1.isChecked())
                {
                    txt.setText("your sendwich feelings include :" +Chkb1+" "+Chkb3);
                }
                else if (ch1.isChecked())
                {
                    txt.setText("your sendwich feelings include :" +Chkb1);
                }
                else if (ch2.isChecked())
                {
                    txt.setText("your sendwich feelings include :"+Chkb2);
                }
                else if (ch3.isChecked())
                {
                    txt.setText("your sendwich feelings include :"+Chkb3);
                }
                else
                {
                    txt.setText("kindly select your sendwich accroding to your teste");
                }
            }
        });
    }
}