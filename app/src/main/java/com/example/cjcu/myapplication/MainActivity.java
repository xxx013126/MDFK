package com.example.cjcu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] fruit = {"Apple","Pineapple","Banana","Kiwi","A","B","C","D","E","F"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //final ListView list = (ListView) findViewById(R.id.list);
        final Spinner spinner=(Spinner) findViewById(R.id.spinner2);



        //ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,fruit);
        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this, R.array.fruit, R.layout.support_simple_spinner_dropdown_item);

        //list.setAdapter(adapter);
        spinner.setAdapter(adapter2);

        /*list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,list.getItemAtPosition(position).toString() , Toast.LENGTH_SHORT).show();
            }
        });*/

    }
}
