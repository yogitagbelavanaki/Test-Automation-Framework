package test_scripts;

import org.testng.annotations.Test;

import generic.BaseClass;
import generic.BaseTest;
import pom_scripts.Profile;

public class TC_03FT extends BaseClass{
	@Test
	//To verift that user is able to click on lastname textfield

	public void LastName() {
		Profile  page=new Profile(driver);
		page.ln();

	}

}
