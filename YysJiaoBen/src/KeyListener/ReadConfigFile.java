package KeyListener;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ReadConfigFile {
    public List<HashMap<String, String>>   ReadFile(){
        HSSFSheet sheet;
        HSSFWorkbook book;
        List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
        try {
            //file为要读取的excel文件名
            File file = new File("C:\\Users\\Administrator\\Desktop\\yys\\薇妹的鼠标插件\\配置文件.xls");
            if (!file.exists()){
                 file = new File("./配置文件.xls");
            }
            InputStream is = new FileInputStream(file);
            book = new HSSFWorkbook(is);
            // 获取每一个工作薄
            for (int numSheet = 0; numSheet < 1; numSheet++) {
                sheet = book.getSheetAt(numSheet);
                // 获取当前工作薄的每一行
                for (int rowNum = 2; rowNum <= 12; rowNum++) {
                    HSSFRow time = sheet.getRow(2);
                    HSSFRow msg = sheet.getRow(rowNum);
                    if (msg != null) {
                        HashMap<String, String> map = new HashMap<String, String>();
                        HSSFCell click = msg.getCell(0);
                        HSSFCell x = msg.getCell(2);
                        HSSFCell y = msg.getCell(3);
                        HSSFCell timeInterval = msg.getCell(4);
                        HSSFCell timeFor = time.getCell(5);
                        map.put("click", click.toString());
                        map.put("x", x.toString());
                        map.put("y", y.toString());
                        map.put("timeInterval", timeInterval.toString());
                        map.put("timeFor", timeFor.toString());
                        list.add(map);
                    }else {
                        break;
                    }
                }
            }
            is.close();
            return list;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "可能未读取到配置文件" + "\n" + list.toString(), "错误原因+", JOptionPane.PLAIN_MESSAGE);
        }
        GlobalKeyListener.state="1";
        return null;
    }
}
