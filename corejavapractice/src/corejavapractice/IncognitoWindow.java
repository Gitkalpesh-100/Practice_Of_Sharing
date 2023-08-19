package corejavapractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IncognitoWindow {

	public static void main(String[] args) throws InterruptedException {
	 
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.setCapability(ChromeOptions.CAPABILITY, options);
		System.setProperty( "webdriver.chrome.driver","C:\\Users\\Kalpesh Patil\\Downloads\\Extracted_jar_files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		String URL = "https://www.amazon.in";
		driver.get(URL);
		Thread.sleep(5000);
		driver.quit();
        System.out.println("Program completed successfully...");		

	}

}


