package ����;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import Reference.Main;
import Reference.Ticket;
import Reference.����;

public class TestMain {

	// �Է°�ü ����
	public static Scanner scanner = new Scanner(System.in);
	
//	public static ArrayList<Member> members = new ArrayList<>(); // user list
//	public static ArrayList<ȣ��Total> ȣ��Totals = new ArrayList<>(); // ���ǿ��� list
//	public static ȣ��Total[] ȣ��Totals2 = new ȣ��Total[100]; // ���ǿ��ฮ��Ʈ(�迭)
	
	public static void main(String[] args) {
		
		
		// 1. �������̽� ����
		ȣ�ڿ��� ȣ�ڿ���;
		
		while(true) {
			System.out.println("======Main menu======");
			System.out.println("1.���� 2.���θ޴� 3.����");
			System.out.print(">>> ���� : "); int ch1 = scanner.nextInt();
			
			if (ch1 == 1) {
				System.out.println("======menu1======");
				System.out.println("1.������ 2.������� 3.���ο�����ȸ 4.��ü������ȸ 5.���Ǽ�������");
				System.out.print(">>> ���� : "); int ch2 = scanner.nextInt();

				if (ch2 == 1) { // ������
					System.out.println(">>ȣ������<<");
					System.out.print("1.ȣ��1 2.ȣ��2 3.ȣ��3  >>> ���� : "); int hotelch = TestMain.scanner.nextInt();
					System.out.println(">>�� Ÿ��<<");
					System.out.print("1.����Ʈ 2.�𷰽� 3.���Ĵٵ�  >>> ���� : "); int roomch = TestMain.scanner.nextInt();
					
					if (hotelch == 1) {
						ȣ�ڿ��� = new ȣ��1();
						if (roomch == 1) {
							ȣ�ڿ���.������(hotelch, roomch);
						} else if (roomch == 2) {
							ȣ�ڿ���.������(hotelch, roomch);
						} else if (roomch == 3) {
							ȣ�ڿ���.������(hotelch, roomch);
						}
					} else if (hotelch == 2) {
						ȣ�ڿ��� = new ȣ��2();
						if (roomch == 1) {
							ȣ�ڿ���.������(hotelch, roomch);
						} else if (roomch == 2) {
							ȣ�ڿ���.������(hotelch, roomch);
						} else if (roomch == 3) {
							ȣ�ڿ���.������(hotelch, roomch);
						}
					} else if (hotelch == 3) {
						ȣ�ڿ��� = new ȣ��3();
						if (roomch == 1) {
							ȣ�ڿ���.������(hotelch, roomch);
						} else if (roomch == 2) {
							ȣ�ڿ���.������(hotelch, roomch);
						} else if (roomch == 3) {
							ȣ�ڿ���.������(hotelch, roomch);
						}
					}
					
				} else if (ch2 == 2) { // �������
					System.out.println(">>ȣ������ ����<<");
					System.out.println("1.ȣ��1 2.ȣ��2 3.ȣ��3"); int hotelch = TestMain.scanner.nextInt();
					System.out.println(">>�� Ÿ�� ����<<");
					System.out.println("1.����Ʈ 2.�𷰽� 3.���Ĵٵ�"); int roomch = TestMain.scanner.nextInt();
					
					if (hotelch == 1) {
						ȣ�ڿ��� = new ȣ��1();
						if (roomch == 1) {
							ȣ�ڿ���.�������(hotelch, roomch);
						} else if (roomch == 2) {
							ȣ�ڿ���.�������(hotelch, roomch);
						} else if (roomch == 3) {
							ȣ�ڿ���.�������(hotelch, roomch);
						}
					} else if (hotelch == 2) {
						ȣ�ڿ��� = new ȣ��2();
						if (roomch == 1) {
							ȣ�ڿ���.�������(hotelch, roomch);
						} else if (roomch == 2) {
							ȣ�ڿ���.�������(hotelch, roomch);
						} else if (roomch == 3) {
							ȣ�ڿ���.�������(hotelch, roomch);
						}
					} else if (hotelch == 3) {
						ȣ�ڿ��� = new ȣ��3();
						if (roomch == 1) {
							ȣ�ڿ���.�������(hotelch, roomch);
						} else if (roomch == 2) {
							ȣ�ڿ���.�������(hotelch, roomch);
						} else if (roomch == 3) {
							ȣ�ڿ���.�������(hotelch, roomch);
						}
					}
				} else if (ch2 == 3) { // ���ο�����ȸ
					ȣ�ڿ��� = new ȣ��1();	ȣ�ڿ���.���ο�����ȸ();
					ȣ�ڿ��� = new ȣ��2();	ȣ�ڿ���.���ο�����ȸ();
					ȣ�ڿ��� = new ȣ��3();	ȣ�ڿ���.���ο�����ȸ();
				} else if (ch2 == 4) { // ��ü������Ȳ��ȸ
					System.out.println("---------------------------------");
					System.out.println("\t��ü������Ȳ��ȸ");
					System.out.println("---------------------------------");
					System.out.println("ȣ��\t����Ʈ��\t�𷰽���\t���Ĵٵ��");
					System.out.println("---------------------------------");
					ȣ�ڿ��� = new ȣ��1();	ȣ�ڿ���.��ü������Ȳ();
					ȣ�ڿ��� = new ȣ��2();	ȣ�ڿ���.��ü������Ȳ();
					ȣ�ڿ��� = new ȣ��3();	ȣ�ڿ���.��ü������Ȳ();
					System.out.println("---------------------------------");
				} else if (ch2 == 5) {
					System.out.print("1.����Ʈ 2.�𷰽� 3.���Ĵٵ�"); int roomno = scanner.nextInt();
					if (roomno == 1) {
					ȣ�ڿ���.	
					} else if (roomno == 2) {
						
					} else if (roomno == 3) {
						
					
					}
					
				} else {
					System.out.println("�� �� ���� �ൿ");
				} 
				
			} else if (ch1 == 2) {
				System.out.println("======menu2======");
				System.out.println("1.ȸ������ 2.�α���");
				System.out.print(">>> ���� : "); int ch3 = scanner.nextInt();
				
				if (ch3 == 1) { // ȸ������
					System.out.println("ȸ������ �Ϸ�");
				} else if (ch3 == 2) { // �α���
					System.out.println("�α��� �Ϸ�");
				} else if (ch3 == 3) {
					System.out.println("�� �� ���� �ൿ");
				}
				
			} else if (ch1 == 3) {
				System.out.println("����"); break;
			} 
				
		}
		
	}
	
	
}
