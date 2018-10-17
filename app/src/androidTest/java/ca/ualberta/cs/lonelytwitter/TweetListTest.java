package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;
import java.util.Date;

public class TweetListTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>{
    public TweetListTest(){
        super(LonelyTwitterActivity.class);
    }

    // JUnit test methods for adding tweet into TweetList
    public void testTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("added tweet");
        tweetList.add(tweet);

        assertTrue((tweetList.hasTweet(tweet)));
    }

    // JUnit test method for checking whether a tweet is in the TweetList
    public void testHasTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("Hello");

        assertFalse(tweetList.hasTweet(tweet));

        tweetList.add(tweet);

        assertTrue(tweetList.hasTweet(tweet));
    }

    public void testGetTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("get tweet check");

        tweetList.add(tweet);
        Tweet retrievedTweet = tweetList.getTweet(0);

        assertEquals(retrievedTweet.getMessage(), tweet.getMessage());
        assertEquals(retrievedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("one for delete");

        tweetList.add(tweet);
        tweetList.delete(tweet);

        assertFalse(tweetList.hasTweet(tweet));
    }

    public void testAddTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("EXISTS");

        tweetList.addTweet(tweet);

    }

    public void testAddDuplicateTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("EXISTS");

        tweetList.addTweet(tweet);

        Boolean noError = Boolean.TRUE;

        try {
            tweetList.addTweet(tweet);
        } catch (Exception e) {
            noError = Boolean.FALSE;
        }

        assertFalse(noError);

    }

    public void testHasCount() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("EXISTS");

        tweetList.add(tweet);
        tweetList.add(tweet);
        tweetList.add(tweet);

        Integer listSize = tweetList.getCount();

        assertEquals(3, (int) listSize);

    }

    public void testGetTweets() {
        TweetList tweetList = new TweetList();

        Date oldDate = new Date();

        Tweet tweet3 = new NormalTweet("EXISTS3");
        Tweet tweet = new NormalTweet("EXISTS0");
        Tweet tweet2 = new NormalTweet(oldDate, "EXISTS2");
        Tweet tweet1 = new NormalTweet("EXISTS1");


        tweetList.add(tweet);
        tweetList.add(tweet1);
        tweetList.add(tweet2);
        tweetList.add(tweet3);

        TweetList newList = new TweetList();

        newList.add(tweet2);
        newList.add(tweet3);
        newList.add(tweet);
        newList.add(tweet1);


        assertEquals(tweetList, newList);


    }

}
