package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseClass;
import pom_scripts.HomePage;
import pom_scripts.SkillPage;

public class TC_Skill_15 extends BaseClass
{
	@Test(groups=("Integration_TestCase"))
	public void testCase() 
	{
		HomePage page=new HomePage(driver);
		page.ClickOnSkill();
		
		SkillPage skillPage=new SkillPage(driver);
		
		skillPage.clickMiddleare();
		
		skillPage.selectRestFull();
		
		skillPage.selectSoap();
		
		String result=page.checkkMiddleare();
		
		Assert.assertTrue(result.contains("RestFull"));
		Assert.assertTrue(result.contains("Soap"));
		System.out.println("Showing in template");
  }
}