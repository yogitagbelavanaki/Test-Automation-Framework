package test_scripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.EducationPage;
import pom_scripts.HomePage;
import pom_scripts.ProfilePage;
import pom_scripts.SkillsPage;
import pom_scripts.SummaryPage;

public class EndToEnd01 extends BaseClass{
	
	@DataProvider(name = "endtoend01")
	public Object[][] data() {
		ReadExcel read = new ReadExcel();
		Object[][] data = read.getMultipleData("endtoend01");
		return data;
	}
	
	@Test(groups = "EndToEnd", dataProvider = "endtoend01")
	public void endToEnd01(String fname, String lname, String technology,String totalexpyrs, String totalexpmnts,String relevexpyrs, String relevexpmnts,String summary,String percentage,String Specialization,String university,String frontendtech,String format) throws InterruptedException {
		ProfilePage profile_page = new ProfilePage(driver);
		profile_page.enterFirstName(fname);
		profile_page.enterLastName(lname);
		profile_page.selectTechnologyByVisibleText(technology);
		profile_page.selectTotalExpYearByVisibleText(totalexpyrs);
		profile_page.selectTotalExpMonthByVisibleText(totalexpmnts);
		profile_page.selectRelevantExpYrsByVisibleText(relevexpyrs);
		profile_page.selectRelevantExpYrsByVisibleText(relevexpmnts);
		
		HomePage home_page = new HomePage(driver);
		home_page.clickOnSummaryModule();
		
		SummaryPage sum_page = new SummaryPage(driver);
		sum_page.enterSummary(summary);
		
		home_page.clickOnEducationModule();
		
		EducationPage edu_page = new EducationPage(driver);
		edu_page.selectHighestEducationByVisibleTxt("BE/B.Tech");
		edu_page.enterPercentage(percentage);
		edu_page.selectSpecialization(Specialization);
		edu_page.selectUniversityByVisibleText(university);
		
		home_page.clickOnSkillsModule();
		SkillsPage skill_page = new SkillsPage(driver);
		skill_page.selectFrontEndTechByVisibleText(frontendtech);
		skill_page.selectbackEndTechByVisibleText("Java 1.8");
		skill_page.selectSdlcAsWaterfallModel();
		
		home_page.downloadAs(format);
		Thread.sleep(4000);
		
		
	}
}
