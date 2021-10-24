package ����ȣ;

import java.util.Scanner;

import controller.MemberController;
import model.Member;

public class Application {

	// 0. ����
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) { // M S

		// 0.���α׷� ���� �ε�

		// 1. ���α׷� ����
		mainmenu();
	}// M E
	
	/////////////////////////////////////////////////////////////////////////////////////////
	// 1. ���� �޴� �޼ҵ�
	private static void mainmenu() {

		while(true) { // ���ѷ���
			try {
				System.out.println("\n+++++++++++++ Main Menu ++++++++++++++");
				System.out.println("\t1.ȸ������ \t2.�α���");
				System.out.println("+++++++++++++++++++++++++++++++++++++++");
				System.out.print("���� : ");		int ch = scanner.nextInt();
				
				if (ch == 1) {
					System.out.println("++++++++++++ ȸ������ ������ ++++++++++++");
					// * �Է¹ޱ� -> ���� ���� -> ������ ������ -> ��ü -> ��ü ������ -> �迭/�÷��� ��´�
					System.out.print(" Id[4�����̻�] : "); 		String h_id = scanner.next();
					System.out.print(" Password[4���ڸ�] : "); 	String h_pw = scanner.next();
					System.out.print(" name[2�����̻�] : "); 		String h_name = scanner.next();
					System.out.print(" HP Number : "); 		String h_phone = scanner.next();
					// 4�� ������ ���ε��� �����ϸ� ������� => 4�� ������ ������ ��üȭ
					Member member = new Member(h_id, h_pw, h_name, h_phone);
					
					// Controller ���� [ �ٸ� Ŭ������ �޼ҵ� ȣ���ϴ� ��� :  1.    2. 
					boolean result =  MemberController.signup(member);
					if(result) {
						System.err.println(" [�˸�] : ȸ������ ���� ");
					}else {
						System.err.println(" [�˸�] : ȸ������ ���� ");
					}
					System.out.println("+++++++++++++++++++++++++++++++++++++++");
					
				} else if (ch == 2) {
					
					System.out.println("++++++++++++ �α��� ������ ++++++++++++");
					System.out.println("\t1.ȸ�� \t2.������");
					System.out.print("���� : ");		int ch1 = scanner.nextInt();
					if (ch1 == 1) {
						System.out.print(" Id : "); 		String h_id = scanner.next();
						System.out.print(" Password : "); 	String h_pw = scanner.next();
						
						boolean result  =  MemberController.login(h_id, h_pw);
						if( result ) {// �α��� ������ 
							System.err.println(" [�˸�] : �α��� ���� ");
							membermenu(h_id); // ȸ���޴� �޼ҵ� ȣ�� ( �α��� ������ ���̵� �μ��� ���� )
							
						}else {
							System.err.println(" [�˸�] : �α��� ���� ( ������ ȸ�������� �����ϴ� ) ");
						}
					} else if (ch1 == 2) {
						System.out.print(" Id : "); 		String h_id = scanner.next();
						System.out.print(" Password : "); 	String h_pw = scanner.next();}
				
					
					
					
				}
				
			} catch (Exception e) {
				System.err.println(" [�˸�] : �޴� ������ ���� [ �����ڹ��� ] ");
				scanner = new Scanner(System.in); // �Է°�ü �ʱ�ȭ
			}
		}
	} // ���� �޴��޼ҵ� ����
	/////////////////////////////////////////////////////////////////////////////////////////
	
	/////////////////////////////////////////////////////////////////////////////////////////
	// 2. ȸ�� �޴� �޼ҵ�
	public static void membermenu( String h_id ) {
		while(true) { // ���ѷ���
			try {
				System.out.println("\n+++++++++++++ ȸ�� ������ ++++++++++++++");
				System.out.println("1.�����ϱ� 2.�������� 3.������Ȳ����Ʈ 4.�ڷΰ���");
				System.out.println("+++++++++++++++++++++++++++++++++++++++");
				System.out.print("\t ���� : ");		int ch = scanner.nextInt();
			} catch (Exception e) {
			
			}
		}
	} // ȸ���޴� �޼ҵ�
	
	// 3. ������ �޴� �޼ҵ�
	public static void admin_menu() {
		while(true) {
			System.out.println(" ---------- Admin Menu ----------");
			System.out.println(" 1.������Ȳ����Ʈ | 2.ȸ��������ȸ | 3.�α׾ƿ� ");
			System.out.print("���� : ");	int ch = scanner.nextInt();
			if( ch == 1 ) {}
			if( ch == 2 ) {} 
			if( ch == 3 ) { System.out.println(" [[ �˸� ]] : �α׾ƿ� �Ǿ����ϴ� "); return; }
		}
	}
	
}
