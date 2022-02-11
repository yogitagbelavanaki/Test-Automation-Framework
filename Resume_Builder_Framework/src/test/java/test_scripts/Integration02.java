package test_scripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.ProfilePage;

public class Integration02 extends BaseClass{

	
	@DataProvider(name = "exp")
	public Object[][] data() {
		ReadExcel read = new ReadExcel();
		Object[][] data = read.getMultipleData("integration02");
		return data;
	}
	
	@Test(groups = "Integration_TestCase", dataProvider = "exp")
	public void integration02(String exp) {
		ProfilePage profile_page = new ProfilePage(driver);
		profile_page.selectTotalExpYearByVisibleText(exp);
		Assert.assertTrue(profile_page.getTotalExpInYrsFromResume().contains(exp));
	}
	
}
