package com.example.shaha.lesson3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class QuadraticActivity extends AppCompatActivity {

    public Button calculate;
    public Button clear;
    public EditText a;
    public EditText b;
    public EditText c;
    public double aa;
    public double bb;
    public double cc;
    public EditText x1;
    public EditText x2;
    public EditText formula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadratic);
            calculate = findViewById(R.id.but_calc);
            clear = findViewById(R.id.but_clear);
            a = findViewById(R.id.edit_a);
            b = findViewById(R.id.edit_b);
            c = findViewById(R.id.edit_c);
            x1 = findViewById(R.id.edit_root1);
            x2 = findViewById(R.id.edit_root2);
            formula = findViewById(R.id.formula);


            calculate.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    aa = Double.valueOf(a.getText().toString());
                    bb = Double.valueOf(b.getText().toString());
                    cc = Double.valueOf(c.getText().toString());
                    final DiscriminateCalculator calculator =  new DiscriminateCalculator(aa,bb,cc);
                    x1.setText(String.valueOf(calculator.calculateRoot1()));
                    x2.setText(String.valueOf(calculator.calculateRoot2()));
                    formula.setText(aa+" x2 + "+bb+" x + "+cc);
                }
            });
            clear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    a.setText("");
                    b.setText("");
                    c.setText("");
                    formula.setText("");
                    x1.setText("");
                    x2.setText("");
                }
            });

        }


}