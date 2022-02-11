package pom_scripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;

import generic.BaseTest;
import generic.UtilityMethods;

public class SummaryPage extends BaseTest{
	WebDriver driver;
	public SummaryPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Type Here')]")
	public WebElement summary_tf;
	
	public void enterSummary(String summary) {
		Actions action = UtilityMethods.actions_classObject(driver);
		action.sendKeys(summary_tf, summary).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
	}

}
