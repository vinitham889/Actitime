package com.actitime.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.actitime.base.TestBase;
import com.actitime.pages.HomePage;
import com.actitime.pages.LoginPage;
import com.actitime.pages.TaskPage;

public class TestCases extends TestBase {
	public TestCases() throws IOException {
		super();
			}
	TaskPage testPage;
	LoginPage loginPage;
	HomePage homePage;
	@BeforeClass
	public void setUp() throws IOException, InterruptedException {
		
		initialization();
		testPage = new TaskPage();
		loginPage = new LoginPage();
		homePage = new HomePage();
	    //homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	    Thread.sleep(2000);
	 }
	@Test(priority=1)
	public void loginPageTitleTest() throws InterruptedException
	{
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "actiTIME - Login");	
		Thread.sleep(2000);
	}
	@Test(priority =2)
	public void logoImageTest()
	{
		boolean flag = loginPage.validateImage();
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void loginTest() throws IOException, InterruptedException
	{
		homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(10000);
	}
	@Test(priority=4)
	public void capacityPlanningTest() throws InterruptedException
	{
		homePage.clickOnCapacityPlanning();
		homePage.clickOnStatus();
		homePage.clickOnPlanningBtn();
		homePage.clickOndeadLineDateBtn();
		homePage.clickOnSpecficDate();
		homePage.clickOnBillableStatus();
		homePage.clickOnManagement();
		homePage.clickOnEnterHour();
		driver.findElement(By.xpath("/html/body/div[18]/div[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"container_tasks\"]")).click();
	    testPage.createNewCustomer();
        testPage.createNewProject();
        testPage.createNewTask();
	    testPage.custAndProjectTab();
	    testPage.copyToTask();
	    testPage.moveToTask();
        testPage.changeStatus();
	    testPage.deleteFunctionality();
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}


}
