package ��������Ʈ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class TestMain {

	// �Է°�ü ����
	public static Scanner scanner = new Scanner(System.in);
	
	public static ArrayList<MemberController> members = new ArrayList<>(); // user list
	public static ArrayList<ȣ��Total> ȣ��Totals = new ArrayList<>(); // ���ǿ��� list
	public static ȣ��Total[] ȣ��Totals2 = new ȣ��Total[100]; // ���ǿ��ฮ��Ʈ(�迭)
	
	public static void main(String[] args) {
		// 1. �������̽� ����
		ȣ�ڿ��� ȣ�ڿ���;
		
		while(true) {
			System.out.println("======Main menu======");
			System.out.println("1.���� 2.���θ޴� 3.����");
			System.out.print(">>> ���� : "); int ch1 = scanner.nextInt();
			
			if (ch1 == 1) {
				System.out.println("======menu======");
				System.out.println("1.������ 2.������� 3.���ο�����ȸ 4.��ü������ȸ");
				System.out.print(">>> ���� : "); int ch2 = scanner.nextInt();

				if (ch2 == 1) { // ������
					
				} else if (ch2 == 2) { // �������
					
				} else if (ch2 == 3) { // ���ο�����ȸ
					ȣ�ڿ��� = new ȣ��1();
					ȣ�ڿ���.���ο�����ȸ();
					ȣ�ڿ��� = new ȣ��2();
					ȣ�ڿ���.���ο�����ȸ();
					ȣ�ڿ��� = new ȣ��3();
					ȣ�ڿ���.���ο�����ȸ();
				} else if (ch2 == 4) { // ��ü������Ȳ��ȸ
					ȣ�ڿ��� = new ȣ��1();
					ȣ�ڿ���.��ü������Ȳ();
					ȣ�ڿ��� = new ȣ��2();
					ȣ�ڿ���.��ü������Ȳ();
					ȣ�ڿ��� = new ȣ��3();
					ȣ�ڿ���.��ü������Ȳ();
				} else {
					System.out.println("�� �� ���� ��ȣ");
				}
				
			} else if (ch1 == 2) {
				
			} else if (ch1 == 3) {
				System.out.println("����"); break;
			} 
				
		}
		
	}
	
	
}