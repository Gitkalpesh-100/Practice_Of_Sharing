package corejavapractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReadDataFromExcelOne {

	public static void main(String[] args) throws InterruptedException {
	 
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.setCapability(ChromeOptions.CAPABILITY, options);
		System.setProperty( "webdriver.chrome.driver","C:\\Users\\Kalpesh Patil\\Downloads\\chromedriver_win32\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		String URL = "https://www.amazon.in";
		driver.get(URL);
		Thread.sleep(5000);
		driver.quit();
        System.out.println("Program completed successfully...");		

	}

}
