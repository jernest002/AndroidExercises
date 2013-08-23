package com.example.geoquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends Activity {
	
	private Button mFromBookButton;
	private Button mExercisesButton;
	private Button mExitButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_menu);
		
		mFromBookButton = (Button) findViewById(R.id.from_book_button);
		mFromBookButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainMenuActivity.this, BookAppsActivity.class);
				startActivity(i);
			}
		});
		
		mExercisesButton = (Button) findViewById(R.id.from_spreadsheet_button);
		mExercisesButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(MainMenuActivity.this, ExerciseAppsActivity.class);
				startActivity(i);
			}
		});
		
		mExitButton = (Button) findViewById(R.id.exit_button);
		mExitButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_menu, menu);
		return true;
	}

}
