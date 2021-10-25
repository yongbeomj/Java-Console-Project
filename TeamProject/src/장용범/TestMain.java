package 장용범;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import Reference.Main;
import Reference.Ticket;
import Reference.예매;

public class TestMain {

	// 입력객체 생성
	public static Scanner scanner = new Scanner(System.in);
	
//	public static ArrayList<Member> members = new ArrayList<>(); // user list
//	public static ArrayList<호텔Total> 호텔Totals = new ArrayList<>(); // 객실예약 list
//	public static 호텔Total[] 호텔Totals2 = new 호텔Total[100]; // 객실예약리스트(배열)
	
	public static void main(String[] args) {
		
		
		// 1. 인터페이스 생성
		호텔예약 호텔예약;
		
		while(true) {
			System.out.println("======Main menu======");
			System.out.println("1.예약 2.메인메뉴 3.종료");
			System.out.print(">>> 선택 : "); int ch1 = scanner.nextInt();
			
			if (ch1 == 1) {
				System.out.println("======menu1======");
				System.out.println("1.예약등록 2.예약취소 3.본인예약조회 4.전체예약조회 5.객실세부정보");
				System.out.print(">>> 선택 : "); int ch2 = scanner.nextInt();

				if (ch2 == 1) { // 예약등록
					System.out.println(">>호텔지점<<");
					System.out.print("1.호텔1 2.호텔2 3.호텔3  >>> 선택 : "); int hotelch = TestMain.scanner.nextInt();
					System.out.println(">>방 타입<<");
					System.out.print("1.스위트 2.디럭스 3.스탠다드  >>> 선택 : "); int roomch = TestMain.scanner.nextInt();
					
					if (hotelch == 1) {
						호텔예약 = new 호텔1();
						if (roomch == 1) {
							호텔예약.예약등록(hotelch, roomch);
						} else if (roomch == 2) {
							호텔예약.예약등록(hotelch, roomch);
						} else if (roomch == 3) {
							호텔예약.예약등록(hotelch, roomch);
						}
					} else if (hotelch == 2) {
						호텔예약 = new 호텔2();
						if (roomch == 1) {
							호텔예약.예약등록(hotelch, roomch);
						} else if (roomch == 2) {
							호텔예약.예약등록(hotelch, roomch);
						} else if (roomch == 3) {
							호텔예약.예약등록(hotelch, roomch);
						}
					} else if (hotelch == 3) {
						호텔예약 = new 호텔3();
						if (roomch == 1) {
							호텔예약.예약등록(hotelch, roomch);
						} else if (roomch == 2) {
							호텔예약.예약등록(hotelch, roomch);
						} else if (roomch == 3) {
							호텔예약.예약등록(hotelch, roomch);
						}
					}
					
				} else if (ch2 == 2) { // 예약취소
					System.out.println(">>호텔지점 선택<<");
					System.out.println("1.호텔1 2.호텔2 3.호텔3"); int hotelch = TestMain.scanner.nextInt();
					System.out.println(">>방 타입 선택<<");
					System.out.println("1.스위트 2.디럭스 3.스탠다드"); int roomch = TestMain.scanner.nextInt();
					
					if (hotelch == 1) {
						호텔예약 = new 호텔1();
						if (roomch == 1) {
							호텔예약.예약취소(hotelch, roomch);
						} else if (roomch == 2) {
							호텔예약.예약취소(hotelch, roomch);
						} else if (roomch == 3) {
							호텔예약.예약취소(hotelch, roomch);
						}
					} else if (hotelch == 2) {
						호텔예약 = new 호텔2();
						if (roomch == 1) {
							호텔예약.예약취소(hotelch, roomch);
						} else if (roomch == 2) {
							호텔예약.예약취소(hotelch, roomch);
						} else if (roomch == 3) {
							호텔예약.예약취소(hotelch, roomch);
						}
					} else if (hotelch == 3) {
						호텔예약 = new 호텔3();
						if (roomch == 1) {
							호텔예약.예약취소(hotelch, roomch);
						} else if (roomch == 2) {
							호텔예약.예약취소(hotelch, roomch);
						} else if (roomch == 3) {
							호텔예약.예약취소(hotelch, roomch);
						}
					}
				} else if (ch2 == 3) { // 본인예약조회
					호텔예약 = new 호텔1();	호텔예약.본인예약조회();
					호텔예약 = new 호텔2();	호텔예약.본인예약조회();
					호텔예약 = new 호텔3();	호텔예약.본인예약조회();
				} else if (ch2 == 4) { // 전체예약현황조회
					System.out.println("---------------------------------");
					System.out.println("\t전체예약현황조회");
					System.out.println("---------------------------------");
					System.out.println("호텔\t스위트룸\t디럭스룸\t스탠다드룸");
					System.out.println("---------------------------------");
					호텔예약 = new 호텔1();	호텔예약.전체예약현황();
					호텔예약 = new 호텔2();	호텔예약.전체예약현황();
					호텔예약 = new 호텔3();	호텔예약.전체예약현황();
					System.out.println("---------------------------------");
				} else if (ch2 == 5) {
					System.out.print("1.스위트 2.디럭스 3.스탠다드"); int roomno = scanner.nextInt();
					if (roomno == 1) {
					호텔예약.	
					} else if (roomno == 2) {
						
					} else if (roomno == 3) {
						
					
					}
					
				} else {
					System.out.println("알 수 없는 행동");
				} 
				
			} else if (ch1 == 2) {
				System.out.println("======menu2======");
				System.out.println("1.회원가입 2.로그인");
				System.out.print(">>> 선택 : "); int ch3 = scanner.nextInt();
				
				if (ch3 == 1) { // 회원가입
					System.out.println("회원가입 완료");
				} else if (ch3 == 2) { // 로그인
					System.out.println("로그인 완료");
				} else if (ch3 == 3) {
					System.out.println("알 수 없는 행동");
				}
				
			} else if (ch1 == 3) {
				System.out.println("종료"); break;
			} 
				
		}
		
	}
	
	
}
