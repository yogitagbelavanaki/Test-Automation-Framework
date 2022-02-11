package pom_scripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generic.UtilityMethods;

public class EducationPage {
	WebDriver driver;
	public EducationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//button[text()='Education']")
	WebElement education;
	
	public void Clicl_On_Education()
	{
		UtilityMethods.clickAction(education);
	}
	
	@FindBy(xpath="(//select[@name=\"dropdown\"])[1]")
	 WebElement highesteduation;
	public void HighestEducation()
	{
		Select sel=UtilityMethods.select_classObject(highesteduation);
		sel.selectByIndex(4);

	}
	@FindBy(xpath="//select[@id='Specialization']")
	WebElement specilization;
	public void Click_OnSpecilization()
	{
		Select sel=UtilityMethods.select_classObject(specilization);
		sel.selectByValue("6");

	}
	@FindBy(xpath="(//select[@id='University'])[1]")
	WebElement university;
	
	public void Click_OnUniversity()
	{
		Select sel=UtilityMethods.select_classObject(university);
		sel.selectByValue("5");
	}
	
		@FindBy(xpath="(//input[@type='number'])[1]")
		WebElement poy;
    public void PassOutYear(String write )
    {
		Actions action =UtilityMethods.actions_classObject(driver);
	 action.sendKeys(poy, write).build().perform();
	action.sendKeys(Keys.ENTER).build().perform();
    }
	@FindBy(xpath="(//input[@type='number'])[2]")
	WebElement percentage;
	public void EnterPercentage(String per)
	{
		Actions action =UtilityMethods.actions_classObject(driver);
	 action.sendKeys(percentage, per).build().perform();
	action.sendKeys(Keys.ENTER).build().perform();

	}

}
