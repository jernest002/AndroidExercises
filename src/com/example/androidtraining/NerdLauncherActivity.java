package com.example.androidtraining;

import android.support.v4.app.Fragment;

public class NerdLauncherActivity extends SingleFragmentActivity {

	@Override
	protected Fragment createFragment() {
		return new NerdLauncherFragment();
	}

}
