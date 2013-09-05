package com.example.androidtraining;

import android.support.v4.app.Fragment;

public class RunMapActivity extends SingleFragmentActivity {
	/** A key for passing a run ID as a long */
	public static final String EXTRA_RUN_ID =
			"com.example.androidtraining.run_id";

	@Override
	protected int getLayoutResId() {
		// TODO Auto-generated method stub
		return R.layout.fragment_map;
	}

	@Override
	protected Fragment createFragment() {
		long runId = getIntent().getLongExtra(EXTRA_RUN_ID, -1);
		if (runId != -1) {
			return RunMapFragment.newInstance(runId);
		} else {
			return new RunMapFragment();
		}
	}
}
