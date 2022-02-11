package test_scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.HomePage;
import pom_scripts.ProfilePage;

public class TC10_Functional extends BaseClass
{
	  
@Test
public void Tc() throws InterruptedException
{
	
	HomePage page=new HomePage(driver);
	ProfilePage page1=new ProfilePage(driver);
	page1.clickFirstname();
	page1.enter_DataInFirstName("likhitha");
	page1.clickLastName();
	page1.enter_DataInLastName("nisha");
	page.clicklogo();
	
	page.ClickIncludeProfilePic();
	
}
}




