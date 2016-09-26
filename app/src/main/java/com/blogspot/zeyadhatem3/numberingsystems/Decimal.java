package com.blogspot.zeyadhatem3.numberingsystems;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Decimal extends AppCompatActivity {

    EditText dec;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal);
        tv1=(TextView) findViewById(R.id.decimalView);
        dec=(EditText) findViewById(R.id.decimalText);


    }
   public void DecimalToBinary(View v)
   {
       if(dec!=null) {
           int decimalNumer = Integer.parseInt(dec.getText().toString());

           if (decimalNumer <= 1)
               tv1.setText(decimalNumer);
           else
               tv1.setText(Integer.toBinaryString(decimalNumer));


       }

   }//end decToBin

    public void  DecimalToOctal(View v)
    {
  if(dec!=null) {
      int decimalNumer = Integer.parseInt(dec.getText().toString());


      tv1.setText(Integer.toOctalString(decimalNumer));

  }
    }//end decToBin

    public void  DecimalToHexadecimal(View v)
    {
        if(dec!=null) {

            int decimalNumer = Integer.parseInt(dec.getText().toString());


            tv1.setText(Integer.toHexString(decimalNumer));

        }
    }//end decToBin

}
