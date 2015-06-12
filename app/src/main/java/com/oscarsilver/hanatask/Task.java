package com.oscarsilver.hanatask;

import android.location.Location;

/**
 * Created by oscarsilver on 11/06/15.
 */
public class Task {


    private Location mLocation;
    private String mDescription;
    private int mPriority;
    private String mDuration;
    private String mDeadline;
    private boolean mIsRepeatable = false;
    private boolean mIsGroup = false;
    private Task mParentGroup = null;

    public Task(Location location,
                String description,
                int priority,
                String duration,
                String deadline,
                boolean isRepeatable,
                boolean isGroup,
                Task parentGroup  ){

        mLocation = location;
        mDescription = description;
        mPriority = priority;
        mDuration = duration;
        mDeadline = deadline;
        mIsRepeatable = isRepeatable;
        mIsGroup = isGroup;
        mParentGroup = parentGroup;


    }

}
