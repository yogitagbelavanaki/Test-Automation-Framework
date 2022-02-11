package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseClass;
import pom_scripts.HomePage;

public class Functional_01 extends BaseClass {
	
	@Test(groups = "Functional_TestCase")
	public void functional_01() {
		HomePage home_page = new HomePage(driver);
		Assert.assertTrue(home_page.profile_module.isEnabled());
	}

}
