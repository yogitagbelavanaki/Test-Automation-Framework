package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generic.UtilityMethods;

public class ProfilePOM extends UtilityMethods {

	public ProfilePOM(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//button[text()='Profile']")
	WebElement profile;

	public void clickProfile() {
		Assert.assertEquals(true, profile.isEnabled());
		System.out.println("profile is enabled");
		clickAction(profile);
	}

	@FindBy(xpath="//input[@type='text']")
	WebElement fname;

	public void firstName() {
		Assert.assertEquals(true, fname.isEnabled());
		System.out.println("fname is enabled");
		String text = fname.getAttribute("value");
		Assert.assertEquals(text, "FirstName");
	}

	public void enterData(String value) {
		fname.clear();
		enter_value(fname, value);
	}

	public void enterTwentyChar(String name) {
		fname.clear();
		enter_value(fname, name);
	}

}

