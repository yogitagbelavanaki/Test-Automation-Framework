package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import generic.BaseTest;
import generic.UtilityMethods;

public class ProfilePage extends BaseTest{

	public ProfilePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	public WebElement first_name_tf;
	
	@FindBy(xpath = "((//div[@class='input-data'])[1])/label")
	public WebElement first_name_locator;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	public WebElement last_name_tf;
	
	@FindBy(xpath = "//select[@id='Technology']")
	public WebElement technology_dd;
	
	@FindBy(xpath = "(//select[@id='Total Experience'])[1]")
	public WebElement totalExpInYears_dd;
	
	@FindBy(xpath = "(//select[@id='Total Experience'])[2]")
	public WebElement totalExpInMonths_dd;
	
	@FindBy(xpath = "(//select[@id='Relevant Experience'])[1]")
	public WebElement relevantExpYrs_dd;
	
	@FindBy(xpath = "(//select[@id='Relevant Experience'])[2]")
	public WebElement relevantExpMnths_dd;
	
	@FindBy(xpath = "//div[contains(@style,'padding-right: 20px; font-size: 32px; font-family:')]")
	public WebElement firstname_onresume;
	
	@FindBy(xpath = "(//div[contains(@style,'font-size: 24px; padding: 2px; font-')])[1]")
	public WebElement totalExpInYrs_from_resume;
	
	public String getTotalExpInYrsFromResume() {
		return totalExpInYrs_from_resume.getText();
	}
	
	public void selectRelevantExpMnthsByVisibleText(String visible_text) {
		Select select = UtilityMethods.select_classObject(relevantExpMnths_dd);
		select.selectByVisibleText(visible_text);
	}
	
	public void selectRelevantExpYrsByVisibleText(String visible_text) {
		Select select = UtilityMethods.select_classObject(relevantExpYrs_dd);
		select.selectByVisibleText(visible_text);
	}
	
	public void selectTotalExpYearByVisibleText(String visible_text) {
		Select select = UtilityMethods.select_classObject(totalExpInYears_dd);
		select.selectByVisibleText(visible_text);
	}
	
	public void selectTotalExpMonthByVisibleText(String visible_text) {
		Select select = UtilityMethods.select_classObject(totalExpInMonths_dd);
		select.selectByVisibleText(visible_text);
	}
	
	public void selectTechnologyByVisibleText(String visible_text) {
		Select select = UtilityMethods.select_classObject(technology_dd);
		select.selectByVisibleText(visible_text);
	}
	
	
	public void enterLastName(String name) {
		last_name_tf.clear();
		UtilityMethods.enter_value(last_name_tf, name);
	}
	
	public String getLastNameAttribute() {
		return last_name_tf.getAttribute("value");
	}
	
	public void enterFirstName(String name) {
		first_name_tf.clear();
		UtilityMethods.enter_value(first_name_tf, name);
	}
	
	public String getFirstNameLocator() {
		return first_name_locator.getText();
	}
	
	public String getFirstNameAttribute() {
		String name = first_name_tf.getAttribute("value");
		return name;
	}
	

}
