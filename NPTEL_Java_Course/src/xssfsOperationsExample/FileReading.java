package xssfsOperationsExample;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileReading {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook xsfb = new XSSFWorkbook("C:\\Users\\Gourish Hegde\\Desktop\\ExpenseLog.xlsx");
		System.out.println("Current Sheet is: "+xsfb.getSheetName(0));
		XSSFSheet sheet = xsfb.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.iterator();
		while(rowIterator.hasNext()){
			XSSFRow row = (XSSFRow) rowIterator.next();
			Iterator<Cell> cellIterator= row.cellIterator();
			System.out.println("");
			while(cellIterator.hasNext()){
				Cell cell = cellIterator.next();
				System.out.print(" ~ ");
				switch(cell.getCellType()){
				case BOOLEAN: System.out.print(cell.getBooleanCellValue());
					break;
				case ERROR: System.out.print(cell.getErrorCellValue());
					break;
				case NUMERIC: System.out.print(cell.getNumericCellValue());
					break;
				case STRING: System.out.print(cell.getStringCellValue());
					break;
				default: System.out.print("Error Occured...");
					break;
				}
			}
		}
	}

}
