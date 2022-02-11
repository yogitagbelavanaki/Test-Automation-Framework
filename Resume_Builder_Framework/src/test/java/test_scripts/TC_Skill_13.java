package test_scripts;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.HomePage;
import pom_scripts.ProfilePage;
import pom_scripts.SkillPage;

public class TC_Skill_13 extends BaseClass
{
	@Test(groups=("Integration_TestCase"))
	public void testCase() 
	{
		HomePage page=new HomePage(driver);
		page.ClickOnSkill();
		
		SkillPage skillPage=new SkillPage(driver);
		
		skillPage.clickOnBackend();
		
		skillPage.clickOnJava();
		
		String result=page.checkBackEndtech();
		
		Assert.assertTrue(result.contains("Java"));
		System.out.println("Showing in template");
   }	
}
