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

public class a_triangle extends AppCompatActivity implements View.OnClickListener{
    methods methods = new methods();
    variables variables = new variables();
    double answer;

    Button calculateTri;
    EditText base, height;
    TextView resultTri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.a_triangle);
        getSupportActionBar().hide();

        //find view by ID
        base = findViewById(R.id.inBaseTri);
        height = findViewById(R.id.inHeightTri);
        calculateTri = findViewById(R.id.calTri);
        resultTri = findViewById(R.id.resTri);
        //on click listeners
        calculateTri.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.calTri:
                variables.setTriBase(Double.parseDouble(base.getText().toString()));
                variables.setTriHeight(Double.parseDouble(height.getText().toString()));
                answer = methods.triangleA(variables.getTriHeight(), variables.getTriBase());
                resultTri.setText(""+answer);
                break;

        }
    }
}
