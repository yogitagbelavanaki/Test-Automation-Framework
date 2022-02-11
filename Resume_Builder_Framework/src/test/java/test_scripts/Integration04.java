package test_scripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.EducationPage;
import pom_scripts.HomePage;

public class Integration04 extends BaseClass{

	
	@DataProvider(name = "education")
	public Object[][] data() {
		ReadExcel read = new ReadExcel();
		Object[][] data = read.getMultipleData("integration04");
		return data;
	}
	
	@Test(groups = "Integration_TestCase", dataProvider = "education")
	public void integration04(String edu) {
		HomePage home_page = new HomePage(driver);
		home_page.clickOnEducationModule();
		EducationPage edu_page = new EducationPage(driver);
		edu_page.selectHighestEducationByVisibleTxt(edu);
		Assert.assertTrue(home_page.getHighestEduFromResume().contains(edu));	
		
		
	}
	
}
