package ��������;

public class Room {
	// �ʵ�
	public static String[] ī�װ� = { "��Ÿ��", "���Ǹ���", "�ΰ�����" };

	// �޼ҵ�
	public static void ���Ĵٵ�() {
		String[] ���Ĵٵ� = new String[3];

		// ���Ĵٵ�
		System.out.println(" ========================================================= ");
		���Ĵٵ�[0] = "���Ĵٵ��";
		���Ĵٵ�[1] = "12��";
		���Ĵٵ�[2] = "32 ��ġ �̻��� TV,�� ���� ������,�̴Ϲ�,����,���������� Ŀ�� �ӽ�,"
				+ "���� ���帵ũ �̴� ������� ����Ŀ,�ٸ��̿� �ٸ��� ��,���� �� �ݰ�,���� �Ź� (��û �� ����)," + "���ƿ�ħ�� (��û �� ����),�� �� (Le Labo��) ����ǰ";

		System.out.println("[[ ���Ǽ������� ]]");
		for (int i = 0; i < 3; i++) {
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
		String[] �𷰽� = new String[3];

		// �𷰽�
		System.out.println(" ========================================================= ");
		�𷰽�[0] = "�𷰽���";
		�𷰽�[1] = "15��";
		�𷰽�[2] = "32 ��ġ �̻��� TV,�� ���� ������,�̴Ϲ�,����,���������� Ŀ�� �ӽ�,"
				+ "���� ���帵ũ �̴� ������� ����Ŀ,�ٸ��̿� �ٸ��� ��,���� �� �ݰ�,���� �Ź� (��û �� ����),"
				+ "���ƿ�ħ�� (��û �� ����),�� �� (Le Labo��) ����ǰ,��尡��� ������";

		System.out.println("[[ ���Ǽ������� ]]");
		for (int i = 0; i < 3; i++) {
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
		String[] ����Ʈ = new String[3];

		// ����Ʈ
		System.out.println(" ========================================================= ");
		����Ʈ[0] = "����Ʈ��";
		����Ʈ[1] = "34��";
		����Ʈ[2] = "���е� �Ļ������ �̴� �ֹ�,���� ���̺�� �繫����,��ǰ �뷮�� �̼� ��޴�Ƽ,"
				+ "LED TV (�Ž�: 65��ġ / ħ��: 55��ġ),���� ���� ������,�̴Ϲٿ� ����,���������� Ŀ�� �ӽ�,"
				+ "���� ���帵ũ �̴� ������� ����Ŀ,�� & �÷콼 ����� �ý���,�ٸ��̿� �ٸ��� ��,���� �� �ݰ�,"
				+ "��īŸ �ǳ� ���� �� ������,���̽� ���ۼҴ�(Dyson Supersonic��) ������̾�";

		System.out.println("[[ ���Ǽ������� ]]");
		for (int i = 0; i < 3; i++) {
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
