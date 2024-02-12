package com.example.volumecalculatorappgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CubeActivity extends AppCompatActivity {

    TextView cubeTxt, resultTxt;
    EditText cubeEditText;
    Button cubeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        cubeTxt = findViewById(R.id.cubeTxt);
        resultTxt = findViewById(R.id.cubeResultTxt);
        cubeEditText = findViewById(R.id.cubeEditTxt);
        cubeBtn = findViewById(R.id.cubeBtn);

        cubeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String slide = cubeEditText.getText().toString();
                double s = Double.parseDouble(slide);
                double volume = s * s * s;
                resultTxt.setText("V = "+ volume +" m3");
            }
        });


    }
}