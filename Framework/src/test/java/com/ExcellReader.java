package com;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcellReader {
	
		String path;
		String sheetName;
		
		public ExcellReader(String path, String sheetName) {
			
			this.path = path;
			this.sheetName = sheetName;
		}

		public int getRowCount()
		{
			int row=0;
			try {
				XSSFWorkbook workbook = new XSSFWorkbook(path);
				XSSFSheet workSheet = workbook.getSheet(sheetName);
				row =  workSheet.getPhysicalNumberOfRows();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return row;
		}
		
		public int getColCount()
		{
			int col=0;
			try {
				XSSFWorkbook workbook = new XSSFWorkbook(path);
				XSSFSheet workSheet = workbook.getSheet(sheetName);
				col = workSheet.getRow(0).getPhysicalNumberOfCells();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return col;
		}
		
		public String getData(int row, int col)
		{
			String data = null;
			try {
				XSSFWorkbook workbook = new XSSFWorkbook(path);
				XSSFSheet workSheet = workbook.getSheet(sheetName);
				data = workSheet.getRow(row).getCell(col).getStringCellValue();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return data;
		}
}
