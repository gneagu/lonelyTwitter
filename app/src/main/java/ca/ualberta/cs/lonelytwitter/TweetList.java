package ca.ualberta.cs.lonelytwitter;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.Collections;

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public boolean hasTweet(Tweet tweet) {
       return tweets.contains(tweet);

    }

    public void addTweet(Tweet tweet) {
        if (this.hasTweet(tweet)) {
            throw new IllegalArgumentException("Tweet already exists");
        } else {
            tweets.add(tweet);
        }
    }

    public void add(Tweet tweet) {
        tweets.add(tweet);
    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }

    public void delete(Tweet tweet) {
        tweets.remove(tweet);
    }

    //ArrayList keeps chronological order
    public ArrayList getList() {
        return tweets;
    }

    public Integer getCount() {
        Integer size = tweets.size();
        return size;

    }

    public ArrayList getTweets() {
        Collections.sort(tweets);
        return tweets;

    }

    /*
    addTweet() -- should throw an IllegalArgumentException when one tries to add a duplicate tweet
    getTweets() -- sould return a list of tweets in chronological order
    hasTweet() -- should return true if there is a tweet that equals() another tweet
    getCount() -- should accurately count up the tweets
     */


}
