package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-jee-oxygen-3-rc2-win32-x86_64\\Test\\chromedriver.exe");
		WebDriver ac=new ChromeDriver();
		ac.get("http://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		ac.manage().window().maximize();
		ac.switchTo().frame(0);
		WebElement ele=ac.findElement(By.xpath("//*[@id='gallery']/li[1]/img"));
		WebElement ele1=ac.findElement(By.id("trash"));
		Actions act=new Actions(ac);
		act.dragAndDrop(ele, ele1).build().perform();;	
	}
}