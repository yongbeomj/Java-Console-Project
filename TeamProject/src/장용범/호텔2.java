package �ſ���;

public class ȣ��2 extends ȣ��Total {
	public int[][] ����ȸ������Ʈ = new int[3][3]; 
	
	// �޼ҵ�
	@Override
	public void ������(int hotelch, int roomch,String h_id) {
		if (roomch == 1) {
			if (room[hotelch-1][roomch-1] == null) {
				System.out.println("ȣ��2 / ����Ʈ�� ���� �Ϸ�");
				room[hotelch-1][roomch-1] = h_id;
			}
			else {
				System.out.println("�̹� ����� �����Դϴ�");
			}
		} else if (roomch == 2) {
			if (room[hotelch-1][roomch-1] == null) {
				System.out.println("ȣ��2 / �𷰽��� ���� �Ϸ�");
				room[hotelch-1][roomch-1] = h_id;
			}
			else {
				System.out.println("�̹� ����� �����Դϴ�");
			}
		} else if (roomch == 3) {
			if (room[hotelch-1][roomch-1] == null) {
				System.out.println("ȣ��2 / ���Ĵٵ�� ���� �Ϸ�");
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
				System.out.println("ȣ��2 / ����Ʈ�� ������� �Ϸ�");
				room[hotelch-1][roomch-1] = null;
			} else {
				System.out.println("�ٽ� �Է¹ٶ��ϴ�");
			}
		} else if (roomch == 2) {
			if (room[hotelch-1][roomch-1] == h_id) {
				System.out.println("ȣ��2 / �𷰽��� ������� �Ϸ�");
				room[hotelch-1][roomch-1] = null;
			} else {
				System.out.println("�ٽ� �Է¹ٶ��ϴ�");
			}
		} else if (roomch == 3) {
			if (room[hotelch-1][roomch-1] == h_id) {
				System.out.println("ȣ��2 / ���Ĵٵ�� ������� �Ϸ�");
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
			if (room[1][i] != null) {
				if (i == 0) {
					System.out.println("*** ȣ��2 / ����Ʈ�� ���� ***"+h_id);
				} else if (i == 1) {
					System.out.println("*** ȣ��2 / �𷰽��� ���� ***"+h_id);
				} else if (i == 2) {
					System.out.println("*** ȣ��2 / ���Ĵٵ�� ���� ***"+h_id);
				}
				
			}
		}
	
	}
	@Override
	public void ��ü������Ȳ() {
		System.out.print("ȣ�� 2\t");
		for (int i = 0; i < 3; i++) {
			if (room[1][i] == null) {
				System.out.print("��\t");
			} else {
				System.out.print(room[1][i]+"\t");
			}
				
		}
		System.out.println();
	}
	@Override
	public void ����ó��() {
		System.out.println("ȣ�� 3 ����ó��");
	}
	
	
}
