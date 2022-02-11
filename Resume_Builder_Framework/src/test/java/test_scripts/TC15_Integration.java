package test_scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.ProfilePage;

public class TC15_Integration extends BaseClass
{
	
	@Test  
	 public void TC_15() throws InterruptedException  
	 {
		  
		ProfilePage page=new ProfilePage(driver);
		page.clickFirstname();
		page.enter_DataInFirstName("likhitha");
	
		page.CheckFirstName();
	 }
	}
