//package KeyListener;
//
//import com.melloware.jintellitype.HotkeyListener;
//import com.melloware.jintellitype.JIntellitype;
//
//import javax.swing.*;
//import java.awt.*;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//public class ShuangKai extends GlobalKeyListener {
//    private Robot robot;
//    private HotkeyListener hotkeyListener;
//
//    public ShuangKai() {
//        try {
//            robot = new Robot();
//        } catch (AWTException e) {
//            e.printStackTrace();
//        }
//        ;
//        this.addKey();
//        this.addKeyEvent();
//    }
//
//    public void addKey() {
//        JIntellitype.getInstance().registerHotKey(1, JIntellitype.MOD_CONTROL, '1');
//        JIntellitype.getInstance().registerHotKey(2, JIntellitype.MOD_CONTROL, '2');
//        JIntellitype.getInstance().registerHotKey(3, JIntellitype.MOD_CONTROL, '3');
//        JIntellitype.getInstance().registerHotKey(4, JIntellitype.MOD_CONTROL, '4');
//        JIntellitype.getInstance().registerHotKey(5, JIntellitype.MOD_CONTROL, '5');
//        JIntellitype.getInstance().registerHotKey(6, JIntellitype.MOD_CONTROL, '6');
//        JIntellitype.getInstance().registerHotKey(7, JIntellitype.MOD_CONTROL, '7');
//        JIntellitype.getInstance().registerHotKey(8, JIntellitype.MOD_CONTROL, '8');
//        JIntellitype.getInstance().registerHotKey(9, JIntellitype.MOD_CONTROL, '9');
//        JIntellitype.getInstance().registerHotKey(10, JIntellitype.MOD_CONTROL, '0');
//        JIntellitype.getInstance().registerHotKey(99, JIntellitype.MOD_CONTROL, 'S');
//        JIntellitype.getInstance().registerHotKey(100, JIntellitype.MOD_CONTROL, 'E');
//    }
//
//    public void clearKey() {
//        JIntellitype.getInstance().unregisterHotKey(1);
//        JIntellitype.getInstance().unregisterHotKey(2);
//    }
//
//    public void clearKeyEvent() {
//        JIntellitype.getInstance().removeHotKeyListener(hotkeyListener);
//    }
//
//    public void addKeyEvent() {
//        hotkeyListener = new HotkeyListener() {
//            @SuppressWarnings("static-access")
//            public void onHotKey(int code) {
//                WaitController queding = new WaitController();
//                IdleClick10 kaishi = new IdleClick10();
//                IdleClick6 jieshu = new IdleClick6();
//                IdleClick6 jiesuan = new IdleClick6();
//                IdleClick6 chulai = new IdleClick6();
//                IdleClick8 jieshu2 = new IdleClick8();
//                IdleClick8 jiesuan2 = new IdleClick8();
//                IdleClick8 chulai2 = new IdleClick8();
//                IdleClick9 duizhang = new IdleClick9();
//                IdleClick7 duiyuan = new IdleClick7();
//
//                Thread mcThread1 = new Thread(queding);
//                Thread mcThread2 = new Thread(kaishi);
//                Thread mcThread3 = new Thread(jieshu);
//                Thread mcThread4 = new Thread(jiesuan);
//                Thread mcThread5 = new Thread(chulai);
//                Thread mcThread6 = new Thread(duiyuan);
//                Thread mcThread7 = new Thread(jieshu2);
//                Thread mcThread8 = new Thread(jiesuan2);
//                Thread mcThread9 = new Thread(chulai2);
//                Thread mcThread10 = new Thread(duizhang);
//                switch (code) {
//                    case 99: {
//                        WriteConfigFile wf = new WriteConfigFile();
//                        List<HashMap<String, String>> list = new ArrayList<>();
//                        HashMap<String, String> map1 = new HashMap<String, String>();
//                        map1.put("x", IdleClick1.Click1X + "");
//                        map1.put("y", IdleClick1.Click1Y + "");
//                        map1.put("timeInterval", "0");
//                        map1.put("timeFor", sleep2 + "0");
//                        list.add(0, map1);
//
//                        HashMap<String, String> map2 = new HashMap<String, String>();
//                        map2 = new HashMap<String, String>();
//                        map2.put("x", IdleClick2.Click2X + "");
//                        map2.put("y", IdleClick2.Click2Y + "");
//                        map2.put("timeInterval", "0");
//                        map2.put("timeFor", "0");
//                        list.add(1, map2);
//
//                        HashMap<String, String> map3 = new HashMap<String, String>();
//                        map3 = new HashMap<String, String>();
//                        map3.put("x", IdleClick3.Click3X + "");
//                        map3.put("y", IdleClick3.Click3Y + "");
//                        map3.put("timeInterval", "0");
//                        map3.put("timeFor", "0");
//                        list.add(2, map3);
//
//                        HashMap<String, String> map4 = new HashMap<String, String>();
//                        map4.put("x", IdleClick4.Click4X + "");
//                        map4.put("y", IdleClick4.Click4Y + "");
//                        map4.put("timeInterval", "0");
//                        map4.put("timeFor", "0");
//                        list.add(3, map4);
//
//                        HashMap<String, String> map5 = new HashMap<String, String>();
//                        map5.put("x", IdleClick5.Click5X + "");
//                        map5.put("y", IdleClick5.Click5Y + "");
//                        map5.put("timeInterval", "0");
//                        map5.put("timeFor", "0");
//                        list.add(4, map5);
//
//                        HashMap<String, String> map6 = new HashMap<String, String>();
//                        map6.put("x", IdleClick6.Click6X + "");
//                        map6.put("y", IdleClick6.Click6Y + "");
//                        map6.put("timeInterval", "0");
//                        map6.put("timeFor",  "0");
//                        list.add(5, map6);
//
//                        HashMap<String, String> map7 = new HashMap<String, String>();
//                        map7.put("x", IdleClick7.Click7X + "");
//                        map7.put("y", IdleClick7.Click7Y + "");
//                        map7.put("timeInterval", "0");
//                        map7.put("timeFor",  "0");
//                        list.add(6, map7);
//
//                        HashMap<String, String> map8 = new HashMap<String, String>();
//                        map8.put("x", IdleClick8.Click8X + "");
//                        map8.put("y", IdleClick8.Click8Y + "");
//                        map8.put("timeInterval", "0");
//                        map8.put("timeFor",  "0");
//                        list.add(7, map8);
//
//                        HashMap<String, String> map9 = new HashMap<String, String>();
//                        map9.put("x", IdleClick9.Click9X + "");
//                        map9.put("y", IdleClick9.Click9Y + "");
//                        map9.put("timeInterval", "0");
//                        map9.put("timeFor",  "0");
//                        list.add(8, map9);
//
//                        HashMap<String, String> map10 = new HashMap<String, String>();
//                        map10.put("x", IdleClick10.Click10X + "");
//                        map10.put("y", IdleClick10.Click10Y + "");
//                        map10.put("timeInterval", "0");
//                        map10.put("timeFor",  "0");
//                        list.add(9, map10);
//
//                        wf.WriteFile(list);
//                        //0未启动，1中断信号，2已启动
//                        if (state.equals("0")) {
//                            state = "2";
//                            addKey();
//                            //点中间确定
//                        }
//                        break;
//                    }
//                    case 100: {
//                        GlobalKeyListener.state = "1";
//                        JOptionPane.showMessageDialog(null, "程序关闭", "哔哩哔哩-歪欧来豆", JOptionPane.PLAIN_MESSAGE);
//                        break;
//                    }
//                    case 1: {
//                        new MouseRoute();
//                        IdleClick1.Click1X = MouseRoute.mousex;
//                        IdleClick1.Click1Y = MouseRoute.mousey;
//                        JOptionPane.showMessageDialog(null, "开始坐标设定完成，请关闭提示", "哔哩哔哩-歪欧来豆", JOptionPane.PLAIN_MESSAGE);
//                        break;
//                    }
//                    case 2: {
//                        new MouseRoute();
//                        IdleClick2.Click2X = MouseRoute.mousex;
//                        IdleClick2.Click2Y = MouseRoute.mousey;
//                        JOptionPane.showMessageDialog(null, "队长领奖励坐标设定完成，请关闭提示", "哔哩哔哩-歪欧来豆", JOptionPane.PLAIN_MESSAGE);
//                        break;
//                    }
//                    case 3: {
//                        new MouseRoute();
//                        IdleClick3.Click3X = MouseRoute.mousex;
//                        IdleClick3.Click3Y = MouseRoute.mousey;
//                        JOptionPane.showMessageDialog(null, "切换队员窗口坐标设定完成，请关闭提示", "哔哩哔哩-歪欧来豆", JOptionPane.PLAIN_MESSAGE);
//                        break;
//                    }
//                    case 4: {
//                        new MouseRoute();
//                        IdleClick4.Click4X = MouseRoute.mousex;
//                        IdleClick4.Click4Y = MouseRoute.mousey;
//                        JOptionPane.showMessageDialog(null, "队员领奖励坐标设定完成，请关闭提示", "哔哩哔哩-歪欧来豆", JOptionPane.PLAIN_MESSAGE);
//                        break;
//                    }
//                    case 5: {
//                        new MouseRoute();
//                        IdleClick5.Click5X = MouseRoute.mousex;
//                        IdleClick5.Click5Y = MouseRoute.mousey;
//                        JOptionPane.showMessageDialog(null, "切换队长窗口坐标设定完成，请关闭提示", "哔哩哔哩-歪欧来豆", JOptionPane.PLAIN_MESSAGE);
//                        break;
//                    }
//                    case 6: {
//                        new MouseRoute();
//                        IdleClick6.Click6X = MouseRoute.mousex;
//                        IdleClick6.Click6Y = MouseRoute.mousey;
//                        JOptionPane.showMessageDialog(null, "切换队长窗口坐标设定完成，请关闭提示", "哔哩哔哩-歪欧来豆", JOptionPane.PLAIN_MESSAGE);
//                        break;
//                    }
//                    case 7: {
//                        new MouseRoute();
//                        IdleClick7.Click7X = MouseRoute.mousex;
//                        IdleClick7.Click7Y = MouseRoute.mousey;
//                        JOptionPane.showMessageDialog(null, "切换队长窗口坐标设定完成，请关闭提示", "哔哩哔哩-歪欧来豆", JOptionPane.PLAIN_MESSAGE);
//                        break;
//                    }
//                    case 8: {
//                        new MouseRoute();
//                        IdleClick8.Click8X = MouseRoute.mousex;
//                        IdleClick8.Click8Y = MouseRoute.mousey;
//                        JOptionPane.showMessageDialog(null, "切换队长窗口坐标设定完成，请关闭提示", "哔哩哔哩-歪欧来豆", JOptionPane.PLAIN_MESSAGE);
//                        break;
//                    }
//                    case 9: {
//                        new MouseRoute();
//                        IdleClick9.Click9X = MouseRoute.mousex;
//                        IdleClick9.Click9Y = MouseRoute.mousey;
//                        JOptionPane.showMessageDialog(null, "切换队长窗口坐标设定完成，请关闭提示", "哔哩哔哩-歪欧来豆", JOptionPane.PLAIN_MESSAGE);
//                        break;
//                    }
//                    case 10: {
//                        new MouseRoute();
//                        IdleClick10.Click10X = MouseRoute.mousex;
//                        IdleClick10.Click10Y = MouseRoute.mousey;
//                        JOptionPane.showMessageDialog(null, "切换队长窗口坐标设定完成，请关闭提示", "哔哩哔哩-歪欧来豆", JOptionPane.PLAIN_MESSAGE);
//                        break;
//                    }
//
//                }
//            }
//        };
//        JIntellitype.getInstance().addHotKeyListener(hotkeyListener);
//    }
//
//}
