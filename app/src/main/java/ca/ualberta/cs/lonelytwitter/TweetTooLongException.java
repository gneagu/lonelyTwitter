/**
 * TweetTooLongException
 *
 * @Version: 1.0
 * @Date: Oct 2, 2018
 */
package ca.ualberta.cs.lonelytwitter;

/** Simple exception that lists the message to be returned when the exception is triggered.*/
public class TweetTooLongException extends Exception {

    TweetTooLongException() {
        super("The message is too long! Please keep your tweets within 140 characters.");
    }
}
