package com.ebankingv1.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlUtil {
	
public static FileInputStream fi;
public static FileOutputStream fo;
public static XSSFWorkbook wb;
public static XSSFSheet ws;
public static XSSFRow row;
public static XSSFCell cell;

public static int getrowcount(String xlfile,String sheet) throws Exception
{
	fi=new FileInputStream(xlfile);
	wb=new XSSFWorkbook(fi);
	ws=wb.getSheet(sheet);
	int rowcount=ws.getLastRowNum();
	wb.close();
	fi.close();
	
	return rowcount;
	

}
public static int getcellcount(String xlfile,String sheet,int rowcount) throws Exception
{
	fi=new FileInputStream(xlfile);
	wb=new XSSFWorkbook(fi);
	ws=wb.getSheet(sheet);
row=ws.getRow(rowcount);
int cellcount=row.getLastCellNum();
	wb.close();
	fi.close();
	
	return cellcount;
	}
	
public static String getCelldata(String  excel,String sheet,int rowcount,int cellcount) throws Exception
{  
	fi=new FileInputStream(excel);
	wb=new XSSFWorkbook(fi);
	ws=wb.getSheet(sheet);
	row=ws.getRow(rowcount);
	cell=row.getCell(cellcount);
	String data;
	try{
		DataFormatter formatter= new DataFormatter();
	String celldata =formatter.formatCellValue(cell);
	return celldata;
	
}
catch(Exception e)
{
	data="";

}
	wb.close();
	fi.close();
	return data;
	
	
	
}

public static void setcelldata(String excel,String sheet,int rowcount,int colcount,String data) throws Exception

{
	
fi=new FileInputStream(excel);
wb=new XSSFWorkbook(fi);
ws=wb.getSheet(sheet);
row=ws.getRow(rowcount);
cell=row.getCell(colcount);
cell.setCellValue(data);
fo=new FileOutputStream(excel);
wb.write(fo);
wb.close();
fi.close();
fo.close();




}
}
