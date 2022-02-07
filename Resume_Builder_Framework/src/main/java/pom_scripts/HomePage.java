package pom_scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.UtilityMethods;

public class HomePage extends UtilityMethods{
	
	@FindBy(xpath = "//button[@class='firstChild']")
	public WebElement profile_module;
	
	

}
