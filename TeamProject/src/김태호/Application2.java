package ����ȣ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Application2 {

	// �Է°�ü ����
	public static Scanner scanner = new Scanner(System.in);
	
	// User ����Ʈ ����
	public static ArrayList<Member> members = new ArrayList<>();
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("======Main menu======");
			System.out.println("1.ȸ������ 2.�α��� 3.�����ڷα��� 4.����");
			System.out.print(">>> ���� : "); int ch = scanner.nextInt();
			
			
			if (ch == 1) {
				Member.signup();
				for (Member temp : members) {
					System.out.print(temp.getH_id()+","+temp.getH_pw()+","+temp.getH_name()+","+temp.getH_phone()+"\n");
				}
				
			} else if (ch == 2) {
				
			} else if (ch == 3) {
				
			} else if (ch == 4) {
				
			} 
				
		}
		
		
		
		
	}
}
