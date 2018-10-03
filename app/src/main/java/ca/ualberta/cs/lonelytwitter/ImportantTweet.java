/**
 * ImportantTweet
 *
 * @Version: 1.0
 * @Date: Oct 2, 2018
 */
package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

/** Child class of Tweet, which creates tweets.*/
public class ImportantTweet extends Tweet {

    /** Generic Constructor that takes no arguments and creates a Important Tweet object.*/
    ImportantTweet() {
        //Call the parent constructor to: avoid duplication!
        super();
    }

    /** Constructor that takes a string as an argument and creates an Important Tweet Object.*/
    ImportantTweet(String message) {
        super(message);
    }

    @Override
    /** Simple function that returns false. */
    public Boolean isImportant() {
        return true;
    }
}
