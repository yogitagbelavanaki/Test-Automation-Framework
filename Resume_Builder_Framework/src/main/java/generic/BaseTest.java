package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BaseTest {
	
	public BaseTest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Profile']")
	static
	WebElement Profile;
	
	

	private static void clickAction(WebElement profile2) {
		// TODO Auto-generated method stub
		clickAction(Profile);
	}

}