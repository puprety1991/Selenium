package com.syntax.JavaBasics.fileHandling;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFChartSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelFileHandling {
    public static void main(String[] args) throws IOException {
        String path = "/Users/puskaruprety/eclipse-workspace/SeleniumTest/src/com/syntax/util/Test.xlsx";
        System.out.println(path); // path to the file
        FileInputStream fileInputStream = new FileInputStream(path); // creating the connection
        Workbook workbook = new XSSFWorkbook(fileInputStream); // creating the object of XSSWorkbook to manipulate .xlsx files

        Sheet sheet = workbook.getSheet("Sheet1"); // accessing the sheet
        Row row = sheet.getRow(0); // accessing the rows by index
        Cell cell = row.getCell(1); // accessing the cell by index
        cell.setCellValue("boxing");
        System.out.println(cell); // printing the result
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
         // 2 hours:52 minutes completed



    }
}
