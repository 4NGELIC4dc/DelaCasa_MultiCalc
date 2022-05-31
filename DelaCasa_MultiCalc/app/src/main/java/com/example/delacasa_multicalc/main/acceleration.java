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

public class acceleration extends AppCompatActivity implements View.OnClickListener{
    methods methods = new methods();
    variables variables = new variables();
    double answer;

    Button calculateAcceleration;
    EditText time, velocity;
    TextView resultAcceleration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.acceleration);
        getSupportActionBar().hide();

        //find view by id
        time = findViewById(R.id.inAccTime);
        velocity = findViewById(R.id.inAccVelocity);
        calculateAcceleration = findViewById(R.id.calAcc);
        resultAcceleration = findViewById(R.id.resAcc);
        //set on click listener
        calculateAcceleration.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.calAcc:
                variables.setAccTime(Double.parseDouble(time.getText().toString()));
                variables.setAccVelocity(Double.parseDouble(velocity.getText().toString()));
                answer = methods.acceleration(variables.getKinSpeed(), variables.getKinVelocity());
                resultAcceleration.setText(""+answer);
                break;
        }
    }
}
