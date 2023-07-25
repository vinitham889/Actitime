package com.actitime.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.base.TestBase;
import com.actitime.pages.HomePage;
import com.actitime.pages.LoginPage;

public class LoginTest extends TestBase {
	public static LoginPage loginpage;
	HomePage homepage;

	public LoginTest() throws IOException {
		super();
	}
	@BeforeClass
	public void setUp() throws IOException
	{
		initialization();
		 loginpage = new LoginPage();
	}
	@Test(priority=1)
	public void loginPageTitleTest() throws InterruptedException
	{
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "actiTIME - Login");	
		Thread.sleep(2000);
	}
	@Test(priority =2)
	public void logoImageTest()
	{
		boolean flag = loginpage.validateImage();
		Assert.assertTrue(flag);
	}
	@Test(priority=3)
	public void loginTest() throws IOException, InterruptedException
	{
		homepage = loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(10000);
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
