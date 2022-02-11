package test_scripts;

import org.testng.annotations.Test;

import generic.BaseClass;
import generic.BaseTest;
import pom_scripts.HomePage;
import pom_scripts.SummaryPage;

public class TC02_Functional extends BaseClass
{
	
	    @Test
		public void Resume1()
		{
			
		 HomePage page=new HomePage(driver);
			page.clickSummary();
			
		    
		}
		
		
	}



