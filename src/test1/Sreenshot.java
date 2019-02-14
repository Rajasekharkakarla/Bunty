package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.ie.InternetExplorerDriver;

public class Sreenshot {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-jee-oxygen-3-rc2-win32-x86_64\\Test\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*System.setProperty("webdriver.ie.driver", "D:\\eclipse-jee-oxygen-3-rc2-win32-x86_64\\Test\\IEDriverServer.exe");
		WebDriver driver1=new InternetExplorerDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("abc");
		
		WebElement ele2=driver.findElement(By.name("q"));
		Screensho_Highlight_Lib.highlight(driver1, ele2);
		Screensho_Highlight_Lib.screenshot(driver1, "abc5");*/
		
		
		
		
		
		driver.get("https://www.google.com");
		Screensho_Highlight_Lib.screenshot(driver, "abc");
		System.out.println(driver.getTitle());
		WebElement ele=driver.findElement(By.name("q"));
		Screensho_Highlight_Lib.highlight(driver, ele);
		Screensho_Highlight_Lib.screenshot(driver, "abc1");
		
		if(driver.getTitle().contains("Google")) {
			driver.navigate().to("https://www.yahoo.com");
			WebElement ele1=driver.findElement(By.id("uh-search-box"));
			Screensho_Highlight_Lib.highlight(driver, ele1);
			Screensho_Highlight_Lib.screenshot(driver, "abc2");
		}
		else {
			driver.close();
		}
	}
}
