package pom_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import generic.UtilityMethods;

public class Profile {
	WebDriver driver;
	public Profile(WebDriver driver)
	{
		this.driver=driver;

		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='Profile']")
	static
	WebElement profile;
	
	public static void ClickProfile() {
		UtilityMethods.clickAction(profile);
	
	}
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement firstname;
	public void fn()
	{
		//firstname.clear();
		UtilityMethods.clickAction(firstname);
		}
	
	
	public void enter_Data(String fname)
	{
		UtilityMethods.enter_value(firstname, fname);
	}
	@FindBy(xpath="//div[@style='padding-right: 20px; font-size: 32px; font-family: \"helvetica Bold\";']")
	 WebElement firstName;
	
	public String Checkfn()
	{
		String check=firstName.getText();
		return check;
	}
	
	@FindBy(xpath="//input[@value='LastName']")
	WebElement lastname;
	
	public void ln()
	{
		UtilityMethods.clickAction(lastname);
	}
	public void Enter_lastName(String lname)
	{
		UtilityMethods.enter_value(lastname, lname);
	}
	@FindBy(xpath="//div[@style='padding-right: 20px; font-size: 32px; font-family: \"helvetica Bold\";']")
     WebElement LastName1;
	public String Checklastn()
	{
		String check=LastName1.getText();
		return check;
	}

	

	//To verify that select technoloy dropdown is enabled
		@FindBy(xpath="(//select[@name='dropdown'])")
		WebElement technology;
		
		public void ClickTechnology()
		{
			UtilityMethods.clickAction(technology);
		}
		public void Selecttechnology(String text)
		{
			Select sel=UtilityMethods.select_classObject(technology);
			sel.selectByIndex(2);
					
		}
		@FindBy(xpath="(//select[@id='Total Experience'])[1]")
		WebElement exp;
		
		public void Totalexp(String text)
		{
			Select sel=UtilityMethods.select_classObject(exp);
			sel.selectByValue("4");

		}
			@FindBy(xpath="(//select[@name='dropdown'])[3]")
			WebElement exmonth;
			
			public void TotalMonth()
			{
				Select sel=UtilityMethods.select_classObject(exmonth);
				sel.selectByValue("8");

			}
			@FindBy(xpath="(//select[@id='Relevant Experience'])[1]")
			WebElement relexpyear;
			
			public void TotalRelExp()
			{
				Select sel=UtilityMethods.select_classObject(relexpyear);
				sel.selectByIndex(5);

			}
			@FindBy(xpath="(//select[@name='dropdown'])[5]")
			WebElement relmonthexp;
			public void Rel_Month()
			{
				Select sel=UtilityMethods.select_classObject(relmonthexp);
				sel.selectByIndex(5);
			}	
				
	   @FindBy(xpath="//button[text()='Download as']")
	   WebElement downloadbutton;
	  
	   public void Download()
	   {
		  Actions action=new Actions(driver);
		  action.moveToElement(downloadbutton).build().perform();
		  driver.findElement(By.xpath("//button[text()='PDF']")).click();
	   }

			

		}

	
	


