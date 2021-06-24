package KeyListener;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class IdleClick10 implements Runnable {
	private Dimension dim;
	private Random rand;
	private Robot robot;
	int x;
	int y;
	static int Click10X=-1;
	static int Click10Y=-1;
	public IdleClick10() {
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
				// 点击开始战斗的轨迹
				x = Click10X +rand.nextInt(8);
				y = Click10Y+rand.nextInt(6);
				robot.mouseMove(x, y);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
//				System.out.println("鼠标移动,点击战斗："+"("+x+"-"+y+")");
				Thread.sleep(GlobalKeyListener.sleep2);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}
