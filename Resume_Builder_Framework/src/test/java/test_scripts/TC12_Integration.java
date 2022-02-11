package test_scripts;

import org.testng.annotations.Test;

import generic.BaseClass;
import pom_scripts.EducationPage;
import pom_scripts.HomePage;

public class TC12_Integration extends BaseClass
{
	
@Test
public void Resume() throws InterruptedException
{
	HomePage page=new HomePage(driver);
	page.clickEducation();
	EducationPage page1=new EducationPage(driver);
	page1.ClickHighestEducation();
	page1.selectTechnologyByVisibleText("value");
	page1.CheckEducationInTempalte();
	
	
}
}

