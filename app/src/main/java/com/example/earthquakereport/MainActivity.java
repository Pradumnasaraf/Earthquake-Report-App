package com.example.earthquakereport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Get teh List of Earthquakes from {@Link QueryUtlis}
        ArrayList<Earthquake> earthquakes = QueryUtils.extractEarthquakes();

        // Find Listview by its id
        ListView earthquakeListView = findViewById(R.id.listView);

        // Creating an object of custom array adapter {@EarthquakeAdapter}
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);

        // Set the adapter on the {@link ListView}
        earthquakeListView.setAdapter(adapter);

    }
}