package ����;

public class ȣ��2 extends ȣ��Total {

	@Override
	public void ������(int hotelch, int roomch) {
		if (roomch == 1) {
			if (room[hotelch-1][roomch-1] == 0) {
				System.out.println("ȣ��2 / ����Ʈ�� ���� �Ϸ�");
				room[hotelch-1][roomch-1] = 1;
			}
		} else if (roomch == 2) {
			if (room[hotelch-1][roomch-1] == 0) {
				System.out.println("ȣ��2 / �𷰽��� ���� �Ϸ�");
				room[hotelch-1][roomch-1] = 1;
			}
		} else if (roomch == 3) {
			if (room[hotelch-1][roomch-1] == 0) {
				System.out.println("ȣ��2 / ���Ĵٵ�� ���� �Ϸ�");
				room[hotelch-1][roomch-1] = 1;
			}
		}
	}
	@Override
	public void �������(int hotelch, int roomch) {
		if (roomch == 1) {
			if (room[hotelch-1][roomch-1] == 1) {
				System.out.println("ȣ��2 / ����Ʈ�� ������� �Ϸ�");
				room[hotelch-1][roomch-1] = 0;
			}
		} else if (roomch == 2) {
			if (room[hotelch-1][roomch-1] == 1) {
				System.out.println("ȣ��2 / �𷰽��� ������� �Ϸ�");
				room[hotelch-1][roomch-1] = 0;
			}
		} else if (roomch == 3) {
			if (room[hotelch-1][roomch-1] == 1) {
				System.out.println("ȣ��2 / ���Ĵٵ�� ������� �Ϸ�");
				room[hotelch-1][roomch-1] = 0;
			}
		}
	}
	@Override
	public void ���ο�����ȸ() {
		System.out.println("ȣ�� 2 ���ο�����ȸ");
	}
	@Override
	public void ��ü������Ȳ() {
		System.out.print("ȣ�� 2\t");
		for (int i = 0; i < 3; i++) {
			if (room[1][i] == 0)
				System.out.print("��\t");
			if (room[1][i] == 1)
				System.out.print("��\t");
		}
		System.out.println();
	}
	@Override
	public void ����ó��() {
		System.out.println("ȣ�� 2 ����ó��");
	}
	
}
