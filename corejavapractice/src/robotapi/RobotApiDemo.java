package robotapi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Network.UserAgent;



public class RobotApiDemo {

	public static void main(String[] args) throws InterruptedException, AWTException  {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kalpesh Patil\\Downloads\\Extracted_jar_files\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://resume.naukri.com/resume-quality-score?fftid=101003");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"dropzone\"]/div[2]/div/div[6]/span")).click();
		Thread.sleep(2000);
		
		//use of robot class to upload a file
		
		Robot robot = new Robot();
		
		//Store the path of the file to be uploaded using StringSelection class object
		StringSelection filepath = new StringSelection("C:\\Users\\Kalpesh Patil\\Desktop\\KPResume1.pdf");
		
		//copy above path to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		
	    //Now press control
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		
		//press V
		robot.keyPress(KeyEvent.VK_V);
		
		//release V
		robot.keyRelease(KeyEvent.VK_V);
		
		//release Control
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);//SUBMITTING - THIS IS PRESSING ENTER KEY
		robot.keyRelease(KeyEvent.VK_ENTER);//SUBMITTING - THIS IS RELEASE ENTER KEY
		
		//driver.close();
	
	//C:\\Users\\Kalpesh Patil\\Desktop\\KP Resume1.pdf	
}
}