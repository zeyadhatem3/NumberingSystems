package com.blogspot.zeyadhatem3.numberingsystems;


import android.content.Intent;




import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void goToDecimal(View v)


    {
        Intent i=new Intent(MainActivity.this,Decimal.class);
      startActivity(i);
    }//end go

    //======================================================

    public void goToBinary(View v)


    {
        Intent i=new Intent(MainActivity.this,Binary.class);
        startActivity(i);
    }//end go
//==========================================================
public void goToOctal(View v)


{
    Intent i=new Intent(MainActivity.this,Octal.class);
    startActivity(i);
}//end go
    //========================================================

    public void goToHexadecimal(View v)


    {
        Intent i=new Intent(MainActivity.this,Hexadecimal.class);
        startActivity(i);
    }//end go

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_list, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_exit:
                 MainActivity.this.finish();
                default:
                    return  onOptionsItemSelected(item);

        }
    }
}

