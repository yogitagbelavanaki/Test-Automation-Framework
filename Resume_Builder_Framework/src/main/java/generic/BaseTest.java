package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BaseTest extends UtilityMethods
{
	
	public BaseTest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Profile']")
	static

	WebElement Profile;
	
	

	public static void clickProfile()
	{
		clickAction(Profile);
	}

}