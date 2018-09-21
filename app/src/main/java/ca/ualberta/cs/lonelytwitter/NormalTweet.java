package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class NormalTweet extends Tweet {

    private ArrayList<String> MoodList = new ArrayList<String>();
    NormalTweet() {
        super();
    }

    NormalTweet(String message) {
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return false;
    }
}
