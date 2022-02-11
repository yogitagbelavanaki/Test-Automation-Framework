package pom_scripts;

import java.rmi.server.UID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

public class ProjectDetailsPage 
{
	public ProjectDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);  
	}
	
	@FindBy(xpath = "//input[@maxlength=\"50\"]")
	WebElement projNameEle;
	
	public void enterProjName(String proName)
	{
		UtilityMethods.enter_value(projNameEle, proName);
	}
	//Frontend Technology
	@FindBy(xpath = "(//div[@class=\"search-wrapper searchWrapper \"])[1]")
    WebElement frontTechEle;
	
	public void clickOnFrontEnd()
	{
		UtilityMethods.clickAction(frontTechEle);
	}
	
	@FindBy(xpath = "//li[text()='HTML']")
	WebElement javaScri;
	
	
	public void clickOnJs()
	{
		UtilityMethods.clickAction(javaScri);
	}
	
	//Backend Technology
	@FindBy(xpath ="//input[@placeholder=\"Backend Technologies\"]")
	WebElement backendTechEle;
	
	public void clickOnBackEnd()
	{
	 UtilityMethods.clickAction(backendTechEle);
	}
	
	
	@FindBy(xpath = "//li[text()='Java 1.8']")
	WebElement javaEle;
	
	public void clickOnJava()
	{
	  UtilityMethods.clickAction(javaEle);	
	}
	
	@FindBy(xpath = "(//div[@class=\"search-wrapper searchWrapper \"])[3]")
	WebElement middleWareEle;
	
	public void clickOnMiddleware()
	{
	  	UtilityMethods.clickAction(middleWareEle);
	}
	
	//click on restFull
	@FindBy(xpath ="//li[text()='RestFull Services']")
	WebElement restFullWeb;
	
	public void clickOnrestFull()
	{
	  UtilityMethods.clickAction(restFullWeb);	
	}
	
	//click on design Pattern
	@FindBy(xpath = "//input[@placeholder=\"Design Patterns\"]")
	WebElement designPatEle;
	
	public void clicOndesignPatt()
	{
		UtilityMethods.clickAction(designPatEle);
	}
	
	@FindBy(xpath = "//li[text()='Singleton']")
	WebElement singleTonEle;
	
	public void clickOnSingleTon()
	{
	  UtilityMethods.clickAction(singleTonEle);
	}
	
   //Duration 
	@FindBy(xpath = "//select[@id=\"Duration\"]")
	WebElement durationWebEle;
	
	public void selectDuration(String value)
	{
	 UtilityMethods.clickAction(durationWebEle);
	 UtilityMethods.select_classObject(durationWebEle).selectByValue(value);
	}
	
	//Team Size
	@FindBy(xpath = "//input[@min=\"1\"]")
	WebElement teamSizeEle;
	
	public void enterTeamSize(String size)
	{
	  UtilityMethods.enter_value(teamSizeEle, size);	
	}
	
	//enter project discription
	@FindBy(xpath = "(//input[@maxlength=\"1000\"])[1]")
	WebElement projDes;
	
	public void enterProjDescrip(String descrip)
	{
	UtilityMethods.enter_value(projDes, descrip);	
	}
	
	//Enter roles and responsiblity
	@FindBy(xpath = "(//input[@maxlength=\"1000\"])[2]")
	WebElement roleEle;
	
	public void enterRolesAnd(String roles)
	{
	 UtilityMethods.enter_value(roleEle, roles);	
	}
	
	
	//Uncheck Devlopment tool
	@FindBy(xpath = "(//input[@class=\"checkBox\"])[5]")
    WebElement uncheckDevlopmentToolEle;
    
	public void uncheckDevlopTool()
	{
	  UtilityMethods.clickAction(uncheckDevlopmentToolEle);	
    }
	
	
	
	
}
