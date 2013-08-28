package com.example.androidtraining;

import java.util.UUID;

import android.support.v4.app.Fragment;

public class Ch7_CrimeActivity extends SingleFragmentActivity {

	@Override
	protected Fragment createFragment() {
		UUID crimeId = (UUID)getIntent()
				.getSerializableExtra(CrimeFragment.EXTRA_CRIME_ID);
			return CrimeFragment.newInstance(crimeId);
	}
}
