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

public class power extends AppCompatActivity implements View.OnClickListener{
    methods methods = new methods();
    variables variables = new variables();
    double answer;

    Button calculatePower;
    EditText work, time;
    TextView resultPower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.power);
        getSupportActionBar().hide();

        //find view by id
        work = findViewById(R.id.inPwrWork);
        time = findViewById(R.id.inPwrTime);
        calculatePower = findViewById(R.id.calPwr);
        resultPower = findViewById(R.id.resPwr);
        //on click listener
        calculatePower.setOnClickListener(this);

    }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.calPwr:
                variables.setPwrTime(Double.parseDouble(time.getText().toString()));
                variables.setPwrWork(Double.parseDouble(work.getText().toString()));
                answer = methods.power(variables.getPwrWork(), variables.getPwrTime());
                resultPower.setText(""+answer);
                break;
        }
    }
}
