package com.actitime.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.actitime.util.WebEventListener;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventlistener;
	public  TestBase() throws IOException
	{
		try
		{
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\vinitham\\eclipse-workspace\\POM\\src\\main\\java\\com\\actitime\\config\\config.properties");
			prop.load(ip);
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public static void initialization() throws IOException
	{
		String browserName = prop.getProperty("browser");
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		 ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        
        //WebEventListener
        e_driver = new EventFiringWebDriver(driver);
        eventlistener = new WebEventListener();
        e_driver.register(eventlistener);
        driver=e_driver;
        
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get(prop.getProperty("url"));

	    
	}
	

}