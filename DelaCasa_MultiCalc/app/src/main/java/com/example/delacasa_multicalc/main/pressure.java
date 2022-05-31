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

public class pressure extends AppCompatActivity implements View.OnClickListener{
    methods methods = new methods();
    variables variables = new variables();
    double answer;

    Button calculatePressure;
    EditText force, area;
    TextView resultPressure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.pressure);
        getSupportActionBar().hide();

        //find view by id
        force = findViewById(R.id.inPrsrForce);
        area = findViewById(R.id.inPrsrArea);
        calculatePressure = findViewById(R.id.calPrsr);
        resultPressure = findViewById(R.id.resPrsr);
        //set on click listener
        calculatePressure.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.calVol:
                variables.setPrsrArea(Double.parseDouble(area.getText().toString()));
                variables.setPrsrForce(Double.parseDouble(force.getText().toString()));
                answer = methods.pressure(variables.getPrsrForce(), variables.getPrsrArea());
                resultPressure.setText(""+answer);
                break;
        }
    }
}
