package com.example.myspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView msg;
    String cities[] = {"Chicago", "Boise","Fargo", "New York"};
    Spinner sp;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        msg= findViewById(R.id.result);
        sp.findViewById(R.id.spinnerCities);
        adapter= new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,cities);
        sp.setAdapter(adapter);

        // Creating click listeners on the LI elements :)
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                // Based on which position you click the result will change
                if (position == 0) {
                    msg.setText("Best City Ever");

                }else if(position ==1){
                    msg.setText("Go Bison");

                }else if(position ==2){
                    msg.setText("Boise State has a blue field");
                }else if(position==3){
                    msg.setText("New York Yankees, New York Knicks.... meh");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}