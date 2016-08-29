# ELog
Manage log output for android.

# Install

## By jitpack.io

```
	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
```

```
	dependencies {
	        compile 'com.github.aotian16:ELog:v1.0.0'
	}
```

## Or Download this project and import as a module

# Use

```java
package com.qefee.pj.testelog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.qefee.pj.testelog.util.ELog;
import com.qefee.pj.testelog.util.ELogStrategy;

public class MainActivity extends AppCompatActivity {

    /**
     * log tag for MainActivity
     */
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        all();
        none();
        onlyV();
        onlyD();
        onlyI();
        onlyW();
        onlyE();
        aboveV();
        aboveD();
        aboveI();
        aboveW();
        aboveE();
    }

    private void all() {
        Log.i(TAG, "all ------------------------------");
        ELog.setStrategy(ELogStrategy.ALL);
        ELog.v(TAG, "onCreate: v");
        ELog.d(TAG, "onCreate: d");
        ELog.i(TAG, "onCreate: i");
        ELog.w(TAG, "onCreate: w");
        ELog.e(TAG, "onCreate: e");
    }

    private void none() {
        Log.i(TAG, "none ------------------------------");
        ELog.setStrategy(ELogStrategy.NONE);
        ELog.v(TAG, "onCreate: v");
        ELog.d(TAG, "onCreate: d");
        ELog.i(TAG, "onCreate: i");
        ELog.w(TAG, "onCreate: w");
        ELog.e(TAG, "onCreate: e");
    }

    private void onlyV() {
        Log.i(TAG, "onlyV ------------------------------");
        ELog.setStrategy(ELogStrategy.ONLY_V);
        ELog.v(TAG, "onCreate: v");
        ELog.d(TAG, "onCreate: d");
        ELog.i(TAG, "onCreate: i");
        ELog.w(TAG, "onCreate: w");
        ELog.e(TAG, "onCreate: e");
    }

    private void onlyD() {
        Log.i(TAG, "onlyD ------------------------------");
        ELog.setStrategy(ELogStrategy.ONLY_D);
        ELog.v(TAG, "onCreate: v");
        ELog.d(TAG, "onCreate: d");
        ELog.i(TAG, "onCreate: i");
        ELog.w(TAG, "onCreate: w");
        ELog.e(TAG, "onCreate: e");
    }

    private void onlyI() {
        Log.i(TAG, "onlyI ------------------------------");
        ELog.setStrategy(ELogStrategy.ONLY_I);
        ELog.v(TAG, "onCreate: v");
        ELog.d(TAG, "onCreate: d");
        ELog.i(TAG, "onCreate: i");
        ELog.w(TAG, "onCreate: w");
        ELog.e(TAG, "onCreate: e");
    }

    private void onlyW() {
        Log.i(TAG, "onlyW ------------------------------");
        ELog.setStrategy(ELogStrategy.ONLY_W);
        ELog.v(TAG, "onCreate: v");
        ELog.d(TAG, "onCreate: d");
        ELog.i(TAG, "onCreate: i");
        ELog.w(TAG, "onCreate: w");
        ELog.e(TAG, "onCreate: e");
    }

    private void onlyE() {
        Log.i(TAG, "onlyE ------------------------------");
        ELog.setStrategy(ELogStrategy.ONLY_E);
        ELog.v(TAG, "onCreate: v");
        ELog.d(TAG, "onCreate: d");
        ELog.i(TAG, "onCreate: i");
        ELog.w(TAG, "onCreate: w");
        ELog.e(TAG, "onCreate: e");
    }

    private void aboveV() {
        Log.i(TAG, "aboveV ------------------------------");
        ELog.setStrategy(ELogStrategy.ABOVE_V);
        ELog.v(TAG, "onCreate: v");
        ELog.d(TAG, "onCreate: d");
        ELog.i(TAG, "onCreate: i");
        ELog.w(TAG, "onCreate: w");
        ELog.e(TAG, "onCreate: e");
    }

    private void aboveD() {
        Log.i(TAG, "aboveD ------------------------------");
        ELog.setStrategy(ELogStrategy.ABOVE_D);
        ELog.v(TAG, "onCreate: v");
        ELog.d(TAG, "onCreate: d");
        ELog.i(TAG, "onCreate: i");
        ELog.w(TAG, "onCreate: w");
        ELog.e(TAG, "onCreate: e");
    }

    private void aboveI() {
        Log.i(TAG, "aboveI ------------------------------");
        ELog.setStrategy(ELogStrategy.ABOVE_I);
        ELog.v(TAG, "onCreate: v");
        ELog.d(TAG, "onCreate: d");
        ELog.i(TAG, "onCreate: i");
        ELog.w(TAG, "onCreate: w");
        ELog.e(TAG, "onCreate: e");
    }

    private void aboveW() {
        Log.i(TAG, "aboveW ------------------------------");
        ELog.setStrategy(ELogStrategy.ABOVE_W);
        ELog.v(TAG, "onCreate: v");
        ELog.d(TAG, "onCreate: d");
        ELog.i(TAG, "onCreate: i");
        ELog.w(TAG, "onCreate: w");
        ELog.e(TAG, "onCreate: e");
    }

    private void aboveE() {
        Log.i(TAG, "aboveE ------------------------------");
        ELog.setStrategy(ELogStrategy.ABOVE_E);
        ELog.v(TAG, "onCreate: v");
        ELog.d(TAG, "onCreate: d");
        ELog.i(TAG, "onCreate: i");
        ELog.w(TAG, "onCreate: w");
        ELog.e(TAG, "onCreate: e");
    }
}
```

# Version

| No.  | Version | Detail        |
| :--: | :-----: | ------------- |
|  1   |  1.0.0  | First version |

# [LICENSE](https://github.com/aotian16/ELog/blob/master/LICENSE)

MIT