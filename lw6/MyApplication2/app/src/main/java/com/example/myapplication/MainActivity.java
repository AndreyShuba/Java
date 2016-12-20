package com.example.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
Button bplus,bminus,bumnogit,bdelit,bmod,btobin,res,bxor;
    TextView customx,customy,customresult,ress;
    EditText fieldx,fieldy;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bplus = (Button)findViewById(R.id.button);
        bminus = (Button)findViewById(R.id.button2);
        bumnogit = (Button)findViewById(R.id.button3);
        bdelit = (Button)findViewById(R.id.button4);
        bmod = (Button)findViewById(R.id.button5);
        btobin = (Button)findViewById(R.id.button6);
        bxor = (Button)findViewById(R.id.button8);
        res = (Button)findViewById(R.id.button7);
        customx = (TextView)findViewById(R.id.textView3);
        customy = (TextView)findViewById(R.id.textView4);
        customresult = (TextView)findViewById(R.id.textView);
        ress  = (TextView)findViewById(R.id.textView2);
        fieldx = (EditText)findViewById(R.id.editText);
        fieldy = (EditText)findViewById(R.id.editText2);

        bplus.setOnClickListener(this);
        bminus.setOnClickListener(this);
        bdelit.setOnClickListener(this);
        bumnogit.setOnClickListener(this);
        btobin.setOnClickListener(this);
        bxor.setOnClickListener(this);
        res.setOnClickListener(this);
        bmod.setOnClickListener(this);
    }




            public void onClick(View v) {
                float fieldx1 = 0;
                float fieldy1 = 0;
                float ress1 = 0;
                int ress2=0;
                fieldx1 = Float.parseFloat(fieldx.getText().toString());
                fieldy1 = Float.parseFloat(fieldy.getText().toString());
                switch (v.getId()) {
                    case R.id.button:
                        ress1 = fieldx1 + fieldy1;
                        break;
                    case R.id.button2:
                        ress1 = fieldx1 - fieldy1;
                        break;
                    case R.id.button3:
                        ress1 = fieldx1 * fieldy1;
                        break;
                    case R.id.button4:
                        ress1 = fieldx1 / fieldy1;
                        break;
                    case R.id.button5:

                      //  ress2 = fieldx1 - fieldy1;
                        ress1=fieldx1%fieldy1;
                        break;
                    case R.id.button8:

                   ress1=(int)fieldx1^(int)fieldy1;



                        break;
                    case R.id.button6:

                        ress1= Float.parseFloat(Integer.toBinaryString((int)fieldx1));

                        break;
                    default:
                        break;
                }
                ress.setText(" "+ress1);


    }
}
