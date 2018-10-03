/**
 * HappyMood
 *
 * @Version: 1.0
 * @Date: Oct 2, 2018
 */
package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * This class is a subclass of the Current Mood, and
 */
public class HappyMood extends CurrentMood {
    String MoodMessage = new String();
    private Date MoodDate;
    private String Mood;

    /** Generic constructor that creates a Happy Mood object. */
    HappyMood() {
        super();
        this.Mood = "This mood is happy!";
    }

    /**
     * Constructor that takes date as ana argument and creates a Happy mood object.
     *
     * @Argument: date
     */
    HappyMood(Date MoodDate) {
        super(MoodDate);
        this.Mood = "This mood is happy!";
    }

}
