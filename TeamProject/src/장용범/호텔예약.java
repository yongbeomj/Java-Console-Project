package ����;

import java.io.IOException;

public interface ȣ�ڿ��� {

	// �߻�޼ҵ�
	public void ������(int hotelch, int roomch);
	public void �������(int hotelch, int roomch);
	public void ���ο�����ȸ();
	public void ��ü������Ȳ();
	public void ����ó��();

	public static void ���Ĵٵ�() {
		String[] ���Ĵٵ� = new String[5];
		String[] ī�װ� = { "��Ÿ��", "���Ǹ���", "�ΰ�����", "���డ�ɿ���", "������̵�" };

		// ���Ĵٵ�
		���Ĵٵ�[0] = "���Ĵٵ��";
		���Ĵٵ�[1] = "12��";
		���Ĵٵ�[2] = "32 ��ġ �̻��� TV,�� ���� ������,�̴Ϲ�,����,���������� Ŀ�� �ӽ�,"
				+ "���� ���帵ũ �̴� ������� ����Ŀ,�ٸ��̿� �ٸ��� ��,���� �� �ݰ�,���� �Ź� (��û �� ����)," 
				+ "���ƿ�ħ�� (��û �� ����),�� �� (Le Labo��) ����ǰ";
		���Ĵٵ�[3] = "true";
		���Ĵٵ�[4] = "id";

		System.out.println("[[" + ���Ĵٵ�[0] + "]]");
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "." + ī�װ�[i] + " : ");
			if (i != 2) {
				System.out.println(���Ĵٵ�[i]);
			} else {
				String[] strArray = ���Ĵٵ�[i].split(",");
				int k = 1;
				System.out.println();
				for (String temp : strArray) {
					System.out.println(" " + k + ")" + temp);
					k++;
				}
			}
		}
	}

	static void �𷰽�() {
		String[] �𷰽� = new String[5];
		String[] ī�װ� = { "��Ÿ��", "���Ǹ���", "�ΰ�����", "���డ�ɿ���", "������̵�" };

		// �𷰽�
		�𷰽�[0] = "�𷰽���";
		�𷰽�[1] = "15��";
		�𷰽�[2] = "32 ��ġ �̻��� TV,�� ���� ������,�̴Ϲ�,����,���������� Ŀ�� �ӽ�,"
				+ "���� ���帵ũ �̴� ������� ����Ŀ,�ٸ��̿� �ٸ��� ��,���� �� �ݰ�,���� �Ź� (��û �� ����),"
				+ "���ƿ�ħ�� (��û �� ����),�� �� (Le Labo��) ����ǰ,��尡��� ������";
		�𷰽�[3] = "true";
		�𷰽�[4] = "id";

		System.out.println("[[" + �𷰽�[0] + "]]");
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "." + ī�װ�[i] + " : ");
			if (i != 2) {
				System.out.println(�𷰽�[i]);
			} else {
				String[] strArray = �𷰽�[i].split(",");
				int k = 1;
				System.out.println();
				for (String temp : strArray) {
					System.out.println(" " + k + ")" + temp);
					k++;
				}
			}
		}
	}

	static void ����Ʈ() {
		String[] ����Ʈ = new String[5];
		String[] ī�װ� = { "��Ÿ��", "���Ǹ���", "�ΰ�����", "���డ�ɿ���", "������̵�" };

		// ����Ʈ
		����Ʈ[0] = "����Ʈ��";
		����Ʈ[1] = "34��";
		����Ʈ[2] = "���е� �Ļ������ �̴� �ֹ�,���� ���̺�� �繫����,��ǰ �뷮�� �̼� ��޴�Ƽ,"
				+ "LED TV (�Ž�: 65��ġ / ħ��: 55��ġ),���� ���� ������,�̴Ϲٿ� ����,���������� Ŀ�� �ӽ�,"
				+ "���� ���帵ũ �̴� ������� ����Ŀ,�� & �÷콼 ����� �ý���,�ٸ��̿� �ٸ��� ��,���� �� �ݰ�,"
				+ "��īŸ �ǳ� ���� �� ������,���̽� ���ۼҴ�(Dyson Supersonic��) ������̾�";
		����Ʈ[3] = "true";
		����Ʈ[4] = "id";

		System.out.println("[[" + ����Ʈ[0] + "]]");
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "." + ī�װ�[i] + " : ");
			if (i != 2) {
				System.out.println(����Ʈ[i]);
			} else {
				String[] strArray = ����Ʈ[i].split(",");
				int k = 1;
				System.out.println();
				for (String temp : strArray) {
					System.out.println(" " + k + ")" + temp);
					k++;
				}
			}
		}
	}

}
