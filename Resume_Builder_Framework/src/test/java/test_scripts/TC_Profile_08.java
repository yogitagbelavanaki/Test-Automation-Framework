package test_scripts;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.HomePage;
import pom_scripts.ProfilePage;

public class TC_Profile_08 extends BaseClass
{
	@DataProvider(name="TestData")
	public Object[][] dataProvide() throws IOException
	{
		ReadExcel excel=new ReadExcel();
	    Object[][] data=excel.getMultipleData("Fname");
	    return data;	
	}	
	@Test(dataProvider="TestData",groups=("Functional_TestCase"))
	public void testCase(String Fname) 
	{
		HomePage page=new HomePage(driver);
		page.clickOnProfile();
		
		ProfilePage profPage=new ProfilePage(driver);
		profPage.enterFname(Fname);
   }
}
