package com.ecocity.app;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class StatsActivity extends AppCompatActivity {

    private int recycleCount = 0;
    private static final String RECYCLE_COUNT_KEY = "recycleCount";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);

        if (savedInstanceState != null) {
            recycleCount = savedInstanceState.getInt(RECYCLE_COUNT_KEY, 0);
        }

        TextView tvRecycleCount = findViewById(R.id.tvRecycleCount);
        tvRecycleCount.setText(getString(R.string.recycled_bags_count, recycleCount));

        findViewById(R.id.btnAddBag).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recycleCount++;
                tvRecycleCount.setText(getString(R.string.recycled_bags_count, recycleCount));
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(RECYCLE_COUNT_KEY, recycleCount);
    }
}