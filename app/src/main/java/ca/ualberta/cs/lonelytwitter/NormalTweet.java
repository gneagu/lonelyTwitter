/**
 * NormalTweet
 *
 * @Version: 1.0
 * @Date: Oct 2, 2018
 */
package ca.ualberta.cs.lonelytwitter;

/**
 * Subclass of Tweet which creates NormalTweet objects.
 */
public class NormalTweet extends Tweet {

    /** Generic constructor which takes no arguments and creates a normal Tweet object.*/
    NormalTweet() {
        super();
    }

    /**
     * Constructor that takes message as an argument and creates a normal tweet object.
     *
     * @argument: message
     */
    NormalTweet(String message) {
        super(message);
    }

    @Override
    /** Simple function that returns false. */
    public Boolean isImportant() {
        return false;
    }
}
