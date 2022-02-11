package test_scripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
//validate the user is able to enter last name it should be display in template
import generic.ReadExcel;
import pom_scripts.Profile;
//verify  that if user enter data in last name textfield it should be display in template

public class TC_012_IT extends BaseClass{
	@Test
	@DataProvider(name="TestData")
	public Object[][] getTestData()
	{
		ReadExcel read=new ReadExcel();
			Object [][]data=read.getMultipleData("Sheet5");
			return data;
		
	}
	@Test(dataProvider="TestData")
	public void LN(String lastname) throws InterruptedException
	{
		Profile  page=new Profile(driver);
		page.ClickProfile();
		page.ln();
		page.Enter_lastName(lastname);
		//page.enter_Data(lastname);
		String check=page.Checklastn();
		Assert.assertTrue(check.contains(lastname));

	}

}

	


