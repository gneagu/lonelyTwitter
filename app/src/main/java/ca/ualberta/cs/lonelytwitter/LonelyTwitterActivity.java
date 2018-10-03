/**
 * LonelyTwitterActivity
 *
 * @Version: 1.0
 * @Date: Oct 2, 2018
 */
package ca.ualberta.cs.lonelytwitter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class LonelyTwitterActivity extends Activity {

	private static final String FILENAME = "file.sav"; //name of the file where data;s saved to disk
	private EditText bodyText; // implemented EditText object
	private ListView oldTweetsList; // implemented ListView object

	ArrayList<Tweet> tweetList; // arraylist of type tweet
	ArrayAdapter<Tweet> adapter; // arrayAdapter for the tweet object

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState); // ??
		setContentView(R.layout.main); // Specifies the content view in use


		bodyText = (EditText) findViewById(R.id.body); // specifies the id of the editText object
		Button saveButton = (Button) findViewById(R.id.save); // specifies the id of the saveButton
		Button clearButton = (Button) findViewById(R.id.clear); // specifies the id of the clearButton
		oldTweetsList = (ListView) findViewById(R.id.oldTweetsList); // specifies the id of the listView

		/** Listener for the save button. Code inside is run when the button is interacted. */
		saveButton.setOnClickListener(new View.OnClickListener() {

			/** Code inside this function is run when the button is used */
			public void onClick(View v) {
				setResult(RESULT_OK);
				String text = bodyText.getText().toString();

				Tweet tweet = new NormalTweet(text);
				tweetList.add(tweet);


				saveInFile();
				adapter.notifyDataSetChanged();

			}
		});

		/** Listener for the clear Button.*/
        clearButton.setOnClickListener(new View.OnClickListener() {

			/** Code that is run when the clear button is used. */
            public void onClick(View v) {
                setResult(RESULT_OK);

                tweetList.clear();

                saveInFile();
				adapter.notifyDataSetChanged();

			}
        });
	}

	@Override
	/** Code run when the app is started/ */
	protected void onStart() {
		super.onStart();

		loadFromFile();
//    adapter.notifyDataSetChanged();


		adapter = new ArrayAdapter<Tweet>(this,
				R.layout.list_item, tweetList);
		oldTweetsList.setAdapter(adapter);
	}

	/** Code run to read data from the save file */
	private void loadFromFile() {

		try {
			FileInputStream fis = openFileInput(FILENAME);
			BufferedReader in = new BufferedReader(new InputStreamReader(fis));

			Gson gson = new Gson(); //library to save objects
			Type listType = new TypeToken<ArrayList<NormalTweet>>(){}.getType();

			tweetList = gson.fromJson(in, listType);

		} catch (FileNotFoundException e) {
			tweetList = new ArrayList<Tweet>();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/** Code run to write data to the save file. */
	private void saveInFile() {
		try {

			FileOutputStream fos = openFileOutput(FILENAME,
					Context.MODE_PRIVATE);

			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos));

			Gson gson = new Gson();
			gson.toJson(tweetList, out);
			out.flush();

			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
