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

        //Find TextView with view id location
        TextView offsetLocationView = listItemView.findViewById(R.id.location_offset);
        //Display the location of the current earthquake in that view
        offsetLocationView.setText(currentEarthquake.getLocationOffset());

        //Find TextView with view id primary_location
        TextView primaryLocationView = listItemView.findViewById(R.id.primary_location);
        //Display the primary location of the current earthquake in that view
        primaryLocationView.setText(currentEarthquake.getPrimaryLocation());

        //Find TextView with view id date
        TextView dateView = listItemView.findViewById(R.id.date);
        //Display the date of the current earthquake in that view
        dateView.setText(currentEarthquake.getDate());

        //Find TextView with view id time
        TextView timeView = listItemView.findViewById(R.id.time);
        //Display the time of the current earthquake in that view
        timeView.setText(currentEarthquake.getTime());



        // Return the list item view
        return listItemView;


    }
}
