package com.syntax.JavaBasics.fileHandling;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelFileHandlingDemo1 {
    public static void main(String[] args) throws IOException {

        String path = "/Users/puskaruprety/eclipse-workspace/SeleniumTest/src/com/syntax/util/Test.xlsx";
        System.out.println(path); // path to the file
        FileInputStream fileInputStream = new FileInputStream(path); // creating the connection
        Workbook workbook = new XSSFWorkbook(fileInputStream); // creating the object of XSSWorkbook to manipulate .xlsx files

        Sheet sheet = workbook.getSheet("SecondPage"); // accessing the sheet
        for(int i=0;i<sheet.getPhysicalNumberOfRows();i++){
           Row rowData = sheet.getRow(i); // getting the row one by one using outer loop
           for(int j =0;j<rowData.getPhysicalNumberOfCells();j++){
               System.out.print(rowData.getCell(j)+" ");//getting the cells one by one using inner loop

           }
           System.out.println();
           //Cell cell = row.getCell(0);
          /* String firstName = row.getCell(0).getStringCellValue();
           String lastName =row.getCell(1).getStringCellValue();
           String hobby = row.getCell(2).getStringCellValue();
           int age = (int)row.getCell(3).getNumericCellValue();*/

       }

    }
}
