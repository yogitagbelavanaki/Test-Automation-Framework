package test_scripts;

import org.testng.annotations.Test;

import generic.BaseClass;
import pom_scripts.EducationPage;
import pom_scripts.HomePage;
import pom_scripts.ProjectDetails;

public class TC14_Integration extends BaseClass
{

	@Test
	public void Resume() throws InterruptedException
	{
		HomePage page=new HomePage(driver);
		page.clickProject();
		
		ProjectDetails page2= new ProjectDetails(driver);
		page2.ClickDuration();
		page2.selectduration("2");
		page2.checkDurationinTemplate();
	     
		
	
	
	}
}
