package �ſ���;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("--------------------------------");
			System.out.print("1.����Ʈ 2.�𷰽� 3.���Ĵٵ�  >> ���� : "); int roomno = scanner.nextInt();
			System.out.println("--------------------------------");
			if (roomno == 1) {
				ȣ�ڿ���.����Ʈ();
			} else if (roomno == 2) {
				ȣ�ڿ���.�𷰽�();
			} else if (roomno == 3) {
				ȣ�ڿ���.���Ĵٵ�();
			}
		}
		
		
	}
}
