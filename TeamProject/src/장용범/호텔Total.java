package ����;

import java.util.ArrayList;

import Reference.Main;
import Reference.Ticket;

public class ȣ��Total implements ȣ�ڿ��� {

	// �ʵ�
	public static int[][] room = new int[3][3]; 
	
	// ������
	
	// �޼ҵ�
	@Override
	public void ������(int hotelch, int roomch) {
		
		if (room[hotelch-1][roomch-1] == 0) {
			System.out.println("*** ȣ�� / ** �� ���� �Ϸ� ***");
			room[hotelch-1][roomch-1] = 1;
		}
		
	}
	@Override
	public void �������(int hotelch, int roomch) {
		if (room[hotelch-1][roomch-1] == 1) {
			System.out.println("*** ȣ�� / ** �� ������� �Ϸ� ***");
			room[hotelch-1][roomch-1] = 0;
		}
		System.out.println("*** ���� ��� �Ϸ� ***");
	}
	@Override
	public void ���ο�����ȸ() {
		System.out.println("*** ���ο�����ȸ ***");
	}
	@Override
	public void ��ü������Ȳ() {
		System.out.print("ȣ�� **\t");
		for (int i = 0; i < 3; i++) {
			if (room[0][i] == 0)
				System.out.print("��\t");
			if (room[0][i] == 1)
				System.out.print("��\t");
		}
	}
	@Override
	public void ����ó��() {
		System.out.println("*** ����ó�� ***");
	}
	
	
}
