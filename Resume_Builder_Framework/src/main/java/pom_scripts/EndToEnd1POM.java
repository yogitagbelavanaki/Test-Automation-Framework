package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generic.UtilityMethods;

public class EndToEnd1POM extends UtilityMethods {
	WebDriver driver;
	public EndToEnd1POM(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//PROFILE

	@FindBy(xpath = "//button[text()='Profile']")
	WebElement module1;

	public void clickOnProfile() {
		clickAction(module1);
	}

	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement profileElement1;

	public void pElement1(String val1) {
		profileElement1.clear();
		enter_value(profileElement1, val1);
	}

	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement profileElement2;

	public void pElement2(String val2) {
		profileElement2.clear();
		enter_value(profileElement2, val2);
	}

	@FindBy(xpath="(//Select[@name='dropdown'])[1]")
	WebElement profileElement3;

	public void pElement3() {
		select_classObject(profileElement3).selectByIndex(3);
	}

	@FindBy(xpath="(//Select[@name='dropdown'])[2]")
	WebElement profileElement4;

	public void pElement4() {
		select_classObject(profileElement4).selectByIndex(1);
	}

	@FindBy(xpath="(//Select[@name='dropdown'])[3]")
	WebElement profileElement5;

	public void pElement5() {
		select_classObject(profileElement5).selectByIndex(2);
	}

	@FindBy(xpath="(//Select[@name='dropdown'])[4]")
	WebElement profileElement6;

	public void pElement6() {
		select_classObject(profileElement6).selectByIndex(5);
	}

	@FindBy(xpath="(//Select[@name='dropdown'])[5]")
	WebElement profileElement7;

	public void pElement7() {
		select_classObject(profileElement7).selectByIndex(5);
	}

	//SUMMARY

	@FindBy(xpath="//button[contains(text(),'Su')]")
	WebElement summary;

	public void clickOnSummary() {
		clickAction(summary);
	}

	@FindBy(xpath="//div[@class='input-data']/child::input")
	WebElement summaryElement1;

	public void sElement1(String text) {
		enter_value(summaryElement1, text);
	}

	//SKILLS

	@FindBy(xpath="//button[text()='Skills']")
	WebElement skills;

	public void clickOnSkills() {
		clickAction(skills);
	}

	@FindBy(xpath="//li[text()='HTML']")
	WebElement skillsElement1;

	public void skillsElement1() {
		select_classObject(skillsElement1).selectByIndex(0);
	}

	@FindBy(xpath="(//div[@class='search-wrapper searchWrapper '])[2]")
	WebElement skillsElement2;

	public void skillsElement2() {
		select_classObject(skillsElement2).selectByIndex(0);
	}

	@FindBy(xpath="(//div[@class='search-wrapper searchWrapper '])[3]")
	WebElement skillsElement3;

	public void skillsElement3() {
		select_classObject(skillsElement3).selectByIndex(0);
	}

	@FindBy(xpath="(//div[@class='search-wrapper searchWrapper '])[4]")
	WebElement skillsElement4;

	public void skillsElement4() {
		select_classObject(skillsElement4).selectByIndex(0);
	}

	@FindBy(xpath="(//div[@class='search-wrapper searchWrapper '])[5]")
	WebElement skillsElement5;

	public void skillsElement5() {
		select_classObject(skillsElement5).selectByIndex(0);
	}

	@FindBy(xpath="(//div[@class='search-wrapper searchWrapper '])[6]")
	WebElement skillsElement6;

	public void skillsElement6() {
		select_classObject(skillsElement6).selectByIndex(0);
	}

	@FindBy(xpath="(//div[@class='search-wrapper searchWrapper '])[7]")
	WebElement skillsElement7;

	public void skillsElement7() {
		select_classObject(skillsElement7).selectByIndex(0);
	}

	@FindBy(xpath="(//div[@class='search-wrapper searchWrapper '])[8]")
	WebElement skillsElement8;

	public void skillsElement8() {
		select_classObject(skillsElement8).selectByIndex(0);
	}

	@FindBy(xpath="(//div[@class='search-wrapper searchWrapper '])[9]")
	WebElement skillsElement9;

	public void skillsElement9() {
		select_classObject(skillsElement9).selectByIndex(0);
	}

}
