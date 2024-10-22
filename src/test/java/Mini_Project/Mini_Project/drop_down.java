package Mini_Project.Mini_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drop_down {

	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Thread.sleep(10);
		driver.manage().window().maximize();
		
		
		
		
		WebElement drop =driver.findElement(By.xpath("//*[@id=\"country\"]"));
		drop.click();
		
		//Syntax
		
		Select s = new Select(drop);
		
	//	s.selectByIndex(5);
	//	s.selectByValue("australia");
		s.selectByVisibleText("Japan");
		
		//capture the all options from the dropdown
		
		List<WebElement> options=s.getOptions();
		System.out.println(options.size());
		
		
//		// for loop
//		
//		for(int i = 0; i<=options.size();i++) {
//			
//			System.out.println(options.get(i).getText());
//			
//			
//		}
		
		
		// for each
		
		for(WebElement op:options) {
			
			op.getText();
			System.out.println(op.getText());
			
		}
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
