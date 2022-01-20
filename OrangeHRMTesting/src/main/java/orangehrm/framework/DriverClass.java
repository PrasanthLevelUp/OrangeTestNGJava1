package orangehrm.framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverClass {
	
	public static WebDriver driver;
	
	public void launcbroswer(String browsername) {
		
		switch(browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			break;
		case "safari":
			WebDriverManager.safaridriver().setup();
			driver= new SafariDriver();
			break;
		default:
			driver = null;
		}
	}
	
	public void enterurl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	
	public void teardown() {
		driver.quit();
	}

}
