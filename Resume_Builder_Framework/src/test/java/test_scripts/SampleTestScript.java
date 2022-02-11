package test_scripts;

import org.testng.annotations.Test;

import generic.BaseClass;
import pom_scripts.HomePage;

public class SampleTestScript extends BaseClass 
{
	
	@Test
	public void testCase() 
	{
	  HomePage page=new HomePage(driver);	
	  page.clickOnUncheck();
	}
}
