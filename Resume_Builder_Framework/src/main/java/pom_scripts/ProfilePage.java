package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

public class ProfilePage
{
	public ProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);  
	}
	@FindBy(xpath = "(//input[@type=\"text\"])[1]")
	WebElement Fname;
	
	public String enterFname(String Fn)
	{
		Fname.clear();
		UtilityMethods.enter_value(Fname, Fn);
		String f=Fname.getText();
		return f;
	}
	
	@FindBy(xpath = "(//input[@type=\"text\"])[2]")
	WebElement Lname;
	
	public String enterLname(String Ln)
	{
		Lname.clear();
		UtilityMethods.enter_value(Lname, Ln);
		String s=Lname.getText();
		return s;
	}
	
	@FindBy(xpath ="//select[@id=\"Technology\"]")
	WebElement technology;
	
    //for selecting technology	
	public void selectTech()
	{
		UtilityMethods.select_classObject(technology).selectByValue("2");
	}
	
	//for select totalyear of exp in year
	@FindBy(xpath = "(//select[@id=\"Total Experience\"])[1]")
	WebElement totalExYear;
	
	public void selectYearEx(String value)
	{
	   UtilityMethods.select_classObject(totalExYear).selectByValue(value);	
	}
    //in month
	@FindBy(xpath = "(//select[@id=\"Total Experience\"])[2]")
	WebElement totalExMonth;
	
	public void selectMonthEx(String month)
	{
	  UtilityMethods.select_classObject(totalExMonth).selectByValue(month);	
	}
	//Enter relavent Exprience in year
	@FindBy(xpath = "(//select[@id=\"Relevant Experience\"])[1]")
	WebElement releventExpYear;
	
	public void selectRelvExpYear(String value)
	{
	  UtilityMethods.select_classObject(releventExpYear).selectByValue(value);	
	}
	
	//Enter relavent Exprience in month
		@FindBy(xpath = "(//select[@id=\"Relevant Experience\"])[2]")
		WebElement releventExpMonth;
		
		public void selectRelvExpMonth(String value)
		{
		  UtilityMethods.select_classObject(releventExpMonth).selectByValue(value);	
		}
		
	
	
	
	
	
	
}
