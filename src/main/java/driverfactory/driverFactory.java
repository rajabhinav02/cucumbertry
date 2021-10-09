package driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverFactory {

	ThreadLocal<WebDriver> tldriver =new ThreadLocal();
	
	
	public void getDriver(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			tldriver.set(new ChromeDriver());
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tldriver.set(new FirefoxDriver());
		}else {
			System.out.println("Send new browsername");
		}
		
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		
	}
	
	public WebDriver getDriver() {
		return tldriver.get();
	}
}
