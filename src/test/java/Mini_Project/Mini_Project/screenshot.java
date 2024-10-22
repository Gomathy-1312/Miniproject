package Mini_Project.Mini_Project;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
		
		//1) full page screenshot
	/*	TakesScreenshot ts=(TakesScreenshot) driver; // casting 
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshotfiles\\fullpagefile.png");
		sourcefile.renameTo(targetfile); // copy sourcefile to target file*/
		
		

		//2) capture the screenshot of specific section
		/*WebElement featuredProducts=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div[4]/div[2]"));
		
		File sourcefile=featuredProducts.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshotfiles\\featredproducts.png");
		sourcefile.renameTo(targetfile); // copy sourcefile to target file*/
		
		
		//3) capture the screenshot of webelement
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/div[3]/div/div[1]/div/div/a/img"));
		File sourcefile=logo.getScreenshotAs(OutputType.FILE);
		File targetfile=new File(System.getProperty("user.dir")+"\\screenshotfiles\\logo.png");
		sourcefile.renameTo(targetfile); // copy sourcefile to target file
		
		//driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
