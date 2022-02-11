package test_scripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.EducationPage;
import pom_scripts.HomePage;

public class Functional_09 extends BaseClass{
	
	@DataProvider(name = "percentage")
	public Object[][] data() {
		ReadExcel read = new ReadExcel();
		Object[][] data = read.getMultipleData("functional09");
		return data;
		
	}
	@Test(groups = "Functional_TestCase", dataProvider = "percentage")
	public void functional_09(String percentage) {
		HomePage home_page = new HomePage(driver);
		home_page.clickOnEducationModule();
		EducationPage edu_page = new EducationPage(driver);
		edu_page.enterPercentage(percentage);
		Assert.assertTrue(percentage.equals(edu_page.getPercentage()));
		
		
	}

}
