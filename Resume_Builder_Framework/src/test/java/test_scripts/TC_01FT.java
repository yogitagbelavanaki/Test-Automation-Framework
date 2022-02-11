package test_scripts;

import org.testng.annotations.Test;

import generic.BaseClass;
import generic.BaseTest;
import pom_scripts.Profile;

public class TC_01FT extends BaseClass{

@Test
//To verify that user is able to click on profile module
public void Profile()
{
	Profile  page=new Profile(driver);
	page.ClickProfile();
}
	

}
