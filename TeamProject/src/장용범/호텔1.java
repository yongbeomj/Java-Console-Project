package ����;

import Reference.Main;
import Reference.Ticket;

public class ȣ��1 extends ȣ��Total {
	
	public int[][] ����ȸ������Ʈ = new int[3][3]; 
	
	// �޼ҵ�
	@Override
	public void ������(int hotelch, int roomch,String h_id) {
		if (roomch == 1) {
			if (room[hotelch-1][roomch-1] == null) {
				System.out.println("[[���� �Ϸ�]] : ȣ��1 / ����Ʈ��");
				room[hotelch-1][roomch-1] = h_id;
			}
			else {
				System.out.println("�̹� ����� �����Դϴ�");
			}
		} else if (roomch == 2) {
			if (room[hotelch-1][roomch-1] == null) {
				System.out.println("[[���� �Ϸ�]] : ȣ��1 / �𷰽���");
				room[hotelch-1][roomch-1] = h_id;
			}
			else {
				System.out.println("�̹� ����� �����Դϴ�");
			}
		} else if (roomch == 3) {
			if (room[hotelch-1][roomch-1] == null) {
				System.out.println("[[���� �Ϸ�]] : ȣ��1 / ���Ĵٵ��");
				room[hotelch-1][roomch-1] = h_id;
			}
			else {
				System.out.println("�̹� ����� �����Դϴ�");
			}
		}
	}
	@Override
	public void �������(int hotelch, int roomch,String h_id) {
		if (roomch == 1) {
			if (room[hotelch-1][roomch-1] == h_id) {
				System.out.println("[[���� ���]] : ȣ��1 / ����Ʈ��");
				room[hotelch-1][roomch-1] = null;
			} else {
				System.out.println("�ٽ� �Է¹ٶ��ϴ�");
			}
		} else if (roomch == 2) {
			if (room[hotelch-1][roomch-1] == h_id) {
				System.out.println("[[���� ���]] : ȣ��1 / �𷰽���");
				room[hotelch-1][roomch-1] = null;
			} else {
				System.out.println("�ٽ� �Է¹ٶ��ϴ�");
			}
		} else if (roomch == 3) {
			if (room[hotelch-1][roomch-1] == h_id) {
				System.out.println("[[���� ���]] : ȣ��1 / ���Ĵٵ��");
				room[hotelch-1][roomch-1] = null;
			} else {
				System.out.println("�ٽ� �Է¹ٶ��ϴ�");
			}
		}
	}
	@Override
	public void ���ο�����ȸ(String h_id) {
		Member member = new Member();
		for (int i = 0; i < 3; i++) {
			if (room[0][i] != null && room[0][i].equals(h_id)) {
				if (i == 0) {
					System.out.println("*** ȣ��1 / ����Ʈ�� ���� ***"+room[0][i]);
				} else if (i == 1) {
					System.out.println("*** ȣ��1 / �𷰽��� ���� ***"+room[0][i]);
				} else if (i == 2) {
					System.out.println("*** ȣ��1 / ���Ĵٵ�� ���� ***"+room[0][i]);
				}
				
			}
		}
	
	}
	@Override
	public void ��ü������Ȳ_ȸ��() {
		System.out.print("ȣ�� 1\t");
		for (int i = 0; i < 3; i++) {
			if (room[0][i] == null) {
				System.out.print("��\t");
			} else {
				System.out.print("��\t");
			}
		}
		System.out.println();
	}
	@Override
	public void ��ü������Ȳ_������() {
		System.out.print("ȣ�� 1\t");
		for (int i = 0; i < 3; i++) {
			if (room[0][i] == null ) {
				System.out.print("��\t");
			} else {
				System.out.print(room[0][i]+"\t");
			}
				
		}
		System.out.println();
	}
	@Override
	public void ����ó��() {
		System.out.println("ȣ�� 1 ����ó��");
	}
	
	
}
