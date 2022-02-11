package test_scripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.BaseTest;
import generic.ReadExcel;
import pom_scripts.Profile;
//To verify that user is able to  enter the data on firstname textfield
public class Tc_05FT extends BaseClass {
	@DataProvider(name="TestData")
	public Object[][] getTestData()
	{
		ReadExcel read=new ReadExcel();
			Object [][]data=read.getMultipleData("sheet1")	;
			return data;
		
	}
	@Test(dataProvider="TestData")
	public void FN(String firstname)
	{
		Profile  page=new Profile(driver);
		page.fn();

		page.enter_Data(firstname);

	}
		
	}
	
	





