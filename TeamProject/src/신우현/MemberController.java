package ��������Ʈ;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class MemberController extends Member {


	static ArrayList<MemberController> memberlist = new ArrayList<>();

	// 1. ȸ������ 
	public static boolean signup( MemberController member) {
		// ��ȯŸ�� : 
		// 1. ��ȿ���˻� 
		if( getId().length()<4 ){ 
			System.out.println(" [�˸�] : ID�� 4�����̻� ���� �մϴ�."); 
			return false; 
		}
		if( getPassword().length() != 4 ) { 
			System.out.println(" [�˸�] : Password�� 4���ڸ� �Դϴ�."); 
			return false;  
		}
		if( getName().length() < 2 ) { 
			System.out.println(" [�˸�] : Name�� 2�����̻� ���� �Դϴ�."); 
			return false; 
		}
		if( !getPhone().contains("-") ) { 
			System.out.println(" [�˸�] : ����ó 11�ڸ��� �Է����ּ���. Ex) 010-xxxx-xxxx "); 
			return false; 
		}
		// 2. ID �ߺ�üũ [ ����Ʈ�� ������ ���̵� �ִ��� Ȯ�� ]
		for( MemberController temp : memberlist ) {
			if( temp.getId().equals( member.getId()) ) {
				System.out.println(" [�˸�] : �̹� ������� ���̵� �Դϴ�");
				return false;
			}
		}
		// 3. ����Ʈ ���� 
		memberlist.add(member);
		// 4. ���� ó�� 
		File.filesave(1);
		
		return true; // ȸ������ ������ 
		
	}
	
	

	public static boolean login( ) {
		for( MemberController member : memberlist ) {
			if( member.getId().equals(id) && 
					member.getPassword().equals(password) ) {
				return true; // �α��� ������ 
			}
		}
		return false; // �α��� ���н�
	}
	
	// 5. ȸ������[ ���̵� �μ��� �޾� �ش� ���̵��� ��� ���� ��ȯ ] 
	public MemberController info( String loginid ) {
		MemberController member = null;
		return member;
	}



	public static boolean signup() {
		}


}