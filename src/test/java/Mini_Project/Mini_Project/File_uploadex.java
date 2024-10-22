package Mini_Project.Mini_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_uploadex {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		
		// Take xpath for choose file
		
		//single file upload 
		
//	//	driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("D:\\Manual testing notes\\Text1.txt");	
//		
//		// validation
//		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Text1.txt"))
//		{
//			System.out.println("File is sucessfully uploaded");
//		}
//		else
//		{
//			System.out.println("Upload failed.");
//		}
		
		//multiple file upload
		
//		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("D:\\Manual testing notes\\Text1.txt");
//		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("D:\\Manual testing notes\\Text2.txt");
//		
		//Multiple files uploaded
				String file1="D:\\Manual testing notes\\Text1.txt";
				String file2="D:\\Manual testing notes\\Text2.txt";
				
				driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
				
				int noOfFilesUploaded=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
				
				//validation 1 - Number of files 
				if(noOfFilesUploaded==2)
				{
					System.out.println("All Files are uploaded");
				}
				else
				{
					System.out.println("Files are not uploaded or incorrect files uploaded");
				}
				
		
		
		
		
		
		
		
		
		
		
		

	}

}
