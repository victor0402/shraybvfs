package me.victor.shraybvfs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ShraybvfsActivity extends Activity {
	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void clickLogin(View view) {
		Intent fibochickenactivity = new Intent(view.getContext(), FiboChickenActivity.class);
		startActivity(fibochickenactivity);
	}
}
