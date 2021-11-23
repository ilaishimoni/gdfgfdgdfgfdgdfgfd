package com.example.custom_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    int [] flag_id={R.drawable.white,R.drawable.israel,R.drawable.usa,R.drawable.italy,R.drawable.japan, R.drawable.germany, R.drawable.russia, R.drawable.france};
    String [] country = {"","israel", "usa", "italy", "japan", "germany", "russia", "france"};
    String [] capital = {"","Jerusalem", "washington", "Roma", "tokyo", "berlin", "moscow", "paris"};
    String [] anthem = {"", "Hatikva", "The Star-Spangled Banner", "Il Canto degli Italiani", "Kimigayo", "Deutschlandlied", "State Anthem of the Russian Federation", "La Marseillaise" };
    String [] population = {"", "9.217", "329.559", "59.55", "125.8", "83.24", "144.1", "67.39 "};
    String [] offical_language = {"", "arabic,hebrew,english", "english", "italian", "Japanese,Ryukyuan", "german", "russian","french"};
    TextView main_tv;
    TextView main_tv_2;
    TextView main_tv_3;
    TextView main_tv_4;
    TextView main_tv_5;


    Spinner spn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spn = (Spinner) findViewById(R.id.spn);
        main_tv = (TextView) findViewById(R.id.main_tv);
        main_tv_2 = (TextView)findViewById(R.id.main_tv_2);
        main_tv_3 = (TextView)findViewById(R.id.main_tv_3);
        main_tv_4 = (TextView)findViewById(R.id.main_tv_4);
        main_tv_5 = (TextView)findViewById(R.id.main_tv_5);


        CustomAdapter customadp = new CustomAdapter(getApplicationContext(),country, flag_id, capital);
        spn.setAdapter(customadp);
        spn.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        main_tv.setText("name of country: " +  country[position]);
        main_tv_2.setText("country's capital: " + capital[position]);
        main_tv_3.setText("country's anthem: " + anthem[position]);
        main_tv_4.setText("population: " + population[position] + "million");
        main_tv_5.setText("offical languages: "+ offical_language[position]);



    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}