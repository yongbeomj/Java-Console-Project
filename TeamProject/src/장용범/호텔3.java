package ����;

public class ȣ��3 extends ȣ��Total {

	@Override
	public void ������(int hotelch, int roomch) {
		if (roomch == 1) {
			if (room[hotelch-1][roomch-1] == 0) {
				System.out.println("ȣ��3 / ����Ʈ�� ���� �Ϸ�");
				room[hotelch-1][roomch-1] = 1;
			} else {
				System.out.println("�̹� ����� �����Դϴ�");
			}
		} else if (roomch == 2) {
			if (room[hotelch-1][roomch-1] == 0) {
				System.out.println("ȣ��3 / �𷰽��� ���� �Ϸ�");
				room[hotelch-1][roomch-1] = 1;
			} else {
				System.out.println("�̹� ����� �����Դϴ�");
			}
		} else if (roomch == 3) {
			if (room[hotelch-1][roomch-1] == 0) {
				System.out.println("ȣ��3 / ���Ĵٵ�� ���� �Ϸ�");
				room[hotelch-1][roomch-1] = 1;
			} else {
				System.out.println("�̹� ����� �����Դϴ�");
			}
		}
	}
	@Override
	public void �������(int hotelch, int roomch) {
		if (roomch == 1) {
			if (room[hotelch-1][roomch-1] == 1) {
				System.out.println("ȣ��3 / ����Ʈ�� ������� �Ϸ�");
				room[hotelch-1][roomch-1] = 0;
			} else {
				System.out.println("�ٽ� �Է¹ٶ��ϴ�");
			}
		} else if (roomch == 2) {
			if (room[hotelch-1][roomch-1] == 1) {
				System.out.println("ȣ��3 / �𷰽��� ������� �Ϸ�");
				room[hotelch-1][roomch-1] = 0;
			} else {
				System.out.println("�ٽ� �Է¹ٶ��ϴ�");
			}
		} else if (roomch == 3) {
			if (room[hotelch-1][roomch-1] == 1) {
				System.out.println("ȣ��3 / ���Ĵٵ�� ������� �Ϸ�");
				room[hotelch-1][roomch-1] = 0;
			} else {
				System.out.println("�ٽ� �Է¹ٶ��ϴ�");
			}
		}
	}
	@Override
	public void ���ο�����ȸ() {
		Member member = new Member();
		for (int i = 0; i < 3; i++) {
			if (room[2][i] != 0) {
				if (i == 0) {
					System.out.println("*** ȣ��3 / ����Ʈ�� ���� ***");
				} else if (i == 1) {
					System.out.println("*** ȣ��3 / �𷰽��� ���� ***");
				} else if (i == 2) {
					System.out.println("*** ȣ��3 / ���Ĵٵ�� ���� ***");
				}
				
			}
		}
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
