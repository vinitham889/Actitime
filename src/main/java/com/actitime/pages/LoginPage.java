package com.actitime.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.actitime.base.TestBase;

public class LoginPage extends TestBase
{
	@FindBy(name="username")
	WebElement username;
	@FindBy(name="pwd")
	WebElement password;
	@FindBy(xpath = "//a[@id=\"loginButton\"]")
	WebElement loginBtn;
	@FindBy(xpath = "//div[@class=\"atLogoImg\"]")
	WebElement actitimeLogo;
	
	//initializing the page object
	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}
	public String validateLoginPageTitle()
	{
		String title= driver.getTitle();
		System.out.println("The Webpage Title is:"+title);
		return title;
	}
	public Boolean validateImage()
	{
		Boolean display= actitimeLogo.isDisplayed();
		System.out.println("Logo is displayed:"+display);
		return display;
	}
	public HomePage login(String un,String pwd) throws IOException
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		
		loginBtn.click();
		return new HomePage();
	}
	
	
	}
	