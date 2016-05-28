package com.example.pavilion.quitsmoking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void quit0(View view){setContentView(R.layout.secondpage);}
    public void quit1(View view){setContentView(R.layout.thirdpage);}
    public void quit2(View view){setContentView(R.layout.fourthpage);}
    public void quit3(View view){setContentView(R.layout.fifthpage);}
    public void quit4(View view){
        setContentView(R.layout.sixthpage);
    }
    public void quit5(View view){
        setContentView(R.layout.seventhpage);
    }
    public void quit6(View view){
        setContentView(R.layout.eighthpage);
    }
    public void quit7(View view){
        setContentView(R.layout.ninthpage);
    }

}

