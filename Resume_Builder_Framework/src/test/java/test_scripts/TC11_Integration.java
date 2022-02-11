package test_scripts;

import org.testng.annotations.Test;

import generic.BaseClass;
import pom_scripts.ProfilePage;

public class TC11_Integration extends BaseClass
{

	@Test
	public void Resume() throws InterruptedException
	{
		ProfilePage page=new ProfilePage(driver);
		
		page.clickTechnology();
		page.selectTechnologyByVisibleText("value");
		page.CheckTechnologyInTemplate();
	
	}
}
