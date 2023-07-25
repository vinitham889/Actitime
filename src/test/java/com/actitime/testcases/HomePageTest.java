package com.actitime.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.base.TestBase;
import com.actitime.pages.HomePage;
import com.actitime.pages.LoginPage;
import com.actitime.util.TestUtil;

public class HomePageTest extends TestBase{
	 LoginPage loginpage;
	 HomePage homePage;
	 TestUtil testUtil;

	public HomePageTest() throws IOException {
		super();
	}
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException
	{
		initialization();
		testUtil = new TestUtil();
	    loginpage = new LoginPage();
	    homePage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	    Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void capacityPlanningTest() throws InterruptedException
	{
		testUtil.eventScroll();
		homePage.clickOnCapacityPlanning();
		homePage.clickOnStatus();
		homePage.clickOnPlanningBtn();
		homePage.clickOndeadLineDateBtn();
		homePage.clickOnSpecficDate();
		homePage.clickOnBillableStatus();
		homePage.clickOnManagement();
		homePage.clickOnEnterHour();
		
	}
	/*@Test(priority=2)
	public void clickOnStatusTest()
	{
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}*/
	
}
