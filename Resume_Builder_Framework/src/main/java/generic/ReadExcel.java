package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author Yogita
 *
 */
public class ReadExcel implements FrameworkConstants{

	public Workbook workbook;
	public File filePath=new File(EXCEL_PATH);

	public String getData(String sheet, int row, int column) throws IOException {

		String val="";
		FileInputStream fis = new FileInputStream(filePath);
		workbook=WorkbookFactory.create(fis);
		Cell cell=workbook.getSheet(sheet).getRow(row).getCell(column);
		return val=cell.getStringCellValue();
	}

	public String[][] getMultipleData(String sheetName) 
	{
		try {
			FileInputStream fis=new FileInputStream(filePath);
			workbook = WorkbookFactory.create(fis);
		}
		catch (EncryptedDocumentException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		int phyRowCount = workbook.getSheet(sheetName).getPhysicalNumberOfRows();
		int phyCellCount = workbook.getSheet(sheetName).getRow(0).getPhysicalNumberOfCells();

		String[][] stringValue = new String[phyRowCount-1][phyCellCount];

		for(int i=1;i<phyRowCount;i++)
		{			
			for(int j=0;j<phyCellCount;j++)
			{				
				stringValue[i-1][j]=workbook.getSheet(sheetName).getRow(i).getCell(j).getStringCellValue();
			}
		}		
		return stringValue;
	}

}
