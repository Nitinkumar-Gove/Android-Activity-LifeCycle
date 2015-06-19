package com.nitingove.mylifecycle;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class LifecycleActivity extends ActionBarActivity {

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lifecycle);
		
		Toast.makeText(getApplicationContext(), "onCreate() Called", Toast.LENGTH_LONG).show();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lifecycle, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	// life cycle methods
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "onStart() Called", Toast.LENGTH_LONG).show();
		super.onStart();
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "onStop() Called", Toast.LENGTH_LONG).show();
		super.onStop();
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "onPause() Called", Toast.LENGTH_LONG).show();
		super.onPause();
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "onResume() Called", Toast.LENGTH_LONG).show();
		super.onResume();
	}
	
	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "onRestart() Called", Toast.LENGTH_LONG).show();
		super.onRestart();
	}
	
	
	
}
