package test_scripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.SamplePOMScript;

public class SampleTestScript extends BaseClass{
	
	@Test (dataProvider = "testData")
	public void testCase(String fn) throws InterruptedException {
		
		SamplePOMScript pom=new SamplePOMScript(driver);
		pom.EnterFirstName(fn);
		Thread.sleep(3000);
		
	}
	
	@DataProvider(name = "testData")
	public String[][]  getTestData() {
		ReadExcel read=new ReadExcel();
		return read.getMultipleData("Sheet1");
	
	}
	

}
