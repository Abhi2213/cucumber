package utility;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;


	public ExcelUtils(String excelPath, String sheetName) {
		try {
			projectPath=System.getProperty("user.dir");
			System.out.println(projectPath);
			workbook=new XSSFWorkbook(excelPath);
			sheet= workbook.getSheet(sheetName);

		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	public static void main(String[] args) {
		//getRowCount();
		getCellData(0,0);
	}

//	public static void getRowCount() {
//		int rowcount=sheet.getPhysicalNumberOfRows();
//		System.out.println("No of rows:"+rowcount); 
//	}

	public static void getCellData(int rowNum, int colNum) {
		String celldata= sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		System.out.println("Cell data:"+celldata);

	}
}