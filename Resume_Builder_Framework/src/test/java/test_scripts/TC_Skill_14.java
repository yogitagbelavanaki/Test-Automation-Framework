package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseClass;
import pom_scripts.HomePage;
import pom_scripts.SkillPage;

public class TC_Skill_14 extends BaseClass
{
	@Test(groups=("Integration_TestCase"))
	public void testCase() 
	{
		HomePage page=new HomePage(driver);
		page.ClickOnSkill();
		
		SkillPage skillPage=new SkillPage(driver);
		
		skillPage.clickMiddleare();
		
		skillPage.selectRestFull();
		
		String result=page.checkkMiddleare();
		
		Assert.assertTrue(result.contains("RestFull"));
		System.out.println("Showing in template");
	}
}
