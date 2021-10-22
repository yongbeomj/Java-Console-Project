package 김태호;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Application2 {

	// 입력객체 생성
	public static Scanner scanner = new Scanner(System.in);
	
	// User 리스트 생성
	public static ArrayList<Member> members = new ArrayList<>();
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("======Main menu======");
			System.out.println("1.회원가입 2.로그인 3.관리자로그인 4.종료");
			System.out.print(">>> 선택 : "); int ch = scanner.nextInt();
			
			
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
