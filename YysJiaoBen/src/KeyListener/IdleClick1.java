package KeyListener;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Random;

public class IdleClick1 implements Runnable {
	private Dimension dim;
	private Random rand;
	private Robot robot;
	int x;
	int y;
	static int Click1X;
	static int Click1Y;

	public IdleClick1() {
		dim = Toolkit.getDefaultToolkit().getScreenSize();
		rand = new Random();
		try {
			robot = new Robot();
		} catch (AWTException ex) {
			ex.printStackTrace();
		}
	}


	public void run() {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		while (true) {
			try {
				// 主号的结算轨迹
				x = Click1X+rand.nextInt(8);
				y = Click1Y+rand.nextInt(4);
				robot.mouseMove(x, y);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
//				System.out.println("鼠标移动，弹出箱子："+"("+x+"-"+y+")"+sdf.format(new Date().getTime()));
				Thread.sleep(GlobalKeyListener.sleep2);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

}
