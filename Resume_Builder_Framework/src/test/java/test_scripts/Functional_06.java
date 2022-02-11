package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseClass;
import pom_scripts.HomePage;
import pom_scripts.SkillsPage;

public class Functional_06 extends BaseClass{
	
	@Test(groups = "Functional_TestCase")
	public void functional_06() {
		
		HomePage home_page = new HomePage(driver);
		home_page.clickOnSkillsModule();
		
		SkillsPage skill_page = new SkillsPage(driver);
		boolean unchecked = false;
		if(skill_page.getFrontendCheckboxStatus().contains("disable_ms")) {
			skill_page.clickOnFrontendCheckbox();
			unchecked=true;
		}
		else {
			skill_page.clickOnFrontendCheckbox();
			skill_page.clickOnFrontendCheckbox();
			unchecked=true;
		}
		Assert.assertTrue(unchecked,"User is not able to deselect frontend checkbox");
		
	}

}
