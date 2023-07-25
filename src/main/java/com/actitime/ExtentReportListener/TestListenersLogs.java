package com.actitime.ExtentReportListener;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.logging.Logs;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.actitime.util.TestUtil;



public class TestListenersLogs extends TestUtil implements ITestListener {

	public TestListenersLogs() throws IOException {
		super();
	}
	public void onTestStart(ITestResult result) {
//		Logs.info(result.getMethod().getMethodName() + " Started");
	}
	public void onTestSuccess(ITestResult result) {
//		Logs.info(result.getMethod().getMethodName() + " Passed");				
	}
	public void onTestFailure(ITestResult result) {
//		Logs.info("Failed because of - "+ result.getThrowable());
		try {
			takeScreenshotAtEndOfTest(result.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void onTestSkipped(ITestResult result) {
//		Logs.info("Skipped because of - "+ result.getThrowable());		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub		
	}
	public void onStart(ITestContext context) {
		
 String screenshotFolderPath = ".//screenshots/"; // Provide the actual path
        deleteFolder(screenshotFolderPath);

	}
	private void deleteFolder(String folderPath) {
        try {
            Path path = Paths.get(folderPath);
            Files.walk(path)
                    .map(Path::toFile)
                    .forEach(File::delete);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	public void onFinish(ITestContext context) {
//		Logs.info("=========== onFinish :-" + context.getName() + "===============");

	}

}
