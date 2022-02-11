package test_scripts;


import org.testng.annotations.Test;

import generic.BaseClass;
import pom_scripts.SkillPOM;

public class Skills extends BaseClass{

	@Test
	public void tc05()  {
		SkillPOM s = new SkillPOM(driver);
		s.clickSkills();
		s.clickFrontEnd();
	}
}
