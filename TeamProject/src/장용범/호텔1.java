package ����;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import Reference.Main;
import Reference.Ticket;

public class ȣ��1 extends ȣ��Total {

	// �޼ҵ�
	@Override
	public void ������(int hotelch, int roomch) {
		if (roomch == 1) {
			try {
				if (room[hotelch - 1][roomch - 1] == 0) {
					System.out.println("ȣ��1 / ����Ʈ�� ���� �Ϸ�");
					room[hotelch - 1][roomch - 1] = 1;
				} else {
					System.out.println("�̹� ����� �����Դϴ�");
				}
			} catch (Exception e) {}

		} else if (roomch == 2) {
			if (room[hotelch - 1][roomch - 1] == 0) {
				System.out.println("ȣ��1 / �𷰽��� ���� �Ϸ�");
				room[hotelch - 1][roomch - 1] = 1;
			} else {
				System.out.println("�̹� ����� �����Դϴ�");
			}
		} else if (roomch == 3) {
			if (room[hotelch - 1][roomch - 1] == 0) {
				System.out.println("ȣ��1 / ���Ĵٵ�� ���� �Ϸ�");
				room[hotelch - 1][roomch - 1] = 1;
			} else {
				System.out.println("�̹� ����� �����Դϴ�");
			}
		}
	}

	@Override
	public void �������(int hotelch, int roomch) {
		if (roomch == 1) {
			if (room[hotelch - 1][roomch - 1] == 1) {
				System.out.println("ȣ��1 / ����Ʈ�� ������� �Ϸ�");
				room[hotelch - 1][roomch - 1] = 0;
			} else {
				System.out.println("�ٽ� �Է¹ٶ��ϴ�");
			}
		} else if (roomch == 2) {
			if (room[hotelch - 1][roomch - 1] == 1) {
				System.out.println("ȣ��1 / �𷰽��� ������� �Ϸ�");
				room[hotelch - 1][roomch - 1] = 0;
			} else {
				System.out.println("�ٽ� �Է¹ٶ��ϴ�");
			}
		} else if (roomch == 3) {
			if (room[hotelch - 1][roomch - 1] == 1) {
				System.out.println("ȣ��1 / ���Ĵٵ�� ������� �Ϸ�");
				room[hotelch - 1][roomch - 1] = 0;
			} else {
				System.out.println("�ٽ� �Է¹ٶ��ϴ�");
			}
		}
	}

	@Override
	public void ���ο�����ȸ() {
		Member member = new Member();
		for (int i = 0; i < 3; i++) {
			if (room[0][i] != 0) {
				if (i == 0) {
					System.out.println("*** ȣ��1 / ����Ʈ�� ���� ***");
				} else if (i == 1) {
					System.out.println("*** ȣ��1 / �𷰽��� ���� ***");
				} else if (i == 2) {
					System.out.println("*** ȣ��1 / ���Ĵٵ�� ���� ***");
				}
				
			}
		}
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
		System.out.println("ȣ�� 1 ����ó���Ϸ�");
	}
}
