package pom_scripts;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import generic.UtilityMethods;

public class EducationPage 
{
	public EducationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);  
	}
	
	@FindBy(xpath = "(//select[@name=\"dropdown\"])[1]")
	WebElement heighestEducation;
	
	public void clickOnHeighestEducation()
	{
	    UtilityMethods.clickAction(heighestEducation);
	    UtilityMethods.select_classObject(heighestEducation).selectByValue("0");
	    
	}
	
	@FindBy(xpath = "//select[@id=\"Specialization\"]")
	WebElement specialization;
	
	public void clickonSecialization()
	{
		UtilityMethods.clickAction(specialization);
		UtilityMethods.select_classObject(specialization).selectByValue("3");
	}
	
	@FindBy(xpath = "(//select[@id=\"University\"])[1]")
	WebElement university;
	
	public void clickOnUniversity()
	{
		UtilityMethods.clickAction(university);
		UtilityMethods.select_classObject(university).selectByValue("4");
	}
	
   @FindBy(xpath = "(//input[@type=\"number\"])[1]")  
   WebElement PassOutYear;
   
   public void EnterPassOutYear(String passYear)
   {
     	UtilityMethods.enter_value(PassOutYear, passYear);
   }
   
   @FindBy(xpath = "//input[@max=\"100\"]")
   WebElement percentage;
  
   
   public void checkPerentage(String perc)
   {
 	  UtilityMethods.enter_value(percentage, perc);
   }
     
   
   @FindBy(xpath = "//text[contains(text(),'year must')]")
   WebElement msg;
   
   public void CheckErrorMsg()
   {
	 String m=msg.getText();
	 System.out.println(m);
	 Assert.assertEquals(m, "year must be above 1950 to below 2040");
   }
   
   
}
