package test_scripts;

import org.testng.annotations.Test;

import generic.BaseClass;
import generic.BaseTest;
import pom_scripts.HomePage;

public class TC03_Functional extends BaseClass
{
	@Test
	 public void Resume3()
	 {
		 HomePage page1=new HomePage(driver);
		 page1.clickSkills();
			
		 
	 }
	}



