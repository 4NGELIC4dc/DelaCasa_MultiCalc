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

public class a_square extends AppCompatActivity implements View.OnClickListener{
    methods methods = new methods();
    variables variables = new variables();
    double answer;

    Button calculateSqr;
    EditText valueSqr;
    TextView resultSqr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.a_square);
        getSupportActionBar().hide();

        //find view by ID
        valueSqr = findViewById(R.id.inValueSqr);
        calculateSqr = findViewById(R.id.calSqr);
        resultSqr = findViewById(R.id.resSqr);
        //on click listener
        calculateSqr.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.calSqr:
                variables.setSqrValue(Double.parseDouble(valueSqr.getText().toString()));
                double answer = methods.square(variables.getSquare(), variables.getSqrAnswer());
                resultSqr.setText(""+answer);
                break;
        }
    }
}
