package test_scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.ProfilePOM;

public class Profile extends BaseClass{

	@Test
	public void tc01() {
		ProfilePOM p1 = new ProfilePOM(driver);
		p1.clickProfile();
	}

	@Test
	public void tc02() {
		ProfilePOM p2 = new ProfilePOM(driver);
		p2.firstName();
	}

	@DataProvider(name="TestData")
	public Object[][] getTestData() {
		ReadExcel r = new ReadExcel();
		Object[][] data = r.getMultipleData("fname"); //to enter characters
		//Object[][] data = r.getMultipleData("chars");  //to enter twenty characters
		return data;
	}

	@Test(dataProvider="TestData")
	public void tc03(String value) {
		ProfilePOM p3 = new ProfilePOM(driver);
		p3.enterData(value); // test case to enter characters
		//p3.enterTwentyChar(value); // test case to enter twenty characters
	}

}
