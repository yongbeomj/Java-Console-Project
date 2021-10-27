package �ſ���;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import ��������.ȣ��Total;
import �ſ���.MemberController;
import �ſ���.Member;

public class File {
	// 1. �ʵ�
	// 1. ȸ�������� �����ϴ� ������ ���
	private static String memberpath = "C:/Users/ezr210310/git/hotel-reservation-system/TeamProject/src/�ſ���/memberlist.txt";
	private static String roompath = "C:/Users/ezr210310/git/hotel-reservation-system/TeamProject/src/�ſ���/roomlist.txt";

	// 2. ���� �޼ҵ�
	public synchronized static boolean filesave(int type) {
		try {
			FileOutputStream fileOutputStream = null;

			if (type == 1) { // ȸ������
				// 1. ���ϰ�ü�� ��� ����
				fileOutputStream = new FileOutputStream(memberpath);
				// 2. �ݺ����� �̿��� ȸ������Ʈ���� �ϳ��� ȸ�� ��������
				for (Member member : MemberController.memberlist) {
					// 3. �� ȸ������ �ʵ�[,]�� ȸ��[/n] ����
					String outstring = member.getH_id() + "," + member.getH_pw() + "," + member.getH_name() + ","
							+ member.getH_phone() + "\n";

					// 4. ����Ʈ�� ��������
					fileOutputStream.write(outstring.getBytes());
				}
				// 5. ��Ʈ�� ����� �ʱ�ȭ
				fileOutputStream.flush(); // ���Ͻ�Ʈ���� �����ϴ� ����Ʈ ����
				fileOutputStream.close(); // ���Ͻ�Ʈ�� �ݱ�

				return true; // ����ó�� ����
			}

			if (type == 2) {
				// 1. ���ϰ�ü�� ��� ����
				fileOutputStream = new FileOutputStream(roompath);
				// 2. �ݺ����� �̿��� ȸ������Ʈ���� �ϳ��� ȸ�� ��������
				for (String[] room : ȣ��Total.room) {

					// 3. �� ȸ������ �ʵ�[,]�� ȸ��[/n] ����
					String outstring = room[0] + "," + room[1] + "," + room[2] + "\n";

					// 4. ����Ʈ�� ��������
					fileOutputStream.write(outstring.getBytes());

				}
				// 5. ��Ʈ�� ����� �ʱ�ȭ
				fileOutputStream.flush(); // ���Ͻ�Ʈ���� �����ϴ� ����Ʈ ����
				fileOutputStream.close(); // ���Ͻ�Ʈ�� �ݱ�

				return true; // ����ó�� ����
			}

		} catch (Exception e) {
			System.err.println(" [�˸�] : ���� ���� ���� �߻� [ �����ڿ��� ���� ]");
		}
		return false; // ����ó�� ����
	}

	// 3. �ҷ����� �޼ҵ�
	public synchronized static boolean fileload(int type) {
		try {
			FileInputStream fileInputStream = null;
			if (type == 1) {
				// 1. �Է½�Ʈ�� ��� ����
				fileInputStream = new FileInputStream(memberpath);
				// 2. ��Ʈ��(����:����Ʈ) ����Ʈ�迭 ����
				byte[] bytes = new byte[10000]; // 10kb ����
				// 3. �Է½�Ʈ������ ����Ʈ �о�ͼ� �迭�� ����
				fileInputStream.read(bytes);
				// 4. ����Ʈ�迭 -> ���ڿ� ��ȯ
				String instring = new String(bytes);
				// 5. ȸ�� �и��ϱ� \n
				String[] members = instring.split("\n"); // \n ���н� ����ȸ�� �߰�
				// 6. �ݺ����� �̿��� ȸ���� �ʵ� �и��ϱ� ,
				for (int i = 0; i < members.length - 1; i++) { // -1 : ����ȸ�� ����
					// 7. ȸ���� �ʵ� �и�
					String[] field = members[i].split(",");
					// 8. �и��� �ʵ带 ��üȭ [ point�ʵ�� int������ ��ȯ : String -> Int ( Integer.parseInt ) ]
					Member member = new Member(field[0], field[1], field[2], field[3]);
					// 9. �� ��ü�� ����Ʈ�� ����
					MemberController.memberlist.add(member);
				}
				fileInputStream.close(); // ��Ʈ�� �ݱ�
				return true; // ���� �ҷ����� ����
			}
			if (type == 2) {
				// 1. �Է½�Ʈ�� ��� ����
				fileInputStream = new FileInputStream(roompath);
				// 2. ��Ʈ��(����:����Ʈ) ����Ʈ�迭 ����
				byte[] bytes = new byte[10000]; // 10kb ����
				// 3. �Է½�Ʈ������ ����Ʈ �о�ͼ� �迭�� ����
				fileInputStream.read(bytes);
				// 4. ����Ʈ�迭 -> ���ڿ� ��ȯ
				String instring = new String(bytes);
				// 5. ȸ�� �и��ϱ� \n
				String[] rooms = instring.split("\n"); // \n ���н� ����ȸ�� �߰�
				// 6. �ݺ����� �̿��� ȸ���� �ʵ� �и��ϱ� ,

				for (int i = 0; i < rooms.length - 1; i++) { // -1 : ����ȸ�� ����
					// 7. ȸ���� �ʵ� �и�
					String[] room = rooms[i].split(",");
					for (int j = 0; j < room.length; j++) {

						if (!room[j].equals("null")) {
							ȣ��Total.room[i][j] = room[j];
						}
					}

				}
				fileInputStream.close(); // ��Ʈ�� �ݱ�
				return true; // ���� �ҷ����� ����
			}

		} catch (Exception e) {
			System.err.println(" [�˸�] : ���� �ҷ����� ���� �߻� [ �����ڿ��� ���� ]");
		}
		return false; // ���� ������ ���н�

	}
}
