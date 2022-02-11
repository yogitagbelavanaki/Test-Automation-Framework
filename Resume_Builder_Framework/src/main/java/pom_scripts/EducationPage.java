package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import generic.BaseTest;
import generic.UtilityMethods;

public class EducationPage extends BaseTest{

	public EducationPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "(//input[@type='number'])[2]")
	public WebElement percentage_tf;
	
	@FindBy(xpath = "//select[@id='Highest Education']")
	public WebElement high_edu_dd;
	
	public void selectHighestEducationByVisibleTxt(String edu) {
		UtilityMethods.select_classObject(high_edu_dd).selectByVisibleText(edu);
	}
	
	@FindBy(xpath = "//select[@id='Specialization']")
	public WebElement specialization_dd;
	
	public void selectSpecialization(String specialization) {
		Select select = UtilityMethods.select_classObject(specialization_dd);
		select.selectByVisibleText(specialization);	
	}
	
	@FindBy(xpath = "(//select[@id='University'])[1]")
	public WebElement university_dd;
	
	public void selectUniversityByVisibleText(String university_name) {
		Select select = UtilityMethods.select_classObject(university_dd);
		select.selectByVisibleText(university_name);	
	}
	
	public void enterPercentage(String percentage) {
		percentage_tf.clear();
		UtilityMethods.enter_value(percentage_tf, percentage);
	}
	
	public String getPercentage() {
		return percentage_tf.getAttribute("value");
	}

}
