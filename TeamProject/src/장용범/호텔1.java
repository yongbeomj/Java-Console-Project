package ����;

import Reference.Main;
import Reference.Ticket;

public class ȣ��1 extends ȣ��Total {

	// �޼ҵ�
	@Override
	public void ������(int hotelch, int roomch) {
		if (roomch == 1) {
			if (room[hotelch-1][roomch-1] == 0) {
				System.out.println("ȣ��1 / ����Ʈ�� ���� �Ϸ�");
				room[hotelch-1][roomch-1] = 1;
			}
		} else if (roomch == 2) {
			if (room[hotelch-1][roomch-1] == 0) {
				System.out.println("ȣ��1 / �𷰽��� ���� �Ϸ�");
				room[hotelch-1][roomch-1] = 1;
			}
		} else if (roomch == 3) {
			if (room[hotelch-1][roomch-1] == 0) {
				System.out.println("ȣ��1 / ���Ĵٵ�� ���� �Ϸ�");
				room[hotelch-1][roomch-1] = 1;
			}
		}
	}
	@Override
	public void �������(int hotelch, int roomch) {
		if (roomch == 1) {
			if (room[hotelch-1][roomch-1] == 1) {
				System.out.println("ȣ��1 / ����Ʈ�� ������� �Ϸ�");
				room[hotelch-1][roomch-1] = 0;
			}
		} else if (roomch == 2) {
			if (room[hotelch-1][roomch-1] == 1) {
				System.out.println("ȣ��1 / �𷰽��� ������� �Ϸ�");
				room[hotelch-1][roomch-1] = 0;
			}
		} else if (roomch == 3) {
			if (room[hotelch-1][roomch-1] == 1) {
				System.out.println("ȣ��1 / ���Ĵٵ�� ������� �Ϸ�");
				room[hotelch-1][roomch-1] = 0;
			}
		}
	}
	@Override
	public void ���ο�����ȸ() {
		System.out.println("ȣ�� 1 ���ο�����ȸ");
	}
	@Override
	public void ��ü������Ȳ() {
		System.out.print("ȣ�� 1\t");
		for (int i = 0; i < 3; i++) {
			if (room[0][i] == 0)
				System.out.print("��\t");
			if (room[0][i] == 1)
				System.out.print("��\t");
		}
		System.out.println();
	}
	@Override
	public void ����ó��() {
		System.out.println("ȣ�� 1 ����ó��");
	}
	
	
}
