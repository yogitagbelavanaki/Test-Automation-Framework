package test_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseClass;
import pom_scripts.SkillsPage;

public class TC_015IT extends BaseClass {
	//To verifty taht selected technology display in template 
@ Test
public void TC015() throws InterruptedException
{
	  SkillsPage sp=new SkillsPage(driver);
	 sp.ClickSkills();
		Thread.sleep(1000);
		//click on design pattern technology
		sp.Click_on_Dp(); 
		Thread.sleep(5000);
		sp.Click_On_STechnology();
		
		
		//select technology on design pattern
       String check=sp.checkOntemplateSingletone();
       Assert.assertTrue(check.contains("Singleton"));
		

}
}
