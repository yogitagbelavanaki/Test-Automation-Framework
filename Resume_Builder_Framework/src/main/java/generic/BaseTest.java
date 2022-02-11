package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class BaseTest extends UtilityMethods
{
	
	public BaseTest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}