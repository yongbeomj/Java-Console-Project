package ����ȣ;

import java.util.ArrayList;

import database.File;
import Final2.Reserve;

public class ReserveController {

	// 1. �ʵ�
	public static ArrayList<Reserve> reservelist = new ArrayList<>();
	// static ������쿡 �ش� �ʵ� ȣ��� [ BoardController ��ü ���� ]
	// static ������� �ش� �ʵ� �ٷ�ȣ�� ����

	// 2. �޼ҵ�
	// �Խù� ��� �޼ҵ�
	public static boolean add(Reserve reserve) {
		
		// 1. ����Ʈ ��� 
		reservelist.add(reserve);
		// 2. ����ó�� 
		File.filesave(2);
		return true; // ��� ������
	}

	// �Խù� ��������[��ȸ] �޼ҵ�
	public static Reserve detail(int index) {

		Reserve reserve = reservelist.get(index);
		
		return reserve; // �˻��� �Խù� ��ȯ
	}



}
