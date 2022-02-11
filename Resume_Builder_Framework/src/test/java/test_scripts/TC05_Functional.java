package test_scripts;

import org.testng.annotations.Test;

import generic.BaseClass;
import pom_scripts.HomePage;

public class TC05_Functional extends BaseClass
{

	@Test
	public void Resume()
	{
		HomePage page=new HomePage(driver);
		page.clickProject();
	}
}
