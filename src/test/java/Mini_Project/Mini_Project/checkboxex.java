package Mini_Project.Mini_Project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxex {

	public static void main(String[] args) throws InterruptedException {

    
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		// Select the checkbox
		
		WebElement tuesday_checkbox=driver.findElement(By.id("tuesday"));
		
		System.out.println("Before checkboxing:   "+tuesday_checkbox.isSelected());// false
		
		driver.findElement(By.id("tuesday")).click();
		
		System.out.println("Before checkboxing:   "+tuesday_checkbox.isSelected());// true
		
		//unselect
		
		Thread.sleep(10);
		driver.findElement(By.id("tuesday")).click();// unselect checkbox
		
		
		// Select the all checkbox at a time
		
		List<WebElement>allcheckbox=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("Overall element size:"  +allcheckbox.size());
//		
	//for(int i=0; i<=allcheckbox.size();i++) {
//			
//			allcheckbox.get(i).click();
//			
//		}
		
		//How to choose the specific element from the checkbox
		
		
		for(int i=0; i<=7;i++) {
			
			if(i==3) {
			
               allcheckbox.get(i).click();// select
				
			}else {
				
				allcheckbox.get(i).click();
				
				
			}
			
			Thread.sleep(40);
			

// for each
			
			
			for(WebElement chx:allcheckbox) {
				
				chx.click();
				
				
			}
				
				
				
				
		}	
			}
			
			
			
			
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	


