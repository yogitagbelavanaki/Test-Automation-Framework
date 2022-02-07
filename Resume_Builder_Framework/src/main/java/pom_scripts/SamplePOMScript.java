package pom_scripts;

import org.testng.annotations.Test;

import generic.BaseClass;
import generic.BaseTest;

public class SamplePOMScript extends BaseClass{

	public SamplePOMScript(){

	}

	@Test
	public void testCase01() {
		BaseTest b = new BaseTest(driver);
		b.clickProfile();
	}
}
