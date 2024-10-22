package Mini_Project.Mini_Project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("https://www.demoblaze.com/index.html");
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		if(title.equals("STORE")) {
			
			System.out.println("Passed");
			
		}else {
			
			
			System.out.println("Failed");
		}

       // Link text 
		//driver.findElement(By.linkText("Cart")).click();
		
	   // partial link text
		driver.findElement(By.partialLinkText("Car")).click();
		
		// isDisplayed
     boolean logo=driver.findElement(By.id("nava")).isDisplayed();
      System.out.println(logo);
      
      // classname
      
//      Thread.sleep(20);
      
//    List<WebElement> linktypes=driver.findElements(By.className("nav-item active"));
//	System.out.println(linktypes.size());
//		
		
		
		
		
		
		
		
		
		
	}

}
