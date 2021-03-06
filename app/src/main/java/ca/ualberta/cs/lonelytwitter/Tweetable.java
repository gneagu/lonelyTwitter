/**
 * Tweetable
 *
 * @Version: 1.0
 * @Date: Oct 2, 2018
 */
package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/** Simple interface that dictates which functions child classes should implement.*/
public interface Tweetable {
    public String getMessage();
    public Date getDate();
}
