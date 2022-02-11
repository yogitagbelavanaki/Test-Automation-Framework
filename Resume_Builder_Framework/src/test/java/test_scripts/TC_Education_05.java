package test_scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.EducationPage;
import pom_scripts.HomePage;

public class TC_Education_05 extends BaseClass
{
	
	@DataProvider(name="TestData")
	public Object[][] dataProvide() throws IOException
	{
		ReadExcel excel=new ReadExcel();
	    Object[][] data=excel.getMultipleData("PassOut");
	    return data;
	}
	 @Test(dataProvider="TestData",groups=("Functional_TestCase"))
	   public void testcase(String PassYear)
	   {
		    HomePage page=new HomePage(driver);
			page.ClickOnEducation();
			EducationPage edu=new EducationPage(driver);
			edu.EnterPassOutYear(PassYear);
	   }   
}
