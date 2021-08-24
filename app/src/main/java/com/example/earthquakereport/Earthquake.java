package com.example.earthquakereport;

public class Earthquake {

private String mMagnitude;
private String mLocation;
private String mDate;

   public Earthquake(String Magnitude, String Location , String Date){
       this.mMagnitude =Magnitude;
       this.mLocation = Location;
       this.mDate =Date;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getDate() {
        return mDate;
    }
}
