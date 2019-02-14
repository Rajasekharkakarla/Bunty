package data_Driven;

import java.io.File;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class InsertData {

	public static void main(String[] args) throws Exception {
		File fi=new File("C:\\Users\\RK00428211\\Desktop\\Bunty.xlsx");
		XSSFWorkbook wb1=new XSSFWorkbook(fi);
		XSSFSheet sh=wb1.getSheetAt(0);
		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-jee-oxygen-3-rc2-win32-x86_64\\Test\\chromedriver.exe");
		WebDriver excel=new ChromeDriver();
		excel.get("https://www.google.com");
		excel.findElement(By.name("q")).sendKeys(sh.getRow(1).getCell(0).getStringCellValue());
		wb1.close();
		
		TakesScreenshot ts=(TakesScreenshot)excel;
		File Sr=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Sr, new File("C:\\Users\\RK00428211\\Desktop\\abcd.png"));
		
		JavascriptExecutor js=(JavascriptExecutor)excel;
		WebElement ele=excel.findElement(By.name("q"));
	//	js.executeScript("arguments[0].setAttribute('style', 'border: solid 2px red; background: yellow;');", ele);
		
		js.executeScript("arguments[0].setAttribute('style', 'border: solid 2px red; background: yellow;');", ele);
		
		
		
	//	js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
		Thread.sleep(2000);
		
		Actions act=new Actions(excel);
		act.moveToElement(ele).contextClick().build().perform();
		WebElement ele1=excel.findElement(By.linkText("Gmail"));
		act.dragAndDrop(ele1, ele).build().perform();
		act.clickAndHold().dragAndDrop(ele1, ele).build().perform();
		
		
		
		
	}

}
