package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelUtils {


	private XSSFWorkbook wb;
	private XSSFSheet sheet;

	public ExcelUtils(String excelPath, String sheetName){

		try{

			wb = new XSSFWorkbook(excelPath);

			sheet = wb.getSheet(sheetName);

		}catch(Exception e){
			e.printStackTrace();
		}


	}

	@Test
	public int getRowCount(){
		int rowCount =0;
		try {
			rowCount = sheet.getPhysicalNumberOfRows();

			System.out.println("Number of active rows : "+rowCount);

		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}
		return rowCount;
	}
	@Test
	public int getColCount(){

		int colCount = 0;

		try {
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();

			System.out.println("Number of active rows : "+colCount);

		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}

		return colCount;
	}

	@Test
	public String getCellDataString(int rowNum,int colNum){
		String cellData = null;
		try {

			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();

			//System.out.println(cellData);

		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}
		return cellData;

	}

	@Test	
	public void getCellDataNumber(int rowNum,int colNum){

		try {

			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();

			System.out.println(cellData);

		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();

		}

	}
}
