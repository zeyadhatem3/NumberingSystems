package com.blogspot.zeyadhatem3.numberingsystems;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Octal extends AppCompatActivity {
   EditText ed1;
    TextView tv2;
    int result;

    Button btx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_octal);
        ed1=(EditText) findViewById(R.id.octalText);
        tv2=(TextView)findViewById(R.id.octalView);
        btx=(Button) findViewById(R.id.button8);

        btx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               octalToDecimal(v);

            }
        });
    }


    public  int octalToDecimal2(String s)
    {

        int i= 0;
        for(int j = 0; j < s.length(); j++) {
            char num = s.charAt(j);
            num -= '0';
            if(num<0||num>7) {

                tv2.setText("invalid number");
            }
            i *= 8;
            i += num;
        }

        return  i;
    }

    public  void octalToDecimal(View v)
    {
        String oct=ed1.getText().toString();
        int i= 0;
        for(int j = 0; j < oct.length(); j++) {
            char num = oct.charAt(j);
            num -= '0';
            if(num<0||num>7) {

                tv2.setText("invalid number");
            }
            i *= 8;
            i += num;
        }

   tv2.setText("the result is   "+ i);

    }
    //=======================================================================
    public  void octalToBinary(View v)
    {
        String oct=ed1.getText().toString();
        int DecimalNum=octalToDecimal2(oct);
        String octNum=Integer.toBinaryString(DecimalNum);

        tv2.setText("the result is   "+octNum);



    }
    //=======================================================================
    public  void octalToHex(View v)
    {

        String oct=ed1.getText().toString();
        int DecimalNum=octalToDecimal2(oct);
        String Hex=Integer.toHexString(DecimalNum);
        tv2.setText("the result is   "+ Hex);
    }
    //=======================================================================
}
