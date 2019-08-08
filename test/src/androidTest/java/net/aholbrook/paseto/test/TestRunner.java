package net.aholbrook.paseto.test;

import android.app.Application;
import android.content.Context;
import android.support.test.runner.AndroidJUnitRunner;

public class TestRunner extends AndroidJUnitRunner {
	@Override
	public Application newApplication(ClassLoader cl, String className, Context context) throws ClassNotFoundException
			, IllegalAccessException, InstantiationException {
		return super.newApplication(cl, TestApplication.class.getName(), context);
	}
}
