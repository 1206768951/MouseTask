package KeyListener;

import com.melloware.jintellitype.HotkeyListener;
import com.melloware.jintellitype.JIntellitype;

import javax.swing.*;
import java.awt.*;

public class XlsConfigMouse extends GlobalKeyListener {
    private Robot robot;
    private HotkeyListener hotkeyListener;

    public XlsConfigMouse() {
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
        JIntellitype.getInstance().registerHotKey(1, JIntellitype.MOD_CONTROL, 'Q');
        JIntellitype.getInstance().registerHotKey(2, JIntellitype.MOD_CONTROL, 'E');
    }

    public void clearKey() {
        JIntellitype.getInstance().unregisterHotKey(1);
        JIntellitype.getInstance().unregisterHotKey(2);
    }

    public void clearKeyEvent() {
        JIntellitype.getInstance().removeHotKeyListener(hotkeyListener);
    }

    public void addKeyEvent() {
        hotkeyListener = new HotkeyListener() {
            @SuppressWarnings("static-access")
            public void onHotKey(int code) {
                WaitController queding = new WaitController();
                IdleClick1 click1 = new IdleClick1();
                IdleClick2 click2 = new IdleClick2();
                IdleClick3 click3 = new IdleClick3();
                IdleClick4 click4 = new IdleClick4();
                IdleClick5 click5 = new IdleClick5();

                IdleClick6 click6 = new IdleClick6();
                IdleClick7 click7 = new IdleClick7();
                IdleClick8 click8 = new IdleClick8();
                IdleClick9 click9 = new IdleClick9();
                IdleClick10 click10 = new IdleClick10();

                Thread mcThread1 = new Thread(queding);
                Thread mcThread2 = new Thread(click1);
                Thread mcThread3 = new Thread(click2);
                Thread mcThread4 = new Thread(click3);
                Thread mcThread5 = new Thread(click4);
                Thread mcThread6 = new Thread(click5);
                Thread mcThread7 = new Thread(click6);
                Thread mcThread8 = new Thread(click7);
                Thread mcThread9 = new Thread(click8);
                Thread mcThread10 = new Thread(click9);
                Thread mcThread11 = new Thread(click10);

                switch (code) {
                    case 1: {
                        int[] x = GlobalKeyListener.x;
                        int[] y = GlobalKeyListener.y;
                        int[] t = GlobalKeyListener.t;
                        int f = GlobalKeyListener.f;
                        GlobalKeyListener.sleep2 = f;
                        //0未启动，1中断信号，2已启动
                        if (state.equals("0")) {
                            state = "2";
                            addKey();
                            //点中间确定
                            JOptionPane.showMessageDialog(null, "xls配置启动成功,点击确定开始", "梅之寒-薇尔莉特伊芙伽登", JOptionPane.PLAIN_MESSAGE);
                            try {
                                mcThread1.sleep(t[0]);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            IdleClick1.Click1X = x[0];
                            IdleClick1.Click1Y = y[0];
                            mcThread2.start();
                            if (x.length > 1) {
                                IdleClick2.Click2X = x[1];
                                IdleClick2.Click2Y = y[1];
                                try {
                                    mcThread3.sleep(t[1]);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                mcThread3.start();
                            }
                            if (x.length > 2) {
                                IdleClick3.Click3X = x[2];
                                IdleClick3.Click3Y = y[2];
                                try {
                                    mcThread4.sleep(t[2]);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                mcThread4.start();
                            }
                            if (x.length > 3) {
                                IdleClick4.Click4X = x[3];
                                IdleClick4.Click4Y = y[3];
                                try {
                                    mcThread5.sleep(t[3]);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                mcThread5.start();
                            }
                            if (x.length > 4) {
                                IdleClick5.Click5X = x[4];
                                IdleClick5.Click5Y = y[4];
                                try {
                                    mcThread6.sleep(t[4]);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                mcThread6.start();
                            }
                            if (x.length > 5) {
                                IdleClick6.Click6X = x[5];
                                IdleClick6.Click6Y = y[5];
                                try {
                                    mcThread7.sleep(t[5]);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                mcThread7.start();
                            }
                            //第二个领取完毕，开始跳转到第一个，中间用时第一个1.5秒第二个2秒
                            if (x.length > 6) {
                                IdleClick7.Click7X = x[6];
                                IdleClick7.Click7Y = y[6];
                                try {
                                    mcThread8.sleep(t[6]);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                mcThread8.start();
                            }
                            if (x.length > 7) {
                                IdleClick8.Click8X = x[7];
                                IdleClick8.Click8Y = y[7];
                                try {
                                    mcThread9.sleep(t[7]);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                mcThread9.start();
                            }
                            if (x.length > 8) {
                                IdleClick9.Click9X = x[8];
                                IdleClick9.Click9Y = y[8];
                                try {
                                    mcThread10.sleep(t[8]);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                mcThread10.start();
                            }
                            if (x.length > 9) {
                                IdleClick10.Click10X = x[9];
                                IdleClick10.Click10Y = y[9];
                                try {
                                    mcThread10.sleep(t[9]);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                                mcThread11.start();
                            }
                        }
                        break;
                    }
                    case 2: {
                        GlobalKeyListener.state = "1";
                        JOptionPane.showMessageDialog(null, "程序关闭", "哔哩哔哩-歪欧来豆", JOptionPane.PLAIN_MESSAGE);
                        break;
                    }
                }
            }
        };
        JIntellitype.getInstance().addHotKeyListener(hotkeyListener);
    }

}
