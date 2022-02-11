package pom_scripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.beust.jcommander.JCommander.Builder;

import generic.UtilityMethods;

public class ProjectDetails 
{
	WebDriver driver;
	public ProjectDetails(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	@FindBy(xpath="//button[text()='ProjectDetails']")
	WebElement Project_button;
	
	@FindBy(xpath="//input[@type=\"text\"]")
	WebElement ProjectName;
	
	@FindBy(xpath="//label[text()=\"Project Description\"]")
	WebElement ProjectDescription;
	
	@FindBy(xpath="//select[@name=\"dropdown\"]")
	WebElement Duration;
	
	@FindBy(xpath="(//input[@type='text'])[8]")
	WebElement RolesAndRes;
	
	@FindBy(xpath="(//div[@style=\"padding-left: 10px; padding-top: 10px; margin-left: 4px; color: rgb(112, 112, 112);\"])[15]")
	WebElement durationTemplate;
	
	
	
	
	public void checkDurationinTemplate()
	{
		String check=durationTemplate.getText();
		
		System.out.println(check);
		
	}
	public void Clickrolesandres()
	{
		UtilityMethods.clickAction(RolesAndRes);
	}
	public void RolesAndResponsibilities(String roles)
	{
	    Actions action = UtilityMethods.actions_classObject(driver);
		action.sendKeys(RolesAndRes,roles).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
	}
	
	public  void ClickProjectDescription()
	{
		UtilityMethods.clickAction(ProjectDescription);
	}
	
	public void ProjectDescription(String description)
	{
	    Actions action = UtilityMethods.actions_classObject(driver);
		action.sendKeys(ProjectDescription,description).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
	}

	
	public  void ClickProjectName()
	{
		UtilityMethods.clickAction(ProjectName);
	}
	
	public void enter_DataInProjectName(String pname)
	{
		ProjectName.clear();
		UtilityMethods.enter_value(ProjectName,pname);
		
	}
	
	public  void clickProject()
	{
		Assert.assertEquals(true,Project_button.isEnabled());
		UtilityMethods.clickAction(Project_button);
		
	}
	
	public  void ClickDuration()
	{
		Assert.assertEquals(true,Duration.isEnabled());
		UtilityMethods.clickAction(Duration);
	}

	
	public void selectduration(String text)
	{
		Select sel=UtilityMethods.select_classObject(Duration);
		//sel.selectByVisibleText(text);
		sel.selectByIndex(1);
	}
	 

}
