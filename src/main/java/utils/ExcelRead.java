package utils;

import org.apache.poi.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

public class ExcelRead {

    public void readExcel(String filePath, String sheetName, String targetData){

        if(sheetName==null || filePath == null){
            throw new MyException("Browser is null");
        }

        try {
            File file = new File(System.getProperty("user.dir")+filePath);
            FileInputStream fileInput = new FileInputStream(file);
//            System.out.println(System.getProperty("user.dir")+filePath);
            XSSFWorkbook xlsRead = new XSSFWorkbook(fileInput);
            Sheet targetSheet = xlsRead.getSheet(sheetName);
            int lRow = targetSheet.getLastRowNum();
            int fRow = targetSheet.getFirstRowNum();
            System.out.println(lRow +" first row "+fRow);
            for(int i=0;i<lRow;i++){
                Row r = targetSheet.getRow(i);
                if(r!=null) {
                    for (int j = 0; j < r.getLastCellNum(); j++) {
                        System.out.println(r.getLastCellNum());
                        try {
                            Boolean flag = r.getCell(j).toString().equalsIgnoreCase(targetData);
                            System.out.println(flag);
                            int firstRow = j;
                            int secondRow = 0;
//                            while(r.getCell(j).toString().equalsIgnoreCase(targetData)) {
//                                System.out.println("1111");
//                                secondRow = j;
//                                break;
//                            }
//                            System.out.println(firstRow);
//                            System.out.println(secondRow);

//                            if(flag) {
//                                System.out.println("inside ");
//                                for (int k = 0; k < r.getLastCellNum(); k++) {
//                                    System.out.println("inside k");
//                                    System.out.println("cell data " + r.getCell(j));
//                                }
//                            }

                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
//                System.out.println(targetSheet.getRow(i));
//                Iterator<Cell> it = targetSheet.getRow(i).cellIterator();
//                if(it.hasNext()){
//                    short lastColumn = targetSheet.getRow(i).getLastCellNum();
//                    System.out.println(lastColumn);
//                }
            }


        }
        catch (Exception e){
            System.out.println("File exception");
            e.printStackTrace();
        }
    }


}
