package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class SadMood extends CurrentMood {

    String MoodMessage = new String();
    private Date MoodDate;
    private String Mood;
//    Mood = "This mood is sad!" ;

    SadMood() {
        super();
        this.Mood  = "This mood is sad!";
    }

    SadMood(Date MoodDate) {
        super(MoodDate);
        this.Mood  = "This mood is sad!";
    }

    public Date getMoodDate() {
        return this.MoodDate;
    }

    public void setMoodDate(Date MoodDate) {
        this.MoodDate = MoodDate;
    }

    public String getMoodType() {
        return this.Mood;
    }

}
