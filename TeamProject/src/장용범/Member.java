package 장용범;

import java.io.FileOutputStream;

public class Member {

	// 1. 필드 - 아이디 , 비밀번호 , 이름 , 연락처
	private String h_id;
	private String h_pw;
	private String h_name;
	private String h_phone;

	// 2. 생성자
	public Member() {}

	public Member(String h_id, String h_pw, String h_name, String h_phone) {
		super();
		this.h_id = h_id;
		this.h_pw = h_pw;
		this.h_name = h_name;
		this.h_phone = h_phone;
	}

	// 3. 메소드

	// 1. 회원가입
	public static void signup() {

		// 1. 회원정보 입력
		System.out.println("------------------회원가입 페이지 ----------------");
		System.out.print(" 아이디 : ");		String h_id = Application.scanner.next();
		System.out.print(" 비밀번호 : ");		String h_pw = Application.scanner.next();
		System.out.print(" 성명 : ");			String h_name = Application.scanner.next();
		System.out.print(" 연락처 : ");		String h_phone = Application.scanner.next();

		// 2. 임시객체 생성
		Member members = new Member(h_id, h_pw, h_name, h_phone);

			// 아이디 중복체크
			boolean idcheck = true;
			for (Member temp : Application.members) {
				if (temp.getH_id().equals(h_id)) {
					System.out.println(" [[ 알림 ]] : 중복된 아이디 입니다 ");
					idcheck = false;
					break; // 회원가입 실패
				}
			}

		// 3. 만든 객체를 리스트에 넣기
		if (idcheck) {
			Application.members.add(members);
			System.out.println("[[ 알림 ]] : 회원가입이 되었습니다");
			
			// 4. 파일 저장
			try {	
				FileOutputStream fileOutputStream = 
					new FileOutputStream("C:/Users/ez201208/git/hotel-reservation-system/TeamProject/src/장용범/userlist.txt", true);
				
				// 필드간 구분 : [,] 회원간 구분 : [\n]
				String outstring = members.getH_id()+","+members.getH_pw()+","+members.getH_name()+","+members.getH_phone()+"\n";
				
				fileOutputStream.write( outstring.getBytes() );
				System.out.println(" [[ 알림 ]] : 파일처리 성공 ");
			}
			catch (Exception e) {
				System.out.println(" [[ 알림 ]] : 파일처리 실패 ");
			}
		}

	}
	// 2. 로그인

	// 3. 관리자로그인

	public String getH_id() {
		return h_id;
	}

	public void setH_id(String h_id) {
		this.h_id = h_id;
	}

	public String getH_pw() {
		return h_pw;
	}

	public void setH_pw(String h_pw) {
		this.h_pw = h_pw;
	}

	public String getH_name() {
		return h_name;
	}

	public void setH_name(String h_name) {
		this.h_name = h_name;
	}

	public String getH_phone() {
		return h_phone;
	}

	public void setH_phone(String h_phone) {
		this.h_phone = h_phone;
	}

}
