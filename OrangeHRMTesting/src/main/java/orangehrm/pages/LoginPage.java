package orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//input[@id='txtUsername']") WebElement logintxt;
	@FindBy(xpath ="//input[@id='txtPassword']") WebElement passwordtxt;
	@FindBy(xpath ="//input[@id='btnLogin']") WebElement loginbtn;
	
	public void login(String username,String password) {
		logintxt.sendKeys(username);
		passwordtxt.sendKeys(password);
		loginbtn.click();
	}
	
	
}
