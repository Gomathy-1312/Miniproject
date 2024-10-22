package Mini_Project.Mini_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class waitex {

	public static void main(String[] args) {

    WebDriver driver = new ChromeDriver();
    driver.get("https://testautomationpractice.blogspot.com/");
    
    // Select the single checkbox
    
//    driver.findElement(By.xpath("//input[@id='monday']")).click();
    
    // Count of all the checkbox
    
   List<WebElement> Allcheckbox=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
    
  System.out.println("Count of all the checkbox:    "+Allcheckbox.size());
  
  
  // Select all the checkboxes
  
  for(int i=0;i<=Allcheckbox.size();i++){
	  
	  if(i==2 || i==6 || i==3) {
		  
		  Allcheckbox.get(i).click();
		  
	  }
	 
	  
	    
	  
  }
  
//  
//  for(WebElement chx:Allcheckbox) {
//	  
//	  chx.click();
//	  
//  }
    

	}

}
