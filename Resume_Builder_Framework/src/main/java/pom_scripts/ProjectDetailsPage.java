package pom_scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.BaseTest;
import generic.UtilityMethods;

public class ProjectDetailsPage extends BaseTest{
	
	WebDriver driver;
	public ProjectDetailsPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	@FindBy(xpath = "(//div[@class='search-wrapper searchWrapper '])[2]")
	public WebElement backend_tech_dd;
	
	@FindBy(xpath = "(//div[@class='search-wrapper searchWrapper '])[1]")
	public WebElement frontend_tech_dd;
	
	@FindBy(xpath = "(//div[@class='search-wrapper searchWrapper '])[3]")
	public WebElement middleware_tech_dd;
	
	@FindBy(xpath = "(//div[@class='search-wrapper searchWrapper '])[4]")
	public WebElement designpatterns_dd;
	
	@FindBy(xpath = "(//div[@class='search-wrapper searchWrapper '])[5]")
	public WebElement dev_tools_dd;
	
	public void selectDevToolsByVisibleText(String visible_text) {
		List<WebElement> backend_technologies = driver.findElements(By.xpath("(//ul[@class='optionContainer'])[5]//li"));
		for (WebElement webElement : backend_technologies) {
			if(webElement.getText().equals(visible_text)) {
				UtilityMethods.clickAction(webElement);
			}
		}
	}
	
	
	
	@FindBy(xpath = "//label[contains(text(),'Project Name')]")
	public WebElement project_name_tf;
	
	public void enterProjectName(String name) {
		UtilityMethods.enter_value(project_name_tf, name);
	}
	
	public void selectDesignPatternsByVisibleText(String visible_text) {
		List<WebElement> backend_technologies = driver.findElements(By.xpath("(//ul[@class='optionContainer'])[4]//li"));
		for (WebElement webElement : backend_technologies) {
			if(webElement.getText().equals(visible_text)) {
				UtilityMethods.clickAction(webElement);
			}
		}
	}
	
	public void selectMiddlewareTechByVisibleText(String visible_text) {
		List<WebElement> backend_technologies = driver.findElements(By.xpath("(//ul[@class='optionContainer'])[3]//li"));
		for (WebElement webElement : backend_technologies) {
			if(webElement.getText().equals(visible_text)) {
				UtilityMethods.clickAction(webElement);
			}
		}
	}
	
	public void selectFrontEndTechByVisibleText(String visible_text) {
		List<WebElement> backend_technologies = driver.findElements(By.xpath("(//ul[@class='optionContainer'])[1]//li"));
		for (WebElement webElement : backend_technologies) {
			if(webElement.getText().equals(visible_text)) {
				UtilityMethods.clickAction(webElement);
			}
		}
	}
	
	public void selectBackEndTechByVisibleText(String visible_text) {
		List<WebElement> backend_technologies = driver.findElements(By.xpath("(//ul[@class='optionContainer'])[2]//li"));
		for (WebElement webElement : backend_technologies) {
			if(webElement.getText().equals(visible_text)) {
				UtilityMethods.clickAction(webElement);
			}
		}
	}
	
	
	

}
