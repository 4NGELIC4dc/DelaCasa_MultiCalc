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

public class kinetic_energy extends AppCompatActivity implements View.OnClickListener{
    methods methods = new methods();
    variables variables = new variables();
    double answer;

    Button calculateKinetic;
    EditText speed, velocity;
    TextView resultKinetic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.kinetic_energy);
        getSupportActionBar().hide();

        //find view by ID
        speed = findViewById(R.id.inKinSpeed);
        velocity = findViewById(R.id.inKinVelocity);
        calculateKinetic = findViewById(R.id.calKin);
        resultKinetic = findViewById(R.id.resKin);
        //set on click listener
        calculateKinetic.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.calVol:
                variables.setKinSpeed(Double.parseDouble(speed.getText().toString()));
                variables.setKinVelocity(Double.parseDouble(velocity.getText().toString()));
                answer = methods.kinetic(variables.getKinSpeed(), variables.getKinVelocity());
                resultKinetic.setText(""+answer);
                break;
        }
    }

}
