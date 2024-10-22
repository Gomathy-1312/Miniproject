package Mini_Project.Mini_Project;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_action {

	public static void main(String[] args) throws InterruptedException {

		// mouse actions

		// Step 1: move over

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://demo.opencart.com/");

		WebElement desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));

//		WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));

	//	Actions ac = new Actions(driver); // syntax for mouse actions
//		Thread.sleep(20);
//		ac.moveToElement(desktop).moveToElement(mac).click().build().perform();
		
		
		// Right click
		
		Action a = contextClick(desktop);

		
		
		
		
		

	}

	private static Action contextClick(WebElement desktop) {
		// TODO Auto-generated method stub
		return null;
	}
}
