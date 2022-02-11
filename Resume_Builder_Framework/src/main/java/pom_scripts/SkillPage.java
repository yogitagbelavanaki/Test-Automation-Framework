package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

public class SkillPage 
{
	public SkillPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);  
	}
	
	@FindBy(xpath = "(//input[@class=\"checkBox\"])[1]")
	WebElement frontEndTech;
	
	public void clickOnFrountEndTech()
	{
		UtilityMethods.clickAction(frontEndTech);
	}
	
	@FindBy(xpath ="//input[@placeholder=\"Frontend Technologies\"]")
    WebElement FroFront;
     
	public void SearchOnFrountEnd()
	{
	  UtilityMethods.clickAction(FroFront);	
	}
	
	@FindBy(xpath = "(//input[@class=\"checkbox\"])[2]")
	WebElement javaScri;
	
	
	public void clickOnJs()
	{
		UtilityMethods.clickAction(javaScri);
	}
	
	@FindBy(xpath = "(//div[@class=\"multiselect-data\"])[2]")
	WebElement backEnd;
	
	public void clickOnBackend()
	{
	  UtilityMethods.clickAction(backEnd);	
	}
	
	@FindBy(xpath = "(//input[@placeholder=\"Backend Technologies\"]/../following-sibling::div/child::ul/child::li)[1]")
	WebElement java1;
	
	public void clickOnJava()
	{
	   UtilityMethods.clickAction(java1);	
	}
	
	@FindBy(xpath = "(//div[@class=\"search-wrapper searchWrapper \"])[3]") 
	  WebElement middleTech;
	  
	  public void clickMiddleare()
	  {
		UtilityMethods.clickAction(middleTech);	
	  }
		
	  @FindBy(xpath = "//li[text()='RestFull Services']")
	  WebElement restFull;
	  
	  public void selectRestFull()
	  {
	     UtilityMethods.clickAction(restFull);	  
	  }
	  
	  @FindBy(xpath = "//li[text()='Soap Services']")
	  WebElement SopServ;
	  
	  public void selectSoap()
	  {
		UtilityMethods.clickAction(SopServ);  
	  }
	  
	  //Design Pattern
	  @FindBy(xpath = "//input[@placeholder=\"Design Patterns\"]")
	  WebElement designPat;
	  
	 public void clickOnDesignPat()
	 {
		UtilityMethods.clickAction(designPat); 
	 }
	  
	 @FindBy(xpath = "//li[text()='Singleton']")
	 WebElement clickOnSingle;
	 
	 public void clickOnSingletone()
	 {
	     UtilityMethods.clickAction(clickOnSingle);	 
	 }
	 
	 @FindBy(xpath = "//input[@placeholder=\"DataBase used\"]")
	 WebElement dataBaseUsed;
	 
	 public void clickOnDataBaseUsed()
	 {
        UtilityMethods.clickAction(dataBaseUsed);		 
	 }
	 
	 @FindBy(xpath = "//li[text()='Oracle 10g']")
	 WebElement oracalEle;
	 
	 public void clickOnOracal()
	 {
		 UtilityMethods.clickAction(oracalEle);
	 }
	 
	@FindBy(xpath ="//input[@placeholder=\"Version Control System\"]")
	WebElement versionElemen;
	
   	public void clickOnVersion()
   	{
   		UtilityMethods.clickAction(versionElemen);
   	}
	
   @FindBy(xpath ="//li[text()='Gitlab']")
    WebElement gitlabEle;
   
   public void clickOngitLab()
   {
	UtilityMethods.clickAction(gitlabEle);   
   }
		
   //Unselect the AWS 
   @FindBy(xpath = "(//input[@class=\"checkBox\"])[7]")
   WebElement deSelelectWeb;
   
   public void deselectAWS()
   {
	 UtilityMethods.clickAction(deSelelectWeb);   
   }
   
   @FindBy(xpath = "(//input[@class=\"checkBox\"])[8]")
   WebElement deselctSDlcEle;
   
   public void clickOnSDLC()
   {
	 UtilityMethods.clickAction(deselctSDlcEle);   
   }
   
   @FindBy(xpath = "//input[@placeholder=\"Development Tools\"]")
   WebElement clickOnTool;
   
   public void clickTool()
   {
	UtilityMethods.clickAction(clickOnTool);   
   }
   
   @FindBy(xpath = "//li[text()='Maven']")
   WebElement mavenWeb;
   
   public void clickOnMaven()
   {
	   UtilityMethods.clickAction(mavenWeb);
   }
   
   
   
   
   
   
   
    
   
}
       