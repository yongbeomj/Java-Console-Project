package �ſ���;

import java.util.ArrayList;

import Reference.Main;
import Reference.Ticket;

public class ȣ��Total implements ȣ�ڿ��� {

	// �ʵ�
	public static String[][] room = new String[3][3]; 
	

	// ������
	
	// �޼ҵ�
	@Override
	public void ������(int hotelch, int roomch , String h_id) {
		
		if (room[hotelch-1][roomch-1] == null) {
			System.out.println("*** ȣ�� / ** �� ���� �Ϸ� ***");
			 room[hotelch-1][roomch-1] = h_id;
			 
			
		}
		
	}
	@Override
	public void �������(int hotelch, int roomch, String h_id) {
		if (room[hotelch-1][roomch-1] == null) {
			System.out.println("*** ȣ�� / ** �� ������� �Ϸ� ***");
			room[hotelch-1][roomch-1] = h_id;
		}
		System.out.println("*** ���� ��� �Ϸ� ***");
	}
	@Override
	public void ���ο�����ȸ(String h_id) {
		System.out.println("*** ���ο�����ȸ ***");
		Member member = new Member();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (room[i][j] != null) {
					System.out.println("*** ȣ�� / ** �� ���� ***"+room[0][i]);
				}
			}
		}
		
	}
	
	@Override
	public void ��ü������Ȳ() {
		System.out.print("ȣ�� **\t");
		for (int i = 0; i < 3; i++) {
			if (room[0][i] == null) {
				System.out.print("��\t");
			} else {
				System.out.print(room[0][i]);
			}
				
		}
	}
	
	
	@Override
	public void ����ó��() {
		System.out.println("*** ����ó�� ***");
	}
	
	
}
