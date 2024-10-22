package Mini_Project.Mini_Project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		// Total count of row
		
		int row_total =driver.findElements(By.xpath("//div[@class='table-container']//tbody//tr//td")).size();
		System.out.println(row_total);   // 20
		
		
		
		//Overall count of pagination
		
		int pagination=driver.findElements(By.xpath("//*[@id=\"pagination\"]//li//a")).size();
		System.out.println(pagination); // 4
		
		int row=driver.findElements(By.xpath("//div[@class='table-container']//tbody//tr")).size();
		System.out.println(row); //5
		
		for(int p=1;p<=pagination;p++) {
			
			driver.findElement(By.xpath("//*[@id=\"pagination\"]//li["+p+"]//a")).click();   // pagination
	
			
			if(p==2) { 
			
			
				for(int r =1; r<=row; r++) {
			
			   driver.findElement(By.xpath("//*[@id=\"productTable\"]//tbody//tr["+r+"]//td[4]//input")).click();  // checkbox
				}
			
			
			}
			
			
			
		}
		


		
			
	}

}
