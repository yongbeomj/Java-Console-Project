package Final_1027;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestMain {

	// �Է°�ü ����
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		// ������ ����
		FileThread fileThread = new FileThread();
		fileThread.start();

		File.fileload(1);

		// 1. �������̽� ����
		ȣ�ڿ��� ȣ�ڿ���;

		while (true) {
			try {
				System.out.println(" ======================== ȣ�ڿ���ý��� ========================= ");
				System.out.println(" ========================= main menu ========================= ");
				System.out.println("\t 1.ȸ������ \t 2.�α��� \t 3.����");
				System.out.println(" ============================================================= ");
				System.out.print(">>> ���� : ");

				int ch = scanner.nextInt();
				if (ch == 1) { // ȸ������

					System.out.println(" ======================== ȸ������ ������ ======================== ");
					MemberController.signup();

				} else if (ch == 2) {
					System.out.println(" ======================== �α��� ������ ======================== ");
					System.out.println("\t\t1.ȸ�� \t\t2.������");
					System.out.println(" ============================================================= ");
					System.out.print("���� : ");
					int ch1 = scanner.nextInt();

					if (ch1 == 1) { // ȸ��
						System.out.println(" ============================================================= ");
						System.out.print(" Id : ");
						String h_id = scanner.next();
						System.out.print(" Password : ");
						String h_pw = scanner.next();

						boolean result = MemberController.login(h_id, h_pw);
						if (result) {// �α��� ������
							System.err.println(" [�˸�] : �α��� ���� ");

							while (true) {
								System.out.println(" ============================================================= ");
								System.out.println("1.������ 2.������� 3.���ο�����ȸ\n4.��ü������ȸ 5.���Ǽ������� 6.�ڷΰ���");
								System.out.println(" ============================================================= ");
								System.out.print(">>> ���� : ");
								int ch2 = scanner.nextInt();

								if (ch2 == 1) { // ������
									System.out
											.println(" ============================================================= ");
									System.out.println(">>ȣ������ ����<<");
									System.out.println("1.�Ŷ�ȣ�� 2.�󸶴�ȣ�� 3.�׷���ȣ��");
									int hotelch = TestMain.scanner.nextInt();
									System.out
											.println(" ============================================================= ");
									System.out.println(">>�� Ÿ�� ����<<");
									System.out.println("1.����Ʈ 2.�𷰽� 3.���Ĵٵ�");
									int roomch = TestMain.scanner.nextInt();

									if (hotelch == 1) {
										ȣ�ڿ��� = new ȣ��1();
										for (int i = 1; i <= 3; i++) {
											if (roomch == i) {
												ȣ�ڿ���.������(hotelch, roomch, h_id);
											}
										}
									} else if (hotelch == 2) {
										ȣ�ڿ��� = new ȣ��2();
										for (int i = 1; i <= 3; i++) {
											if (roomch == i) {
												ȣ�ڿ���.������(hotelch, roomch, h_id);
											}
										}
									} else if (hotelch == 3) {
										ȣ�ڿ��� = new ȣ��3();
										for (int i = 1; i <= 3; i++) {
											if (roomch == i) {
												ȣ�ڿ���.������(hotelch, roomch, h_id);
											}
										}
									} else {
										System.err.println(" �߸��� �Է¹�ȣ�Դϴ�. ��ȣ�� �ٽ� �������ּ���. ");
									}

								} else if (ch2 == 2) { // �������
									System.out
											.println(" ============================================================= ");
									System.out.println(">>ȣ������ ����<<");
									System.out.println("1.�Ŷ�ȣ�� 2.�󸶴�ȣ�� 3.�׷���ȣ��");
									int hotelch = TestMain.scanner.nextInt();
									System.out
											.println(" ============================================================= ");
									System.out.println(">>�� Ÿ�� ����<<");
									System.out.println("1.����Ʈ 2.�𷰽� 3.���Ĵٵ�");
									int roomch = TestMain.scanner.nextInt();
									if (hotelch == 1) {
										ȣ�ڿ��� = new ȣ��1();
										for (int i = 1; i <= 3; i++) {
											if (roomch == i) {
												ȣ�ڿ���.�������(hotelch, roomch, h_id);
											}
										}
									} else if (hotelch == 2) {
										ȣ�ڿ��� = new ȣ��2();
										for (int i = 1; i <= 3; i++) {
											if (roomch == i) {
												ȣ�ڿ���.�������(hotelch, roomch, h_id);
											}
										}
									} else if (hotelch == 3) {
										ȣ�ڿ��� = new ȣ��3();
										for (int i = 1; i <= 3; i++) {
											if (roomch == i) {
												ȣ�ڿ���.�������(hotelch, roomch, h_id);
											}
										}
									} else {
										System.err.println("  �߸��� �Է¹�ȣ�Դϴ�. ��ȣ�� �ٽ� �������ּ���. ");
									}

								} else if (ch2 == 3) { // ���ο�����ȸ
									System.out
											.println(" ============================================================= ");
									System.out.println("\t\t\t���ο�����Ȳ��ȸ");
									System.out
											.println(" ============================================================= ");
									ȣ�ڿ��� = new ȣ��1();
									ȣ�ڿ���.���ο�����ȸ(h_id);
									ȣ�ڿ��� = new ȣ��2();
									ȣ�ڿ���.���ο�����ȸ(h_id);
									ȣ�ڿ��� = new ȣ��3();
									ȣ�ڿ���.���ο�����ȸ(h_id);
									System.out
											.println(" ============================================================= ");
								} else if (ch2 == 4) { // ��ü������Ȳ��ȸ
									System.out
											.println(" ============================================================= ");
									System.out.println("\t\t\t��ü������Ȳ��ȸ");
									System.out
											.println(" ============================================================= ");
									System.out.println("ȣ��\t\t����Ʈ��\t\t�𷰽���\t\t���Ĵٵ��");
									System.out
											.println(" ============================================================= ");
									ȣ�ڿ��� = new ȣ��1();
									ȣ�ڿ���.��ü������Ȳ_ȸ��();
									ȣ�ڿ��� = new ȣ��2();
									ȣ�ڿ���.��ü������Ȳ_ȸ��();
									ȣ�ڿ��� = new ȣ��3();
									ȣ�ڿ���.��ü������Ȳ_ȸ��();
									System.out
											.println(" ============================================================= ");
								} else if (ch2 == 5) { // ������
									System.out
											.println(" ============================================================= ");
									System.out.println(" ������ : 1.���Ĵٵ� 2.�𷰽� 3.����Ʈ ");
									System.out.println(">>> ���� : ");
									int ch3 = scanner.nextInt();

									if (ch3 == 1) {
										Room.���Ĵٵ�();
									} else if (ch3 == 2) {
										Room.�𷰽�();
									} else if (ch3 == 3) {
										Room.����Ʈ();
									} else {
										System.err.println(" ���� �ٽ� �������ּ���. ");
										ch3 = scanner.nextInt();
									}
								} else if (ch2 == 6) {
									break;

								} else {
									System.err.println(" ��ȣ�� �ٽ� �������ּ���. ");
									ch2 = scanner.nextInt();
								}

							}

						} else { // �α��� ���н�
							System.err.println(" ���̵� �ٽ� �Է����ּ���. ");
						}
					} else if (ch1 == 2) { // ������
						System.out.println(" ============================================================= ");
						System.out.print(" Id : ");
						String h_id = scanner.next();
						System.out.print(" Password : ");
						String h_pw = scanner.next();

						if (h_id.equals("admin") && h_pw.equals("1234")) {
							System.err.println(" �����ڰ� �α����ϼ̽��ϴ�. ");
							while (true) {
								System.out.println(" ============================================================= ");
								System.out.println("\t1.������Ȳ\t2.ȸ������\t3.�ڷΰ���");
								System.out.println(" ============================================================= ");
								System.out.print(">>> ���� : ");
								int ch3 = scanner.nextInt();
								if (ch3 == 1) {
									System.out
											.println(" ============================================================= ");
									System.out.println("\t\t\t��ü������Ȳ��ȸ");
									System.out
											.println(" ============================================================= ");
									System.out.println("ȣ��\t\t����Ʈ��\t\t�𷰽���\t\t���Ĵٵ��");
									System.out
											.println(" ============================================================= ");
									ȣ�ڿ��� = new ȣ��1();
									ȣ�ڿ���.��ü������Ȳ_������();
									ȣ�ڿ��� = new ȣ��2();
									ȣ�ڿ���.��ü������Ȳ_������();
									ȣ�ڿ��� = new ȣ��3();
									ȣ�ڿ���.��ü������Ȳ_������();
									System.out
											.println(" ============================================================= ");

								} else if (ch3 == 2) {
									System.out.println(" ========================== ȸ�� ���� ========================== ");
									System.out.println("ȸ��ID\t   �̸�\t       ����ó");
									System.out
											.println(" ============================================================= ");
									Member member = new Member(h_id, h_pw, h_id, h_pw);
									for (Member temp : MemberController.memberlist) {
										if (!temp.getH_id().equals("admin")) {
											System.out.println("ID : " + temp.getH_id() + "/ �̸� : " + temp.getH_name()
													+ "/ ����ó : " + temp.getH_phone());
											System.out.println(
													" ============================================================= ");

										}
									}
								} else if (ch3 == 3) {
									System.err.println(" �����ڰ� �α׾ƿ��ϼ̽��ϴ�. ");
									break;
								} else { // ������ ����
									System.err.println(" �ٽ� �Է����ּ���.");

								}
							}

						} else {
							System.err.println(" ȸ�������� �ٸ��ϴ�. ");
						}

					} else {
						System.err.println(" �߸��Է��ϼ̽��ϴ�. �ʱ�ȭ������ ���ư��ϴ�. ");

					}
				} else if (ch == 3) {
					System.err.println(" ���� ");
					break;
				} else {
					System.err.println(" �ٽ� �Է����ּ���. ");
				}
			} catch (Exception e) {
				System.err.println(" [�˸�] : �޴� �Է¹�ȣ ���� [ �����ڹ��� ] ");
				scanner = new Scanner(System.in);
			} // �Է°�ü �ʱ�ȭ

		}

	}

}