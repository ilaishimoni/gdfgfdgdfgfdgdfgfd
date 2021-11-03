package com.example.custom_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    int [] flag_id={R.drawable.israel,R.drawable.usa,R.drawable.italy,R.drawable.japan, R.drawable.germany, R.drawable.russia, R.drawable.france};
    String [] country = {"israel", "usa", "italy", "japan", "germany", "russia", "france"};
    String [] capital = {"Jerusalem", "washington", "Roma", "tokyo", "berlin", "moscow", "paris"};

    Spinner spn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spn = (Spinner) findViewById(R.id.spn);


        CustomAdapter customadp = new CustomAdapter(getApplicationContext(),country, flag_id, capital);
        spn.setAdapter(customadp);

    }
}