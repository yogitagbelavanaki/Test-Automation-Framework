package test_scripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.HomePage;
import pom_scripts.ProfilePage;

public class Integration03 extends BaseClass{

	
	@DataProvider(name = "technologies")
	public Object[][] data() {
		ReadExcel read = new ReadExcel();
		Object[][] data = read.getMultipleData("integration03");
		return data;
	}
	
	@Test(groups = "Integration_TestCase", dataProvider = "technologies")
	public void integration03(String tech) {
		ProfilePage profile_page = new ProfilePage(driver);
		profile_page.selectTechnologyByVisibleText(tech);
		
		HomePage home_page = new HomePage(driver);
		Assert.assertEquals(tech,home_page.getTechnologyFromResume());
	}
	
}
