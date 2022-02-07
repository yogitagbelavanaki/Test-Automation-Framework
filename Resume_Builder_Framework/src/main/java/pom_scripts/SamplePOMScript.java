package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.BaseTest;
import generic.UtilityMethods;

public class SamplePOMScript extends BaseTest{

	public SamplePOMScript(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath = "//input[@value='FirstName']")
	public WebElement firstNameTextField;

	public void EnterFirstName(String firstname) {
		UtilityMethods.enter_value(firstNameTextField, firstname);
	}
	

	
	
	
	
	
	
	

}
