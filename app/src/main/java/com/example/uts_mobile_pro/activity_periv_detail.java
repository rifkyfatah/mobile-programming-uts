package com.example.uts_mobile_pro;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class activity_periv_detail extends AppCompatActivity {

    Shape selectedShape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periv_detail);

        getSelectedShape();
        setValues();
    }

    public void getSelectedShape(){
        Intent previousIntent = getIntent();
        String parseStringId = previousIntent.getStringExtra("id");
        selectedShape = activity_periv.shappeList.get(Integer.parseInt(parseStringId));
    }

    public void setValues(){
        TextView tv = findViewById(R.id.list_text);
        ImageView iv = findViewById(R.id.list_image);

        tv.setText(selectedShape.getName());
        iv.setImageResource(selectedShape.getImage());
    }
}