package pom_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;
import generic.UtilityMethods;

public class HomePage extends BaseTest{
	
	WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		
	}

	@FindBy(xpath = "//button[@class='firstChild']")
	public WebElement profile_module;
	
	@FindBy(xpath = "//button[contains(text(),'Skills')]")
	public WebElement skills_module;
	
	@FindBy(xpath = "//button[contains(text(),'Education')]")
	public WebElement education_module;
	
	@FindBy(xpath = "//button[contains(text(),'Download as')]")
	public WebElement download_as_button;
	
	@FindBy(xpath = "//input[@src='/static/media/Template2.1eb122f1.PNG']")
	public WebElement template2;
	
	@FindBy(xpath = "//text[@style='color: rgb(128, 138, 149);']")
	public WebElement technology_from_resume;
	
	@FindBy(xpath = "//div[contains(@style,'font-size: 20px; padding: 2px; color: rgb(7, 98, 136); font-family: ')]")
	public WebElement highestedu_onresume;
	
	@FindBy(xpath = "(//text[contains(@style,'color: black; font-size: 14px; font-family: ')])[1]")
	public WebElement frontendtech_onresume;
	
	public String getFrontEndTechFromResume() {
		return frontendtech_onresume.getText();
	}
	
	@FindBy(xpath = "//button[contains(text(),'Summary')]")
	public WebElement summary_module;
	
	public void clickOnSummaryModule() {
		UtilityMethods.clickAction(summary_module);
	}
	
	@FindBy(xpath = "//button[contains(text(),'Download as')]")
	public WebElement downloadas_button;
	
	public void downloadAs(String format) {
		Actions action = UtilityMethods.actions_classObject(driver);
		action.moveToElement(download_as_button).build().perform();
		if(format=="pdf") {
			action.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'PDF')]"))).click().build().perform();
		}
		else {
			action.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'WORD')]"))).click().build().perform();
		}
	}
	
	public String getHighestEduFromResume() {
		return highestedu_onresume.getText();
	}
	
	public String getTechnologyFromResume() {
		return technology_from_resume.getText();
	}
	
	public void selectTemplate2() {
		UtilityMethods.clickAction(template2);
	}
	
	public void clickOnEducationModule() {
		UtilityMethods.clickAction(education_module);
	}
	
	public void clickOnSkillsModule() {
		UtilityMethods.clickAction(skills_module);
	}
	
	public void clickOnDownloadAsButton() {
		UtilityMethods.clickAction(download_as_button);
	}
	
	public void clickOnProfileModule() {
		UtilityMethods.clickAction(profile_module);
	}

}
