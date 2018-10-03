/**
 * SadMood
 *
 * @Version: 1.0
 * @Date: Oct 2, 2018
 */
package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Subclass of CurrentMood which employs its functions.
 */
public class SadMood extends CurrentMood {

    private String MoodMessage = new String(); // String that contains a message
    private Date MoodDate; // value that keeps a date
    private String Mood; // string that keeps the mood

    /**
     * Generic Constructor that creates a sad mood object.
     */
    SadMood() {
        super();
        this.Mood  = "This mood is sad!";
    }

    /**
     * Constructor that takes a date as an argument and creates an object with this atriubte.
     * @variable:  MoodDate
     */
    SadMood(Date MoodDate) {
        super(MoodDate);
        this.Mood  = "This mood is sad!";
    }

}
