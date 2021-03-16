package util;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	static WebDriver driver;

	public static WebDriver init() {

		System.setProperty("webdriver.chrome.driver", "driver1\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://techfios.com/test/101/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}
	
	public static  void teardown() {
		driver.close();
	}
	
	
}