package generic;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


/**
 * 
 * @author Yogita
 *
 */
public class UtilityMethods {
	
	public static WebDriver driver;	
	
	public static void get_title() {
		String title= driver.getTitle();
		System.out.println(title);
	}
	
	public static void get_url() {		
		String CurrentURL=driver.getCurrentUrl();
		System.out.println(CurrentURL);
	}
	
	public static void clickAction(WebElement element_To_Click) {
		element_To_Click.click();
	}
	
	public static void enter_value(WebElement TextField,String value) {		
		TextField.sendKeys(value);
	}
	
	public static Select select_classObject(WebElement DropDown){		
		Select select= new Select(DropDown);		
		return select;		
	}
	
	public static Actions actions_classObject(WebDriver driver) {		
		Actions action=new Actions(driver);
		return action;
		
		
	}
	
	
	/*
	 * public static void switchToASpecificTitledWindow(String title) { String
	 * parentWindowId = driver.getWindowHandle(); Set<String> allWindowIds =
	 * driver.getWindowHandles(); allWindowIds.remove(parentWindowId); for(String
	 * windowId:allWindowIds){ driver.switchTo().window(windowId);
	 * if(driver.getTitle().equalsIgnoreCase(title)){ break; } } } public static
	 * void switchToASpecificWindow(WebElement element) { String
	 * parent=driver.getWindowHandle(); Set<String>
	 * allWid=driver.getWindowHandles(); allWid.remove(parent); for(String
	 * sessionID:allWid){ driver.switchTo().window(sessionID);
	 * if(element.isDisplayed()){ break; } } }
	 * 
	 * 
	 */

}
