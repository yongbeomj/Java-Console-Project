package �ſ���;

public class ȣ��3 extends ȣ��Total {
	public int[][] ����ȸ������Ʈ = new int[3][3]; 
	
	// �޼ҵ�
	@Override
	public void ������(int hotelch, int roomch,String h_id) {
		if (roomch == 1) {
			if (room[hotelch-1][roomch-1] == null) {
				System.out.println("ȣ��3 / ����Ʈ�� ���� �Ϸ�");
				room[hotelch-1][roomch-1] = h_id;
			}
			else {
			System.out.println("�̹� ����� �����Դϴ�");
			}
		} else if (roomch == 2) {
			if (room[hotelch-1][roomch-1] == null) {
				System.out.println("ȣ��3 / �𷰽��� ���� �Ϸ�");
				room[hotelch-1][roomch-1] = h_id;
			}
			else {
			System.out.println("�̹� ����� �����Դϴ�");
			}
		} else if (roomch == 3) {
			if (room[hotelch-1][roomch-1] == null) {
				System.out.println("ȣ��3 / ���Ĵٵ�� ���� �Ϸ�");
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
				System.out.println("ȣ��3 / ����Ʈ�� ������� �Ϸ�");
				room[hotelch-1][roomch-1] = null;
			} else {
				System.out.println("�ٽ� �Է¹ٶ��ϴ�");
			}
		} else if (roomch == 2) {
			if (room[hotelch-1][roomch-1] == h_id) {
				System.out.println("ȣ��3 / �𷰽��� ������� �Ϸ�");
				room[hotelch-1][roomch-1] = null;
			} else {
				System.out.println("�ٽ� �Է¹ٶ��ϴ�");
			}
		} else if (roomch == 3) {
			if (room[hotelch-1][roomch-1] == h_id) {
				System.out.println("ȣ��3 / ���Ĵٵ�� ������� �Ϸ�");
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
			if (room[2][i] != null) {
				if (i == 0) {
					System.out.println("*** ȣ��3 / ����Ʈ�� ���� ***   "+room[2][i]);
				} else if (i == 1) {
					System.out.println("*** ȣ��3 / �𷰽��� ���� ***   "+room[2][i]);
				} else if (i == 2) {
					System.out.println("*** ȣ��3 / ���Ĵٵ�� ���� ***   "+room[2][i]);
				}
				
			}
		}
	
	}
	@Override
	public void ��ü������Ȳ() {
		System.out.print("ȣ�� 3\t");
		for (int i = 0; i < 3; i++) {
			if (room[2][i] == null) {
				System.out.print("��\t");
			} else {
				System.out.print(room[2][i]+"\t");
			}
				
		}
		System.out.println();
	}
	@Override
	public void ����ó��() {
		System.out.println("ȣ�� 3 ����ó��");
	}
	
	
}