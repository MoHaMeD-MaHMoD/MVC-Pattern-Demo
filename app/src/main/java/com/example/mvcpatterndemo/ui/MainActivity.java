package com.example.mvcpatterndemo.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mvcpatterndemo.R;
import com.example.mvcpatterndemo.pojo.data;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.button)
    Button clickbutton;
    @BindView(R.id.age)
    TextView ageTextview;
    @BindView(R.id.name)
    TextView nameTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        clickbutton.setOnClickListener(this);
    }

    public data getModelFromDataBase() {
        return new data("Mohamed Mahmoud", 23);
    }

    public void getData() {
        nameTextView.setText(getModelFromDataBase().getName());
        ageTextview.setText(String.valueOf(getModelFromDataBase().getAge()));
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button)
            getData();


    }


}
