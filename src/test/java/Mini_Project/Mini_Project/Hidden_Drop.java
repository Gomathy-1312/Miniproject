package Mini_Project.Mini_Project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Drop {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(10);
		driver.manage().window().maximize();
		
		
        driver.findElement(By.name("username")).sendKeys("Admin");
		
        driver.findElement(By.name("password")).sendKeys("admin123");
        
        
        
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
        
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div[1]/div[1]")).click();
		
		Thread.sleep(10);
		
	  List<WebElement> drop	=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println(drop.size());
		
		
		for(int i=0; i<=drop.size();i++) {
			
			
			drop.get(5).click();
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
