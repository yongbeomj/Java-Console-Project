package 신우현;

import java.util.ArrayList;

public class 호텔2 extends 호텔Total {
	public int[][] 예약회원리스트 = new int[3][3]; 
	
	// 메소드
	@Override
	public void 예약등록(int hotelch, int roomch,String h_id) {
		if (roomch == 1) {
			if (room[hotelch-1][roomch-1] == null) {
				System.out.println("[[예약 완료]] : 호텔2 / 스위트룸");
				room[hotelch-1][roomch-1] = h_id;
				File.filesave(2);
				File.fileload(2);
			}
			else {
				System.out.println("이미 예약된 객실입니다");
			}
		} else if (roomch == 2) {
			if (room[hotelch-1][roomch-1] == null) {
				System.out.println("[[예약 완료]] : 호텔2 / 디럭스룸");
				room[hotelch-1][roomch-1] = h_id;
				File.filesave(2);
				File.fileload(2);
			}
			else {
				System.out.println("이미 예약된 객실입니다");
			}
		} else if (roomch == 3) {
			if (room[hotelch-1][roomch-1] == null) {
				System.out.println("[[예약 완료]] : 호텔2 / 스탠다드룸");
				room[hotelch-1][roomch-1] = h_id;
				File.filesave(2);
				File.fileload(2);
			}
			else {
				System.out.println("이미 예약된 객실입니다");
			}
		}
	}
	@Override
	public void 예약취소(int hotelch, int roomch,String h_id) {
		if (roomch == 1) {
			if (room[hotelch-1][roomch-1] == h_id) {
				System.out.println("[[예약 취소]] : 호텔2 / 스위트룸");
				room[hotelch-1][roomch-1] = null;
				File.filesave(2);
				File.fileload(2);
			} else {
				System.out.println("다시 입력바랍니다");
			}
		} else if (roomch == 2) {
			if (room[hotelch-1][roomch-1] == h_id) {
				System.out.println("[[예약 취소]] : 호텔2 / 디럭스룸");
				room[hotelch-1][roomch-1] = null;
				File.filesave(2);
				File.fileload(2);
			} else {
				System.out.println("다시 입력바랍니다");
			}
		} else if (roomch == 3) {
			if (room[hotelch-1][roomch-1] == h_id) {
				System.out.println("[[예약 취소]] : 호텔2 / 스탠다드룸");
				room[hotelch-1][roomch-1] = null;
				File.filesave(2);
				File.fileload(2);
			} else {
				System.out.println("다시 입력바랍니다");
			}
		}
	}
	@Override
	public void 본인예약조회(String h_id) {
		Member member = new Member();
		for (int i = 0; i < 3; i++) {
			if (room[1][i] != null && room[1][i].equals(h_id)) {
				if (i == 0) {
					System.out.println("*** 호텔2 / 스위트룸 예약 ***"+room[1][i]);
				} else if (i == 1) {
					System.out.println("*** 호텔2 / 디럭스룸 예약 ***"+room[1][i]);
				} else if (i == 2) {
					System.out.println("*** 호텔2 / 스탠다드룸 예약 ***"+room[1][i]);
				}
				
			}
		}
	
	}
	@Override
	public void 전체예약현황_회원() {
		System.out.print("호텔 2\t");
		for (int i = 0; i < 3; i++) {
			if (room[1][i] == null) {
				System.out.print("□\t");
			} else {
				System.out.print("■\t");
			}
		}
		System.out.println();
	}
	@Override
	public void 전체예약현황_관리자() {
		System.out.print("호텔 2\t");
		for (int i = 0; i < 3; i++) {
			if (room[1][i] == null) {
				System.out.print("□\t");
			} else {
				System.out.print(room[1][i]+"\t");
			}
				
		}
		System.out.println();
	}
	@Override
	public void 파일처리() {
		System.out.println("호텔 3 파일처리");
	}
	
	
}
