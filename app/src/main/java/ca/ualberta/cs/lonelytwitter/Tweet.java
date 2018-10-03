/**
 * Tweet
 *
 * @Version: 1.0
 * @Date: Oct 2, 2018
 */
package ca.ualberta.cs.lonelytwitter;
 
import java.util.Date;

/**
 * Superclass of other tweets which contains that functions that are shared between them.
 */
public abstract class Tweet implements Tweetable {

    private Date date; // variable that keeps date
    private String message; // variable that keeps a string message
    private static final Integer MAX_CHARS = 140; // Strict integer of the character limit.

    /**Empty argument constructor with default values */
    Tweet() {
        //Must use the 'this' keyword in order to specify the current object message = message does nothing!
        this.date = new Date();
        this.message = "I am default message schwa!";
    }

    /**Overloading: so that we can specify the tweet content */
    Tweet(String message) {
        this.date = new Date();
        this.message = message;
    }

    /**
     * Function that returns a string of the message.
     *
     * @return: string
     */
    public String getMessage() {
        return this.message;
    }

    /** Function that sets the message of the tweet object. */
    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() <= this.MAX_CHARS ) {
            this.message = message;
        } else {
            throw new TweetTooLongException();
        }
    }
    /**
     * Function that returns the date
     *
     * @return: date
     */
    public Date getDate() { return this.date; }

    /**No method body implemented! We leave that up to the subclasses (they MUST implement it) */
    public abstract Boolean isImportant();

    @Override
    /**
     * Function that returns a string of the message.
     *
     * @return: string
     */
    public String toString() {
        return this.getMessage();
    }
}
