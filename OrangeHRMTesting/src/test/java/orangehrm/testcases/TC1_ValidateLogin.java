package orangehrm.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import orangehrm.framework.DriverClass;
import orangehrm.pages.LoginPage;

public class TC1_ValidateLogin extends DriverClass{
	
	
	@Test
	public void longintest() {
		
		launcbroswer("chrome");
		enterurl("https://opensource-demo.orangehrmlive.com/");
		
		LoginPage login = new LoginPage(driver);
		
		login.login("Admin", "admin123");
		
		String url =  driver.getCurrentUrl();
		
		Assert.assertEquals("https://opensource-demo.orangehrmlive.com/index.php/dashboard", url);
	
		teardown();
		
	}

}
