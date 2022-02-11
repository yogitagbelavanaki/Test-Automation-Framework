package test_scripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.BaseTest;
import generic.ReadExcel;
import pom_scripts.Profile;
//To verify that user is able to  enter the data on lastname textfield

public class TC_06FT extends BaseClass {
	@DataProvider(name="TestData")
	public Object[][] getTestData()
	{
		ReadExcel read=new ReadExcel();
			Object [][]data=read.getMultipleData("sheet2")	;
			return data;
		
	}
	@Test(dataProvider="TestData")
	public void FN(String lastname) throws InterruptedException
	{
		Profile  page=new Profile(driver);
		Thread.sleep(5000);

		page.Enter_lastName(lastname);

	}
		
	}
	
	


