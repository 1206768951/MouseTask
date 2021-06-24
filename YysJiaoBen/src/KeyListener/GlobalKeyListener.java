package KeyListener;

import java.awt.AWTException;
import java.awt.Robot;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.swing.JOptionPane;

import com.melloware.jintellitype.HotkeyListener;
import com.melloware.jintellitype.JIntellitype;

public class GlobalKeyListener {
    private Robot robot;
    private HotkeyListener hotkeyListener;
    static String state = "0";
    static int sleep2 = 35000;
    static int x[];
    static int y[];
    static int t[];
    static int f;

    public GlobalKeyListener() {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        ;
        this.addKey();
        this.addKeyEvent();
    }

    public void addKey() {
    }

    public void clearKey() {
    }

    public void clearKeyEvent() {
    }

    public void addKeyEvent() {

    }

    public static void main(String[] args) {
        //监控程序结束
        ExitController exitController = new ExitController();
        Thread exit = new Thread(exitController);
        exit.start();
        //前言介绍
        JOptionPane.showMessageDialog(null,
                "使用前一定要看使用说明" + "！！！" + "\n" + "程序至少需要执行一轮才能关闭" + "\n"
                        + "操作指令在说明文档上" + "\n" + "程序2021年6月27号过期,详情联系哔哩哔哩-歪欧来豆",
                "前言提示！！！", JOptionPane.PLAIN_MESSAGE);
        //这段请勿修改
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time1 = new Date();
        Date time2 = new Date();
        try {
            time1 = sdf.parse(sdf.format(new Date())); // 这是获取当前时间
            time2 = sdf.parse("2021-06-27 00:00:00");
        } catch (ParseException e) {
            state = "1";
            JOptionPane.showMessageDialog(null, "获取系统时间异常，即将自动结束程序", "其他异常", JOptionPane.PLAIN_MESSAGE);
        }
        if (time1.getTime() > time2.getTime()) {
            try {
                int a = 1 / 0;
            } catch (Exception e) {
                state = "1";
                JOptionPane.showMessageDialog(null, "程序已过使用时限，即将自动结束程序", "已经过期", JOptionPane.PLAIN_MESSAGE);
            }
        }
        //是否自定义鼠标位置
//        JOptionPane mouse = new JOptionPane("ojbk");
//        Object[] TorF = {"使用xls配置鼠标位置", "使用快捷键配置鼠标位置"};
//        Object wzstr = mouse.showInputDialog(null,
//                "请选择鼠标配置方式", "歪欧来豆",
//                mouse.INFORMATION_MESSAGE, null,
//                TorF, TorF[0]);
//        if (wzstr == null) {
//            state = "1";
//            JOptionPane.showMessageDialog(null, "未选择设置" + "\n" + "即将自动结束程序！！！", "程序结束", JOptionPane.PLAIN_MESSAGE);
//        }else if (wzstr.toString().equals("使用xls配置鼠标位置")) {
        try {
            new XlsConfigMouse();
            //读取xls文件内容
            DealWithFile dealWithFile = new DealWithFile();
            List<HashMap<String, String>> list = dealWithFile.SetString();
            x = new int[list.size()];
            y = new int[list.size()];
            t = new int[list.size()];
            Random random = new Random();
            f = (int) Double.parseDouble(list.get(0).get("timeFor")) * 1000 + random.nextInt(100);
            for (int i = 0; i < list.size(); i++) {
                try {
                    x[i] = (int) Double.parseDouble(list.get(i).get("x"));
                    y[i] = (int) Double.parseDouble(list.get(i).get("y"));
                    t[i] = (int) Double.parseDouble(list.get(i).get("timeInterval")) * 1000 + random.nextInt(200);
                } catch (Exception e) {
                    i = i + 2;
                    state = "1";
                    JOptionPane.showMessageDialog(null, "错误程序即将结束" + "\n" + "请检查你的指令" + i + "数据格式，别瞎几把填" + "\n" + "请按Ctrl+E结束程序！！！", "失败", JOptionPane.PLAIN_MESSAGE);
                }
            }

        } catch (Exception e) {
            state = "1";
            JOptionPane.showMessageDialog(null, "错误" + "\n" + "可能是程序未关闭，或者启动多个程序" + "\n" + "请按Ctrl+E结束程序！！！", "失败", JOptionPane.PLAIN_MESSAGE);
        }
//        } else if (wzstr.toString().equals("使用快捷键配置鼠标位置")) {
//            //选择战斗规则
//            JOptionPane p = new JOptionPane("ojbk");
//            Object[] msg = {"组队队长", "组队队员", "组队双开"};
//            Object choose = p.showInputDialog(null,
//                    "请选择你刷御魂副本的设定", "歪欧来豆",
//                    p.INFORMATION_MESSAGE, null,
//                    msg, msg[0]);
//            if (choose == null) {
//                state = "1";
//                JOptionPane.showMessageDialog(null, "未选择设定" + "\n" + "即将自动结束程序！！！", "程序结束", JOptionPane.PLAIN_MESSAGE);
//            }
//            //选择战斗时间
//            JOptionPane pane = new JOptionPane("ojbk");
//            Object[] possibleValues = {"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33"};
//            Object selectedValue = pane.showInputDialog(null,
//                    "请选择你刷御魂副本的时间", "歪欧来豆",
//                    pane.INFORMATION_MESSAGE, null,
//                    possibleValues, possibleValues[0]);
//            if (selectedValue == null) {
//                state = "1";
//                JOptionPane.showMessageDialog(null, "未选择时间" + "\n" + "即将自动结束程序！！！", "程序结束", JOptionPane.PLAIN_MESSAGE);
//            } else {
//                String s = selectedValue.toString();
//                for (int i = 18; i <= 34; i++) {
//                    if (s.equals(i + "")) {
//                        sleep = (i + 10) * 1000;
//                        sleep2 = (i + 17) * 1000;
//                    }
//                }
//            }
//            //开始创建已经设定的战斗对象
//            String s = choose.toString();
//            if (s.equals("组队队长")) {
//                try {
//                    need=3;
//                    new DuiZhang();
//                } catch (Exception e) {
//                    state = "1";
//                    JOptionPane.showMessageDialog(null, "错误" + "\n" + "可能是程序未关闭，或者启动多个程序" + "\n" + "请按Ctrl+E结束程序！！！", "失败", JOptionPane.PLAIN_MESSAGE);
//                }
//            } else if (s.equals("组队队员")) {
//                try {
//                    need=2;
//                    new DuiYuan();
//                } catch (Exception e) {
//                    state = "1";
//                    JOptionPane.showMessageDialog(null, "错误" + "\n" + "可能是程序未关闭，或者启动多个程序" + "\n" + "请按Ctrl+E结束程序！！！", "失败", JOptionPane.PLAIN_MESSAGE);
//                }
//            } else if (s.equals("组队双开")) {
//                try {
//                    need=4;
//                    new ShuangKai();
//                } catch (Exception e) {
//                    state = "1";
//                    JOptionPane.showMessageDialog(null, "错误" + "\n" + "可能是程序未关闭，或者启动多个程序" + "\n" + "请按Ctrl+E结束程序！！！", "失败", JOptionPane.PLAIN_MESSAGE);
//                }
//            } else {
//                state = "1";
//                JOptionPane.showMessageDialog(null, "其他错误" + "\n" + "即将自动结束程序！！！", "程序结束", JOptionPane.PLAIN_MESSAGE);
//            }
//        } else {
//            state = "1";
//            JOptionPane.showMessageDialog(null, "其他错误" + "\n" + "即将自动结束程序！！！", "程序结束", JOptionPane.PLAIN_MESSAGE);
//        }
    }


}
