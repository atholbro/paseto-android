package net.aholbrook.paseto.test;

import android.app.Application;

import com.jakewharton.threetenabp.AndroidThreeTen;

public class TestApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		AndroidThreeTen.init(this);
	}
}
