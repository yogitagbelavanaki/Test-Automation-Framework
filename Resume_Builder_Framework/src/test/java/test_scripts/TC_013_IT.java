package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseClass;
import pom_scripts.SkillsPage;

public class TC_013_IT extends BaseClass{
	@Test
	public void TC013() throws InterruptedException
	{
		SkillsPage sp=new SkillsPage(driver);
		sp.ClickSkills();
			Thread.sleep(1000);
			sp.Click_backend();
			Thread.sleep(5000);
			sp.Click_on();
			String check=sp.Checklanguage();
			Assert.assertTrue(check.contains("java"));


	}

}
