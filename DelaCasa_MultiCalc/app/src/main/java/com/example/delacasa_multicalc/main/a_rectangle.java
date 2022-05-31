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

public class a_rectangle extends AppCompatActivity implements View.OnClickListener{
    methods methods = new methods();
    variables variables = new variables();
    double answer;

    Button calculateRec;
    EditText width, length;
    TextView resultRec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.a_rectangle);
        getSupportActionBar().hide();

        //find view by ID
        width = findViewById(R.id.inWidthRec);
        length = findViewById(R.id.inLengthRec);
        calculateRec = findViewById(R.id.calRec);
        resultRec = findViewById(R.id.resRec);
        //on click listener
        calculateRec.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.calRec:
                variables.setRecWidth(Double.parseDouble(width.getText().toString()));
                variables.setRecLength(Double.parseDouble(length.getText().toString()));
                answer = methods.rectangle(variables.getRecLength(), variables.getRecWidth(), variables.getRectangle());
                resultRec.setText(""+answer);
                break;
        }
    }
}
