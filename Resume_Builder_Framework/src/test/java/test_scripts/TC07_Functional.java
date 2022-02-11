package test_scripts;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import generic.BaseClass;
import generic.ReadExcel;
import generic.UtilityMethods;
import pom_scripts.ProfilePage;

public class TC07_Functional extends BaseClass
{
	@DataProvider(name="TestData")
    public Object[][] getTestData() throws IOException
   {
		ReadExcel excel=new ReadExcel();
      Object[][] data=excel.getMultipleData("Sheet1");

    return data;

     }
	
  @Test(dataProvider="TestData")
 public void TC14(String value) throws InterruptedException  
 {
	  
	ProfilePage page=new ProfilePage(driver);
	//page.enter_DataInFirstName("likhitha");
	page.clickLastName();
	page.enter_DataInLastName("nisha");
	
	

 }
}
