package ��������Ʈ;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Application{

	// �Է°�ü ����
	public static Scanner scanner = new Scanner(System.in);
	
	// User ����Ʈ ����
	public static ArrayList<MemberController> members = new ArrayList<>();
	
	
	public static void main(String[] args) {
		// 0.���α׷� ���� �ε� 
		File.fileload(1);	// ȸ�� ���� �ҷ����� 	
		
		// 1. ���α׷� ���� 
		mainmenu(); // ���� �޴� �޼ҵ� ȣ��{
		
		while(true) {
			System.out.println("======Main menu======");
			System.out.println("1.ȸ������ 2.�α��� 3.�����ڷα��� 4.����");
			System.out.print(">>> ���� : "); int ch = scanner.nextInt();
			
			
			if (ch == 1) {
				MemberController.signup();
				for (MemberController temp : members) {
					System.out.print(temp.getId()+","+temp.getPassword()+","+temp.getName()+","+temp.getPhone()+"\n");
				}
				
			} else if (ch == 2) {
				MemberController.login();
				for (MemberController temp : members) {
					System.out.print(temp.getId()+","+temp.getPassword()+"\n");
				}
				
			} else if (ch == 3) {
				
			} else if (ch == 4) {
				
			} 
				
		}
		
		
		
		
	}



}