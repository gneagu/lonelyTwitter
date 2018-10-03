/**
 * CurrentMood
 *
 * @Version: 1.0
 * @Date: Oct 2, 2018
 */
package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Abstract implementation of CurrentMood. This class serves as the superclass for the other mood
 * classes. This class provides the functions for the sub classes.
 */
public abstract class CurrentMood implements MoodInterface{
    private Date MoodDate; // Date of the CurrentMood object.
    private String Mood;   // String of the mood of the object.

    /**
     * Default constructor for CurrentMood which takes no arguments.
     */
    CurrentMood(){
        this.Mood = new String();
        this.MoodDate = new Date();
    }

    /**
     * Constructor for CurrentMood which takes date as an argument.
     */
    CurrentMood(Date date){
        this.Mood = new String();
        this.MoodDate = date;
    }

    /** Function that returns the Mood of a CurrentMood object. */
    public String getMood() {
        return this.Mood;
    }

    /** Function that sets the Mood of a CurrentMood object. */
    public void setMood(String Mood) {
        this.Mood = Mood;
    }

    /** Function that gets the date of a CurrentMood object. */
    public Date getMoodDate() {
        return this.MoodDate;
    }

    /** Function that sets the date of a CurrentMood object. */
    public void setMoodDate(Date MoodDate) {
        this.MoodDate = MoodDate;
    }

}
