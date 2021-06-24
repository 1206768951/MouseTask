package KeyListener;


import javax.swing.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

public class DealWithFile {
    int count;
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.size());
        System.out.println(list.get(0));
    }

    public List<HashMap<String, String>> SetString() {
        ReadConfigFile file = new ReadConfigFile();
        List<HashMap<String, String>> list = file.ReadFile();
        List<HashMap<String, String>> listCount = new ArrayList<HashMap<String, String>>();
        if (list == null) {
            GlobalKeyListener.state = "1";
            JOptionPane.showMessageDialog(null, "xls的第一个表的数据为空,请检查" + "\n" + "即将自动结束程序！！！", "程序结束", JOptionPane.PLAIN_MESSAGE);
        } else {
            for (int i = 0; i < 11; i++) {
                //
                HashMap<String, String> map = list.get(i);
                if (map.get("x") == "" && map.get("y") == "" && map.get("timeInterval") == "") {
                    count = i - 1;
                    break;
                } else if (map.get("x") == "" || map.get("y") == "" || map.get("timeInterval") == "" || map.get("timeFor") == "") {
                    count = i + 1;
                    GlobalKeyListener.state = "1";
                    JOptionPane.showMessageDialog(null, "您的第" + count + "个点击指令行未配置完成" + "\n" + "即将自动结束程序！！！", "程序结束", JOptionPane.PLAIN_MESSAGE);
                } else if (map.get("x") != "" || map.get("y") != "" || map.get("timeInterval") != "" || map.get("timeFor") != "") {
                    count = i;
                }
                listCount.add(list.get(i));
            }
        }
        return listCount;
    }


}
