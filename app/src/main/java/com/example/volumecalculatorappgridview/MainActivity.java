package com.example.volumecalculatorappgridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<ShapeModelClass> data;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Grid view
        gridView = findViewById(R.id.gridView);

        // Data Source
        data = new ArrayList<>();
        data.add(new ShapeModelClass(R.drawable.sphere, "Sphere"));
        data.add(new ShapeModelClass(R.drawable.cylinder, "Cylinder"));
        data.add(new ShapeModelClass(R.drawable.cube, "Cube"));
        data.add(new ShapeModelClass(R.drawable.prism, "Prism"));

        // Adapter
        adapter = new CustomAdapter(getApplicationContext(), data);
        gridView.setAdapter(adapter);
        // Handling the click event
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(adapter.getItem(position).getShapeName().equals("Sphere")) {
                    Intent i = new Intent(getApplicationContext(), SphereActivity.class);
                    startActivity(i);
                }else if (adapter.getItem(position).getShapeName().equals("Cylinder")) {
                    Intent i = new Intent(getApplicationContext(), CylinderActivity.class);
                    startActivity(i);
                }else if(adapter.getItem(position).getShapeName().equals("Cube")) {
                    Intent i = new Intent(getApplicationContext(), CubeActivity.class);
                    startActivity(i);
                }else if(adapter.getItem(position).getShapeName().equals("Prism")) {
                    Intent i = new Intent(getApplicationContext(), PrismActivity.class);
                    startActivity(i);
                }
            }
        });

    }
}