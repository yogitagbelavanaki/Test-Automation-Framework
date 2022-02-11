package test_scripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.ProfilePage;

public class Integration01 extends BaseClass{
	
	
	@DataProvider(name = "name")
	public Object[][] data() {
		ReadExcel read = new ReadExcel();
		Object[][] data = read.getMultipleData("integration01");
		return data;
	}
	
	@Test(groups = "Integration_TestCase", dataProvider = "name")
	public void integration01(String name) {
		ProfilePage profile_page = new ProfilePage(driver);
		profile_page.enterFirstName(name);
		Assert.assertTrue(profile_page.firstname_onresume.getText().contains(name));;
	}

}
