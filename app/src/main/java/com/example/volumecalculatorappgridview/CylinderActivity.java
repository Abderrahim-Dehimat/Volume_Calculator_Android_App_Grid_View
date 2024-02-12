package com.example.volumecalculatorappgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CylinderActivity extends AppCompatActivity {


    TextView cylinderTxt, resultTxt;
    EditText cylinderEditText, heightEditText;
    Button cylinderBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        cylinderTxt = findViewById(R.id.cylinderTxt);
        resultTxt = findViewById(R.id.cylinderResultTxt);
        cylinderEditText = findViewById(R.id.cylinderEditTxt);
        cylinderBtn = findViewById(R.id.cylinderBtn);
        heightEditText = findViewById(R.id.heightEditText);

        cylinderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String radius = cylinderEditText.getText().toString();
                double r = Double.parseDouble(radius);
                String height = heightEditText.getText().toString();
                double h = Double.parseDouble(height);
                double volume = h * 3.14159 * (r*r);
                resultTxt.setText("V = "+ volume +" m3");
            }
        });


    }
}