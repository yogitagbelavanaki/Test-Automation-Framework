package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseClass;
import pom_scripts.SkillsPage;
//verify that selected technology should display in template
public class TC_014IT extends BaseClass{
	@Test
	public void TC014() throws InterruptedException
	{
		SkillsPage sp=new SkillsPage(driver);
		sp.ClickSkills();
			Thread.sleep(1000);
			//click on middleware technology 
			sp.Cliclk_On_Tech();
			// click on jms language
			sp.Click_On_Technology();
			String check=sp.Checklanguage1();
			Assert.assertTrue(check.contains("JMS"));

			
			

	}

}
