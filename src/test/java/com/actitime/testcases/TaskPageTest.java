package com.actitime.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.base.TestBase;
import com.actitime.pages.HomePage;
import com.actitime.pages.LoginPage;
import com.actitime.pages.TaskPage;

public class TaskPageTest extends TestBase {
	public TaskPageTest() throws IOException
	{
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
	    homePage = loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	    Thread.sleep(2000);
	    testPage.taskbtn.click();
}

	@Test(priority=1)
	public void createNewCustomerTest() throws InterruptedException
	{ 
		testPage.createNewCustomer();
	}
	@Test(priority=2)
	public void createNewProjectTest() throws InterruptedException
	{
		testPage.createNewProject();
	}
	@Test(priority=3)
	public void createNewTaskTest() throws InterruptedException
	{
		testPage.createNewTask();
	}
	
	@Test(priority=4)
	public void custAndProjectTabTest() throws InterruptedException
	{
		testPage.custAndProjectTab();
	}
	@Test(priority=5)
	public void copyToTaskTest() throws InterruptedException
	{
		testPage.copyToTask();
	}
	@Test(priority=6)
	public void moveToTaskTest() throws InterruptedException
	{
		testPage.moveToTask();
	}
	/*@Test(priority=7)
	public void assignTaskTest() throws InterruptedException
	{
		testPage.assignTask();
	}*/
	@Test(priority=8)
	public void changeStatusTest() throws InterruptedException
	{
		testPage.changeStatus();
	}
	@Test(priority=9)
	public void deleteFunctionalityTest() throws InterruptedException
	{
		testPage.deleteFunctionality();
		
	}
	
	/*@Test
	public void scrollTest() throws InterruptedException
	{
		testPage.scroll();
	}*/
	
	/*
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}*/
	
	
}
