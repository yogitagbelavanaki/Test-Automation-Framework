package test_scripts;

import org.testng.annotations.Test;

import generic.BaseClass;
import pom_scripts.HomePage;

public class Functional_02 extends BaseClass{

	@Test(groups = "Functional_TestCase")
	public void functional_02() {
		HomePage home_page = new HomePage(driver);
		home_page.clickOnProfileModule();
		
	}
	
	
}
