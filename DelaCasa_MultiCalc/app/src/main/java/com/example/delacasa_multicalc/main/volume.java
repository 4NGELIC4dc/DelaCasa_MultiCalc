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


public class volume extends AppCompatActivity implements View.OnClickListener {

    methods methods = new methods();
    variables variables = new variables();
    double answer;

    Button calculateVolume;
    EditText length, width, height;
    TextView resultVolume;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.volume);
        getSupportActionBar().hide();

        //find view by ID
        length = findViewById(R.id.inVolLength);
        width = findViewById(R.id.inVolWidth);
        height = findViewById(R.id.inVolHeight);
        calculateVolume = findViewById(R.id.calVol);
        resultVolume = findViewById(R.id.resVol);
        //on click listener
        calculateVolume.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.calVol:
                variables.setVolLength(Double.parseDouble(length.getText().toString()));
                variables.setVolWidth(Double.parseDouble(width.getText().toString()));
                variables.setVolHeight(Double.parseDouble(height.getText().toString()));
                answer = methods.volume(variables.getVolLength(), variables.getVolWidth(), variables.getVolHeight());
                resultVolume.setText(""+answer);
                break;

        }
    }
}
