package test_scripts;

import org.testng.annotations.Test;

import generic.BaseClass;
import pom_scripts.HomePage;
import pom_scripts.SkillsPage;



public class TC13_Integration extends BaseClass
{

	@Test 
	public void Resume() throws InterruptedException
	{
		HomePage page=new HomePage(driver);
		page.clickSkills();
		
		SkillsPage page1=new SkillsPage(driver);
		Thread.sleep(1000);
		page1.clickFrontTech();
		Thread.sleep(1000);
		page1.ClickonCSS();
		page1.checkCSSinTemplate();
		
	}
}


