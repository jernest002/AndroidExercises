package com.example.androidtraining;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class BookAppsActivity extends Activity {

	private Button mBookApp1;
	private Button mBookApp2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_book_apps);
		
		mBookApp1 = (Button) findViewById(R.id.book_app1_button);
		mBookApp1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(BookAppsActivity.this, Ch1_QuizActivity.class);
				startActivity(i);
			}
		});
		
		
		mBookApp2 = (Button) findViewById(R.id.book_app2_button);
		mBookApp2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent i = new Intent(BookAppsActivity.this, Ch7_CrimeActivity.class);
				startActivity(i);
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
