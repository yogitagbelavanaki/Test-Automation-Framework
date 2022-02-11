package test_scripts;

import org.testng.annotations.Test;

import generic.BaseClass;
import pom_scripts.Summary;

public class TC_07FT extends BaseClass{
	@Test
	//To verify that user is able to click on summary module and click on typehere textfield
	public void Summary1() throws InterruptedException 
	{
		Summary summary=new Summary(driver);
		Thread.sleep(1000);
		summary.ClickSummary();
		Thread.sleep(1000);

	}
	public void Summary2()
	{
		Summary.ClickTypeHere();
	}
	

}
