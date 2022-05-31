package com.example.delacasa_multicalc.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.delacasa_multicalc.R;

public class MainActivity extends AppCompatActivity {
    private Button btnVol, btnKin, btnAcc, btnPrsr, btnPwr, btnMass, btnTri, btnRec, btnSqr,btnSphr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find view by id
        btnVol = (Button) findViewById(R.id.btnVol);
        btnKin = (Button) findViewById(R.id.btnKin);
        btnAcc = (Button) findViewById(R.id.btnAcc);
        btnPrsr = (Button) findViewById(R.id.btnPrsr);
        btnPwr = (Button) findViewById(R.id.btnPwr);
        btnMass = (Button) findViewById(R.id.btnMass);
        btnTri = (Button) findViewById(R.id.btnTri);
        btnRec = (Button) findViewById(R.id.btnRec);
        btnSqr = (Button) findViewById(R.id.btnSqr);
        btnSphr = (Button) findViewById(R.id.btnSphr);

        //on click listener
        btnVol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openVolume();
            }
        });

        btnKin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openKinetic();
            }
        });
        btnAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAcceleration();
            }
        });
        btnPrsr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPressure();
            }
        });
        btnPwr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPower();
            }
        });
        btnMass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMass();
            }
        });
        btnTri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTriangle();
            }
        });
        btnRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRectangle();
            }
        });
        btnSqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSquare();
            }
        });
        btnSphr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSphere();
            }
        });
    }
    public void openVolume(){
        Intent intent = new Intent(this, volume.class);
        startActivity(intent);
    }
    public void openKinetic(){
        Intent intent = new Intent(this, kinetic_energy.class);
        startActivity(intent);
    }
    public void openAcceleration(){
        Intent intent = new Intent(this, acceleration.class);
        startActivity(intent);
    }public void openPressure(){
        Intent intent = new Intent(this, pressure.class);
        startActivity(intent);
    }
    public void openPower(){
        Intent intent = new Intent(this, power.class);
        startActivity(intent);
    }
    public void openMass(){
        Intent intent = new Intent(this, mass.class);
        startActivity(intent);
    }
    public void openTriangle(){
        Intent intent = new Intent(this, a_triangle.class);
        startActivity(intent);
    }
    public void openRectangle() {
        Intent intent = new Intent(this, a_rectangle.class);
        startActivity(intent);
    }
    public void openSquare(){
        Intent intent = new Intent(this, a_square.class);
        startActivity(intent);
    }
    public void openSphere(){
        Intent intent = new Intent(this, a_sphere.class);
        startActivity(intent);
    }
}