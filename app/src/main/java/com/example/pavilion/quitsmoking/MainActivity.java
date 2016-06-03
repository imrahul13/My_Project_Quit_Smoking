package com.example.pavilion.quitsmoking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

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
    public void quit8(View view){setContentView(R.layout.tennthpage);
    }

    public void select(View view) {
        CheckBox yesbox = (CheckBox) findViewById(R.id.yesbox);
        boolean hasyesChecked = yesbox.isChecked();
        CheckBox nobox = (CheckBox) findViewById(R.id.nobox);
        boolean hasnoChecked = nobox.isChecked();
        if (hasyesChecked) {
            displayyes();
        }
        if (hasnoChecked) {
            displayno();
        }
    }
    private void displayyes()
    {
        TextView quantityTextView=(TextView) findViewById(R.id.display);
        quantityTextView.setText("Congratulations!! You are on the right path.All the best for your great future.\n");
    }
    private void displayno()
    {
        TextView quantityTextView=(TextView) findViewById(R.id.display);
        quantityTextView.setText("Oops!! Its very heartbreaking to know that you haven't yet decided to quit smoking.");
    }
}


