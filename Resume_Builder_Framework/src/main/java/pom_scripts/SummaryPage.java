package pom_scripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

public class SummaryPage 
{
	WebDriver driver;
	public SummaryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);  
	}

	@FindBy(xpath = "//div[@class=\"input-data\"]/child::input")
	WebElement typeHear;
	
	
	public void typeHearText(String text)
	{
		Actions an=new Actions(driver);
		an.sendKeys(typeHear,text).build().perform();
		an.sendKeys(Keys.ENTER).build().perform();
	
	}
}
