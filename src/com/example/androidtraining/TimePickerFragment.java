package com.example.androidtraining;

import java.util.Calendar;
import java.util.Date;

import com.example.androidtraining.R;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.widget.TimePicker;
import android.widget.TimePicker.OnTimeChangedListener;

public class TimePickerFragment extends DialogFragment {
	public static final String EXTRA_TIME =
			"com.bignerdranch.android.criminalintent.date";
	private Date mDate;
	
	public static TimePickerFragment newInstance(Date date) {
		Bundle args = new Bundle();
		args.putSerializable(EXTRA_TIME, date);
			
		TimePickerFragment fragment = new TimePickerFragment();
		fragment.setArguments(args);
		
		return fragment;
	}
	
	private void sendResult(int resultCode) {
		if (getTargetFragment() == null)
		return;
		
		Intent i = new Intent();
		i.putExtra(EXTRA_TIME, mDate);
		getTargetFragment()
		.onActivityResult(getTargetRequestCode(), resultCode, i);
	}
	
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState){
		mDate = (Date)getArguments().getSerializable(EXTRA_TIME);
		
		// Create a Calendar to get the year, month, and day
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(mDate);
		
		View v = getActivity().getLayoutInflater()
				.inflate(R.layout.dialog_time, null);
		
		TimePicker timePicker = (TimePicker)v.findViewById(R.id.dialog_time_timePicker);
		timePicker.setOnTimeChangedListener(new OnTimeChangedListener(){
			@Override
			public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
				Calendar c = Calendar.getInstance();
				c.set(Calendar.HOUR, hourOfDay);
				c.set(Calendar.MINUTE, minute);
				mDate.setTime(c.getTimeInMillis());
				
				getArguments().putSerializable(EXTRA_TIME, mDate);
		}});
		return new AlertDialog.Builder(getActivity())
			.setView(v)
			.setTitle(R.string.date_picker_title)
			.setPositiveButton(
					android.R.string.ok,
					new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							sendResult(Activity.RESULT_OK);
						}
					})
			.create();
	}
}
