package test1;

import java.io.File;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Timesheet {

	public static void main(String[] args) throws Exception {
		
		
		
		/*System.setProperty("webdriver.firefox.marionette", "D:\\eclipse-jee-oxygen-3-rc2-win32-x86_64\\Test\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();*/
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-jee-oxygen-3-rc2-win32-x86_64\\Test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:/pacehr.techmahindra.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("user")).sendKeys("RK00428211");
		driver.findElement(By.name("pwd")).sendKeys("bunTy@1995");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='sign']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ADMN_SC_PGT_TIMESHEET_Data\"]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[2]/a")).click();
		
		String click=driver.getWindowHandle();
		Set<String> second=driver.getWindowHandles();
		for(String abc:second) {
			if(!abc.equals(second)) {
				driver.switchTo().window(abc);
			}
		}
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Src, new File("D:\\abc.png"));
		
		
		driver.findElement(By.id("txtLanID")).sendKeys("RK00428211");
		driver.findElement(By.id("txtpwd")).sendKeys("bunTy@1995");
		driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/div[3]/button")).click();
		//driver.findElement(By.id("lnkLogout")).click();
		
		driver.switchTo().window(click);	
	}
}