package Mini_Project.Mini_Project;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitalertex {

	public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		// Explicitwait
		
		WebDriverWait mywait =new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		Alert myalert=mywait.until(ExpectedConditions.alertIsPresent());
		myalert.getText();
		
		myalert.accept();
		
		
		
		
		
		
		
		
		
		
		

	}

}
