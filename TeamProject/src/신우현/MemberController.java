package �ſ���;

import java.util.ArrayList;



public class MemberController {

	private static final Object h_id = null;
	// 1. �ʵ� [ ��� ȸ���� ��� �ִ� ��ü = �÷��� �����ӿ�ũ vs �迭 ]
	public static ArrayList<Member> memberlist = new ArrayList<>();

	// 2. �޼ҵ�

	// 1. ȸ������
	public static boolean signup(Member member) {
		// ��ȯŸ�� :
		// 1. ��ȿ���˻�
		if (member.getH_id().length() < 4) {
			System.out.println(" [�˸�] : ID�� 4�����̻� ���� �մϴ�");
			return false;
		}
		if (member.getH_pw().length() != 4) {
			System.out.println(" [�˸�] : Password�� 4���ڸ� �Դϴ�");
			return false;
		}
		if (member.getH_name().length() < 2) {
			System.out.println(" [�˸�] : Name�� 2�����̻� ���� �Դϴ�");
			return false;
		}

		// 2. ID �ߺ�üũ [ ����Ʈ�� ������ ���̵� �ִ��� Ȯ�� ]
		for (Member temp : memberlist) {
			if (temp.getH_id().equals(member.getH_id())) {
				System.out.println(" [�˸�] : �̹� ������� ���̵� �Դϴ�");
				return false;
			}
		}

		// 3. ����Ʈ ����
		memberlist.add(member);

		// 4. ���� ó��
		//	File.filesave(1);
		// File file = new File();
		// file.filesave(1);



		return true; // ȸ������ ������

	}
	
	// 2. �α��� 
	public static boolean login( String h_id , String h_pw ) {
		for( Member member : memberlist ) {
			if( member.getH_id().equals(h_id) && 
					member.getH_pw().equals(h_pw) ) {
				return true; // �α��� ������ 
			}
		}
		return false; // �α��� ���н�
	}
}
