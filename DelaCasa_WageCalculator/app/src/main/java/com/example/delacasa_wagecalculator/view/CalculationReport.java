package com.example.delacasa_wagecalculator.view;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.delacasa_wagecalculator.R;
import com.example.delacasa_wagecalculator.controller.Functions;
import com.example.delacasa_wagecalculator.model.Variables;

public class CalculationReport extends AppCompatActivity {

    TextView resEmployeeName, resHoursR, resHoursO, resWageR, resWageO, resWageTotal;

    Variables variables = new Variables();
    Functions functions = new Functions();

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.report_page);

        Intent intent = getIntent();
        variables.setName(intent.getStringExtra("Name"));
        variables.setEmployeeType(intent.getStringExtra("Type"));
        variables.setHours(intent.getDoubleExtra("Hours", variables.getHours()));

        //find view by ID
        resEmployeeName = findViewById(R.id.resEmployeeName);
        resHoursR = findViewById(R.id.resHoursR);
        resHoursO = findViewById(R.id.resHoursO);
        resWageR = findViewById(R.id.resWageR);
        resWageO = findViewById(R.id.resWageO);
        resWageTotal = findViewById(R.id.resWageTotal);

        double overtime = functions.solveOvertime(variables.getHours());
        double regular = functions.solveWageRegular(variables.getEmployeeType(), variables.getHours(), overtime);
        double overtimeWage = functions.solveWageOvertime(variables.getEmployeeType(), overtime);
        double total = functions.solveTotalWage(regular, overtimeWage);

        resEmployeeName.setText(variables.getName() + "(" + variables.getEmployeeType() + ")");
        resHoursR.setText("Hours Rendered:" + variables.getHours());
        resHoursO.setText("Overtime Hours:" + overtime);
        resWageR.setText("Regular Wage:" + regular);
        resWageO.setText("Overtime Wage:" + overtimeWage);
        resWageTotal.setText(String.valueOf(total));
    }
}
