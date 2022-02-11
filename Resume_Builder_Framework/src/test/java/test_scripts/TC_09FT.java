package test_scripts;

import org.testng.annotations.Test;

import generic.BaseClass;
import pom_scripts.SkillsPage;
//To verify that user is able to click on skills module
public class TC_09FT extends BaseClass{
	@Test
	public  void Skills()
	{
		SkillsPage sp=new SkillsPage(driver);
		sp.ClickSkills();
	}

}
