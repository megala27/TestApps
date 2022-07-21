package com.module3;

import org.apache.poi.util.SystemOutLogger;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SuiteListener implements ISuiteListener {

	public void onStart(ISuite suite) {
		System.out.println("AM Started my suite");
	}

	public void onFinish(ISuite suite) {
		System.out.println("Am Finish my suite");
	}

	
}
