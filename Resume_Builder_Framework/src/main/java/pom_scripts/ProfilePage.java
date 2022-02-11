package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import generic.UtilityMethods;

public class ProfilePage 
{
	public ProfilePage(WebDriver driver)
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//input[@class=\"tempBtnactive\"]")
	WebElement Template;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement FirstName;
	
	@FindBy(xpath="//div[@Style='padding-right: 20px; font-size: 32px; font-family: \"helvetica Bold\";']")
	WebElement FirstNameTemplate;
	
	@FindBy(xpath="//select[@name=\"dropdown\"] ")
	WebElement Technology_Dropdown;
	
	@FindBy(xpath="(//input[@type=\"text\"])[2]")
	WebElement LastName;
	
	@FindBy(xpath="//select[@id=\"Total Experience\"]")
	WebElement TotalExpYear;
	
	@FindBy(xpath="(//select[@name='dropdown'])[3]")
	WebElement TotalExpmonth;
	
	@FindBy(xpath="//select[@id=\"Relevant Experience\"]")
	WebElement RelaventExp;
	
	@FindBy(xpath="(//select[@name='dropdown'])[5]")
	WebElement relExpMonth;
	
	@FindBy(xpath="//text[@style=\"color: rgb(128, 138, 149);\"]")
	WebElement TechnologyTemplate;
	
	
	
	public void SelectTemplate()
	{
		UtilityMethods.clickAction(Template);
	}
	
	public void CheckTechnologyInTemplate()
	{
		String check=TechnologyTemplate.getText();
		System.out.println("in Template it is "+check);
	}
	
	
	public void clickFirstname()
	{
		UtilityMethods.clickAction(FirstName);
	}
	
	public void Clicklastname()
	{
		UtilityMethods.clickAction(LastName);
	}
	public void TotalRelaventExp()
	{
		Select sel=UtilityMethods.select_classObject(RelaventExp);
		//sel.selectByVisibleText(text);
		sel.selectByIndex(1);
	}
	
	public void RelaventExpMonth()
	{
		Select sel=UtilityMethods.select_classObject(relExpMonth);
		sel.selectByIndex(4);
		
	}
	public void Totalexpmonth()
	{
		Select sel=UtilityMethods.select_classObject(TotalExpmonth);
				sel.selectByIndex(8);
	}
	public void TotalExpYear()
	{
		Select sel=UtilityMethods.select_classObject(TotalExpYear);
		sel.selectByIndex(8);
	}
	
	
	
	public void CheckFirstName()
	{
		String check=FirstNameTemplate.getText();
		
		System.out.println(check);
		
	}
	public void enter_DataInFirstName(String fname)
	{
		FirstName.clear();
		UtilityMethods.enter_value( FirstName,fname);
		
	}
	public void fname()
	{
		FirstName.clear();
		Assert.assertEquals(true, FirstName.isEnabled());
		System.out.println("fname is enabled");
		String Title =FirstName.getAttribute("value");
		Assert.assertEquals(Title, "FirstName");
		FirstName.click();
	}
	
	public void clickTechnology()
	{
		Assert.assertEquals(true,Technology_Dropdown.isEnabled());
		UtilityMethods.clickAction(Technology_Dropdown);
	}

	public void selectTechnologyByVisibleText(String text)
	{
		Select sel=UtilityMethods.select_classObject(Technology_Dropdown);
		//sel.selectByVisibleText(text);
		sel.selectByIndex(1);
	}

	public void clickLastName()
	{
		UtilityMethods.clickAction(LastName);
	}
	public void enter_DataInLastName(String lname)
	{
		LastName.clear();
		UtilityMethods.enter_value( LastName,lname);
		
	}
	
	

	
}



