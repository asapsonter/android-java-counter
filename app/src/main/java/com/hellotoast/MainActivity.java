package com.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.androidcounter.R;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
   private Context context;
   private Button toastBtn, count ;
   private TextView txtCount;

  private int mCount = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("mainActivity", "sam sonter ");

        txtCount = (TextView) findViewById(R.id.show_count);


    }

    //Button toastBtn  = (Button)findViewById(R.id.buttonToast);



    @SuppressLint("SetTextI18n")
    public void showToast(View view) {
        mCount --;
        if(txtCount != null)
            txtCount.setText(Integer.toString(mCount));


        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "this is toast button ", Toast.LENGTH_LONG);
        toast.show();
    }

    @SuppressLint("SetTextI18n")
    public void countUp(View view) {
        mCount ++;
        if (txtCount != null)
            txtCount.setText(Integer.toString( mCount));

        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "this is count button ", Toast.LENGTH_LONG);
        toast.show();

    }
}