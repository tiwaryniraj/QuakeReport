package com.example.android.quakereport;

public class Earthquake {
    private Double mMagnitude ;
    private String mLocation;
    private Long mTimeInMilliseconds;
    private String mUrl;


    public Earthquake(Double mMagnitude, String mLocation, Long mDate, String url) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTimeInMilliseconds = mDate;
        this.mUrl = url;

    }

    public String getmUrl() {
        return mUrl;
    }

    public Double getMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public Long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
