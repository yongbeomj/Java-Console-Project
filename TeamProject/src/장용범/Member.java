package ����;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Member {

	// 1. �ʵ� - ���̵� , ��й�ȣ , �̸� , ����ó
	private String h_id;
	private String h_pw;
	private String h_name;
	private String h_phone;

	// 2. ������
	public Member() {
	}

	public Member(String h_id, String h_pw, String h_name, String h_phone) {
		super();
		this.h_id = h_id;
		this.h_pw = h_pw;
		this.h_name = h_name;
		this.h_phone = h_phone;
	}

	// 3. �޼ҵ�

	// 1. ȸ������
	public static void signup() {

		// 1. ȸ������ �Է�
		System.out.println("------------------ȸ������ ������ ----------------");
		System.out.print(" ���̵� : ");
		String h_id = Application.scanner.next();
		System.out.print(" ��й�ȣ : ");
		String h_pw = Application.scanner.next();
		System.out.print(" ���� : ");
		String h_name = Application.scanner.next();
		System.out.print(" ����ó : ");
		String h_phone = Application.scanner.next();

		// 2. �ӽð�ü ����
		Member members = new Member(h_id, h_pw, h_name, h_phone);

		// ���̵� �ߺ�üũ
		boolean idcheck = true;
		for (Member temp : Application.members) {
			if (temp.getH_id().equals(h_id)) {
				System.out.println(" [[ �˸� ]] : �ߺ��� ���̵� �Դϴ� ");
				idcheck = false;
				break; // ȸ������ ����
			}
		}

		// 3. ���� ��ü�� ����Ʈ�� �ֱ�
		if (idcheck) {
			Application.members.add(members);
			System.out.println("[[ �˸� ]] : ȸ�������� �Ǿ����ϴ�");

			// 4. ���� ����
			try {
				FileOutputStream fileOutputStream = new FileOutputStream(
						"C:/Users/ez201208/git/hotel-reservation-system/TeamProject/src/����/userlist.txt", true);

				// �ʵ尣 ���� : [,] ȸ���� ���� : [\n]
				String outstring = members.getH_id() + "," + members.getH_pw() + "," + members.getH_name() + ","
						+ members.getH_phone() + "\n";

				fileOutputStream.write(outstring.getBytes());
				System.out.println(" [[ �˸� ]] : ����ó�� ���� ");
			} catch (Exception e) {
				System.out.println(" [[ �˸� ]] : ����ó�� ���� ");
			}
		}

	}

	// ���� �ҷ�����
	public static void fileread() {
		try {
			FileInputStream fileInputStream = new FileInputStream(
					"C:/Users/ez201208/git/ezen-education/java11/src/Day14/userlist.txt");
			// 1. ���ϳ� ��� ���� �������� [ ��Ʈ�� ���� : ����Ʈ ]
			// 1. ����Ʈ�迭 ����
			byte[] bytes = new byte[1024]; // 1bit -> 8bit -> 1byte -> 1024byte -> 1kbyte
			// ����,����,Ư������ 1����Ʈ // �ѱ� 2����Ʈ
			// 2. ����Ʈ �о����
			fileInputStream.read(bytes);
			// 3. ����Ʈ -> ���ڿ� ��ȭ
			String inString = new String(bytes);

			// 2. ȸ�� �����ϱ�
			String[] usernum = inString.split("\n");
			// split( ���� ) �и� => �迭
			// 3. �ʵ� �����ϱ�
			for (String temp : usernum) {
				String[] userdata = temp.split(",");
				if (userdata.length == 1)
					break;
				// * ������ ȸ��(����ȸ��) ����
				// 4. ��ü ����
				Member members = new Member(userdata[0], userdata[1], userdata[2], userdata[3]);
				// 5. ����Ʈ ���
				Application.members.add(members);
			}
		} catch (Exception e) {
			System.out.println(" [[ ���� �ҷ����� ���� ]]");
		}
	}

	// 2. �α���

	// 3. �����ڷα���

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
