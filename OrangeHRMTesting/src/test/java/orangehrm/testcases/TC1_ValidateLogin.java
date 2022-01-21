package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import orangehrm.framework.DriverClass;
import orangehrm.pages.LoginPage;

public class TC1_ValidateLogin extends DriverClass{
	
	
	@Test
	public void longintest() {
		
		launcbroswer(prop.getProperty("browser"));
		enterurl(prop.getProperty("url"));
		
		LoginPage login = new LoginPage(driver);
		
		login.login(prop.getProperty("username"), prop.getProperty("password"));
		
		String url =  driver.getCurrentUrl();
		
		Assert.assertEquals(prop.getProperty("homepageurl"), url);
	
		teardown();
		
	}

}
