package ����;

public class ȣ��3 extends ȣ��Total {

	@Override
	public void ������(int hotelch, int roomch) {
		if (roomch == 1) {
			if (room[hotelch-1][roomch-1] == 0) {
				System.out.println("ȣ��3 / ����Ʈ�� ���� �Ϸ�");
				room[hotelch-1][roomch-1] = 1;
			}
		} else if (roomch == 2) {
			if (room[hotelch-1][roomch-1] == 0) {
				System.out.println("ȣ��3 / �𷰽��� ���� �Ϸ�");
				room[hotelch-1][roomch-1] = 1;
			}
		} else if (roomch == 3) {
			if (room[hotelch-1][roomch-1] == 0) {
				System.out.println("ȣ��3 / ���Ĵٵ�� ���� �Ϸ�");
				room[hotelch-1][roomch-1] = 1;
			}
		}
	}
	@Override
	public void �������(int hotelch, int roomch) {
		if (roomch == 1) {
			if (room[hotelch-1][roomch-1] == 1) {
				System.out.println("ȣ��3 / ����Ʈ�� ������� �Ϸ�");
				room[hotelch-1][roomch-1] = 0;
			}
		} else if (roomch == 2) {
			if (room[hotelch-1][roomch-1] == 1) {
				System.out.println("ȣ��3 / �𷰽��� ������� �Ϸ�");
				room[hotelch-1][roomch-1] = 0;
			}
		} else if (roomch == 3) {
			if (room[hotelch-1][roomch-1] == 1) {
				System.out.println("ȣ��3 / ���Ĵٵ�� ������� �Ϸ�");
				room[hotelch-1][roomch-1] = 0;
			}
		}
	}
	@Override
	public void ���ο�����ȸ() {
		System.out.println("ȣ�� 3 ���ο�����ȸ");
	}
	@Override
	public void ��ü������Ȳ() {
		System.out.print("ȣ�� 3\t");
		for (int i = 0; i < 3; i++) {
			if (room[2][i] == 0)
				System.out.print("��\t");
			if (room[2][i] == 1)
				System.out.print("��\t");
		}
		System.out.println();
	}
	@Override
	public void ����ó��() {
		System.out.println("ȣ�� 3 ����ó��");
	}
	
}
