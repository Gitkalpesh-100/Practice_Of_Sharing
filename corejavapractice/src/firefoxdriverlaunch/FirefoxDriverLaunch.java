package firefoxdriverlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverLaunch {

	public static void main(String[] args) throws InterruptedException {
		 	
			System.setProperty("webdriver.gecko.driver", "\"C:\\Users\\Kalpesh Patil\\Downloads\\Extracted_jar_files\\Firefox_driver\\geckodriver-v0.33.0-win32\\geckodriver.exe\"");
			WebDriver driver = new FirefoxDriver();
			
			driver.get("https://www.google.com");
			Thread.sleep(5000);
			
			driver.quit();	
	}
}
