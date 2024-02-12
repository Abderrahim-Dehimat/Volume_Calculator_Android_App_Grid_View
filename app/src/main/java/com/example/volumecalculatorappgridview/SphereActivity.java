package com.example.volumecalculatorappgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SphereActivity extends AppCompatActivity {


    TextView sphereTxt, resultTxt;
    EditText sphereEditText;
    Button sphereBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);

        sphereTxt = findViewById(R.id.sphereTxt);
        resultTxt = findViewById(R.id.sphereResultTxt);
        sphereEditText = findViewById(R.id.sphereEditTxt);
        sphereBtn = findViewById(R.id.sphereBtn);

        sphereBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius = sphereEditText.getText().toString();
                double r = Double.parseDouble(radius);
                double volume = (4/3) * 3.14159 * (r*r*r);
                resultTxt.setText("V = "+ volume +" m3");
            }
        });


    }
}