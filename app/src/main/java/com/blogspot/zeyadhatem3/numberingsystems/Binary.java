package com.blogspot.zeyadhatem3.numberingsystems;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Binary extends AppCompatActivity {
   EditText text1;
    TextView tv2;
    String nullString="enter number !";
    String BinaryInput="enter binary number (zeros and ones only";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary);
        text1=(EditText)findViewById(R.id.binaryText);
        tv2=(TextView)findViewById(R.id.binaryView);
    }

    public  void BinaryToDecimal(View v) {

        if (text1 != null ) {
            String binarynumber = text1.getText().toString();
            int binary =Integer.parseInt(binarynumber);
            if(isBinary(binary))
            {
                int decimalValue = Integer.parseInt(binarynumber, 2);
                tv2.setText("the result is " + decimalValue);
            }
            else
            {
                Toast toast = Toast.makeText(getApplicationContext(), BinaryInput, Toast.LENGTH_LONG);
                toast.show();
            }
        }
        else {
            Toast toast = Toast.makeText(getApplicationContext(), nullString, Toast.LENGTH_LONG);
            toast.show();
        }
    }//end biTOde
//======================================================================
    public  void BinaryToOctal(View v)
    {
        String binaryStr = text1.getText().toString();
 if(binaryStr!=null) {
     int binary =Integer.parseInt(binaryStr);
     if(isBinary(binary)) {

         int decimal = Integer.parseInt(binaryStr, 2);
         String octStr = Integer.toString(decimal, 8);
         tv2.setText("the result is:   " + octStr);
     }
     else
     {
         Toast toast = Toast.makeText(getApplicationContext(), BinaryInput, Toast.LENGTH_LONG);
         toast.show();
     }
 }
 else
 {

     Toast toast = Toast.makeText(getApplicationContext(), nullString, Toast.LENGTH_LONG);
     toast.show();
 }

    }//end biTOde

    //================================================================
    public  void BinaryToHex(View v)
    {
        String binaryStr = text1.getText().toString();
       if(text1!=null) {
           int binary = Integer.parseInt(binaryStr);
           if (isBinary(binary)) {
               int decimal = Integer.parseInt(binaryStr, 2);
               String hexStr = Integer.toString(decimal, 16);
               tv2.setText("the result is " + hexStr);
           }
           else
           {
               Toast toast = Toast.makeText(getApplicationContext(), BinaryInput, Toast.LENGTH_LONG);
               toast.show();
           }
       }
        else
       {
           Toast toast = Toast.makeText(getApplicationContext(), nullString, Toast.LENGTH_LONG);
           toast.show();
       }
    }//end biTOde
    public  boolean isBinary(int number)
    { int copyOfInput = number;
        while (copyOfInput != 0)
        { if (copyOfInput % 10 > 1)
        {
            return false;
        }
            copyOfInput = copyOfInput / 10; }
        return true;
    }



}
