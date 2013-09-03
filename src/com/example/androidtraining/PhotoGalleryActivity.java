package com.example.androidtraining;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.Fragment;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.os.Build;

public class PhotoGalleryActivity extends SingleFragmentActivity {

	@Override
	protected Fragment createFragment() {
		return new PhotoGalleryFragment();
	}

}
