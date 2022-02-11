package test_scripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.Profile;
import pom_scripts.Summary;
//To verify that user is able to enter the data on typehere textfield in summary module
public class TC_08FT extends BaseClass {
	@DataProvider(name="TestData")
	public Object[][] getTestData()
	{
		ReadExcel read=new ReadExcel();
			Object [][]data=read.getMultipleData("sheet3")	;
			return data;
		
	}
	@Test(dataProvider="TestData")
	public void Type(String typehere) throws InterruptedException
	{
		System.out.println(typehere);
		Summary summary=new Summary(driver);
		summary.ClickSummary();
		Thread.sleep(1000);
		
		Summary.ClickTypeHere();

		summary.enter_Data(typehere);

	}
		


}
