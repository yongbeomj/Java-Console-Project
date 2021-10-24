package 팀프로젝트;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Application{

	// 입력객체 생성
	public static Scanner scanner = new Scanner(System.in);
	
	// User 리스트 생성
	public static ArrayList<MemberController> members = new ArrayList<>();
	
	
	public static void main(String[] args) {
		// 0.프로그램 파일 로딩 
		File.fileload(1);	// 회원 파일 불러오기 	
		
		// 1. 프로그램 시작 
		mainmenu(); // 메인 메뉴 메소드 호출{
		
		while(true) {
			System.out.println("======Main menu======");
			System.out.println("1.회원가입 2.로그인 3.관리자로그인 4.종료");
			System.out.print(">>> 선택 : "); int ch = scanner.nextInt();
			
			
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