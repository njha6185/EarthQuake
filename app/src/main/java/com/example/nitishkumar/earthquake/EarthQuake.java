package com.example.nitishkumar.earthquake;

public class EarthQuake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;

    private String mUrl;

    public EarthQuake(double mMagnitude, String mLocation, long mTimeInMilliseconds, String mUrl)
    {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
        this.mUrl = mUrl;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getmUrl() {
        return mUrl;
    }
}