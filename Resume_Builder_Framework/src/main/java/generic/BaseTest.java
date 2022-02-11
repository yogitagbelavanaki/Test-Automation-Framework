package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

/***
 * 
 * @author Yogita
 *
 */
public class BaseTest  {

	public BaseTest(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



}
