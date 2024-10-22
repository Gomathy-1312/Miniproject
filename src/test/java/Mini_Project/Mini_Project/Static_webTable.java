package Mini_Project.Mini_Project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_webTable {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// 1. find total number of in a table
          int Total_table =driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td")).size();
		  System.out.println(Total_table);  //24
		
		// 1. find total number row  in a table
		
		  int row =driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();
		  System.out.println(row);//7
		  
		// 1. find total number row  in a table
			
		  int column =driver.findElements(By.xpath("//table[@name='BookTable']//tbody//th")).size();
		  System.out.println(column);//7  
		
		// for loop
		  
		  for(int r=2;r<=row;r++) {// value
			  
			  for(int c=1;c<=column;c++) {
				  
				 Thread.sleep(3000); 
				  String element=driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+r+"]//td["+c+"]")).getText();
				  System.out.print(element+"\t");
				  
				  
			  }
			  
			  System.out.println();
			  
		  }
		  
//		// //5.Print book name whose author is Mukesh
//		  
//		
//		  for(int r=2;r<=row;r++) {
//		  
//		  
//		  
//		  // specific element for mukesh
//		  String authorname = driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+r+"]//td[2]")).getText();
////		  System.out.println(authorname);
//		  
//		  if(authorname.equals("Mukesh")) {
//			  
//			//  driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr[3]//td[2]")).isDisplayed();
//			  String Bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr["+r+"]//td[1]")).getText();
//			  System.out.println(Bookname);
//			  
//			  
//			  
//		  }
//		  
//		  
		  
		
		  }
		
		
		
		
		
		
		
		
		
		

	}


