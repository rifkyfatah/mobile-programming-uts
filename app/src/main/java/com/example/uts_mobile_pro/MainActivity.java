package com.example.uts_mobile_pro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        String[] value = new String[]{"Pertemuan 1", "Pertemuan 2", "Pertemuan 3"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, value);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent intent = new Intent(view.getContext(), activity_peri.class);
                    startActivity(intent);
                }else if (i == 1){
                    Intent intent = new Intent(view.getContext(), activity_perii.class);
                    startActivity(intent);
                }
                else if (i == 2){
                    Intent intent = new Intent(view.getContext(), activity_periii.class);
                    startActivity(intent);
                }
            }
        });
    }
}