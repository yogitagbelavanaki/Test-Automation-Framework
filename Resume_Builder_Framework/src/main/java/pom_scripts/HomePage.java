package pom_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;
import generic.UtilityMethods;

public class HomePage 
{
	WebDriver driver;
    public HomePage(WebDriver driver)
	{
    	this.driver=driver;
		PageFactory.initElements(driver,this);  
	}

	@FindBy(xpath = "//button[text()='Profile']")
	WebElement ProfileModule;
	
	public void clickOnProfile()
	{
		UtilityMethods.clickAction(ProfileModule);
	}

	
	@FindBy(xpath ="//button[contains(text(),'Education')]")
	WebElement educationModule;
	
	public void ClickOnEducation()
	{
		UtilityMethods.clickAction(educationModule);
	}
	
	@FindBy(xpath ="//button[contains(text(),'Skills')]")
	WebElement skillEle;
	
	public void ClickOnSkill()
	{
     UtilityMethods.clickAction(skillEle);		
	}
	
   @FindBy(xpath = "(//button[contains(text(),Summary)])[2]")
   WebElement summary;
	
   public void clickOnSummary()
   {
	UtilityMethods.clickAction(summary);
   }
	
   //Click On Project Details
   @FindBy(xpath = "//button[text()='ProjectDetails']")
   WebElement projectModule;
   
   public void clickOnProjectModule()
   {
	 UtilityMethods.clickAction(projectModule);   
   }
   

	//template
	@FindBy(xpath = "//div[contains(@style,'padding-right: 20px; fo')]")
	WebElement tempFname;
	
	public String checkFname()
	{
      String check=tempFname.getText();
      return check;
	}
	
	@FindBy(xpath ="(//td[@style=\"width: 600px; border: 1px solid rgb(112, 112, 112); border-radius: 5px; height: 36px;\"])[2]")
	WebElement checkBackTech;
	
    public String checkBackEndtech()
    {
    	String backCheck=checkBackTech.getText();
    	return backCheck;
    }
  
    
  @FindBy(xpath = "(//div[@style=\"padding-left: 10px; padding-top: 10px; margin-left: 4px; color: rgb(112, 112, 112);\"])[3]") 
  WebElement ckeckmiddleTech;
  
  public String checkkMiddleare()
  {
	String middle=ckeckmiddleTech.getText();
	return middle;
  }
 
  //deselect the photo from template
  @FindBy(xpath = "(//input[@class=\"checkBox\"])[7]")
  WebElement inclProgPic;
  
  public void uncheckProfPic()
  {
	  UtilityMethods.clickAction(inclProgPic);
  }
  
  //Uncheck Include logo
  @FindBy(xpath ="(//input[@type=\"checkbox\"])[1]")
  WebElement unCheckInclude;
  
  public void clickOnUncheck()
  {
	UtilityMethods.clickAction(unCheckInclude);  
  }
  
  
  
  
  
  
  //For downlode the resume
  @FindBy(xpath = "//button[contains(text(),'Downl')]")
  WebElement downlodBtn;
  
  public void clicOnDownlode()
  {
	Actions action=new Actions(driver);
	action.moveToElement(downlodBtn).build().perform();
	driver.findElement(By.xpath("//button[text()='PDF']")).click();
  }  
  
  
  
  
  
}
