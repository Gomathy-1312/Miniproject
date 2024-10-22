package Mini_Project.Mini_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		Thread.sleep(10);
		driver.manage().window().maximize();
		
		
		
		//frame 1
		WebElement frame1 =driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		
		//jump out of frame 1
		
		driver.switchTo().defaultContent();
		
		//frame2
		
       WebElement frame2 =driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Automation");
		
		//jump out of frame 2
		driver.switchTo().defaultContent();// jumping comment
		
		//frame3
		
		WebElement frame3 =driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
			
			driver.switchTo().frame(frame3);
			
			driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Web Application");
		
		//iframe
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//div[@id='i5']")).click();
			
			//iframe to frame4 
			
			
			//jump out of frame 4
			driver.switchTo().defaultContent();// jumping comment
			

			WebElement frame4 =driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
				
		    driver.switchTo().frame(frame4);
				
		    driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Manual testing");
			
			
			
			
		
		
		
		
		
		

	}

}
