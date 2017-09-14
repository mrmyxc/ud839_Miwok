package com.example.android.miwok;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView btnToNumbersActivity;
    TextView btnToFamilyActivity;
    TextView btnToColorsActivity;
    TextView btnToPhrasesActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = MainActivity.this;


        btnToNumbersActivity = (TextView) findViewById(R.id.numbers);
        btnToFamilyActivity = (TextView) findViewById(R.id.family);
        btnToColorsActivity = (TextView) findViewById(R.id.colors);
        btnToPhrasesActivity = (TextView) findViewById(R.id.phrases);

        sendIntentToActivity(btnToNumbersActivity, NumbersActivity.class);
        sendIntentToActivity(btnToFamilyActivity, FamilyActivity.class);
        sendIntentToActivity(btnToColorsActivity, ColorsActivity.class);
        sendIntentToActivity(btnToPhrasesActivity, PhrasesActivity.class);





//        btnToNumbersActivity.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent  = new Intent(context, NumbersActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        btnToFamilyActivity.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent  = new Intent(context, FamilyActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        btnToColorsActivity.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent  = new Intent(context, ColorsActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        btnToPhrasesActivity.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent  = new Intent(context, PhrasesActivity.class);
//                startActivity(intent);
//            }
//        });


    }

    public void sendIntentToActivity (TextView button, final Class someActivity)
    {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, someActivity));
            }
        });

    }


}
