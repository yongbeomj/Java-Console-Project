package 脚快泅;

public class FileThread extends Thread {

	@Override
	public void run() {
		while (true) {

			File.fileload(2);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.err.println("贸府吝");
			}
			
			File.filesave(2);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.err.println("贸府吝");
			}
		}
	}

}
