package pom_scripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

public class SummaryPage extends UtilityMethods
{
	public SummaryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class=\"input-data\"]/child::input")
	WebElement TypeSummary;
	
	
	
	public void EnterSummaryDescription(String summarydescription)
	{
		TypeSummary.sendKeys("hey i'm likitha");
		
		
		 //Actions action = UtilityMethods.actions_classObject(driver);
		 // action.sendKeys(TypeSummary,summarydescription).build().perform();
		 // action.sendKeys(Keys.ENTER).build().perform();
	}
	
	
}
