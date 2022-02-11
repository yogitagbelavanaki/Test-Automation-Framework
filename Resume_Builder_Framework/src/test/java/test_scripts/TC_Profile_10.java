package test_scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.HomePage;
import pom_scripts.ProfilePage;

public class TC_Profile_10 extends BaseClass
{
	@DataProvider(name="TestData")
	public Object[][] dataProvide() throws IOException
	{
		ReadExcel excel=new ReadExcel();
	    Object[][] data=excel.getMultipleData("FnameSpecial");
	    return data;	
	}	
	@Test(dataProvider="TestData",groups=("Functional_TestCase"))
	public void testCase(String Fname) 
	{
		HomePage page=new HomePage(driver);
		page.clickOnProfile();
		
		ProfilePage profPage=new ProfilePage(driver);
		String g=profPage.enterFname(Fname);
		
		Assert.assertFalse("@#@".equals(g));
   }
}
