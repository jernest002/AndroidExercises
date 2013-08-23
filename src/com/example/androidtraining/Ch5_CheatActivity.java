package com.example.androidtraining;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ch5_CheatActivity extends Activity {
	
	public static final String EXTRA_ANSWER_IS_TRUE =
			"com.bignerdranch.android.geoquiz.answer_is_true";
	public static final String EXTRA_ANSWER_SHOWN =
			"com.bignerdranch.android.geoquiz.answer_shown";
	public static final String ANSWER_SHOWN = "isAnswerShown";
	
	private boolean mAnswerIsTrue;
	private boolean mIsAnswerShown;
	
	private TextView mAnswerTextView;
	private Button mShowAnswer;
	
	private void setAnswerShownResult(boolean isAnswerShown) {
		Intent data = new Intent();
		Log.d("setAnswerShownResult", " " + isAnswerShown + " / mIsAnswerShown : " + mIsAnswerShown);
		data.putExtra(EXTRA_ANSWER_SHOWN, isAnswerShown);
		setResult(RESULT_OK, data);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cheat);
		
		if(savedInstanceState != null){
			mIsAnswerShown = savedInstanceState.getBoolean(ANSWER_SHOWN, false);
		}
		
		mAnswerIsTrue = getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE, false);
		mAnswerTextView = (TextView) findViewById(R.id.answerTextView);
		
		mShowAnswer = (Button) findViewById(R.id.showAnswerButton);
		
		if(mIsAnswerShown == false){
			setAnswerShownResult(false);
		} else {
			mAnswerTextView.setText(R.string.true_button);
			setAnswerShownResult(true);
		}
		
		mShowAnswer.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (mAnswerIsTrue) {
					mAnswerTextView.setText(R.string.true_button);
				} else {
					mAnswerTextView.setText(R.string.false_button);
				}
				mIsAnswerShown = true;
				setAnswerShownResult(true);
			}
		});
	}
	
	@Override
	public void onSaveInstanceState(Bundle savedInstanceState) {
		super.onSaveInstanceState(savedInstanceState);
		savedInstanceState.putBoolean(ANSWER_SHOWN, mIsAnswerShown);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ch5___cheat, menu);
		return true;
	}

}
