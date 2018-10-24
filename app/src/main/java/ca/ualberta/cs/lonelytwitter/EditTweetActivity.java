package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class EditTweetActivity extends Activity {
    private TextView bodyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        bodyText = (TextView) findViewById(R.id.textView);

        String toShow = getIntent().getStringExtra("NAME");

        displayText(toShow);
    }

    protected void displayText(String textToBeShown) {

        bodyText.setText(textToBeShown);
    }
}
