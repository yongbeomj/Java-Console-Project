package 팀프로젝트;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class MemberController extends Member {


	static ArrayList<MemberController> memberlist = new ArrayList<>();

	// 1. 회원가입 
	public static boolean signup( MemberController member) {
		// 반환타입 : 
		// 1. 유효성검사 
		if( getId().length()<4 ){ 
			System.out.println(" [알림] : ID는 4글자이상 가능 합니다."); 
			return false; 
		}
		if( getPassword().length() != 4 ) { 
			System.out.println(" [알림] : Password는 4글자만 입니다."); 
			return false;  
		}
		if( getName().length() < 2 ) { 
			System.out.println(" [알림] : Name는 2글자이상 가능 입니다."); 
			return false; 
		}
		if( !getPhone().contains("-") ) { 
			System.out.println(" [알림] : 연락처 11자리를 입력해주세요. Ex) 010-xxxx-xxxx "); 
			return false; 
		}
		// 2. ID 중복체크 [ 리스트내 동일한 아이디가 있는지 확인 ]
		for( MemberController temp : memberlist ) {
			if( temp.getId().equals( member.getId()) ) {
				System.out.println(" [알림] : 이미 사용중인 아이디 입니다");
				return false;
			}
		}
		// 3. 리스트 저장 
		memberlist.add(member);
		// 4. 파일 처리 
		File.filesave(1);
		
		return true; // 회원가입 성공시 
		
	}
	
	

	public static boolean login( ) {
		for( MemberController member : memberlist ) {
			if( member.getId().equals(id) && 
					member.getPassword().equals(password) ) {
				return true; // 로그인 성공시 
			}
		}
		return false; // 로그인 실패시
	}
	
	// 5. 회원정보[ 아이디를 인수로 받아 해당 아이디의 모든 정보 반환 ] 
	public MemberController info( String loginid ) {
		MemberController member = null;
		return member;
	}



	public static boolean signup() {
		}


}