package class28;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class E1ExcelFile {
    public static void main(String[] args) throws IOException {

        String path=System.getProperty("user.dir")+"\\Files\\TestExcelFIle.xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        //1)Software 2) Path 3) Store the file
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
     //   Sheet sheet = xssfWorkbook.createSheet("Sheet1");
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        Row row = sheet.createRow(0);
        Cell cell = row.createCell(0);
        Cell cell1=row.createCell(1);
        cell.setCellValue("Wael");
        cell1.setCellValue("Jacob");
        // used when we have to create a new file or we write data to a file
        FileOutputStream fileOutputStream=new
                FileOutputStream(path);
        xssfWorkbook.write(fileOutputStream);



    }
}
