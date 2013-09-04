package com.example.androidtraining;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Menu;

public class DragAndDrawActivity extends SingleFragmentActivity {

	@Override
	protected Fragment createFragment() {
		return new DragAndDrawFragment();
	}

	
}
