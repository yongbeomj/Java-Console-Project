package ��������Ʈ;

import java.util.Scanner;

public class ȸ������ {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(true) { // ���ѷ��� 
			try {
				System.out.println("\n+++++++++++++ ȸ�� Ŀ�´�Ƽ ++++++++++++++");
				System.out.println("1.�α��� 2.ȸ������ 3.���̵�ã�� 4.��й�ȣã��");
				System.out.println("+++++++++++++++++++++++++++++++++++++++");
				System.out.print("\t ���� : ");		int ch = scanner.nextInt();
				
				if( ch == 1 ) {
					System.out.println("++++++++++++ �α��� ������ ++++++++++++");
					System.out.print(" Id : "); 		String id = scanner.next();
					System.out.print(" Password : "); 	String password = scanner.next();
					
					boolean result  =  MemberController.login();
					
					if( result ) {// �α��� ������ 
						System.err.println(" [�˸�] : �α��� ���� ");
						membermenu(id); // ȸ���޴� �޼ҵ� ȣ�� ( �α��� ������ ���̵� �μ��� ���� )
						
					}else {
						System.err.println(" [�˸�] : �α��� ���� ( ������ ȸ�������� �����ϴ� ) ");
					}
					
				}
				else if( ch == 2 ){
					System.out.println("++++++++++++ ȸ������ ������ ++++++++++++");
					// * �Է¹ޱ� -> ���� ���� -> ������ ������ -> ��ü -> ��ü ������ -> �迭/�÷��� ��´�
					System.out.print(" Id[4�����̻�] : "); 		String id = scanner.next();
					System.out.print(" Password[4���ڸ�] : "); 	String passowrd = scanner.next();
					System.out.print(" name[2�����̻�] : "); 		String name = scanner.next();
					System.out.print(" Phone[11����] : "); 		String Phone = scanner.next();
					// 4�� ������ ���ε��� �����ϸ� ������� => 4�� ������ ������ ��üȭ
					Member member = new Member(id, passowrd, name, Phone );
					
					// Controller ���� [ �ٸ� Ŭ������ �޼ҵ� ȣ���ϴ� ��� :  1.    2. 
					boolean result =  MemberController.signup(member);
					if(result) {
						System.err.println(" [�˸�] : ȸ������ ���� ");
					}else {
						System.err.println(" [�˸�] : ȸ������ ���� ");
					}
					System.out.println("+++++++++++++++++++++++++++++++++++++++");
				}
			
				else {
					System.err.println(" [�˸�] : �˼����� �ൿ �Դϴ� [ �����ڿ��� ���� ]");
				}
			}
			catch (Exception e) {
				System.err.println(" [�˸�] : �޴� ������ ���� [ �����ڹ��� ] ");
				scanner = new Scanner(System.in); // �Է°�ü �ʱ�ȭ
						// new : 
			}
		}
	}

}
