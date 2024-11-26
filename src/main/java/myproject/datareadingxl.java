package myproject;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datareadingxl {

	public static void main(String[] args) throws IOException
	{
	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\datafiles\\Sales data.xlsx");
	
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	
	XSSFSheet sheet = workbook.getSheet("sales Data ");
	int totalrows = sheet.getLastRowNum();
	int totalcells = sheet.getRow(2).getLastCellNum();
	System.out.println("total number of Rows"+ totalrows );
	System.out.println("total number of cells"+ totalcells );
	
	for(int r=1;r<=totalrows;r++)
	{
		XSSFRow currentRow = sheet.getRow(r);
	
	     for(int c=0; c<totalcells; c++)	
	    {
		XSSFCell cell=currentRow.getCell(c);
		 System.out.print(cell.toString()+"\t");
	     }
	System.out.println();
	}
	workbook.close();
	file.close();
	

}
}