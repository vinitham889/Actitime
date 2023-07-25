package com.actitime.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;

import com.actitime.base.TestBase;

public class TestUtil extends TestBase{
	
	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICIT_WAIT=10;

	public TestUtil() throws IOException {
		super();
		}
	public void eventScroll() throws InterruptedException
	{
		EventFiringWebDriver scroll = new EventFiringWebDriver(driver);
		scroll.executeScript("document.querySelector('div.contentScrollableWrapper').scrollTop=500");
		Thread.sleep(1000);
	}
	public static void takeScreenshotAtEndOfTest(String testName) throws IOException
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		//To get screenshot with time
//		FileUtils.copyFile(scrFile,new File(currentDir+"/screenshots/"+System.currentTimeMillis()+".png"));
		FileUtils.copyFile(scrFile,new File(currentDir+"/screenshots/"+testName+".png"));
	}

}
