package com.example.love2code.rainorshine;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {


    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = (Button) findViewById(R.id.Btnone);


            btnOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MainActivity.this, "hello", Toast.LENGTH_SHORT ).show();
                }
        });
        btnTwo = (Button) findViewById(R.id.Btntwo);


        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Maybe", Toast.LENGTH_SHORT).show();

            }
        });

        btnThree = (Button) findViewById(R.id.Btnthree);


        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Goodbye", Toast.LENGTH_SHORT).show();

            }
        });





    }//end on create

} //end activity
