package base;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_ReadTC {

	public String[][] ReadingExcelFile(String FileSheet_Name) throws IOException {

		XSSFWorkbook wb = new XSSFWorkbook("./Data/POMLeads.xlsx");
		XSSFSheet ws = wb.getSheet(FileSheet_Name);
		int MaxRowCount = ws.getLastRowNum();
		short MaxColumnCount = ws.getRow(1).getLastCellNum();

		String[][] data = new String[MaxRowCount][MaxColumnCount];
		for (int i = 1; i <= MaxRowCount; i++) {
			for (int j = 0; j < MaxColumnCount; j++) {
				String ExcelValue = ws.getRow(i).getCell(j).getStringCellValue();
				data[i - 1][j] = ExcelValue;

			}

		}
		wb.close();
		return data;

	}

}
