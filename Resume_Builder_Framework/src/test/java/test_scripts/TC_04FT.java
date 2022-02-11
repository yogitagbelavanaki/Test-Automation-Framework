package test_scripts;

import org.testng.annotations.Test;

import generic.BaseClass;
import pom_scripts.Profile;

public class TC_04FT extends BaseClass {
	@Test
	//to verify that user is able to click on download button
	public void ClickOndownload() {
		Profile  page=new Profile(driver);
		page.Download();
}

}
