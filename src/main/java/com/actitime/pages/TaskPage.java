package com.actitime.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.base.TestBase;

public class TaskPage extends TestBase{
	
	JavascriptExecutor js =(JavascriptExecutor)driver;
	@FindBy(xpath="//*[@id=\"container_tasks\"]")
	public
	WebElement taskbtn;
	
	@FindBy(xpath="//div[contains(text(),'Add New')]")
	WebElement addNewBtn;
	
	//Customer and project tab
	@FindBy(xpath="//*[@id=\"customersProjectsPanelFilterCPSelectorContainer\"]")
	WebElement projectFilter;
	
	@FindBy(xpath="//label[contains(text(),'All projects of all customers (active and archived)')]")
	WebElement projectOption;
	
	@FindBy(css="div[class*=\" selector-panel customer-project-panel\"]>table>tbody>tr:nth-child(4)>td>div>div:nth-child(1)")
	WebElement projectFilterClose;
	
	@FindBy(xpath="(//div//*[contains(text(),'Big Bang Company')])[1]")
	WebElement bigBangCompany;
	
	@FindBy(xpath="(//*[contains(text(),'Flight operations')])[2]")
	WebElement flightOpertion;
	
	@FindBy(css="table.headerRowTable>tbody>tr>td:nth-of-type(1)")
	WebElement taskCheckBox;
	
	@FindBy(css="div.clearSelection")
	WebElement clearBtn;
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[3]/div/div/div")
	WebElement statusBtn1;
	
	@FindBy(xpath="(//*[@class=\"openStatusesContainer\"]//*[contains(text(),'In Progress')])[1]")
	WebElement statusInProgress;
	
	@FindBy(xpath="(//*[contains(text(),'Enter hours')])[1]")
	WebElement EnterHours;
	//Copy To Task
	@FindBy(xpath="//*[@class=\"node projectNode editable selected\"]//*[contains(text(),'Spaceship building')]")
	WebElement spaceshipBtn;
	
	@FindBy(css="div.taskRowsTableContent>div>div>table.taskRowsTable>tbody>tr:nth-of-type(1)>td:nth-of-type(1)>div>div")
	WebElement spaceChkBtn;
	
	@FindBy(xpath="//div[@class=\"animatedVisibilityContainer tasklist_components_bulkOperationsPanelContainer\"]//div[@class=\"copyTo button\"]")
	WebElement cpyToBtn;
	
	@FindBy(xpath="//*[contains(text(),'- Select Customer -')]")
	WebElement selCut;
	
	@FindBy(xpath="//div[@class=\"scrollableContainer \"]//*[contains(text(),'Big Bang Company')]")
	WebElement galaxyBtn;
	
	@FindBy(xpath="//*[contains(text(),'- Select Project -')]")
	WebElement selProject;
	
	@FindBy(xpath="//div[@class=\"scrollableContainer \"]//*[contains(text(),'Spaceship building')]")
	WebElement flightBtn;
	
	@FindBy(xpath="(//*[contains(text(),'Copy')])[14]")
	WebElement cpyBtn;
	
	//Move to task 
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[2]/table/tbody/tr[2]/td[1]/div")
	WebElement chkBoxBtn;
	
	@FindBy(xpath="(//*[contains(text(),'Move to')])[1]")
	WebElement moveToBtn;
	
	@FindBy(css="div.emptySelection")
	WebElement emptyBtn;
	
	@FindBy(xpath="//*[@class=\"scrollableContainer \"]//div[contains(text(),'Big Bang Company')]")
	WebElement companyName;
	
	@FindBy(xpath="//div[contains(text(),'- Select Project -')]")
	WebElement selprojectName;
	
	@FindBy(xpath="//*[@id=\"taskManagementPage\"]/div[2]/div[5]/div[1]/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div/div[1]")
	WebElement selprojectNameOption;
	
	@FindBy(xpath="(//div[contains(text(),'Cancel')])[14]")
	WebElement cancelBtn;
	
	//Assign Task to user
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[2]/table/tbody/tr[3]/td[1]/div")
	WebElement selectTasktoAssign;
	
	@FindBy(css="#taskListBlock > div.animatedVisibilityContainer.tasklist_components_bulkOperationsPanelContainer > div > div > div.content > div > div.assignTo.button")
	WebElement assignBtn;
	
	@FindBy(css="div.selectorContainer>table[class*='dropdown-button']")
	WebElement selUserOption;
	
	@FindBy(xpath="//*[@id=\"ext-comp-1290\"]/div[1]/div[1]/div[3]/div[2]/div[1]/div/a/span[2]")
	WebElement selUser;
	
	@FindBy(xpath="//*[@id=\"ext-comp-1089\"]")
	WebElement assignCloseBtn;
	
	//Change Status of the task
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[2]/table/tbody/tr[3]/td[1]/div")
	WebElement changeCheckBox;
	
	@FindBy(css="#taskListBlock > div.animatedVisibilityContainer.tasklist_components_bulkOperationsPanelContainer > div > div > div.content > div > div.changeStatus.button")
    WebElement changeStatusBtn;
	
	@FindBy(xpath="//*[@id=\"taskManagementPage\"]/div[2]/div[4]/div[1]/div[1]/div/div[2]/div[2]/div/div")
	WebElement newstatusBtn;
	
	@FindBy(xpath="/html/body/div[26]/div/div/div[1]/div/div[2]/div[1]/div[3]/div[3]/div/div[3]")
	WebElement newstatusPlanning;
	
	@FindBy(xpath="//span[contains(text(),'Apply')]")
	WebElement applyBtn;
	
	public TaskPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	public void createNewCustomer() throws InterruptedException
	{ 
		taskbtn.click();
		Thread.sleep(2000);
		addNewBtn.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[19]/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"customerLightBox_content\"]/div[2]/div[1]/div/div[1]/div[1]/input")).sendKeys("Virat");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"customerLightBox_content\"]/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/div[1]/div[1]/textarea")).sendKeys("Have 5years experience in Selenium at Google");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"customerLightBox_content\"]/div[2]/div[1]/div/div[1]/div[3]/div[2]/span/div/div[1]/div[3]")).click();
		Thread.sleep(2000);
		WebElement drpDownData = driver.findElement(By.xpath("//*[@class=\"scrollableDropdownView\"]//div[contains(text(),'Galaxy Corporation')]"));
		js.executeScript("arguments[0].scrollIntoView();",drpDownData);
		driver.findElement(By.xpath("//*[@class=\"scrollableDropdownView\"]//div[contains(text(),'Galaxy Corporation')]")).click();
		Thread.sleep(2000);
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//*[@id=\"customerLightBox_content\"]/div[3]/div[2]/div[1]/div/div[1]")).click();
		Thread.sleep(2000);
	}
	public void createNewProject() throws InterruptedException
	{
//		taskbtn.click();
		Actions act = new Actions(driver);
		act.moveToElement(addNewBtn).click().build().perform();
		Thread.sleep(4000);
		addNewBtn.click();
		driver.findElement(By.xpath("/html/body/div[19]/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"createProjectPopup_content\"]/div[2]/div[1]/div/div[1]/div[1]/input")).sendKeys("actiTIME");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"createProjectPopup_content\"]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"createProjectPopup_content\"]/div[2]/div[1]/div/div[1]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div/div[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"createProjectPopup_content\"]/div[2]/div[1]/div/div[1]/div[1]/div[2]/input")).sendKeys("Peter");
		driver.findElement(By.xpath("//*[@id=\"createProjectPopup_content\"]/div[2]/div[1]/div/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/textarea")).sendKeys("Short term project for automation testing using selenium");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder=\"Enter task name\"])[1]")).sendKeys("Sanity Testing");
		driver.findElement(By.xpath("(//input[@placeholder=\"not needed\"])[1]")).sendKeys("100");
		driver.findElement(By.xpath("(//*[contains(text(),'set deadline')])[1]")).click();
		driver.findElement(By.xpath("(//table[@class=\"x-date-inner\"]//tbody//tr//td/a/em/span)[35]")).click();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//*[@id=\"createProjectPopup_content\"]/div[3]/div[2]/div[1]/div/div[1]")).click();
		Thread.sleep(2000);
		}
       
	public void createNewTask() throws InterruptedException
	{   
		
		Thread.sleep(8000);		
		addNewBtn.click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("body > div.dropdownContainer.addNewMenu > div.item.createNewTasks")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div/div[1]/div[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[2]/td[1]/input")).sendKeys("Tom");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[4]/td[1]/input")).sendKeys("ibs");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[3]/div/div[1]/table/tbody/tr[1]/td[1]/input")).sendKeys("Functional Testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[3]/div/div[1]/table/tbody/tr[1]/td[3]/input")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[contains(text(),'set deadline')])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("30")).click();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Create Tasks')]")).click();
		Thread.sleep(2000);
		}
	
	public void custAndProjectTab() throws InterruptedException
	{
//		taskbtn.click();
		Thread.sleep(3000);
	    projectFilter.click();
		projectOption.click();
		Thread.sleep(2000);
		projectFilterClose.click();
		Thread.sleep(2000);
//		js.executeScript("arguments[0].scrollIntoView();", bigBangCompany);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"taskManagementPage\"]/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]/table/tbody/tr/td[1]/div")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div/div/div[1]/div/div[3]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"taskManagementPage\"]/div[2]/div[5]/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[3]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@class=\"scrollableDropdownView\"]//*[@class=\"searchItemList\"]//*[contains(text(),'Big Bang Company')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"taskManagementPage\"]/div[2]/div[5]/div[1]/div[1]/div[4]/div[2]/div/div[1]/div[3]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@class=\"scrollableDropdownView\"]//*[contains(text(),'Spaceship building')]")).click();
//		Thread.sleep(2000);
//     	driver.findElement(By.xpath("//*[@id=\"taskManagementPage\"]/div[2]/div[5]/div[1]/div[1]/div[8]/div[1]")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"taskManagementPage\"]/div[1]/div[1]/div[1]/div[2]/div/table/tbody/tr/td[1]/div/input")).sendKeys("Big Bang Company");
		Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"taskManagementPage\"]/div[1]/div[1]/div[2]/div/div[3]/div/div[1]/div[2]/div[2]/div[2]/div[2]")).click();
	   Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"taskManagementPage\"]/div[1]/div[1]/div[2]/div/div[3]/div/div[1]/div[2]/div[4]/div[2]/div[1]")).click();
//		//spaceshipBtn.click();
//		Thread.sleep(2000);
		
		taskCheckBox.click();
		Thread.sleep(2000);
		clearBtn.click();
		Thread.sleep(2000);	
		statusBtn1.click();
		Thread.sleep(2000);
		statusInProgress.click();
		Thread.sleep(2000);
		WebElement estimationHour=driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[5]/div/div/div"));
		Actions act=new Actions(driver);
		act.moveToElement(estimationHour).click().sendKeys("100").build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.BACK_SPACE).perform();
		act.sendKeys(Keys.BACK_SPACE).perform();
		act.sendKeys(Keys.BACK_SPACE).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[2]/table/tbody/tr[1]/td[7]")).click();
		driver.findElement(By.linkText("28")).click();
		
		}
	
	public void copyToTask() throws InterruptedException
	{
//		taskbtn.click();
//		Thread.sleep(3000);
//		js.executeScript("arguments[0].scrollIntoView();", bigBangCompany);
//		Thread.sleep(2000);
//		spaceshipBtn.click();
		Thread.sleep(4000);
		spaceChkBtn.click();
		Thread.sleep(2000);
		cpyToBtn.click();
		Thread.sleep(2000);
		selCut.click();
		Thread.sleep(2000);
		galaxyBtn.click();
		Thread.sleep(2000);
		selProject.click();
		flightBtn.click();
		cpyBtn.click();
	}
	
	public void moveToTask() throws InterruptedException
	{
//		taskbtn.click();
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", bigBangCompany);
		chkBoxBtn.click();
		Thread.sleep(2000);
		moveToBtn.click();
		Thread.sleep(2000);
		emptyBtn.click();
		Thread.sleep(2000);
		companyName.click();
		Thread.sleep(2000);
		selprojectName.click();
		Thread.sleep(2000);
		selprojectNameOption.click();
		cancelBtn.click();
		Thread.sleep(2000);
		
	}
	
	/*public void assignTask() throws InterruptedException
	{
//		taskbtn.click();
		Thread.sleep(3000);
		selectTasktoAssign.click();
		Thread.sleep(2000);
		assignBtn.click();
		Thread.sleep(4000);
		selUserOption.click();
		Thread.sleep(4000);
		
//        selUser.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id="ext-gen253"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@class=\"buttonsContainer\"]//*[@class=\"buttonIcon\"]//*[contains(text(),'Assign')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("#ext-comp-1100 > div.treePanel > div.treeContainer.filtered.hideDisabled > div:nth-child(7) > div.childrenContainer > div:nth-child(1) > div > a > span.ellipsisLabel")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"x-table-layout-cell footer\"]//*[contains(text(),'Close')]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//*[@class=\"buttonsContainer\"]//*[@class=\"buttonIcon\"]//*[contains(text(),'Assign')]")).click();

	}*/
	
	public void changeStatus() throws InterruptedException
	{
//		taskbtn.click();
		Thread.sleep(3000);
		changeCheckBox.click();
		Thread.sleep(2000);
		changeStatusBtn.click();
		Thread.sleep(2000);
		newstatusBtn.click();
		Thread.sleep(2000);
		newstatusPlanning.click();
		Thread.sleep(2000);
		applyBtn.click();
	}
	public void deleteFunctionality() throws InterruptedException
	{
//		taskbtn.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"taskManagementPage\"]/div[1]/div[1]/div[1]/div[2]/div/table/tbody/tr/td[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@placeholder=\"Start typing name ...\"])[1]")).sendKeys("Virat");
		Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"taskManagementPage\"]/div[1]/div[1]/div[2]/div/div[3]/div/div[1]/div[2]/div[1]/div[3]")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//*[@id=\"taskManagementPage\"]/div[1]/div[1]/div[2]/div/div[3]/div/div[1]/div[2]/div[1]/div[4]")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[5]/div[1]/div/div[1]/div/div[1]/div/div[3]/div/div")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[5]/div[1]/div/div[1]/div/div[4]/div/div[3]/div")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("(//*[contains(text(),'Delete permanently')])[2]")).click();
	}
	public void scroll() throws InterruptedException
	{
		//to scroll down webtable
		Thread.sleep(2000);
		js.executeScript("document.querySelector(\"#taskManagementPage > div.cpTreeBlock.ui-widget-content.ui-resizable > div.customersProjectsPanel > div.customersProjectsTreeContainer > div > div.unfilteredContainer > div\").scrollTop = 400");
		//To scroll up webtable
		Thread.sleep(2000);
		js.executeScript("document.querySelector(\"#taskManagementPage > div.cpTreeBlock.ui-widget-content.ui-resizable > div.customersProjectsPanel > div.customersProjectsTreeContainer > div > div.unfilteredContainer > div\").scrollTop = -400");
	}
	

}
