package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

public abstract class CurrentMood implements MoodInterface{
    private Date MoodDate;
    private String Mood;

    CurrentMood(){
        this.Mood = new String();
        this.MoodDate = new Date();
    }

    CurrentMood(Date date){
        this.Mood = new String();
        this.MoodDate = date;
    }

    public String getMood() {
        return this.Mood;
    }

    public void setMood(String Mood) {
        this.Mood = Mood;
    }

}
