package �ſ���;

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
				System.out.println("====== main menu======");
				System.out.println("1.ȸ������ 2.�α��� 3.����");
				System.out.print(">>> ���� : ");
				int ch = scanner.nextInt();
				if (ch == 1) { // ȸ������

					System.out.println("++++++++++++ ȸ������ ������ ++++++++++++");
					// * �Է¹ޱ� -> ���� ���� -> ������ ������ -> ��ü -> ��ü ������ -> �迭/�÷��� ��´�
					System.out.print(" Id[4�����̻�] : ");
					String h_id = scanner.next();
					System.out.print(" Password[4���ڸ�] : ");
					String h_pw = scanner.next();
					System.out.print(" name[2�����̻�] : ");
					String h_name = scanner.next();
					System.out.print(" HP Number : ");
					String h_phone = scanner.next();
					// 4�� ������ ���ε��� �����ϸ� ������� => 4�� ������ ������ ��üȭ
					Member member = new Member(h_id, h_pw, h_name, h_phone);

					// Controller ���� [ �ٸ� Ŭ������ �޼ҵ� ȣ���ϴ� ��� : 1. 2.
					boolean result = MemberController.signup(member);
					if (result) {
						System.err.println(" [�˸�] : ȸ������ ���� ");
					} else {
						System.err.println(" [�˸�] : ȸ������ ���� ");
					}

				} else if (ch == 2) {
					System.out.println("++++++++++++ �α��� ������ ++++++++++++");
					System.out.println("\t1.ȸ�� \t2.������");
					System.out.print("���� : ");
					int ch1 = scanner.nextInt();

					if (ch1 == 1) { // ȸ��
						System.out.print(" Id : ");
						String h_id = scanner.next();
						System.out.print(" Password : ");
						String h_pw = scanner.next();

						boolean result = MemberController.login(h_id, h_pw);
						if (result) {// �α��� ������
							System.err.println(" [�˸�] : �α��� ���� ");

							while (true) {
								System.out.println("1.������ 2.������� 3.���ο�����ȸ 4.��ü������ȸ 5.���Ǽ������� 6.�ڷΰ���");
								System.out.print(">>> ���� : ");
								int ch2 = scanner.nextInt();

								if (ch2 == 1) { // ������

									System.out.println(">>ȣ������ ����<<");
									System.out.println("1.ȣ��1 2.ȣ��2 3.ȣ��3");
									int hotelch = TestMain.scanner.nextInt();
									System.out.println(">>�� Ÿ�� ����<<");
									System.out.println("1.����Ʈ 2.�𷰽� 3.���Ĵٵ�");
									int roomch = TestMain.scanner.nextInt();

									if (hotelch == 1) {
										ȣ�ڿ��� = new ȣ��1();
										if (roomch == 1) {
											ȣ�ڿ���.������(hotelch, roomch, h_id);
										} else if (roomch == 2) {
											ȣ�ڿ���.������(hotelch, roomch, h_id);
										} else if (roomch == 3) {
											ȣ�ڿ���.������(hotelch, roomch, h_id);
										}

									} else if (hotelch == 2) {
										ȣ�ڿ��� = new ȣ��2();
										if (roomch == 1) {
											ȣ�ڿ���.������(hotelch, roomch, h_id);
										} else if (roomch == 2) {
											ȣ�ڿ���.������(hotelch, roomch, h_id);
										} else if (roomch == 3) {
											ȣ�ڿ���.������(hotelch, roomch, h_id);
										}
									} else if (hotelch == 3) {
										ȣ�ڿ��� = new ȣ��3();
										if (roomch == 1) {
											ȣ�ڿ���.������(hotelch, roomch, h_id);
										} else if (roomch == 2) {
											ȣ�ڿ���.������(hotelch, roomch, h_id);
										} else if (roomch == 3) {
											ȣ�ڿ���.������(hotelch, roomch, h_id);
										}
									}

								} else if (ch2 == 2) { // �������
									System.out.println(">>ȣ������ ����<<");
									System.out.println("1.ȣ��1 2.ȣ��2 3.ȣ��3");
									int hotelch = TestMain.scanner.nextInt();
									System.out.println(">>�� Ÿ�� ����<<");
									System.out.println("1.����Ʈ 2.�𷰽� 3.���Ĵٵ�");
									int roomch = TestMain.scanner.nextInt();

									if (hotelch == 1) {
										ȣ�ڿ��� = new ȣ��1();
										if (roomch == 1) {
											ȣ�ڿ���.�������(hotelch, roomch, h_id);
										} else if (roomch == 2) {
											ȣ�ڿ���.�������(hotelch, roomch, h_id);
										} else if (roomch == 3) {
											ȣ�ڿ���.�������(hotelch, roomch, h_id);
										}
									} else if (hotelch == 2) {
										ȣ�ڿ��� = new ȣ��2();
										if (roomch == 1) {
											ȣ�ڿ���.�������(hotelch, roomch, h_id);
										} else if (roomch == 2) {
											ȣ�ڿ���.�������(hotelch, roomch, h_id);
										} else if (roomch == 3) {
											ȣ�ڿ���.�������(hotelch, roomch, h_id);
										}
									} else if (hotelch == 3) {
										ȣ�ڿ��� = new ȣ��3();
										if (roomch == 1) {
											ȣ�ڿ���.�������(hotelch, roomch, h_id);
										} else if (roomch == 2) {
											ȣ�ڿ���.�������(hotelch, roomch, h_id);
										} else if (roomch == 3) {
											ȣ�ڿ���.�������(hotelch, roomch, h_id);
										}
									}
								} else if (ch2 == 3) { // ���ο�����ȸ
									System.out.println("---------------------------------");
									System.out.println("\t���ο�����Ȳ��ȸ");
									System.out.println("---------------------------------");
									ȣ�ڿ��� = new ȣ��1();
									ȣ�ڿ���.���ο�����ȸ(h_id);
									ȣ�ڿ��� = new ȣ��2();
									ȣ�ڿ���.���ο�����ȸ(h_id);
									ȣ�ڿ��� = new ȣ��3();
									ȣ�ڿ���.���ο�����ȸ(h_id);
									System.out.println("---------------------------------");
								} else if (ch2 == 4) { // ��ü������Ȳ��ȸ
									System.out.println("---------------------------------");
									System.out.println("\t��ü������Ȳ��ȸ");
									System.out.println("---------------------------------");
									System.out.println("ȣ��\t����Ʈ��\t�𷰽���\t���Ĵٵ��");
									System.out.println("---------------------------------");
									ȣ�ڿ��� = new ȣ��1();
									ȣ�ڿ���.��ü������Ȳ_ȸ��();
									ȣ�ڿ��� = new ȣ��2();
									ȣ�ڿ���.��ü������Ȳ_ȸ��();
									ȣ�ڿ��� = new ȣ��3();
									ȣ�ڿ���.��ü������Ȳ_ȸ��();
									System.out.println("---------------------------------");
								} else if (ch2 == 5) { // ������
									System.out.println("������ : 1.���Ĵٵ� 2.�𷰽� 3.����Ʈ");
									System.out.println(" ���� : ");
									int ch3 = scanner.nextInt();

									if (ch3 == 1) {
										�ſ���.Room.���Ĵٵ�();
									} else if (ch3 == 2) {
										�ſ���.Room.�𷰽�();
									} else if (ch3 == 3) {
										�ſ���.Room.����Ʈ();
									} else {
										System.out.println("�� �� ���� �ൿ");
										ch3 = scanner.nextInt();
									}
								} else if (ch2 == 6) {
									break;

								} else {
									System.out.println("�� �� ���� �ൿ");
									ch2 = scanner.nextInt();
								}

							}

						} else {
							System.err.println(" �� �� ���� �ൿ ");
							break;
						}
					} else if (ch1 == 2) { // ������

						System.out.print(" Id : ");
						String h_id = scanner.next();
						System.out.print(" Password : ");
						String h_pw = scanner.next();
						if (h_id.equals("admin")) {
							System.out.println(" �����ڰ� �α����ϼ̽��ϴ�. ");
							while (true) {
								System.out.println("1.������Ȳ 2.ȸ������ 3.�ڷΰ���");
								System.out.print(">>> ���� : ");
								int ch3 = scanner.nextInt();
								if (ch3 == 1) {
									System.out.println("ȣ��\t����Ʈ��\t�𷰽���\t���Ĵٵ��");
									ȣ�ڿ��� = new ȣ��1();
									ȣ�ڿ���.��ü������Ȳ_������();
									ȣ�ڿ��� = new ȣ��2();
									ȣ�ڿ���.��ü������Ȳ_������();
									ȣ�ڿ��� = new ȣ��3();
									ȣ�ڿ���.��ü������Ȳ_������();

								} else if (ch3 == 2) {

									Member member = new Member(h_id, h_pw, h_id, h_pw);
									for (Member temp : MemberController.memberlist) {
										if (!temp.getH_id().equals("admin")) {
											System.out.println("ID : " + temp.getH_id() + "/ �̸� : " + temp.getH_name()
													+ "/ ����ó : " + temp.getH_phone());

										}
									}

								} else {
									System.out.println(" �ٽ� �Է����ּ���.");
									ch3 = scanner.nextInt();
								}
							}

						}

					} else {
						System.out.println(" �߸��Է��ϼ̽��ϴ� �ʱ�ȭ������ ���ư��ϴ� ");
						scanner = new Scanner(System.in);
					}

				} else if (ch == 3) {
					System.out.println("����");
					break;
				} else {
					System.out.println("�ٽ� �Է����ּ���");
					scanner = new Scanner(System.in);
				}

			} catch (Exception e) {
				System.err.println(" [�˸�] : �޴� ������ ���� [ �����ڹ��� ] ");
				scanner = new Scanner(System.in);
			} // �Է°�ü �ʱ�ȭ

		}

	}

}