package com.blogspot.zeyadhatem3.numberingsystems;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Hexadecimal extends AppCompatActivity {
  EditText editH;
    TextView HexV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hexadecimal);
        editH=(EditText) findViewById(R.id.hexadecimalText);
        HexV=(TextView) findViewById(R.id.hexadecimalView);
    }

    public  int hex2decimal2(String s) {

        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;

        }

        return val;
    }


        public  void hex2decimal(View v) {
            String hexNumber = editH.getText().toString();
            String digits = "0123456789ABCDEF";
            hexNumber = hexNumber.toUpperCase();
            int val = 0;
            for (int i = 0; i < hexNumber.length(); i++) {
                char c = hexNumber.charAt(i);
                int d = digits.indexOf(c);
                val = 16*val + d;

            }
            HexV.setText("the result is:   "+val);

        }

    //*******************************************************************
    public void HexToBinary (View v)
    {

        String hexNumber = editH.getText().toString();
        int decimal = hex2decimal2(hexNumber);
        String binaryStr=Integer.toBinaryString(decimal);
        HexV.setText("the result is:   "+ binaryStr);


    }




    //*****************************************************************************
    public void HexToOctal (View v)
    {
        String hexNumber = editH.getText().toString();
        int decimal = hex2decimal2(hexNumber);
        String octalStr=Integer.toOctalString(decimal);
        HexV.setText("the result is:   "+ octalStr);


    }
}
