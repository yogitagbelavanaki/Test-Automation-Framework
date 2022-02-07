
package pom_scripts;



import org.testng.annotations.Test;

import generic.BaseClass;
import generic.BaseTest;

public class TC01 extends BaseClass
{
	@Test
	public void Resume()
	{
		BaseTest page=new BaseTest(driver);
		page.clickProfile();
	
	}
		

}
