package de.henry.poetzl;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class QwkActivity extends Activity {

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        // Make sure we're running on Honeycomb or higher to use ActionBar APIs
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            // For the main activity, make sure the app icon in the action bar
            // does not behave as a button
            ActionBar actionBar = getActionBar();
            actionBar.setHomeButtonEnabled(false);
        }
        
        EditText searchBox = (EditText) findViewById(R.id.search_box);
        searchBox.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				showAdvancedSearchOptions(view);
			}
		});
    }
    
    private void onSearchButtonClicked(View view) {
    	
    }
    
    private void showAdvancedSearchOptions(View view) {
    	
    }

    @Override
    public void onDestroy() {
        super.onDestroy(); 
        // Stop method tracing that the activity started during onCreate()
        android.os.Debug.stopMethodTracing();
    }
}