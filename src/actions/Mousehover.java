package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-jee-oxygen-3-rc2-win32-x86_64\\Test\\chromedriver.exe");
				WebDriver mouse=new ChromeDriver();
				mouse.get("http://www.dravidianuniversity.ac.in/");
				
				Actions act=new Actions(mouse);
				act.moveToElement(mouse.findElement(By.xpath("//*[@id=\"navAbout\"]/a"))).build().perform();
				act.click(mouse.findElement(By.xpath("/html/body/php/table[1]/tbody/tr[5]/td/table/tbody/tr/td[1]/table/tbody/tr/td[1]/span[2]/div"))).doubleClick().build().perform();

	}

}
