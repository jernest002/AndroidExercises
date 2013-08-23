package com.example.geoquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class BookAppsActivity extends Activity {

	private Button mBookApp1;
	private Button mBackButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_book_apps);
		
		mBookApp1 = (Button) findViewById(R.id.book_app1_button);
		mBookApp1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(BookAppsActivity.this, QuizActivity.class);
				startActivity(i);
			}
		});
		
		mBackButton = (Button) findViewById(R.id.back_button);
		mBackButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(BookAppsActivity.this, MainMenuActivity.class);
				startActivity(i);
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.book_apps, menu);
		return true;
	}

}
