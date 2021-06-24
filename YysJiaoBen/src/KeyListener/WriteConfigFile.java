package KeyListener;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.hssf.util.Region;

import java.io.*;
import java.util.HashMap;
import java.util.List;

public class WriteConfigFile {
    public int WriteFile(List<HashMap<String, String>> list) {
        HSSFSheet sheet;
        HSSFWorkbook book;
        try {
            //file为要读取的excel文件名
            File file = new File("C:\\Users\\Administrator\\Desktop\\yys\\薇妹的鼠标插件\\上次的鼠标坐标.xls");
            if (!file.exists()) {
                file = new File("C:\\Users\\Administrator\\Desktop\\yys\\薇妹的鼠标插件\\上次的鼠标坐标.xls");
//                file = new File("./上次的鼠标坐标.xls");
            }
//            InputStream is = new FileInputStream(file);
//            book = new HSSFWorkbook(is);
//            // 获取每一个工作薄
//            sheet = book.getSheetAt(0);
            HSSFWorkbook ws = new HSSFWorkbook();//建立新HSSFWorkbook对象
            sheet=ws.createSheet("sheet1");//新建sheet
//            FileOutputStream fileOut = new FileOutputStream("./上次的鼠标坐标.xls");//创建文件流

            FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\yys\\薇妹的鼠标插件\\上次的鼠标坐标.xls");//创建文件流
            HashMap<String, String> map = new HashMap();
            //样式
            SheetStyle style = new SheetStyle();
            style.setWidth(sheet);
            HSSFCellStyle frontStyleY = style.Front(ws, HSSFColor.YELLOW.index);
            HSSFCellStyle frontStyleG = style.Front(ws,HSSFColor.GREY_25_PERCENT.index);
            HSSFCellStyle frontStyleW = style.Front(ws, HSSFColor.WHITE.index);
            style.mergeSheet(sheet,0,1,0,0);
            style.mergeSheet(sheet,0,1,1,1);
            style.mergeSheet(sheet,0,1,2,2);
            style.mergeSheet(sheet,0,1,3,3);
            style.mergeSheet(sheet,0,1,4,4);
            style.mergeSheet(sheet,0,1,5,5);
            // 获取当前工作薄的每一行
            HSSFCell cell;
            for (int rowNum = 0; rowNum <= list.size()+1; rowNum++) {
                HSSFRow msg = sheet.createRow(rowNum);
                if (rowNum < 2) {

                    cell = msg.createCell(0);
                    cell.setCellStyle(frontStyleY);

                    msg.getCell(0).setCellValue("操作指令顺序：");

                    cell = msg.createCell(1);
                    cell.setCellStyle(frontStyleY);
                    msg.getCell(1).setCellValue("录取快捷键：");

                    cell = msg.createCell(2);
                    cell.setCellStyle(frontStyleY);
                    msg.getCell(2).setCellValue("坐标轴X:");

                    cell = msg.createCell(3);
                    cell.setCellStyle(frontStyleY);
                    msg.getCell(3).setCellValue("坐标轴Y:");

                    cell = msg.createCell(4);
                    cell.setCellStyle(frontStyleY);
                    msg.getCell(4).setCellValue("触发点击点击等待时间：(单位秒）：");

                    cell =  msg.createCell(5);
                    cell.setCellStyle(frontStyleY);
                    msg.getCell(5).setCellValue("循环时间：循环时间为一波指令循环的时间(单位秒）：");
                }
                if (rowNum >= 2)  {
                    map = list.get(rowNum - 2);
                    int num=rowNum-1;
                    cell = msg.createCell(0);
                    cell.setCellStyle(frontStyleG);
                    msg.getCell(0).setCellValue("点击"+num);

                    cell =  msg.createCell(1);
                    cell.setCellStyle(frontStyleG);
//                    String str= WriteConfigFile.getString(list.size(),rowNum);
                    String str;
                    if (num<10){
                         str = "Ctrl+"+num;
                    }else {
                         str =  "Ctrl+0";
                    }
                    msg.getCell(1).setCellValue(str);

                    cell = msg.createCell(2);
                    cell.setCellStyle(frontStyleW);
                    msg.getCell(2).setCellValue(map.get("x"));

                    cell =  msg.createCell(3);
                    cell.setCellStyle(frontStyleW);
                    msg.getCell(3).setCellValue(map.get("y"));

                    cell =   msg.createCell(4);
                    cell.setCellStyle(frontStyleW);
                    msg.getCell(4).setCellValue(map.get("timeInterval"));

                    cell =  msg.createCell(5);
                    cell.setCellStyle(frontStyleW);
                    msg.getCell(5).setCellValue(map.get("timeFor"));
                }
            }
            style.mergeSheet(sheet,2,list.size()+1,5,5);
            ws.write(fileOut);//把Workbook对象输出到路径path中
            fileOut.close();
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

//    static String getString(int size,int num){
//        if (num==2){
//
//        }
//        return "";
//    }
}
