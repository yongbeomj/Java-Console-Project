package Final_1027;

import java.util.ArrayList;

import Reference.Main;
import Reference.Ticket;

public class ȣ��1 extends ȣ��Total {


	// �޼ҵ�
	@Override
	public void ������(int hotelch, int roomch, String h_id) {
		if (roomch == 1) {
			if (room[hotelch - 1][roomch - 1] == null) {
				System.err.println(" [[���� �Ϸ�]] : �Ŷ�ȣ�� / ����Ʈ�� ");
				room[hotelch - 1][roomch - 1] = h_id;

			} else {
				System.err.println(" �̹� ����� �����Դϴ�. ");
			}
		} else if (roomch == 2) {
			if (room[hotelch - 1][roomch - 1] == null) {
				System.err.println(" [[���� �Ϸ�]] : �Ŷ�ȣ�� / �𷰽��� ");
				room[hotelch - 1][roomch - 1] = h_id;

			} else {
				System.err.println(" �̹� ����� �����Դϴ�. ");
			}
		} else if (roomch == 3) {
			if (room[hotelch - 1][roomch - 1] == null) {
				System.err.println(" [[���� �Ϸ�]] : �Ŷ�ȣ�� / ���Ĵٵ�� ");
				room[hotelch - 1][roomch - 1] = h_id;

			} else {
				System.err.println(" �̹� ����� �����Դϴ�. ");
			}
		}
	}

	@Override
	public void �������(int hotelch, int roomch, String h_id) {
		if (roomch == 1) {
			if (room[hotelch - 1][roomch - 1].equals(h_id)) {
				System.err.println(" [[���� ���]] : �Ŷ�ȣ�� / ����Ʈ�� ");
				room[hotelch - 1][roomch - 1] = null;

			} else {
				System.err.println(" �ٽ� �Է¹ٶ��ϴ�. ");
			}
		} else if (roomch == 2) {
			if (room[hotelch - 1][roomch - 1].equals(h_id)) {
				System.err.println(" [[���� ���]] : �Ŷ�ȣ�� / �𷰽��� ");
				room[hotelch - 1][roomch - 1] = null;

			} else {
				System.err.println(" �ٽ� �Է¹ٶ��ϴ�. ");
			}
		} else if (roomch == 3) {
			if (room[hotelch - 1][roomch - 1].equals(h_id)) {
				System.err.println(" [[���� ���]] : �Ŷ�ȣ�� / ���Ĵٵ�� ");
				room[hotelch - 1][roomch - 1] = null;

			} else {
				System.err.println(" �ٽ� �Է¹ٶ��ϴ�. ");
			}
		}
	}

	@Override
	public void ���ο�����ȸ(String h_id) {
		Member member = new Member();
		for (int i = 0; i < 3; i++) {
			if (room[0][i] != null && room[0][i].equals(h_id)) {
				if (i == 0) {
					System.out.println(" *** �Ŷ�ȣ�� / ����Ʈ�� " + room[0][i] + " �� ���� *** ");
				} else if (i == 1) {
					System.out.println(" *** �Ŷ�ȣ�� / �𷰽��� " + room[0][i] + " �� ���� *** ");
				} else if (i == 2) {
					System.out.println(" *** �Ŷ�ȣ�� / ���Ĵٵ�� " + room[0][i] + " �� ���� *** ");
				}

			}
		}

	}

	@Override
	public void ��ü������Ȳ_ȸ��() {
		System.out.print("�Ŷ�ȣ��\t");
		for (int i = 0; i < 3; i++) {
			if (room[0][i] == null) {
				System.out.print("\t��\t");
			} else {
				System.out.print("\t��\t");
			}
		}
		System.out.println();
	}

	@Override
	public void ��ü������Ȳ_������() {
		System.out.print("�Ŷ�ȣ��\t");
		for (int i = 0; i < 3; i++) {
			if (room[0][i] == null) {
				System.out.print("\t��\t");
			} else {
				System.out.print("\t"+room[0][i] + "\t");
			}

		}
		System.out.println();
	}

}
