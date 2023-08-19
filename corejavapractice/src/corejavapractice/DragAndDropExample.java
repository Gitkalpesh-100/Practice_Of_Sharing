package corejavapractice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDropExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        
		
		System.setProperty( "webdriver.chrome.driver","C:\\Users\\Kalpesh Patil\\Downloads\\Extracted_jar_files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String URL = "https://the-internet.herokuapp.com/drag_and_drop";
		driver.get(URL);
		//deprecated after selenium4
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.MILLISECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Actions builder = new Actions(driver);                                                                          
		WebElement from = driver.findElement(By.id("column-a"));
		WebElement to = driver.findElement(By.id("column-b"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("column-b")));
		Thread.sleep(2000);
		builder.dragAndDrop(from, to).perform();
		Thread.sleep(2000);
		builder.dragAndDropBy(to,10,20).perform();
		
		
		//verify text changed in to "Drop here"
		
		String textTo = to.getText();
		if (textTo.equals("A"))
		{
			System.out.println("PASS : File was dropped to the correct target location as expected.");
		}
		else
		{
		    System.out.println("FAIL : File was not dropped to the target location as expected.");	
		}
		
		driver.quit();
		
		
	}

}
