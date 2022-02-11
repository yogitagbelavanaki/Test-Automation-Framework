package test_scripts;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.ReadExcel;
import pom_scripts.EndToEnd1POM;

public class EndToEndTestCase extends BaseClass{

	@DataProvider(name="TestData1")
	public Object[][] getTestDataForElement1(){
		ReadExcel r = new ReadExcel();
		Object[][] data = r.getMultipleData("EndToEnd");
		return data;
	}

	@Test(dataProvider="TestData1")
	public void testCase1(String fName,String lName,String text) throws InterruptedException{
		EndToEnd1POM e = new EndToEnd1POM(driver);

		//PROFILE
		e.clickOnProfile();
		e.pElement1(fName);
		e.pElement2(lName);
		e.pElement3();
		e.pElement4();
		e.pElement5();
		e.pElement6();
		e.pElement7();

		//SUMMARY
		e.clickOnSummary();
		Thread.sleep(1000);
		e.sElement1(text);
		Thread.sleep(2000);

		//SKILLS
		e.clickOnSkills();
		Thread.sleep(2000);
		e.skillsElement1();
		/*e.skillsElement2();
		e.skillsElement3();
		e.skillsElement4();
		e.skillsElement5();
		e.skillsElement6();
		e.skillsElement7();
		e.skillsElement8();
		e.skillsElement9();*/
	}

}
