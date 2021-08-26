package com.example.earthquakereport;
public class Earthquake {
private final Double mMagnitude;
private final String mLocation;
private final Long mTimeInMilliseconds;
private final String mUrl;

    // Class constructor which take Double, String and Long as a arguments
   public Earthquake(Double Magnitude, String Location , Long TimeInMilliseconds, String Url){

       // Here setting global variables value to the argument received
       this.mMagnitude =Magnitude;
       this.mLocation = Location;
       this.mTimeInMilliseconds =TimeInMilliseconds;
       this.mUrl = Url;
    }

    /**
     * * @return the Magnitude in double format (eg : 7.21 )
     */
    public Double getMagnitude() {
       return mMagnitude;
    }

    /**
     * * @return  the time long format, in Unix time stamp (eg ;121212123123)
     */
    public Long getTimeInMilliseconds() {
       return mTimeInMilliseconds;
    }

    /**
     * * @return the location in String format (Eg: 88Km N of Yelizovo, Russia )
     */
    public String getLocation() {
       return mLocation;
    }
    /**
     * * @return the url in String format
     * (Eg: http://earthquake.usgs.gov/fdsnws/event/1/query?eventid=us20004uks&format=geojson)
     */

    public String getUrl() {
        return mUrl;
    }
}
