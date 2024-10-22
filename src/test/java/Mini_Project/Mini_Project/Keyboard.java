package Mini_Project.Mini_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://text-compare.com/");
	     
	     // step1 
	     // take xpath for white screen
	     
	     driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome");
		
	     Actions ac = new Actions(driver);
		
	     Thread.sleep(20);
	     //ctrl+A
	     
	     ac.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
	     
	     // ctrl+C
	     
	     ac.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
	     
	     //Tab
	     
	     ac.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
	     
	     //ctrl+V
		
	     ac.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
