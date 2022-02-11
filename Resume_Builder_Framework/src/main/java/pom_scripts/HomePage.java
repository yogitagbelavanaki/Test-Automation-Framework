package pom_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

public class HomePage
{
	private WebDriver driver;


	public HomePage(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(xpath="//button[text()=\"Summary\"]")
	WebElement Summary;
	
	@FindBy(xpath="//button[text()='Education']")
	WebElement Education;
	
	@FindBy(xpath="//button[text()='Download as']")
	WebElement Downloadas;
	
	//@FindBy(xpath="//button[text()=\"PDF\"]")
	//WebElement PDF;
	
	@FindBy(xpath="//button[text()='Profile']")
	WebElement Profile;
	
	@FindBy(xpath="//button[text()='Skills']")
	WebElement Skills_Button;
	
	@FindBy(xpath="//button[text()='ProjectDetails']")
	WebElement Project;
	
	@FindBy(xpath="//input[@class=\"checkBox\"]")
	WebElement Checkboxlogo;
	
	@FindBy(xpath="//label[text()=\"Include Profile pic\"]")
	WebElement IncludeProfilePic;

	@FindBy(xpath="//input[@class=\"tempBtnactive\"]")
	WebElement Template;
	
	
	public void SelectTemplate()
	{
		UtilityMethods.clickAction(Template);
	}
	
	
	public void clicklogo()
	{
		UtilityMethods.clickAction(Checkboxlogo);
	}
	
	public void ClickIncludeProfilePic()
	{
		UtilityMethods.clickAction(IncludeProfilePic);
	}
	
	/*public void ClickonPDF()
	{
		UtilityMethods.clickAction(PDF);
	
	public void clickDownloadas()
	{
		UtilityMethods.clickAction(Downloadas);
	}*/
		public  void clickEducation()
	{
		UtilityMethods.clickAction(Education);
	}
	
	
	public  void clickProfile()
	{
		UtilityMethods.clickAction(Profile);
	}
	  
	public  void clickSkills()
	{
		UtilityMethods.clickAction(Skills_Button);
	}
	
	public  void clickProject()
	{
		UtilityMethods.clickAction(Project);
	}
	public void clickSummary()
	{
		UtilityMethods.clickAction(Summary);
	}
	public void Downloadas()
	{
		Actions action=new Actions(driver);
		action.moveToElement(Downloadas).build().perform();
		driver.findElement(By.xpath("//button[text()='PDF']")).click();
	}

}

	
	

