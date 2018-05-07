package Example;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Appache {
	String path="C:\\Users\\WINDOWS\\Desktop\\Yahoo.xlsx";

	public String getExceldata(String sheetname, int rownum, int colnum ) throws Throwable
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetname);
		Row row=sh.getRow(rownum);
		String data=row.getCell(colnum).getStringCellValue();
		wb.close();
		return data;
		
	}
	public void setExceldata(String sheetname, int rownum, int colnum,String data )throws Throwable
	{

		FileInputStream fis= new FileInputStream("path");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetname);
		Row r=sh.getRow(rownum);
		Cell cel=r.createCell(colnum);
		cel.setCellValue(data);
		FileOutputStream fos=new FileOutputStream("path");
		wb.write(fos);
		wb.close();
		
	}
}
