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

public class mass extends AppCompatActivity implements View.OnClickListener{
    methods methods = new methods();
    variables variables = new variables();
    double answer;

    Button calculateMass;
    EditText volume, density;
    TextView resultMass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.mass);
        getSupportActionBar().hide();

        //find view by id
        volume = findViewById(R.id.inMassVolume);
        density = findViewById(R.id.inMassDensity);
        calculateMass = findViewById(R.id.calMass);
        resultMass = findViewById(R.id.resMass);
        //on click listener
        calculateMass.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.calMass:
                variables.setMassDensity(Double.parseDouble(density.getText().toString()));
                variables.setMassVolume(Double.parseDouble(volume.getText().toString()));
                answer = methods.mass(variables.getMassVolume(), variables.getMassDensity());
                resultMass.setText(""+answer);
                break;
        }
    }
}
