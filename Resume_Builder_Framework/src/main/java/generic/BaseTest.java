package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pom_scripts.HomePage;

/***
 * 
 * @author Yogita
 *
 */
public class BaseTest 
{
	
	public BaseTest(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	

}
