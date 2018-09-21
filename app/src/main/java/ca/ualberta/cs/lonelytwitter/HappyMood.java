package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class HappyMood extends CurrentMood {
    String MoodMessage = new String();
    private Date MoodDate;
    private String Mood;

    HappyMood() {
        super();
        this.Mood = "This mood is happy!";
    }

    HappyMood(Date MoodDate) {
        super(MoodDate);
        this.Mood = "This mood is happy!";
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

    public void setMoodType() { this.Mood = "This mood is happy!"; }

}
