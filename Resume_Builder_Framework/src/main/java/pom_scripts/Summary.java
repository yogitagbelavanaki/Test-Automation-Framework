package pom_scripts;

import javax.swing.Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

public class Summary {
	WebDriver driver;
	public Summary(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='Summary']")
	static
	WebElement summary;
	
	public  void ClickSummary()
	{
		UtilityMethods.clickAction(summary);
	}
	@FindBy(xpath="//div[@class='input-data']")
	static
	WebElement typehere;
	
	public static void ClickTypeHere()
	{
		UtilityMethods.clickAction(typehere);
	}
	public void enter_Data(String typehere1)
	{
		Actions action =UtilityMethods.actions_classObject(driver);
	 action.sendKeys(typehere, typehere1).build().perform();
	action.sendKeys(Keys.ENTER).build().perform();
	}
	
	
	}


