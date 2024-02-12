package com.example.volumecalculatorappgridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<ShapeModelClass> {

    // Attributes
    Context context;
    private ArrayList<ShapeModelClass> data;

    // Constructor
    public CustomAdapter(Context context, ArrayList<ShapeModelClass> data) {
        super(context, R.layout.grid_item_layout, data);
        this.context = context;
        this.data = data;
    }

    // View Holder
    public static class ViewHolder {
        ImageView shapeImg;
        TextView shapeName;
    }

    // Overriding the getView method
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ShapeModelClass dataModel = getItem(position);

        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();

            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.grid_item_layout, parent, false);

            viewHolder.shapeImg = convertView.findViewById(R.id.shapeImg);
            viewHolder.shapeName = convertView.findViewById(R.id.shapeName);

            convertView.setTag(viewHolder);

        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.shapeImg.setImageResource(dataModel.getShapeImg());
        viewHolder.shapeName.setText(dataModel.getShapeName());

        return convertView;

    }
}
