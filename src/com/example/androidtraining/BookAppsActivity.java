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
	private Button mBookApp3;
	private Button mBookApp4;
	private Button mBookApp5;
	private Button mBookApp6;
	private Button mBookApp7;
	
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
		
		
		mBookApp2 = (Button) findViewById(R.id.book_app2_button);
		mBookApp2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent i = new Intent(BookAppsActivity.this, CrimeListActivity.class);
				startActivity(i);
			}
		});
		
		mBookApp3 = (Button) findViewById(R.id.book_app3_button);
		mBookApp3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(BookAppsActivity.this, HelloMoonActivity.class);
				startActivity(i);
			}
		});
		
		mBookApp4 = (Button) findViewById(R.id.book_app4_button);
		mBookApp4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(BookAppsActivity.this, NerdLauncherActivity.class);
				startActivity(i);
			}
		});
		
		mBookApp5 = (Button) findViewById(R.id.book_app5_button);
		mBookApp5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(BookAppsActivity.this, RemoteControlActivity.class);
				startActivity(i);
			}
		});
		
		mBookApp6 = (Button) findViewById(R.id.book_app6_button);
		mBookApp6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(BookAppsActivity.this, PhotoGalleryActivity.class);
				startActivity(i);
			}
		});
		mBookApp7 = (Button) findViewById(R.id.book_app7_button);
		mBookApp7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent i = new Intent(BookAppsActivity.this, DragAndDrawActivity.class);
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
