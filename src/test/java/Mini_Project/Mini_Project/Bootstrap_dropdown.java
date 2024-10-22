package Mini_Project.Mini_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_dropdown {

	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
			
			Thread.sleep(10);
			driver.manage().window().maximize();
	        driver.findElement(By.xpath("//span[@class='multiselect-native-select']")).click();
		    driver.findElement(By.xpath("//input[@value='Java']")).click();		
		    
		    List<WebElement> option=driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//label"));
		    option.size();
		    System.out.println(option.size());
		    
		    
		    for(int i=0; i<=option.size();i++) {
		    	
		    	
		    	System.out.println(option.get(i).getText());
		    	
		    	
		    }
		
		
		
		

	}

}
