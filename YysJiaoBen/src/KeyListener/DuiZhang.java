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
//import java.util.Map;
//
//public class DuiZhang extends GlobalKeyListener {
//    private Robot robot;
//    private HotkeyListener hotkeyListener;
//
//    public DuiZhang() {
//        try {
//            robot = new Robot();
//        } catch (AWTException e) {
//            e.printStackTrace();
//        }
//        this.addKey();
//        this.addKeyEvent();
//    }
//
//    public void addKey() {
//        JIntellitype.getInstance().registerHotKey(1, JIntellitype.MOD_CONTROL, 'Q');
//        JIntellitype.getInstance().registerHotKey(2, JIntellitype.MOD_CONTROL, 'E');
//        if (need == 3) {
//            JIntellitype.getInstance().registerHotKey(3, JIntellitype.MOD_CONTROL, '1');
//            JIntellitype.getInstance().registerHotKey(4, JIntellitype.MOD_CONTROL, '2');
//        }
//    }
//
//    public void clearKey() {
//        JIntellitype.getInstance().unregisterHotKey(1);
//        JIntellitype.getInstance().unregisterHotKey(2);
//        JIntellitype.getInstance().unregisterHotKey(3);
//        JIntellitype.getInstance().unregisterHotKey(4);
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
//                StartRoute kaishi = new StartRoute();
//                AccountFor1 jieshu = new AccountFor1();
//                AccountFor1 jiesuan = new AccountFor1();
//                AccountFor1 jiesuan2 = new AccountFor1();
//                Thread mcThread1 = new Thread(queding);
//                Thread mcThread2 = new Thread(kaishi);
//                Thread mcThread3 = new Thread(jieshu);
//                Thread mcThread4 = new Thread(jiesuan);
//                Thread mcThread5 = new Thread(jiesuan2);
//                switch (code) {
//                    case 1: {
//                        WriteConfigFile wf = new WriteConfigFile();
//                        List<HashMap<String, String>> list = new ArrayList<>();
//                        HashMap<String,String> map = new HashMap<String,String>();
//                        map.put("x",StartRoute.startX+"");
//                        map.put("y",StartRoute.startY+"");
//                        map.put("timeInterval","1");
//                        map.put("timeFor",sleep2+"");
//                        list.add(0,map);
//                        map.clear();
//                        map.put("x",AccountFor1.Acc1X+"");
//                        map.put("y",AccountFor1.Acc1Y+"");
//                        map.put("timeInterval",sleep+"");
//                        map.put("timeFor",sleep2+"");
//                        list.add(1,map);
//                        wf.WriteFile(list);
//                        if (need == 3) {
//                            if (StartRoute.startX == -1 || StartRoute.startY == -1) {
//                                JOptionPane.showMessageDialog(null, "请配置一个合适的开始战斗的循环点击轨迹" + "\n" + "快捷键Ctrl+1", "哔哩哔哩-歪欧来豆", JOptionPane.PLAIN_MESSAGE);
//                                 return;
//                            }
//                            if (AccountFor1.Acc1X == -1 || AccountFor1.Acc1Y == -1) {
//                                JOptionPane.showMessageDialog(null, "请配置一个合适的领御魂的循环点击轨迹" + "\n" + "快捷键Ctrl+2", "哔哩哔哩-歪欧来豆", JOptionPane.PLAIN_MESSAGE);
//                                return;
//                            }
//                        }else {
//                            state = "1";
//                            JOptionPane.showMessageDialog(null, "配置鼠标出现了其他错误", "哔哩哔哩-歪欧来豆", JOptionPane.PLAIN_MESSAGE);
//                        }
//                        //0未启动，1中断信号，2已启动
//                        if (state.equals("0")) {
//                            state = "2";
//                            addKey();
//                            //点中间确定
//                            JOptionPane.showMessageDialog(null, "队长启动成功,点击确定开始", "梅之寒-薇尔莉特伊芙伽登", JOptionPane.PLAIN_MESSAGE);
//                            try {
//                                mcThread1.sleep(1000);
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
//                            mcThread1.interrupt();
//                            mcThread2.start();
//                            try {
//                                mcThread3.sleep(sleep);
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
//                            mcThread3.start();
//                            try {
//                                mcThread4.sleep(1000);
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
//                            mcThread4.start();
//                            try {
//                                mcThread5.sleep(2000);
//                            } catch (InterruptedException e) {
//                                e.printStackTrace();
//                            }
//                            mcThread5.start();
//                        }
//                        break;
//                    }
//                    case 2: {
//                        GlobalKeyListener.state="1";
//                        JOptionPane.showMessageDialog(null, "程序关闭", "哔哩哔哩-歪欧来豆", JOptionPane.PLAIN_MESSAGE);
//                        break;
//                    }
//                    case 3: {
//                        new MouseRoute();
//                        StartRoute.startX = MouseRoute.mousex;
//                        StartRoute.startY = MouseRoute.mousey;
//                        JOptionPane.showMessageDialog(null, "开始坐标设定完成，请关闭提示", "哔哩哔哩-歪欧来豆", JOptionPane.PLAIN_MESSAGE);
//                        break;
//                    }
//                    case 4: {
//                        new MouseRoute();
//                        AccountFor1.Acc1X = MouseRoute.mousex;
//                        AccountFor1.Acc1Y = MouseRoute.mousey;
//                        JOptionPane.showMessageDialog(null, "领奖励坐标设定完成，请关闭提示", "哔哩哔哩-歪欧来豆", JOptionPane.PLAIN_MESSAGE);
//                        break;
//                    }
//                }
//            }
//        };
//        JIntellitype.getInstance().addHotKeyListener(hotkeyListener);
//    }
//
//
//}
