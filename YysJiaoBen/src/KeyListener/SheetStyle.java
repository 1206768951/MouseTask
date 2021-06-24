package KeyListener;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.CellRangeAddress;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;

public class SheetStyle {
    public void setWidth(Sheet sheet) {
        for (int i = 0; i < 4; i++) {
            sheet.setColumnWidth(i, 5000);
        }
        sheet.setColumnWidth(4, 12000);
        sheet.setColumnWidth(5, 12000);
    }

    public HSSFCellStyle Front(HSSFWorkbook book,short color) {
        //设置内容居中
        HSSFCellStyle cellStyle = book.createCellStyle();
        cellStyle.setFillForegroundColor(color);
        //solid 填充  foreground  前景色
        cellStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
        //标题字体
        HSSFFont text = book.createFont(); //标题字体
        text.setFontHeightInPoints((short)12); //字号

        cellStyle.setBorderBottom(HSSFCellStyle.BORDER_MEDIUM);
        cellStyle.setBottomBorderColor(HSSFColor.BLACK.index);
        cellStyle.setBorderLeft(HSSFCellStyle.BORDER_MEDIUM);
        cellStyle.setLeftBorderColor(HSSFColor.BLACK.index);
        cellStyle.setBorderRight(HSSFCellStyle.BORDER_MEDIUM);
        cellStyle.setRightBorderColor(HSSFColor.BLACK.index);
        cellStyle.setBorderTop(HSSFCellStyle.BORDER_MEDIUM);
        cellStyle.setTopBorderColor(HSSFColor.BLACK.index);

//        text.setColor((short)6);//字体颜色
        cellStyle.setFont(text);
        cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); //水平居中
        cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER); //垂直居中
        return cellStyle;
    }

    public void mergeSheet(Sheet sheet,int x1,int x2,int x3,int x4) {
        sheet.addMergedRegion(new CellRangeAddress(x1, x2, x3, x4));
    }
}
