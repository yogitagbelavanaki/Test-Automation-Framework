package test_scripts;

import org.testng.annotations.Test;

import generic.BaseClass;
import pom_scripts.ProfilePage;

public class TC06_Functional extends BaseClass
{
	@Test
	public void Resume()
	{
		ProfilePage page=new ProfilePage(driver);
		page.CheckFirstName();
	}

}
