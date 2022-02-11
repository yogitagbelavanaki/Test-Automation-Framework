package test_scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.EducationPage;
import pom_scripts.Profile;
import pom_scripts.ProjectDetailsPage;
import pom_scripts.SkillsPage;
import pom_scripts.Summary;

public class TC_016ST extends BaseClass{
	
	@DataProvider(name="TestData")
	public Object[][] getTestData() throws IOException
	
	{
		
			ReadExcel read=new ReadExcel();
				Object [][]data=read.getMultipleData("End")	;
				return data;
			
		}
	
	
		@Test(dataProvider="TestData")
		public void FN(String firstname,String lastname,String value,String value2,String summa,String passYear,String per,String projName,String disc,String roles) throws InterruptedException
		{
		
	Profile  page=new Profile(driver);
	   page.ClickProfile();
	   page.fn();
		page.enter_Data(firstname);
		page.ln();
		page.Enter_lastName(lastname);
		page.ClickTechnology();
	   page.Selecttechnology(value);
	   page.Totalexp( value2);
	   page.TotalMonth();
	   page.TotalRelExp(); 
	   page.Rel_Month();
	   Thread.sleep(5000);
		Summary summary=new Summary(driver);
		summary.ClickSummary();
		   Thread.sleep(5000);

        summary.ClickTypeHere();
        
        summary.enter_Data(summa);
 	   Thread.sleep(5000);
 	   SkillsPage sp=new SkillsPage(driver);
		sp.ClickSkills();
		sp.Click_frnttech();
		sp.Clickon();
		   Thread.sleep(2000);

		sp.Click_backend();
		sp.Click_on();
		sp.Cliclk_On_Tech();
		   Thread.sleep(2000);

		sp.Click_On_Technology();
		sp.Click_on_Dp();
		sp.Click_On_STechnology();
		   Thread.sleep(2000);
		   EducationPage education =new EducationPage(driver);
			education.Clicl_On_Education();
		    education.HighestEducation();
		    education.Click_OnSpecilization();
		    education.Click_OnUniversity();

		    education.PassOutYear(passYear);
		    education.EnterPercentage(per);
			   Thread.sleep(5000);

			ProjectDetailsPage pd=new ProjectDetailsPage(driver);
			pd.Click_onProjectDetail();
			pd.ClickOn_ProjrctName();
			pd.Enter_DataProjectName(projName);
			pd.Enter_DataProjectDescription(disc);
			pd.ClickOnRolesAndResponsibilities();
			pd.Enter_DataRolesndResponsibilities(roles);
	       
			page.Download();

			
		}
	

	}

		
	


