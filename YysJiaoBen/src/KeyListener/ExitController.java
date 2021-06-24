package KeyListener;


public class ExitController implements Runnable {

	public void run() {
		while (true) {
			try {
				Thread.sleep(2000);
				if (GlobalKeyListener.state.equals("1")){
					Thread.sleep(2000);
					System.exit(-1);
					Thread.interrupted();
//					System.exit(-1);
				}else {
				}
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}


}
