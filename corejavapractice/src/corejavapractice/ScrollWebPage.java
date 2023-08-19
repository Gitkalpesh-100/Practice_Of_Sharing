package corejavapractice;

import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollWebPage {
	public static void main(String[] args) {

		System.setProperty( "webdriver.chrome.driver","C:\\Users\\Kalpesh Patil\\Downloads\\Extracted_jar_files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "h  ";
		driver.get(URL);
		driver.manage().window().maximize();
		//JavascriptExecutor declaration
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//storing 'from' webelement from the webpage
		WebElement from = driver.findElement(By.xpath("//button[text()='Request Demo' and @class='btn-arrow btn-CTA']"));
		// This will scroll the page Horizontally till the element is found
		js.executeScript("arguments[0].scrollIntoView();", from);
		
		// to perform scroll on an application till its height
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		// Scrolling down the page by mentioning the axis x and y		
        js.executeScript("window.scrollBy(0,-350)", "");
        js.executeScript("window.scrollBy(0,350)", "");
        driver.quit();      
	}
}
