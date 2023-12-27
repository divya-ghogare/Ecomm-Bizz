package Utility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import BaseClass.Base_Class;

public class Listeners extends Base_Class implements ITestListener {

	public Listeners() throws IOException {
		super();
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test has been started:-"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test has been passed:-"+result.getName());
		try {
			Capture_Images.takescreen_passed(driver, result.getName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test has been failed:-"+result.getName());
		try {
			Capture_Images.takescreen_failure(driver, result.getName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test has been skipped:-"+result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
        System.out.println("execution started:- ");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("execution finished:- ");
	}
	

}
