package test_scripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.Profile;

//verify  that if user enter data in first name textfield it should be display in template
public class TC011_IT extends BaseClass {
	@Test
	@DataProvider(name="TestData")
	public Object[][] getTestData()
	{
		ReadExcel read=new ReadExcel();
			Object [][]data=read.getMultipleData("Sheet4")	;
			return data;
		
	}
	@Test(dataProvider="TestData")
	public void FN(String firstname)
	{
		Profile  page=new Profile(driver);
		page.ClickProfile();
		page.fn();
		page.enter_Data(firstname);
		String check=page.Checkfn();
		Assert.assertTrue(check.contains(firstname));

	}

}
