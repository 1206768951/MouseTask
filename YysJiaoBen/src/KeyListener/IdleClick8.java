package KeyListener;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Random;

public class IdleClick8 implements Runnable {
	private Dimension dim;
	private Random rand;
	private Robot robot;
	int x;
	int y;
	static int Click8X=-1;
	static int Click8Y=-1;

	public IdleClick8() {
		dim = Toolkit.getDefaultToolkit().getScreenSize();
		rand = new Random();
		try {
			robot = new Robot();
		} catch (AWTException ex) {
			ex.printStackTrace();
		}
	}

	int i = 0;

	public void run() {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		while (true) {
			try {
				// 辅号的结算轨迹
				x = Click8X+rand.nextInt(8);
				y = Click8Y+rand.nextInt(6);
//				robot.mouseMove(x, y);
//				robot.mousePress(InputEvent.BUTTON1_MASK);
//				robot.mouseRelease(InputEvent.BUTTON1_MASK);
//				Thread.sleep(500);
				robot.mouseMove(x, y);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
//				System.out.println("鼠标移动，点击箱子："+"("+x+"-"+y+")");
				Thread.sleep(GlobalKeyListener.sleep2);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

}
