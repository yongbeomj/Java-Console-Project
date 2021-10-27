package ����ȣ;

import java.util.ArrayList;
import java.util.Vector;

public class MemberController {

	private static final Object h_id = null;
	// 1. �ʵ� [ ��� ȸ���� ��� �ִ� ��ü = �÷��� �����ӿ�ũ vs �迭 ]
	public static Vector<Member> memberlist = new Vector<>();

	// 2. �޼ҵ�

	// 1. ȸ������
	public static boolean signup(Member member) {
		// ��ȯŸ�� :
		// 1. ��ȿ���˻�
		if (member.getH_id().length() < 4) {
			System.err.println(" [�˸�] : ID�� 4�����̻� ���� �մϴ�. ");
			return false;
		}
		if (member.getH_id().equals("admin")) {
			System.err.println(" ����� �� ���� ���̵��Դϴ�. ");
			return false;
		}
		if (member.getH_pw().length() != 4) {
			System.err.println(" [�˸�] : Password�� 4���ڸ� �Դϴ�. ");
			return false;
		}
		if (member.getH_name().length() < 2) {
			System.err.println(" [�˸�] : Name�� 2�����̻� ���� �Դϴ�. ");
			return false;
		}

		// 2. ID �ߺ�üũ [ ����Ʈ�� ������ ���̵� �ִ��� Ȯ�� ]
		for (Member temp : memberlist) {
			if (temp.getH_id().equals(member.getH_id())) {
				System.err.println(" [�˸�] : �̹� ��� ���� ���̵� �Դϴ�. ");
				return false;
			}
		}

		// 3. ����Ʈ ����
		memberlist.add(member);

		File.filesave(1);

		return true; // ȸ������ ������

	}

	// 2. �α���
	public static boolean login(String h_id, String h_pw) {

		for (Member member : memberlist) {
			if (h_id.equals("admin")) {
				System.err.println(" ����� �� ���� ���̵��Դϴ�. ");
				return false;
			} else if (member.getH_id().equals(h_id) && member.getH_pw().equals(h_pw)) {
				return true; // �α��� ������
			}
		}
		return false; // �α��� ���н�
	}
}
