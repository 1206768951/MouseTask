package KeyListener;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class IdleClick6 implements Runnable {
	private Dimension dim;
	private Random rand;
	private Robot robot;
	int x;
	int y;
	static int Click6X=-1;
	static int Click6Y=-1;

	public IdleClick6() {
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
				x = Click6X+rand.nextInt(8);
				y = Click6Y+rand.nextInt(6);
//				robot.mouseMove(x, y);
//				robot.mousePress(InputEvent.BUTTON1_MASK);
//				robot.mouseRelease(InputEvent.BUTTON1_MASK);
//				Thread.sleep(500);
				robot.mouseMove(x, y);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
//				System.out.println("鼠标移动，弹出箱子："+"("+x+"-"+y+")");
				Thread.sleep(GlobalKeyListener.sleep2);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

}
