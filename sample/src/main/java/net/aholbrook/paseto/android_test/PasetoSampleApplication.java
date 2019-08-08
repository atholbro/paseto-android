package net.aholbrook.paseto.android_test;

import android.app.Application;

import com.jakewharton.threetenabp.AndroidThreeTen;

public class PasetoSampleApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		AndroidThreeTen.init(this);
	}
}
