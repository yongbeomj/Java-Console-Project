package ��������;

import java.util.ArrayList;

import Reference.Main;
import Reference.Ticket;
import �ſ���.Member;
import �ſ���.ȣ�ڿ���;

public class ȣ��Total implements ȣ�ڿ��� {

	
	String ȣ�ڸ� ;
	
	ArrayList< rooms > roomlist = new ArrayList<>();
	

	// �޼ҵ�
	public ȣ��Total(String ȣ�ڸ�) {
	
		this.ȣ�ڸ� = ȣ�ڸ�;
	}

	@Override
	public void ������(int hotelch, int roomch, String h_id) {

		if (room[hotelch - 1][roomch - 1] == null) {
			System.err.println(" *** " + this.ȣ�ڸ� + " ȣ�� / ** " + rooms. + " ���� �Ϸ� *** ");
			room[hotelch - 1][roomch - 1] = h_id;

		} else {
			System.err.println(" �̹� ����� �����Դϴ�. ");
		}
		
		
		

	}

	@Override
	public void �������(int hotelch, int roomch, String h_id) {
		if (room[hotelch - 1][roomch - 1] == null) {
			System.err.println(" *** " + rooms.ȣ�ڸ� + " ȣ�� / ** " + rooms.��Ÿ�� + " ���� ��ҿϷ� *** ");
			room[hotelch - 1][roomch - 1] = h_id;

		}
		System.out.println("*** ���� ��� �Ϸ� ***");
	}

	@Override
	public void ���ο�����ȸ(String h_id) {
		System.err.println(" *** ���ο�����ȸ *** ");
		Member member = new Member();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (room[i][j] != null) {
					System.err.println(" *** " + rooms.ȣ�ڸ� + " ȣ�� / ** " + rooms.��Ÿ�� + room[0][i] + " �� ���� *** ");
				}
			}
		}

	}

	@Override
	public void ��ü������Ȳ_ȸ��() {
		System.err.print("ȣ�� **\t");
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
		System.out.print("ȣ�� **\t");
		for (int i = 0; i < 3; i++) {
			if (room[0][i] == null) {
				System.out.print("\t��\t");
			} else {
				System.out.print("\t"+room[0][i]+"\t");
			}

		}
	}

}
