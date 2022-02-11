package test_scripts;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.EducationPage;
import pom_scripts.HomePage;
import pom_scripts.ProfilePage;
import pom_scripts.ProjectDetails;
import pom_scripts.SkillsPage;
import pom_scripts.SummaryPage;

public class TC16_System extends BaseClass
{ 
	
	@DataProvider(name="TestData")
	    public Object[][] getTestData() throws IOException
	   {
			ReadExcel excel=new ReadExcel();
	      Object[][] data=excel.getMultipleData("Sheet1");

	    return data;

	     }
		
	  @Test(dataProvider="TestData")
	 public void TC(String value, String p) throws InterruptedException  
	 {
		  
		  
		  //HomePage
		  HomePage page1 =new HomePage(driver);
		  page1.clickProfile();
		  
		  
		  //ProfilePage
		  ProfilePage page2=new ProfilePage(driver);
		  page2.enter_DataInFirstName(value);
		  page2.Clicklastname();
		  page2.enter_DataInLastName("nisha");
		  page2.selectTechnologyByVisibleText(value);
		  page2.TotalExpYear();
		  page2.Totalexpmonth();
		  page2.TotalRelaventExp();
		  page2.RelaventExpMonth();
		  page1.ClickIncludeProfilePic();
		  page1.clicklogo();
		  page1.clickSummary();
		  
		  
		  //Summarypage
          SummaryPage page6=new SummaryPage(driver);
	      page6.EnterSummaryDescription("value");
		  Thread.sleep(2000);
		  page1.clickSkills();
		  
		  
		  //SkillsPage
		  SkillsPage page3=new SkillsPage(driver);
		  page3.clickFrontTech();
		  page3.ClickonCSS();
		  page3.ClickonBackendTech();
		  page3.clickSql();
		  page1.clickEducation();
		  
		  
		  //EducationPage
		  EducationPage page4=new EducationPage(driver);
		  page4.ClickHighestEducation();
		  page4.selectTechnologyByVisibleText(value);
		  page4.clickSpecialization();
		  page4.selectSpecialization(value);
		  page4.clickUniversity();
		  page4.selectUniversity(value);
		  page4.Clickpassoutyear();
		  page4.PassoutYear("1956");
		 // page4.clickPercentage();
		 //page4.percentage("74");
		  page1.clickProject();
		  
		  
		  
		  //projectDetails
		  ProjectDetails page5=new ProjectDetails(driver);
		  page5.ClickProjectName();
		  page5.enter_DataInProjectName(p);
		  page3.clickFrontTech();
		  page3.ClickonCSS();
		  page5.ClickDuration();
		  page5.selectduration("value");
		  page5.ProjectDescription("Projectdescription is resume Builder");
		  page5.Clickrolesandres();
		  page5.RolesAndResponsibilities("converting Testcase into testScript");
		  Thread.sleep(3000);
		  page1.SelectTemplate();
		  Thread.sleep(2000);
	      page1.Downloadas();
		  
	 }
	}
	
