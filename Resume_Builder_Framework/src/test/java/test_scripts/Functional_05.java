package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseClass;
import pom_scripts.ProfilePage;

public class Functional_05 extends BaseClass{

	@Test(groups = "Functional_TestCase")
	public void functional_05() {
		ProfilePage profile_page = new ProfilePage(driver);
		Assert.assertTrue(profile_page.getFirstNameLocator().equals("FirstName"), "First name locator is different");
	}
	
	
}
