package com.example.earthquakereport;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Earthquake {
private final String LOCATION_SEPARATOR = " of ";
private String primaryLocation;
private String locationOffset;
private Double mMagnitude;
private String mLocation;
private Long mTimeInMilliseconds;

   public Earthquake(Double Magnitude, String Location , Long TimeInMilliseconds){
       this.mMagnitude =Magnitude;
       this.mLocation = Location;
       this.mTimeInMilliseconds =TimeInMilliseconds;
    }
    public String getMagnitude() {
        DecimalFormat formatter = new DecimalFormat("0.0");
        return formatter.format(mMagnitude);
    }

    public String getDate() {
       //Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.

        Date dateObject = new Date(mTimeInMilliseconds);
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }
    public String getTime() {
       //Return the formatted date string (i.e. "4:30 PM") from a Date object.
        Date dateObject = new Date(mTimeInMilliseconds);
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

    public String getLocationOffset() {

        if (mLocation.contains(LOCATION_SEPARATOR)) {
            String[]parts = mLocation.split(LOCATION_SEPARATOR);
            locationOffset = parts[0] + LOCATION_SEPARATOR;
            primaryLocation = parts[1];
        } else {
            locationOffset = "Near the";
            primaryLocation = mLocation;
        }
        return locationOffset;
    }
    public String getPrimaryLocation(){

        return primaryLocation;
    }







}
