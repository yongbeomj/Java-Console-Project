package 신우현;

public class FileThread extends Thread {

	@Override
	public void run() {
		while (true) {

			File.fileload(2);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.err.println("처리중");
			}
			File.filesave(2);

		}
	}

}
