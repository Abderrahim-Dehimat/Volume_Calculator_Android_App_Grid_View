package com.example.volumecalculatorappgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrismActivity extends AppCompatActivity {

    TextView prismTxt, resultTxt;
    EditText prismEditText, prismHeightEditText, prismWidthEditText;
    Button sphereBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);

        prismTxt = findViewById(R.id.prismTxt);
        resultTxt = findViewById(R.id.prismResultTxt);
        prismEditText = findViewById(R.id.prismEditTxt);
        prismHeightEditText = findViewById(R.id.prismheightEditText);
        prismWidthEditText = findViewById(R.id.prismwidthEditText);
        sphereBtn = findViewById(R.id.prismBtn);

        sphereBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String length = prismEditText.getText().toString();
                double l = Double.parseDouble(length);
                String height = prismHeightEditText.getText().toString();
                double h = Double.parseDouble(height);
                String width = prismWidthEditText.getText().toString();
                double w = Double.parseDouble(width);
                double volume = l*h*w;
                resultTxt.setText("V = "+ volume +" m3");
            }
        });

    }
}