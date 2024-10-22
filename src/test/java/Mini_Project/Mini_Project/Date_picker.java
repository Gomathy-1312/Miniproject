package Mini_Project.Mini_Project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_picker {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://jqueryui.com/datepicker/");

		Thread.sleep(10);
		driver.manage().window().maximize();
		
		// frame
		driver.switchTo().frame(0);
		
		//Method1: using sendkeys
		
	//	driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/07/2022");
		
		// Method 2: using calender
		
		String month ="September";
		String year ="2021";
		String date="20";
		
		
	//	Take xpath for month and year
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		
		while(true) {
		
		String currentmonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();// month
		String currentyear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();// year
		
		
		if(currentmonth.equals(month)&& currentyear.equals(year)){
		
			break;
		
		}
		
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();// previous
		}
		
		
		
		
		// for date
		
		
		List<WebElement> totaledate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement actualdate:totaledate) {
			
			if(actualdate.getText().equals(date)) {
				
				actualdate.click();
				break;
				
			}
			
			
		}
		
		

	}

}
