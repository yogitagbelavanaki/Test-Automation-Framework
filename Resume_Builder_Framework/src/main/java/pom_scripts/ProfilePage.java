package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage 
{
	public ProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);  
	}
	
	@FindBy(xpath = "(//select[@name=\"dropdown\"])[1]")
	WebElement heighestEducation;
	
	public void click
	
	@FindBy(xpath = "(//option[@value=\"0\"])[1]")
	WebElement beBtech;
	
	
}
