package pom_scripts;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import bsh.util.Util;
import generic.BaseTest;
import generic.UtilityMethods;

public class SkillsPage extends BaseTest{
	
	WebDriver driver;
	public SkillsPage(WebDriver driver){
		super(driver);
		this.driver=driver;
	}
	
	@FindBy(xpath = "(//input[@class='checkBox'])[1]")
	public WebElement frontend_checkbox;
	
	@FindBy(xpath = "(//input[@class='checkBox'])[1]/../../div[2]")
	public WebElement frontend_checkbox_status;
	
	@FindBy(xpath = "(//div[@id='multiselectContainerReact'])[1]")
	public WebElement frontEndTech_dd;
	
	@FindBy(xpath = "(//div[@class='search-wrapper searchWrapper '])[2]")
	public WebElement backEndTech_dd;
	
	public void clickOnBackEndTech() {
		UtilityMethods.clickAction(backEndTech_dd);
	}
	
	@FindBy(xpath = "(//div[@class='search-wrapper searchWrapper '])[4]")
	public WebElement designPattern_dd;
	
	public void clickOnDesignPattern() {
		UtilityMethods.clickAction(designPattern_dd);
	}
	
	@FindBy(xpath = "(//div[@class='search-wrapper searchWrapper '])[5]")
	public WebElement database_dd;
	
	@FindBy(xpath = "(//div[@class='search-wrapper searchWrapper '])[6]")
	public WebElement verContSystm_dd;
	
	@FindBy(xpath = "(//div[@class='search-wrapper searchWrapper '])[7]")
	public WebElement aws_dd;
	
	@FindBy(xpath = "(//div[@class='search-wrapper searchWrapper '])[8]")
	public WebElement sdlc_dd;
	
	public void clickOnSdlcDD() {
		UtilityMethods.clickAction(sdlc_dd);
	}
	
	public void selectSdlcAsWaterfallModel() {
		clickOnSdlcDD();
		UtilityMethods.clickAction(driver.findElement(By.xpath("//li[contains(text(),'Waterfall model and agile Git')]")));
	}
	
	@FindBy(xpath = "(//div[@class='search-wrapper searchWrapper '])[9]")
	public WebElement devTools_dd;
	
	public void clickOnDevTools() {
		UtilityMethods.clickAction(devTools_dd);
	}
	
	public void selectDevToolAsMaven() {
		clickOnDevTools();
		UtilityMethods.clickAction(driver.findElement(By.xpath("//li[contains(text(),'Maven')]")));
	}
	
	@FindBy(xpath = "(//div[contains(@class,'multiselect-container multiSelectContaine')])[1]")
	public WebElement frontends_checkbox_status;
	
	public String getFrontendCheckboxStatus() {
		return frontends_checkbox_status.getAttribute("class");
	}
	
	public void selectFrontEndTechByVisibleText(String tech) {
		clickOnFrontendTech();
		String path = "//li[contains(text(),'"+tech+"')]";
		UtilityMethods.clickAction(driver.findElement(By.xpath(path)));
	}
	
	public void selectbackEndTechByVisibleText(String tech) {
		clickOnBackEndTech();
		String path = "//li[contains(text(),'"+tech+"')]";
		UtilityMethods.clickAction(driver.findElement(By.xpath(path)));
	}
	
	
	public void clickOnFrontendTech() {
		UtilityMethods.clickAction(frontEndTech_dd);
	}
	
	public void clickOnFrontendCheckbox() {
		UtilityMethods.clickAction(frontend_checkbox);
	}
	
	
}
