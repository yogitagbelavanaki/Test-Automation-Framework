package test_scripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.HomePage;
import pom_scripts.SkillsPage;

public class Integration05 extends BaseClass{
	
	@DataProvider(name = "technologies")
	public Object[][] data() {
		ReadExcel read = new ReadExcel();
		Object[][] data = read.getMultipleData("integration05");
		return data;
	}
	
	@Test(groups = "Integration_TestCase", dataProvider = "technologies")
	public void integration05(String tech) {
		HomePage home_page = new HomePage(driver);
		home_page.clickOnSkillsModule();
		SkillsPage skill_page = new SkillsPage(driver);
		skill_page.selectFrontEndTechByVisibleText(tech);
		Assert.assertTrue(home_page.getFrontEndTechFromResume().contains(tech));
		
       
	}

}
