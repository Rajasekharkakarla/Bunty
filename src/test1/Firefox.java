package test1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firefox {


	public static  void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-jee-oxygen-3-rc2-win32-x86_64\\Test\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		TakesScreenshot ts= ((TakesScreenshot)driver);
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D:\\abc.png"));
		
		driver.navigate().back();
		
		File src1=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src1,new File("D:\\abcdhh.png"));
	
		if(driver.getTitle().contains("Google")) {
			driver.get("https://www.gmail.com");
			System.out.println("Pass");
		}
		else {
			driver.navigate().back();
			System.out.println("Fail");
			TakesScreenshot ts1= ((TakesScreenshot)driver);
			File src2=ts1.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src2,new File("D:\\abcd.png"));
			
		}
		TakesScreenshot ts1= ((TakesScreenshot)driver);
		File src3=ts1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src3,new File("D:\\abcde.png"));
	
			
					//driver.close();
	}

}
