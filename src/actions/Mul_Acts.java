package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mul_Acts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-jee-oxygen-3-rc2-win32-x86_64\\Test\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.google.com");
		WebElement ele=Driver.findElement(By.name("q"));
		Actions act= new Actions(Driver);
		act.moveToElement(ele).click().keyDown(ele, Keys.SHIFT).sendKeys("bunty").keyUp(ele, Keys.SHIFT).contextClick().build().perform();

	}

}
