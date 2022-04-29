package com.example.delacasa_wagecalculator.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.delacasa_wagecalculator.R;
import com.example.delacasa_wagecalculator.model.Variables;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnRegular, btnProbationary, btnPartTime, btnCalculate;
    EditText editTextEmployee, editTextHours;
    TextView textTitle3;
    Variables variables = new Variables();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        //buttons
        btnRegular = findViewById(R.id.btnRegular);
        btnProbationary = findViewById(R.id.btnProbationary);
        btnPartTime = findViewById(R.id.btnPartTime);
        btnCalculate = findViewById(R.id.btnCalculate);
        //edit text
        editTextEmployee = findViewById(R.id.editTextEmployee);
        editTextHours = findViewById(R.id.editTextHours);
        //text
        textTitle3 = findViewById(R.id.textTitle3);

        //onClick listeners
        btnRegular.setOnClickListener(this);
        btnProbationary.setOnClickListener(this);
        btnPartTime.setOnClickListener(this);
        btnCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnRegular:
                variables.setEmployeeType("Regular");
                textTitle3.setText("Employee Type: Regular");
                break;
            case R.id.btnProbationary:
                variables.setEmployeeType("Probationary");
                textTitle3.setText("Employee Type: Probationary");
                break;
            case R.id.btnPartTime:
                variables.setEmployeeType("Part Time");
                textTitle3.setText("Employee Type: Part Time");
                break;
            case R.id.btnCalculate:
                if (variables.getEmployeeType() == ""){
                    Toast.makeText(MainActivity.this, "Please input in the field", Toast.LENGTH_SHORT).show();
            } else {
                    variables.setName(String.valueOf(editTextEmployee.getText()));
                    variables.setHours(Double.parseDouble(editTextHours.getText().toString()));

                    Intent intent = new Intent(this, CalculationReport.class);
                    intent.putExtra("Name", variables.getName());
                    intent.putExtra("Type", variables.getEmployeeType());
                    intent.putExtra("Hours", variables.getHours());
                    startActivity(intent);
                }
                break;

        }
    }
}