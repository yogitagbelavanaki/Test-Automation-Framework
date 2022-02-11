package test_scripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.ProfilePage;

public class Functional_10 extends BaseClass{
	
	@DataProvider(name = "alphanumeric")
	public Object[][] data() {
		ReadExcel read = new ReadExcel();
		Object[][] data = read.getMultipleData("functional10");
		return data;
	}

	@Test(dataProvider = "alphanumeric",groups = "Functional_TestCase")
	public void functional_10(String name) {
		ProfilePage profile_page = new ProfilePage(driver);
		profile_page.enterFirstName(name);
		Assert.assertFalse(name.equals(profile_page.getFirstNameAttribute()), "First name text field not accept alphanumeric");
	}
}
