package KeyListener;

import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Random;

public class IdleClick7 implements Runnable {
	private Dimension dim;
	private Random rand;
	private Robot robot;
	int x;
	int y;
	static int Click7X=-1;
	static int Click7Y=-1;

	public IdleClick7() {
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
				// 切换辅号的轨迹
				x = Click7X +rand.nextInt(8);
				y = Click7Y+rand.nextInt(6);
				robot.mouseMove(x, y);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
//				System.out.println("鼠标移动，点击箱子："+"("+x+"-"+y+")"+sdf.format(new Date().getTime()));
				Thread.sleep(GlobalKeyListener.sleep2);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

}
