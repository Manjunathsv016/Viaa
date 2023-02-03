package genericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

/***
 * 
 * @author MANJUNATH
 *
 */

public class ReadData {
	/**
	 * This method helps us to read data from property file
	 * 
	 * @param the associated key name in property file
	 * @return
	 */
	public static String fromPropertyFile(String key) {
		FileInputStream fis = null;
		Properties properties = null;
		try {
			fis = new FileInputStream(new File("./src/test/resources/testData/configration.properties"));
			properties = new Properties();
			properties.load(fis);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(key);

	}

	public static String fromExcel(String sheetName, int rowNo, int cellNo) {
		FileInputStream fis = null;
		Workbook workbook = null;
		try {
			fis = new FileInputStream(new File("./src/test/resources/testData/userData.xlsx"));
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();

	}
	public static LocalDateTime fromExcelWithDateTime(String sheetName, int rowNo, int cellNo) {
		FileInputStream fis = null;
		Workbook workbook = null;
		try {
			fis = new FileInputStream(new File("./testData/u.xlsx"));
			workbook = WorkbookFactory.create(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getLocalDateTimeCellValue();

	}
	
	
	public static int dayFromSystem(int num) {
		LocalDateTime systemdate = LocalDateTime.now().plusDays(num);
		
		int day =systemdate.getDayOfMonth();
		return day;
	}
	public static int yearFromSystem(int num) {
		LocalDateTime systemdate = LocalDateTime.now().plusYears(num);
		
		int year = systemdate.getYear();
		return year;
	}
	public static String monthFromSystem(int num) {
		LocalDateTime systemdate = LocalDateTime.now().plusMonths(num);
		String monthName = systemdate.getMonth().name();	
		String month = "" + monthName.charAt(0) + monthName.substring(1, 3).toLowerCase();
		return month;	
	}
	@DataProvider
	public String[][] viaDataFromExcel() throws EncryptedDocumentException, IOException{
		FileInputStream fis=new FileInputStream("./testData/Test.xlsx");
		Workbook workBook = WorkbookFactory.create(fis);
		Sheet sheetInfo = workBook.getSheet("Via");
		int rowCount = sheetInfo.getPhysicalNumberOfRows()-1;
		int columnCount = sheetInfo.getRow(0).getPhysicalNumberOfCells();
		String data[][]=new String[rowCount][columnCount];
		
		for(int i=1,k=0;i<=rowCount;i++,k++) {
			for(int j=0;j<columnCount;j++) {
				data[k][j]=sheetInfo.getRow(i).getCell(j).toString();
			}
		}
		return data;
		
	}

}
