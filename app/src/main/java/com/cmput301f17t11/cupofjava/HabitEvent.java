package com.cmput301f17t11.cupofjava;

import android.graphics.Bitmap;
import android.location.Location;

import java.util.Date;

public class HabitEvent {
    //TODO: optional photograph
    private Habit habitObject;
    private String comment; //TODO: ensure no more than 20 chars
    private Date habitEventDate;
    private Geolocation location;
    private boolean locationSet = false;
    private Bitmap photo;
    public HabitEvent(Habit habit){
        this.habitObject = habit;
        this.habitEventDate = new Date();
    }

    /**
     * Constructor for HabitEvent
     * @param habit
     * @param comment
     */
    public HabitEvent(Habit habit, String comment){
        this.habitObject = habit;
        this.comment = comment;
    }
    //TODO: constructor for optional comment and optional photograph
    //public  HabitEvent(Habit habit, String comment, )

    //TODO: constructor for optional photograph

    //TODO: Constructor for optional location

    // this method was added by eshna
    public Habit getHabitObject()
    {
        return this.habitObject;
    }


    public String getHabitTitle(){
        return this.habitObject.getHabitTitle();
    }

    public String getHabitReason(){
        return this.getHabitReason();
    }

    public Date getHabitEventDate(){
        return this.habitEventDate;
    }

    public void setHabitEventDateToCurrent(){
        this.habitEventDate = new Date();
    } //TODO: Perhaps custom date setter needed as well?

    public void setComment(String comment){
        this.comment = comment;
    }

    public String getComment(){
        return this.comment;
    }


    public void setLocation(Geolocation location){
        this.location = location;

    }

    public Geolocation getLocation() {
        return this.location;
    }


    public boolean hasLocation(){
        if(this.location!=null) {
            locationSet = true;
        }
        return locationSet;
    }

    public void setPhoto(Bitmap photo) {
        this.photo = photo;
    }

    public Bitmap getPhoto(){
        return this.photo;
    }
    public boolean hasPhoto(){
        return true;
    }
}
