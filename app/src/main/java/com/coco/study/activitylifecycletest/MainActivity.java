package com.coco.study.activitylifecycletest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "========== onCreate ========== ");
        Button startNormalActivityBtn = findViewById(R.id.start_normal_activity);
        Button startDialogActivity = findViewById(R.id.start_dialog_activity);
        startNormalActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NormalActivity.class);
                startActivity(intent);
            }
        });
        startDialogActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(intent);
            }
        });

        // 活动被系统回收之前放入的数据在这里获取
        if (null != savedInstanceState) {
            String dataKey = savedInstanceState.getString("data_key");
            Log.d(TAG, "onCreate:savedInstanceState:data_key: " + dataKey);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "========== onStart ========== ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "========== onResume ========== ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "========== onPause ========== ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "========== onStop ========== ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "========== onDestroy ========== ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "========== onRestart ========== ");
    }

    /**
     * 活动被系统回收之前调用此方法
     * 1. 活动处于停滞状态
     * 2. 手机内存不足，活动有可能会被回收
     * @param outState
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String tempData = "这是MainActivity活动被系统回收之前，留下的数据";
        outState.putString("data_key", tempData);

    }
}
