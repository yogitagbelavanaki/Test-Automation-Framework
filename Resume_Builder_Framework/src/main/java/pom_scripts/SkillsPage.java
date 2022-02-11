package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generic.UtilityMethods;

public class SkillsPage {
	public SkillsPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='Skills']")
	WebElement skills;
	//click on skills
	public  void ClickSkills()
	{
		UtilityMethods.clickAction(skills);
	}
	//click on frnt tech
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement frnttechnology;
	
	
	public  void Click_frnttech() 
	{
		UtilityMethods.clickAction(frnttechnology);
	}
	//select technology on frnt technology
	@FindBy(xpath="//li[text()='HTML']")
	WebElement html;

  public  void Clickon() 
  {
	  UtilityMethods.clickAction(html);
  }
  
  
  //clcik on backend tech
  @FindBy(xpath="(//input[@type='text'])[2]")
  WebElement backendtechnology ;
  
  public  void Click_backend()
  {
	  UtilityMethods.clickAction(backendtechnology);
  }
  //select technology on backend tech
  @FindBy(xpath="//li[text()='Java 1.8']")
  	WebElement Java;
  
  public  void Click_on()
  {
	 UtilityMethods.clickAction(Java ); 
  }
  @FindBy(xpath="(//div[@style=\"padding-left: 10px; padding-top: 10px; margin-left: 4px; color: rgb(112, 112, 112);\"])[2]")
   WebElement language;
  
	public String Checklanguage()
	{
		String check=language.getText();
		return check;

	}

  //click on middleware technology
  
  @FindBy(xpath="(//input[@class='searchBox'])[3]")
   WebElement middletech;
  
  public  void Cliclk_On_Tech()
  {
	  UtilityMethods.clickAction(middletech);
  }
  //select technology on middleware technology
  @FindBy(xpath="//li[text()='JMS']")
  WebElement JMS;
  
  public void Click_On_Technology()
  {
	  UtilityMethods.clickAction(JMS);
  }
  @FindBy(xpath="(//div[@style=\"padding-left: 10px; padding-top: 10px; margin-left: 4px; color: rgb(112, 112, 112);\"])[3]")
  WebElement language1;
   public String Checklanguage1()
   {
		String check=language1.getText();
		return check;

   }
 // click on Design pattern 
  @FindBy(xpath="(//input[@id='search_input'])[4]")
  WebElement designpattern;
  
  public void Click_on_Dp()
  {
	  UtilityMethods.clickAction(designpattern);
  }
  //select language on design pattern
  
  @FindBy(xpath="//li[text()='Singleton']")
  WebElement singltone;
  
  public void Click_On_STechnology()
  {
	  UtilityMethods.clickAction(singltone);
  }
  @FindBy(xpath="(//div[@style=\"padding-left: 10px; padding-top: 10px; margin-left: 4px; color: rgb(112, 112, 112);\"])[4]")
  WebElement checkTempSingTone;
  
  public String checkOntemplateSingletone() 
  {
		String check=checkTempSingTone.getText();
		return check;
  }
}
