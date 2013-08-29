package com.example.androidtraining;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class HelloMoonFragment extends Fragment {
	private AudioPlayer mPlayer = new AudioPlayer();
	
	private Button mPlayButton;
	private Button mPauseButton;
	private Button mStopButton;
	
	private Button mPlayVidButton;
	private Button mPauseVidButton;
	private Button mStopVidButton;
	
	private boolean isPlaying;
	private boolean isPaused;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup parent,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_hello_moon, parent, false);
		
		mPlayButton = (Button)v.findViewById(R.id.hellomoon_playButton);
		mPlayButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				isPlaying = true;
				mPlayer.play(getActivity());
			}
		});
		
		mPauseButton = (Button) v.findViewById(R.id.hellomoon_pauseButton);
		mPauseButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if(isPlaying && !isPaused){
					mPauseButton.setText(R.string.hellomoon_resume);
					isPaused = true;
				}
				else if(isPlaying && isPaused){
					mPauseButton.setText(R.string.hellomoon_pause);
					isPaused = false;
				}
				
				mPlayer.pause();
			}
		});
		
		mStopButton = (Button)v.findViewById(R.id.hellomoon_stopButton);
		mStopButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				if(isPlaying){
					mPauseButton.setText(R.string.hellomoon_pause);
					isPlaying = false;
					mPlayer.stop();
				}
			}
		});
		
		
		return v;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRetainInstance(true);
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		mPlayer.stop();
	}
}
