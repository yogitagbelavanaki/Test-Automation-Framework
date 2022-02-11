package pom_scripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generic.UtilityMethods;

public class EducationPage
{
	public WebDriver driver;

	public EducationPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//select[@name='dropdown']")
	WebElement Highest_education;
	
	@FindBy(xpath="//select[@id=\"Specialization\"]")
	WebElement Specialization;
	
	@FindBy(xpath="//select[@id=\"University\"]")
	WebElement University;
	
	@FindBy(xpath="(//input[@type='number'])[1]")
	WebElement Yop;
	
	@FindBy(xpath="//input[@type='number'])[2]")
	WebElement Percentage;
	
	@FindBy(xpath="//td[text()=\"BCA\"]")
	WebElement EducationInTemplate;
	
	public void CheckEducationInTempalte()
	{
		String check=EducationInTemplate.getText();
		System.out.println(check);
	}
	
	public void percentage(String value)
	{
		Actions action=UtilityMethods.actions_classObject(driver);
		action.sendKeys(Percentage,value).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
		
	}
	public void clickPercentage()
	{
		UtilityMethods.clickAction(Percentage);
	}
	public void Clickpassoutyear()
	{
		UtilityMethods.clickAction(Yop);
	}
	
	public void PassoutYear(String value)
	{
		Actions action=UtilityMethods.actions_classObject(driver);
		action.sendKeys(Yop,value).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
	}
	public void clickUniversity()
	{
		UtilityMethods.clickAction(University);
	}
	public void selectUniversity(String text)
	{
		Select sel=UtilityMethods.select_classObject(University);
		//sel.selectByVisibleText(text);
		sel.selectByIndex(2);
	}
	
	public void clickSpecialization()
	{
		UtilityMethods.clickAction(Specialization);
	}
	public void selectSpecialization(String text)
	{
		Select sel=UtilityMethods.select_classObject(Specialization);
		//sel.selectByVisibleText(text);
		sel.selectByIndex(1);
	}
	
	public void ClickHighestEducation()
	{
		UtilityMethods.clickAction(Highest_education);
	}
	public void selectTechnologyByVisibleText(String text)
	{
		Select sel=UtilityMethods.select_classObject(Highest_education);
		//sel.selectByVisibleText(text);
		sel.selectByIndex(3);
	}
	 
	
	

}
