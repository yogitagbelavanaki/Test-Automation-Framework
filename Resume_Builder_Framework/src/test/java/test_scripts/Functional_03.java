package test_scripts;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.ProfilePage;

public class Functional_03 extends BaseClass{

	@DataProvider(name = "FirstName")
	public Object[][] data() {
		ReadExcel read = new ReadExcel();
		Object data[][] = read.getMultipleData("Functional03");
		return data;
		
	}
	
	@Test(groups = "Functional_TestCase", dataProvider = "FirstName")
	public void functional_03(String name) {
		ProfilePage profile_page = new ProfilePage(driver);
		profile_page.enterFirstName(name);
		String verify_name = profile_page.getFirstNameAttribute();
		Assert.assertTrue(name.equals(profile_page.getFirstNameAttribute()));
	}
	

}
