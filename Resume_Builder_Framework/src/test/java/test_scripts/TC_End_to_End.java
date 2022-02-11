package test_scripts;

import java.io.IOException;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.EducationPage;
import pom_scripts.HomePage;
import pom_scripts.ProfilePage;
import pom_scripts.ProjectDetailsPage;
import pom_scripts.SkillPage;
import pom_scripts.SummaryPage;

public class TC_End_to_End extends BaseClass
{
	@DataProvider(name="TestData")
	public Object[][] dataProvide() throws IOException
	{
		ReadExcel excel=new ReadExcel();
	    Object[][] data=excel.getMultipleData("EntToEnd");
	    return data;	
	}	
	
	@Test(dataProvider="TestData",groups=("End_To_End"))
	public void testCase(String Fname,String Lname,String summary,String passYear,String percen,String projName,String teamSize,String descrip,String roles) throws InterruptedException 
	{
		HomePage page=new HomePage(driver);
		page.clickOnProfile();
		
		ProfilePage profPage=new ProfilePage(driver);
		
		profPage.enterFname(Fname);
		profPage.enterLname(Lname);
		
		//select the thechnology
		profPage.selectTech();
		
		//select total year of exprieance in year
		profPage.selectYearEx("2");
		
		//In month
		profPage.selectMonthEx("6");
		
		//Relevent year of exprience in year
		profPage.selectRelvExpYear("4");
		
		//Relevent year of exprience in Month
		profPage.selectRelvExpMonth("3");
		
		//Click on summary
		page.clickOnSummary();
		
		
		//Next Module
		SummaryPage sumPage=new SummaryPage(driver);
		sumPage.typeHearText(summary);
		
	   //Skill Page
		page.ClickOnSkill();
		
		SkillPage skPage=new SkillPage(driver);
	    //Front End Technology
		
		
		//Search For FrontEnd Technology
		skPage.SearchOnFrountEnd();
		skPage.clickOnJs();
		
		//BackEnd Technology
		skPage.clickOnBackend();
		skPage.clickOnJava();
		
		//Middleware
		skPage.clickMiddleare();
		skPage.selectRestFull();
	    
		//Design Pattern
		skPage.clickOnDesignPat();
		skPage.clickOnSingletone();
		
		//DataBase
		skPage.clickOnDataBaseUsed();
		skPage.clickOnOracal();
		
		//Version Control System
		skPage.clickOnVersion();
		skPage.clickOngitLab();
		
		//deselect to AWS
		skPage.deselectAWS();
		
		//deselect SDLC
		skPage.clickOnSDLC();
		
		//select devlopment tool
		skPage.clickTool();
		skPage.clickOnMaven();
		
		//Education Module
		page.ClickOnEducation();
		
	   EducationPage eduPage=new EducationPage(driver);
	   //selecting heighest education
	   eduPage.clickOnHeighestEducation();
	   
	   //selecting specialization
	   eduPage.clickonSecialization();
	   
	   //selectig University
	   eduPage.clickOnUniversity();
	   
	   //Entering Passout year
	   eduPage.EnterPassOutYear(passYear);
	   
	  //Entering Percentage
	  eduPage.checkPerentage(percen);
	  
		Thread.sleep(3000);
	  //click On Project Module
	  page.clickOnProjectModule();
	  
	  //ProjectDetail Module
	  ProjectDetailsPage projPage=new ProjectDetailsPage(driver);
	  
	  projPage.enterProjName(projName);
	  
	  
	  projPage.clickOnFrontEnd();
	  projPage.clickOnJs();
	  
	  
		//click on Backend
	  projPage.clickOnBackEnd();
	  projPage.clickOnJava();
	  
	  //click on Middleware
	  projPage.clickOnMiddleware();
	  projPage.clickOnrestFull();
	  
	  //design pattern
	  projPage.clicOndesignPatt();
	  projPage.clickOnSingleTon();
	  
	  //uncheck devlopment tool
	  projPage.uncheckDevlopTool();
	  
	  
	  //duration
	  projPage.selectDuration("3");
	  
	  //enter team size
	  projPage.enterTeamSize(teamSize);
	  
	  
	  //Project Description
	  projPage.enterProjDescrip(descrip);
	  
	  //Roles and Responsiblity
	  projPage.enterRolesAnd(roles);
	  			
     //	Unchecked Profile pic
	 page.uncheckProfPic();
	 
	 //Downlode the Resume
	 page.clicOnDownlode();
	 
		
   }
}
