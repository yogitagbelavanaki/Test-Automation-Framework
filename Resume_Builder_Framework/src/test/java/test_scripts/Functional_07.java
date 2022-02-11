package test_scripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.ProfilePage;

public class Functional_07 extends BaseClass{
	
	@DataProvider(name = "number")
	public Object[][] numbers() {
		ReadExcel read = new ReadExcel();
		Object data[][] = read.getMultipleData("functional07");
		return data;
	}
	
	@Test(groups = "Functional_testCase", dataProvider = "number")
	public void functional_07(String number) {
		ProfilePage profile_page = new ProfilePage(driver);
		profile_page.enterFirstName(number);
		Assert.assertFalse(profile_page.getFirstNameAttribute().equals(number));
	}

}
