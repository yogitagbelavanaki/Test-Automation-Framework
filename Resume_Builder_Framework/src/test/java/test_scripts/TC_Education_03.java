package test_scripts;

import org.testng.annotations.Test;

import generic.BaseClass;
import pom_scripts.EducationPage;
import pom_scripts.HomePage;

public class TC_Education_03 extends BaseClass
{
	@Test(groups=("Functional_TestCase"))
	public void testCase() 
	{
		HomePage page=new HomePage(driver);
		page.ClickOnEducation();
		
		EducationPage edu=new EducationPage(driver);
		edu.clickonSecialization();
	}
}
