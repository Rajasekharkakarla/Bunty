package data_Driven;

import java.io.File;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Sheet {

	public static void main(String[] args) throws Exception {
		
		File fis=new File("C:\\Users\\RK00428211\\Desktop\\Bunty.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		
		
		for(int i=1;i<sh.getLastRowNum()+1;i++) {
			String str=sh.getRow(i).getCell(0).getStringCellValue();
			String str1=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(str);
			System.out.println(str1);
			wb.close();	
		}
	}
}