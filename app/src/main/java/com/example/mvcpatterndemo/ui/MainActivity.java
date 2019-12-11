package com.example.mvcpatterndemo.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvcpatterndemo.R;
import com.example.mvcpatterndemo.pojo.data;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
TextView nameTextView,ageTextview;
Button clickbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameTextView=findViewById(R.id.name);
        ageTextview=findViewById(R.id.age);
        clickbutton=findViewById(R.id.button);
        clickbutton.setOnClickListener(this);
    }
    public data getModelFromDataBase (){
        return new data("Mohamed Mahmoud",23);
   }

   public void getData(){
        nameTextView.setText(getModelFromDataBase().getName());
        ageTextview.setText(String.valueOf(getModelFromDataBase().getAge()));
   }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button)
            getData();


    }


}
