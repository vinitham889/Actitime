package com.actitime.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath = "//div[contains(text(),'Capacity planning: Q2')]")
	WebElement capacityPlanningBtn;
	
	@FindBy(xpath="/html/body/div[18]/div[1]/div/div[1]/div/div[2]/div/div[7]/div[1]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div")
	WebElement status;
	
	@FindBy(xpath ="/html/body/div[18]/div[1]/div/div[1]/div/div[2]/div/div[7]/div[1]/div/div[1]/div[3]/div[1]/div[2]/div[1]/div/div/div[1]/div/div[2]/div[1]/div[3]/div[3]/div/div[3]")
	WebElement planningBtn;
	
	@FindBy(xpath="//*[@id=\"ext-gen111\"]/span[3]")
	WebElement dateClearBtn;
	
	@FindBy(xpath ="//*[contains(text(),'Set up deadline')]")
	WebElement deadLineDateBtn;
	
	@FindBy(xpath ="//table[@class=\"x-date-inner\"]//tbody//tr[6]//td[3]")
	WebElement specficDate;
	
	@FindBy(xpath ="//div[@class=\"value ellipsis\"]")
	WebElement billableStatus;
	
	@FindBy(xpath = "//div[@class=\"typeOfWorkList\"]//div[3]")
	WebElement management;
	
	@FindBy(xpath="//*[contains(text(),'Enter hours')]")
	WebElement enterHour;
	
	@FindBy(xpath="//textarea[@placeholder=\"Enter task description...\"]")
	WebElement description;
	
	@FindBy(xpath="//*[@class=\"sendCommentLine\"]")
	WebElement comments;
	
	@FindBy(xpath="//*[@class=\"sendIcon\"]")
	WebElement commentBtn;
	
	@FindBy(xpath="//*[contains(text(),'REPORTED TIME ')]")
	WebElement reportedTimebtn;
	
	@FindBy(xpath="//*[@id=\"ext-gen74\"]/div[18]/div[1]/div/div[1]/div/div[1]/div/div[4]/div[3]")
	WebElement assignedUser;
	
	@FindBy(xpath="//*[@id=\"ext-gen74\"]/div[18]/div[1]/div/div[1]/div/div[1]/div/div[4]/div[4]")
	WebElement managerTab;
	
	//Initializing the page objects
	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver,this);
		
	}
	public String verifyHomePageTitle() 
	{
		return driver.getTitle();
	}
	public void clickOnCapacityPlanning() throws InterruptedException
	{
		capacityPlanningBtn.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
 		
		//scroll into webpage
       /* WebElement Element = driver.findElement(By.xpath("(//*[contains(text(),'Comments')])[4]"));

         
        js.executeScript("arguments[0].scrollIntoView();", Element);
		Thread.sleep(2000);*/
	}
     public void clickOnStatus() throws InterruptedException
     {
    	 status.click();
    	 Thread.sleep(2000);
     }
     public void clickOnPlanningBtn() throws InterruptedException
     {
    	 planningBtn.click();
    	 Thread.sleep(2000);

     }
     public void clickOndeadLineDateBtn() throws InterruptedException
     {
    	 deadLineDateBtn.click();
    	 Thread.sleep(2000);

    	 
     }
     public void clickOnSpecficDate() throws InterruptedException
     {
    	 specficDate.click();
    	 Thread.sleep(2000);

     }
     public void clickOnBillableStatus() throws InterruptedException
     {
    	 billableStatus.click();
    	 Thread.sleep(2000);

     }
     public void clickOnManagement() throws InterruptedException
     {
    	 management.click();
    	 Thread.sleep(3000);

     }
     public void clickOnEnterHour() throws InterruptedException
     {
    	 
    	 WebElement a= enterHour;
    	 Actions act = new Actions(driver);
    	 act.moveToElement(a).click()
    	 .sendKeys("100")
    	 .build().perform();
    	 //keyUp(a,Keys.SHIFT).sendKeys("100");
    	
    	 Thread.sleep(2000);
    	 JavascriptExecutor js = (JavascriptExecutor) driver;
  		
 		//scroll into webpage
         WebElement Element = driver.findElement(By.xpath("(//*[contains(text(),'Comments')])[4]"));

          
         js.executeScript("arguments[0].scrollIntoView();", Element);
 		Thread.sleep(2000);
 		description.sendKeys("Hands on experience in regression testing ");
 		Thread.sleep(2000);
 		description.clear();
 		Thread.sleep(2000);
 		 act.moveToElement(comments).click()
 		.sendKeys("Any doubts please be free to ping me!!!").build().perform();
 		Thread.sleep(2000);
 		commentBtn.click();
 	    Thread.sleep(2000);
 	    reportedTimebtn.click();
 	    Thread.sleep(3000);
 	    assignedUser.click();
 	   Thread.sleep(3000);
 	   managerTab.click();
 	    

     }
}
