package ����ȣ;

public class FileThread extends Thread {
	
	
	@Override
	public void run() {
		while(true ) {
		
			File.fileload(2);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				System.err.println("ó����");
			}
			File.filesave(2);
			
		}
	}
	
	

}
