package Mini_Project.Mini_Project;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		// Double click
//		
//		WebElement click=driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
//		
//		Actions ac = new Actions(driver);
//		
//		ac.doubleClick(click).perform();
		
		
		
//		Drap and drop
		
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(drag, drop).perform();
		
		
		
		
		
		
		
		

	}

}
