package ����ȣ;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;



public class ȣ��Total implements ȣ�ڿ��� {

	// �ʵ�
	public static int[][] room = new int[3][3]; 
	
	// ������
	
	// �޼ҵ�
	@Override
	public void ������(int hotelch, int roomch) {
		if (room[hotelch-1][roomch-1] == 0) {
			System.out.println("*** ȣ�� / ** �� ���� �Ϸ� ***");
			room[hotelch-1][roomch-1] = 1;
		} else {
			System.out.println("�̹� ����� �����Դϴ�");
		}
	}
	@Override
	public void �������(int hotelch, int roomch) {
		if (room[hotelch-1][roomch-1] == 1) {
			System.out.println("*** ȣ�� / ** �� ������� �Ϸ� ***");
			room[hotelch-1][roomch-1] = 0;
		}
		System.out.println("*** ���� ��� �Ϸ� ***");
	}
	@Override
	public void ���ο�����ȸ() {
		System.out.println("*** ���ο�����ȸ ***");
	}
	@Override
	public void ��ü������Ȳ() {
		System.out.print("ȣ�� **\t");
		for (int i = 0; i < 3; i++) {
			if (room[0][i] == 0)
				System.out.print("��\t");
			if (room[0][i] == 1)
				System.out.print("��\t");
		}
	}
	@Override
	public void ����ó��() {
		
	}
	
	
}
