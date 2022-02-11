package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

public class SkillPOM extends UtilityMethods{

	public SkillPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[@class='firstChild']")
	WebElement skills;

	public void clickSkills() {
		clickAction(skills);
	}

	@FindBy(xpath="(//input[@class='checkBox'])[2]")
	WebElement frontEnd;

	public void clickFrontEnd() {
		clickAction(frontEnd);
	}
}
