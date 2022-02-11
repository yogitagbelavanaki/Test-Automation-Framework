package test_scripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.ProfilePage;

public class Functional_04 extends BaseClass{
	
	@DataProvider(name = "characters")
	public Object[][] data(){
		ReadExcel read = new ReadExcel();
		Object[][] data = read.getMultipleData("functional04");
		return data;
	}
	
	@Test(groups = "Functional_TestCase", dataProvider = "characters")
	public void functional_04(String character) {
		ProfilePage profile_page = new ProfilePage(driver);
		profile_page.enterFirstName(character);
	}

}
