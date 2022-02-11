package test_scripts;

import java.io.IOException;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.EducationPage;
import pom_scripts.HomePage;

public class TC_Eductaion_06 extends BaseClass
{
@DataProvider(name="TestData")
public Object[][] dataProvide() throws IOException
{
	ReadExcel excel=new ReadExcel();
    Object[][] data=excel.getMultipleData("PassOut1");
    return data;
	
}	
	@Test(dataProvider="TestData",groups=("Functional_TestCase"))
	public void testCase(String PassYear) 
	{
		HomePage page=new HomePage(driver);
		page.ClickOnEducation();
		
		EducationPage edu=new EducationPage(driver);
		edu.EnterPassOutYear(PassYear);
		edu.CheckErrorMsg();	
   }
}
