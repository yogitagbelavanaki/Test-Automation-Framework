package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseClass;
import pom_scripts.HomePage;

public class Functional_08 extends BaseClass{
	
	@Test(groups = "Functional_TestCase")
	public void functional_08() {
		HomePage home_page = new HomePage(driver);
		Assert.assertTrue(home_page.download_as_button.isEnabled());
	}

}
