package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
