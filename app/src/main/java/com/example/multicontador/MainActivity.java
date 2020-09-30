package com.example.multicontador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int contAll;
    int contA;
    int contB;
    int contC;
    int contD;

    TextView contadorAll;
    TextView contadorA;
    TextView contadorB;
    TextView contadorC;
    TextView contadorD;

    Button sumaA;
    Button sumaB;
    Button sumaC;
    Button sumaD;

    Button resetAll;
    Button resetA;
    Button resetB;
    Button resetC;
    Button resetD;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        contadorAll = findViewById(R.id.countAll);
        contadorAll.setText(String.valueOf(contAll));


        contadorA = findViewById(R.id.countA);
        sumaA = findViewById(R.id.sumaA);


        sumaA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contA++;
                contadorA.setText(String.valueOf(contA));
                contAll++;
                contadorAll.setText(String.valueOf(contAll));

            }
        });

        resetA = findViewById(R.id.resetA);

        resetA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contAll = contAll - contA;
                contA = 0;
                contadorA.setText(String.valueOf(contA));
                contadorAll.setText(String.valueOf(contAll));

            }
        });

        contadorB = findViewById(R.id.countB);
        sumaB = findViewById(R.id.sumaB);

        sumaB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contB++;
                contadorB.setText(String.valueOf(contB));
                contAll++;
                contadorAll.setText(String.valueOf(contAll));
            }
        });

        resetB = findViewById(R.id.resetB);

        resetB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contAll = contAll - contB;
                contB = 0;
                contadorB.setText(String.valueOf(contB));
                contadorAll.setText(String.valueOf(contAll));

            }
        });

        contadorC = findViewById(R.id.countC);
        sumaC = findViewById(R.id.sumaC);

        sumaC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contC++;
                contadorC.setText(String.valueOf(contC));

                contAll++;
                contadorAll.setText(String.valueOf(contAll));
            }
        });

        resetC = findViewById(R.id.resetC);

        resetC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contAll = contAll - contC;
                contC = 0;
                contadorC.setText(String.valueOf(contC));
                contadorAll.setText(String.valueOf(contAll));

            }
        });

        contadorD = findViewById(R.id.countD);
        sumaD = findViewById(R.id.sumaD);

        sumaD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contD++;
                contadorD.setText(String.valueOf(contD));

                contAll++;
                contadorAll.setText(String.valueOf(contAll));
            }
        });

        resetD = findViewById(R.id.resetD);

        resetD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contAll = contAll - contD;
                contD = 0;
                contadorD.setText(String.valueOf(contD));
                contadorAll.setText(String.valueOf(contAll));

            }
        });

        resetAll = findViewById(R.id.resetAll);
        resetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contAll = 0;
                contA = 0;
                contB = 0;
                contC= 0;
                contD = 0;

                contadorA.setText(String.valueOf(contD));
                contadorB.setText(String.valueOf(contD));
                contadorC.setText(String.valueOf(contD));
                contadorD.setText(String.valueOf(contD));
                contadorAll.setText(String.valueOf(contAll));

            }
        });
    }
}