package KeyListener;


import java.awt.*;
import java.awt.event.MouseEvent;


import java.awt.event.MouseMotionListener;
import java.awt.geom.Rectangle2D;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class MouseRoute {
    static int mousex = -1;
    static int mousey = -1;

    public MouseRoute() {
        PointerInfo pinfo = MouseInfo.getPointerInfo();
        Point p = pinfo.getLocation();
        mousex = (int) p.getX();
        mousey = (int) p.getY();
    }
}

//class MouseFrame1 extends Container {
//
//    @Override
//    public Component add(Component comp) {
//        addImpl(comp, null, -1);
//        return comp;
//    }
//}


//class MouseFrame extends JFrame {
//    public MouseFrame() {
//        add(new MouseComponent());
//        pack();
//    }
//}

//class MouseComponent extends JComponent {
//    static int mousex;
//    static int mousey;
//    private static final int DEFAULT_WIDTH = (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth();
//    private static final int DEFAULT_HEIGHT = (int)Toolkit.getDefaultToolkit().getScreenSize().getHeight();
//    private static final int SIDELENGTH = 0;
//    private Rectangle2D current;
//
//    public MouseComponent() {
//        addMouseMotionListener(new MouseMotionHandler());
//    }
//
//
//    private class MouseMotionHandler  implements MouseMotionListener {
//        public void mouseMoved(MouseEvent event) {    //榧犳爣绉诲姩鏃惰皟鐢�
//            mousex = event.getX();
//            mousey = event.getY();
//            System.out.println();
//            System.out.println("榧犳爣绉诲姩鏃剁殑鍧愭爣" + mousex + "---" + mousey);
//        }
//
//        public void mouseDragged(MouseEvent event) {  //榧犳爣鎸変綇鎷栧姩鏃惰皟鐢�
//            mousex = event.getX();
//            mousey = event.getY();
//            System.out.println("榧犳爣鎷栧姩鏃剁殑鍧愭爣" + mousex + "---" + mousey);
//        }
//    }
//
//
//}
