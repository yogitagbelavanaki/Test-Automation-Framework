package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import generic.UtilityMethods;

public class SkillsPage 
{
	public SkillsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='checkBox']")
	WebElement CheckBoxFront;
	
	@FindBy(xpath="//input[@placeholder='Frontend Technologies']")
	WebElement FrontendTech;
	
	@FindBy(xpath="//li[text()=\"CSS\"]")
	WebElement SelectCSS;
	
	@FindBy(xpath="//input[@placeholder=\"Backend Technologies\"]")
	WebElement BackendTech;
	
	@FindBy(xpath="//li[text()=\"Sql\"]")
	WebElement Sql;
	
	@FindBy(xpath="(//div[@style=\"padding-left: 10px; padding-top: 10px; margin-left: 4px; color: rgb(112, 112, 112);\"])[1]")
	WebElement CheckCSSTemplate;
	
	
	public void checkCSSinTemplate()
	{
		String check=CheckCSSTemplate.getText();
		
		System.out.println(check);
		
	}
	
	public void ClickonBackendTech()
	{
		UtilityMethods.clickAction(BackendTech);
	}
	public void clickSql()
	{
		UtilityMethods.clickAction(Sql);
	}

	public void clickcheckbox()
	{
		UtilityMethods.clickAction(CheckBoxFront);
	}
	public void clickFrontTech()
	{
		UtilityMethods.clickAction(FrontendTech);
	}
	public void ClickonCSS()
	{
		UtilityMethods.clickAction(SelectCSS);
	}
}

	