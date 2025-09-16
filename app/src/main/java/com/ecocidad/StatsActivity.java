package com.ecocidad;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StatsActivity extends AppCompatActivity {

    private static final String TAG = "StatsActivity";
    private static final String KEY_RECYCLE_COUNT = "recycle_count";
    
    private int recycleCount = 0;
    private TextView tvRecycleCount;
    private Button btnAddBag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);
        Log.d(TAG, "onCreate called");
        
        // Enable up navigation
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        
        // Initialize views
        tvRecycleCount = findViewById(R.id.tvRecycleCount);
        btnAddBag = findViewById(R.id.btnAddBag);
        
        // Restore saved state if available
        if (savedInstanceState != null) {
            recycleCount = savedInstanceState.getInt(KEY_RECYCLE_COUNT, 0);
            Log.d(TAG, "Restored recycle count: " + recycleCount);
        }
        
        updateRecycleCountDisplay();
        
        // Set click listener for the button
        btnAddBag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Add bag button clicked - count before: " + recycleCount);
                recycleCount++;
                Log.d(TAG, "Add bag button clicked - count after: " + recycleCount);
                updateRecycleCountDisplay();
            }
        });
    }

    private void updateRecycleCountDisplay() {
        String countText = getString(R.string.recycle_count, recycleCount);
        tvRecycleCount.setText(countText);
        Log.d(TAG, "Updated display with count: " + recycleCount);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_RECYCLE_COUNT, recycleCount);
        Log.d(TAG, "onSaveInstanceState called - saving count: " + recycleCount);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop called");
    }
}