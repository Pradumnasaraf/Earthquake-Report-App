package com.example.earthquakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Context context,  ArrayList<Earthquake> myClass) {
        super(context ,0, myClass);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       // check if there is an existing list item view (Convert view) that we can reuse
        // otherwise , if convertView is null then inflate a new list item layout.

        View listItemView = convertView;
        if (listItemView ==null){
            listItemView = LayoutInflater.from(getContext())
                    .inflate(R.layout.list_item,parent,false);
        }

        // Find the earthquake at the given position in the list of earthquake.
        Earthquake currentEarthquake = getItem(position);

        //Find TextView with view id magnitude
        TextView magnitudeView = listItemView.findViewById(R.id.magnitude);
        //Display the magnitude of the current earthquake in that view
        magnitudeView.setText(currentEarthquake.getMagnitude());

        //Find TextView with view id magnitude
        TextView locationView = listItemView.findViewById(R.id.location);
        //Display the magnitude of the current earthquake in that view
        locationView.setText(currentEarthquake.getLocation());

        //Find TextView with view id magnitude
        TextView dateView = listItemView.findViewById(R.id.date);
        //Display the magnitude of the current earthquake in that view
        dateView.setText(currentEarthquake.getDate());

        // Return the list item view
        return listItemView;


    }
}
