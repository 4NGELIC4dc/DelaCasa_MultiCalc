package com.example.delacasa_multicalc.main;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.delacasa_multicalc.methods.methods;
import com.example.delacasa_multicalc.variables.variables;
import com.example.delacasa_multicalc.R;

import androidx.appcompat.app.AppCompatActivity;

public class a_sphere extends AppCompatActivity implements View.OnClickListener{
    methods methods = new methods();
    variables variables = new variables();
    double answer;

    Button calculateSphr;
    EditText valueSphr;
    TextView resultSphr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.a_sphere);
        getSupportActionBar().hide();

        //find view by id
        valueSphr = findViewById(R.id.inValueSphr);
        calculateSphr = findViewById(R.id.calSphr);
        resultSphr = findViewById(R.id.resSphr);
        //on click listeners
        calculateSphr.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.calSphr:
                variables.setSphrValue(Double.parseDouble(valueSphr.getText().toString()));
                double answer = methods.sphere(variables.getSphere(), variables.getSphrAnswer());
                resultSphr.setText(""+answer);
                break;
        }
    }
}
