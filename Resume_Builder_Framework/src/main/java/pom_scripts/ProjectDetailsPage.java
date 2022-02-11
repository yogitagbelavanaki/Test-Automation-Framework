package pom_scripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

public class ProjectDetailsPage {
	WebDriver driver;
	public ProjectDetailsPage(WebDriver driver)
	{
		this.driver=driver;

		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='ProjectDetails']")
	WebElement projdetail;
	public void Click_onProjectDetail() 
	{
      UtilityMethods.clickAction(projdetail);
	}
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement projectname;
	public void ClickOn_ProjrctName()
	{
		UtilityMethods.clickAction(projectname);
	}
	public void Enter_DataProjectName(String projname) 
	{
		Actions action =UtilityMethods.actions_classObject(driver);
		 action.sendKeys(projectname, projname).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();

	}
	@FindBy(xpath="(//input[@maxlength=\"1000\"])[1]")
	WebElement Projectdescription;
	public void ClickOnProjectDescription()
	{
		UtilityMethods.clickAction(Projectdescription);
	}
	public void Enter_DataProjectDescription(String projdesc) 
	{
		Actions action =UtilityMethods.actions_classObject(driver);
		 action.sendKeys(Projectdescription, projdesc).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();

	}
	@FindBy(xpath="(//input[@type=\"text\"])[8]")
	WebElement roles;
	public void ClickOnRolesAndResponsibilities() 
	{
		UtilityMethods.clickAction(roles);
	}
	public void Enter_DataRolesndResponsibilities(String rolesandres) 
	{
		Actions action =UtilityMethods.actions_classObject(driver);
		 action.sendKeys(roles, rolesandres).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();
      }
	
}
