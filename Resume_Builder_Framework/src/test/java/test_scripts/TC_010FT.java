package test_scripts;

import org.testng.annotations.Test;

import generic.BaseClass;
import pom_scripts.SkillsPage;
//To verify that user is able to click on frontend technology .
public class TC_010FT extends BaseClass{
	@Test
	public void Technology() throws InterruptedException
	{
		SkillsPage sp=new SkillsPage(driver);
		sp.ClickSkills();
			Thread.sleep(1000);
			//click on technology
            sp.Click_frnttech();
			Thread.sleep(1000);
			//select language
			sp.Clickon();

	}

}
