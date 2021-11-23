package com.example.custom_list;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String cityList[];
    int symbols[];
    LayoutInflater inflter;
    ImageView iv;
    TextView tv;
    TextView tv2;

    int [] flag_id={R.drawable.white,R.drawable.israel,R.drawable.usa,R.drawable.italy,R.drawable.japan, R.drawable.germany, R.drawable.russia, R.drawable.france};
    String [] country = {"","israel", "usa", "italy", "japan", "germany", "russia", "france"};
    String [] capital = {"","Jerusalem", "washington", "Roma", "tokyo", "berlin", "moscow", "paris"};

    public CustomAdapter(Context applicationContext, String[] cityList, int[] symbols, String[]capital) {
        this.context = context;
        this.cityList = cityList;
        this.symbols = symbols;
        inflter = (LayoutInflater.from(applicationContext));

    }

    @Override
    public int getCount() {
        return cityList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.custom_lv_layout, null);
        tv = (TextView) view.findViewById(R.id.tv);
        tv2 = (TextView) view.findViewById(R.id.tv2);
        iv = (ImageView) view.findViewById(R.id.iV);

        tv.setText(country[i]);
        tv2.setText(capital[i]);
        iv.setImageResource(flag_id[i] );
        return view;
    }
}

