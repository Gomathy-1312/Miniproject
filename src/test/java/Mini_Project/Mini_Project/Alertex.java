package Mini_Project.Mini_Project;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertex {

	public static void main(String[] args) throws InterruptedException {


		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));// Explicit wait
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		// JS Alert
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(10);
		
		Alert myalert=mywait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(myalert.getText());
		
		myalert.accept();
		
		
		
		
//		String	jsalert=driver.switchTo().alert().getText();
//		System.out.println(jsalert);
//
//		driver.switchTo().alert().accept();
		
		//Dismiss
		
		// JS Alert
		
	driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
	Thread.sleep(10);
				
	String	jsalert1=driver.switchTo().alert().getText();
	System.out.println(jsalert1);

	driver.switchTo().alert().dismiss();
	
	// Sendkey
	
	driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
	Thread.sleep(10);
	
	
				
	String	jsalert2=driver.switchTo().alert().getText();
	System.out.println(jsalert2);
	
	Thread.sleep(10);
    driver.switchTo().alert().sendKeys("Welcome");
	driver.switchTo().alert().dismiss();
	
	
	
	
					
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
